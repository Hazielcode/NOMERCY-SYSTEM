const API_CITAS = '/api/citas';
const API_PACIENTES = '/api/pacientes';
const API_MEDICOS = '/api/medicos';
const $ = (id) => document.getElementById(id);

document.addEventListener('DOMContentLoaded', () => {
    const tabla = $('tabla-citas');
    const btnCrear = $('c-crear');

    if (!tabla) {
        console.error("No se encontró #tabla-citas en el DOM.");
        return;
    }

    function colorEstado(estado) {
        switch (estado) {
            case 'PROGRAMADA': return 'info';     // azul
            case 'ATENDIDA':   return 'success';  // verde
            case 'CANCELADA':  return 'danger';   // rojo
            default:           return 'secondary';
        }
    }

    async function cargarSelects() {
        try {
            const [pacRes, medRes] = await Promise.all([
                fetch(API_PACIENTES),
                fetch(API_MEDICOS)
            ]);
            const [pacientes, medicos] = [await pacRes.json(), await medRes.json()];

            $('c-paciente').innerHTML = pacientes.map(p =>
                `<option value="${p.id}">${p.nombre} ${p.apellido || ''}</option>`
            ).join('');

            $('c-medico').innerHTML = medicos.map(m =>
                `<option value="${m.id}">${m.nombre} ${m.apellido || ''}</option>`
            ).join('');
        } catch (e) {
            console.error('Error cargando selects', e);
        }
    }

    async function listar() {
        try {
            tabla.innerHTML = `<tr><td colspan="8" class="text-muted">⏳ Cargando citas...</td></tr>`;
            const res = await fetch(API_CITAS);
            const data = await res.json();

            if (!Array.isArray(data) || data.length === 0) {
                tabla.innerHTML = `<tr><td colspan="8" class="text-secondary text-center">No hay citas registradas</td></tr>`;
                return;
            }

            tabla.innerHTML = data.map(c => `
        <tr>
          <td>${c.id}</td>
          <td>${c.paciente ? c.paciente.nombre + " " + (c.paciente.apellido || "") : "—"}</td>
          <td>${c.medico ? c.medico.nombre + " " + (c.medico.apellido || "") : "—"}</td>
          <td>${c.fecha}</td>
          <td>${c.hora}</td>
          <td>${c.motivo}</td>
          <td><span class="badge bg-${colorEstado(c.estado)}">${c.estado}</span></td>
          <td>
            <button class="btn btn-danger btn-sm" onclick="eliminar(${c.id})">
              <i class="bi bi-trash"></i>
            </button>
          </td>
        </tr>
      `).join('');
        } catch (e) {
            console.error('Error listando citas', e);
            tabla.innerHTML = `<tr><td colspan="8" class="text-danger text-center">Error al cargar citas</td></tr>`;
        }
    }

    async function crear() {
        const payload = {
            paciente: { id: $('c-paciente').value },
            medico:   { id: $('c-medico').value },
            fecha:    $('c-fecha').value,
            hora:     $('c-hora').value,
            motivo:   $('c-motivo').value,
            estado:   $('c-estado').value   // PROGRAMADA | ATENDIDA | CANCELADA
        };

        try {
            const res = await fetch(API_CITAS, {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(payload)
            });

            if (res.ok) {
                ['c-fecha','c-hora','c-motivo'].forEach(id => $(id).value = '');
                listar();
            } else {
                alert('⚠️ No se pudo registrar la cita. Verifica los datos.');
            }
        } catch (e) {
            console.error('Error creando cita', e);
            alert('❌ Error de conexión al crear cita');
        }
    }

    window.eliminar = async (id) => {
        if (!confirm('¿Eliminar cita #' + id + '?')) return;
        try {
            await fetch(`${API_CITAS}/${id}`, { method: 'DELETE' });
            listar();
        } catch (e) {
            console.error('Error eliminando cita', e);
            alert('❌ Error al eliminar');
        }
    };

    if (btnCrear) btnCrear.addEventListener('click', crear);

    cargarSelects();
    listar();
});
