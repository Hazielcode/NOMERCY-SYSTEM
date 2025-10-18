const API = '/api/especialidades';
const $ = (id) => document.getElementById(id);
const tbody = document.getElementById('tabla-especialidades');

// listar
async function listar() {
    const res = await fetch(API);
    const data = await res.json();
    tbody.innerHTML = data.map(e => `
    <tr>
      <td>${e.id}</td>
      <td>${e.nombre}</td>
      <td>
        <button class="btn btn-danger btn-sm" onclick="eliminar(${e.id})">
          <i class="bi bi-trash"></i>
        </button>
      </td>
    </tr>
  `).join('');
}

// crear
async function crear() {
    const payload = { nombre: $('e-nombre').value };

    const res = await fetch(API, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(payload)
    });

    if (res.ok) {
        listar();
        $('e-nombre').value = '';
    } else {
        alert('⚠️ Error al guardar la especialidad');
    }
}

// eliminar
async function eliminar(id) {
    if (!confirm('¿Eliminar especialidad #' + id + '?')) return;
    await fetch(`${API}/${id}`, { method: 'DELETE' });
    listar();
}

$('e-crear').addEventListener('click', crear);
listar();
