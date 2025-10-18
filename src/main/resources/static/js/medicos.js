const API = '/api/medicos';
const $ = (id) => document.getElementById(id);
const tbody = document.getElementById('tabla-medicos');

// 🔹 Listar médicos
async function listar() {
    const res = await fetch(API);
    const data = await res.json();
    tbody.innerHTML = data.map(m => `
    <tr>
      <td>${m.id}</td>
      <td>${m.nombre}</td>
      <td>${m.apellido}</td>
      <td>${m.dni}</td>
      <td>${m.cmp}</td>
      <td>${m.telefono}</td>
      <td>${m.correo}</td>
      <td>${m.especialidad ?? '—'}</td>
      <td>
        <button class="btn btn-danger btn-sm" onclick="eliminar(${m.id})">
          <i class="bi bi-trash"></i>
        </button>
      </td>
    </tr>
  `).join('');
}

// 🔹 Crear nuevo médico
async function crear() {
    const payload = {
        nombre: $('m-nombre').value,
        apellido: $('m-apellido').value,
        dni: $('m-dni').value,
        cmp: $('m-cmp').value,
        telefono: $('m-telefono').value,
        correo: $('m-correo').value
    };

    const res = await fetch(API, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(payload)
    });

    if (res.ok) {
        listar();
        ['m-nombre','m-apellido','m-dni','m-cmp','m-telefono','m-correo','m-especialidad']
            .forEach(id => $(id).value = '');
    } else {
        alert('⚠️ Error al guardar médico');
    }
}

// 🔹 Eliminar médico
async function eliminar(id) {
    if (!confirm('¿Eliminar médico #' + id + '?')) return;
    await fetch(`${API}/${id}`, { method: 'DELETE' });
    listar();
}

$('m-crear').addEventListener('click', crear);
listar();
