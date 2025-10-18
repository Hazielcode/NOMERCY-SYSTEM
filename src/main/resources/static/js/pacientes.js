const API = '/api/pacientes';
const $ = (id) => document.getElementById(id);
const tbody = document.getElementById('tabla-pacientes');

// 🔹 Listar pacientes
async function listar() {
    const res = await fetch(API);
    const data = await res.json();
    tbody.innerHTML = data.map(p => `
    <tr>
      <td>${p.id}</td>
      <td>${p.nombre}</td>
      <td>${p.apellido}</td>
      <td>${p.dni}</td>
      <td>${p.telefono}</td>
      <td>${p.correo}</td>
      <td>
        <button class="btn btn-danger btn-sm" onclick="eliminar(${p.id})"><i class="bi bi-trash"></i></button>
      </td>
    </tr>
  `).join('');
}

// 🔹 Crear nuevo paciente
async function crear() {
    const payload = {
        nombre: $('p-nombre').value,
        apellido: $('p-apellido').value,
        dni: $('p-dni').value,
        telefono: $('p-telefono').value,
        correo: $('p-correo').value,
        direccion: $('p-direccion').value
    };

    const res = await fetch(API, {
        method: 'POST',
        headers: {'Content-Type': 'application/json'},
        body: JSON.stringify(payload)
    });

    if (res.ok) {
        listar();
        ['p-nombre','p-apellido','p-dni','p-telefono','p-correo','p-direccion'].forEach(id => $(id).value = '');
    } else {
        alert('Error al guardar paciente');
    }
}

// 🔹 Eliminar
async function eliminar(id) {
    if (!confirm('¿Eliminar paciente #' + id + '?')) return;
    await fetch(`${API}/${id}`, { method: 'DELETE' });
    listar();
}

$('p-crear').addEventListener('click', crear);
listar();
