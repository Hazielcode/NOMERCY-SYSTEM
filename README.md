<div align="center">

# 🏥 **NoMercy System**
### _Hospital Management Application_

💡 Sistema integral para la gestión hospitalaria desarrollado con  
**Spring Boot 3.5**, **Thymeleaf**, **MySQL**, **Bootstrap 5** y **JavaScript**.  
Permite administrar **pacientes, médicos, especialidades y citas médicas** desde una interfaz moderna y dinámica.

---

![Banner](https://img.shields.io/badge/Spring%20Boot-3.5-brightgreen?style=for-the-badge&logo=springboot)
![MySQL](https://img.shields.io/badge/MySQL-8-blue?style=for-the-badge&logo=mysql)
![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-Template%20Engine-success?style=for-the-badge&logo=thymeleaf)
![Bootstrap](https://img.shields.io/badge/Bootstrap-5-purple?style=for-the-badge&logo=bootstrap)
![GitHub](https://img.shields.io/badge/Repo-Hazielcode--NOMERCY--SYSTEM-black?style=for-the-badge&logo=github)

</div>

---

## ⚙️ **Resumen del Proyecto**

**NoMercy System** (HospitalSystem) es una plataforma web diseñada para centralizar la gestión clínica del hospital.  
Incluye CRUDs completos, validaciones, relaciones entre entidades y vistas integradas con JavaScript dinámico.

📦 **Arquitectura general:**
- Backend REST con **Spring Boot**
- Frontend dinámico con **Thymeleaf + Bootstrap**
- Persistencia con **Spring Data JPA / Hibernate**
- Base de datos **MySQL 8**
- Integración modular por capas

---

## 🧩 **Módulos Principales**

### 🧍 **Pacientes**
- CRUD completo: crear, listar, editar y eliminar.
- Datos: nombre, apellido, DNI, teléfono, correo, dirección.

### 🩺 **Médicos**
- Registro de médicos con número CMP y especialidad asignada.

### 🧠 **Especialidades**
- Gestión de especialidades médicas (Cardiología, Pediatría, etc.).
- Relación **1:N** con Médicos.

### 📅 **Citas Médicas**
- Registro de citas entre pacientes y médicos.
- Estado visual:
  - 🩵 **PROGRAMADA** → Azul  
  - 💚 **ATENDIDA** → Verde  
  - ❤️ **CANCELADA** → Rojo

---

## 🧠 **Relaciones entre Entidades**

| Entidad | Relación | Descripción |
|----------|-----------|-------------|
| `Paciente` ↔ `Cita` | 1:N | Un paciente puede tener varias citas |
| `Medico` ↔ `Cita` | 1:N | Un médico puede atender muchas citas |
| `Medico` ↔ `Especialidad` | N:1 | Cada médico pertenece a una especialidad |
| `Cita` → `EstadoCita` | Enum | PROGRAMADA • ATENDIDA • CANCELADA |

---

## 🧭 **Tecnologías Utilizadas**

| Capa | Tecnología |
|------|-------------|
| 💻 Backend | Java 17 • Spring Boot 3.5 • Spring Data JPA |
| 🎨 Frontend | Thymeleaf • Bootstrap 5 • Animate.css • JS Fetch API |
| 🧠 Base de Datos | MySQL 8 (puerto `3307`) |
| ⚙️ Build Tool | Gradle |
| 🧩 IDE Recomendado | IntelliJ IDEA Ultimate |
| 🌍 Control de Versiones | Git + GitHub (`NOMERCY-SYSTEM`) |

---

## 🧱 **Estructura del Proyecto**

```bash
HospitalSystem/
│
├── src/
│   └── main/
│       ├── java/com/tecsup/hospital/
│       │   ├── controller/
│       │   │   ├── PacienteController.java
│       │   │   ├── MedicoController.java
│       │   │   ├── EspecialidadController.java
│       │   │   ├── CitaController.java
│       │   │   └── ViewController.java
│       │   │
│       │   ├── model/
│       │   │   ├── Paciente.java
│       │   │   ├── Medico.java
│       │   │   ├── Especialidad.java
│       │   │   ├── Cita.java
│       │   │   └── EstadoCita.java
│       │   │
│       │   ├── repository/
│       │   ├── service/
│       │   └── HospitalSystemApplication.java
│       │
│       └── resources/
│           ├── static/
│           │   └── js/
│           │       ├── pacientes.js
│           │       ├── medicos.js
│           │       ├── especialidades.js
│           │       └── citas.js
│           │
│           ├── templates/
│           │   ├── index.html
│           │   ├── pacientes.html
│           │   ├── medicos.html
│           │   ├── especialidades.html
│           │   └── citas.html
│           │
│           └── application.properties
│
├── build.gradle
└── README.md



🧾 Configuración de la Base de Datos

spring.datasource.url=jdbc:mysql://localhost:3307/hospitaldb
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080

📌 Antes de ejecutar el proyecto:

CREATE DATABASE hospital_db;
💻 Guía para Clonar y Ejecutar
🪄 1️⃣ Clonar el Repositorio
git clone https://github.com/Hazielcode/NOMERCY-SYSTEM.git

🧩 2️⃣ Abrir el Proyecto

En IntelliJ IDEA o VS Code:

File > Open > HospitalSystem

🛠️ 3️⃣ Crear la Base de Datos
CREATE DATABASE hospitaldb;

⚙️ 4️⃣ Configurar Credenciales

Edita application.properties si tu MySQL tiene otro puerto o usuario.

▶️ 5️⃣ Ejecutar el Proyecto
./gradlew bootRun


o desde IntelliJ → botón Run ▶

🌐 6️⃣ Acceder en el Navegador
http://localhost:8080/

🎨 Diseño e Interfaz

✨ Interfaz moderna y responsiva:

Formularios elegantes y minimalistas

Tablas interactivas con iconos (Bootstrap Icons)

Badges de colores según el estado de la cita

Navbar uniforme en todos los módulos

🩵 PROGRAMADA (azul) 💚 ATENDIDA (verde) ❤️ CANCELADA (rojo)

🧾 Endpoints REST
Módulo	Método	Endpoint	Descripción
Paciente	GET	/api/pacientes	Listar pacientes
Paciente	POST	/api/pacientes	Crear paciente
Médico	GET	/api/medicos	Listar médicos
Especialidad	GET	/api/especialidades	Listar especialidades
Cita	GET	/api/citas	Listar citas
Cita	POST	/api/citas	Crear cita
Cita	DELETE	/api/citas/{id}	Eliminar cita
<div align="center">
👨‍💻 Autor del Proyecto
Rol	Nombre
👨‍💻 Backend & Frontend Integration	Samir Haziel Alfonso Solórzano
🎓 Proyecto Académico	TECSUP — Desarrollo de Aplicaciones Empresariales
🗓️ Año	2025
🧾 Licencia

Proyecto académico desarrollado con fines educativos.
© 2025 Samir Haziel Alfonso Solórzano — Todos los derechos reservados.

🌐 Repositorio Oficial – NOMERCY SYSTEM
</div> ```

