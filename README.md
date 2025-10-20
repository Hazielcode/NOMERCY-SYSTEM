<h1 align="center">🏥 HospitalSystem – Spring Boot + MongoDB</h1>

<p align="center">
  <img src="https://i.imgur.com/8M9r1nV.png" width="120" alt="Hospital Icon"/>
</p>

<p align="center">
  <b>Sistema de gestión hospitalaria moderno y escalable.</b><br>
  Desarrollado con <code>Spring Boot 3.5</code>, <code>Thymeleaf</code>, <code>Bootstrap</code> y <code>MongoDB</code> 💾.
</p>

---

## 🧠 Descripción general

HospitalSystem es una aplicación web diseñada para la **gestión integral de un hospital**, permitiendo administrar de forma sencilla:

- 👨‍⚕️ Médicos  
- 🧑‍🤝‍🧑 Pacientes  
- 🧾 Citas médicas  
- 🧬 Especialidades  

El sistema utiliza **MongoDB** como base de datos NoSQL, ofreciendo una estructura flexible, eficiente y completamente libre de esquemas SQL.

---

## ⚙️ Tecnologías principales

| Categoría | Tecnología |
|------------|-------------|
| Backend | ☕ Java 17, Spring Boot 3.5 |
| Base de datos | 🍃 MongoDB (Compass / Atlas) |
| Frontend | 🌐 Thymeleaf + Bootstrap + JS |
| Build Tool | 🧱 Gradle |
| IDE | 🧩 IntelliJ IDEA Ultimate |
| Pruebas | 🔍 Postman |

---

## 🧩 Arquitectura del sistema

HospitalSystem/
├── controller/ # Controladores REST y vistas Thymeleaf
├── model/ # Documentos MongoDB (Pacientes, Médicos, etc.)
├── repository/ # Repositorios MongoRepository
├── service/ # Lógica de negocio CRUD
├── resources/
│ ├── templates/ # Páginas Thymeleaf
│ ├── static/ # Archivos JS y CSS
│ └── application.properties
└── HospitalSystemApplication.java

yaml
Copiar código

---

## 🛠️ Instalación y ejecución

### 🔹 1. Clonar el repositorio
```bash
git clone https://github.com/Hazielcode/NOMERCY-SYSTEM.git
cd NOMERCY-SYSTEM
🔹 2. Verificar MongoDB
Abre tu terminal y ejecuta:

bash
Copiar código
mongosh
use hospitaldb
Si usas MongoDB Compass, conéctate con:

arduino
Copiar código
mongodb://localhost:27017
🔹 3. Configurar el archivo application.properties
Ubicación: src/main/resources/application.properties

properties
Copiar código
spring.application.name=HospitalSystem
spring.data.mongodb.uri=mongodb://localhost:27017/hospitaldb
spring.data.mongodb.database=hospitaldb
server.port=8080
🔹 4. Ejecutar el proyecto
bash
Copiar código
gradlew bootRun
Luego abre tu navegador:

arduino
Copiar código
http://localhost:8080/
🌐 Rutas disponibles (Frontend)
Página	URL
🏠 Inicio	/
🧑‍🤝‍🧑 Pacientes	/view/pacientes
👨‍⚕️ Médicos	/view/medicos
🧬 Especialidades	/view/especialidades
📅 Citas	/view/citas

💻 Endpoints REST API
Método	Endpoint	Descripción
GET	/api/pacientes	Listar todos los pacientes
POST	/api/pacientes	Crear nuevo paciente
GET	/api/medicos	Listar todos los médicos
GET	/api/especialidades	Listar especialidades
GET	/api/citas	Listar citas
POST	/api/citas	Crear nueva cita
PUT	/api/.../{id}	Actualizar registro
DELETE	/api/.../{id}	Eliminar registro

🧠 Todas las colecciones se crean automáticamente en MongoDB al ejecutar la app.

🍃 Colecciones MongoDB generadas
pacientes

medicos

especialidades

citas

📸 Ejemplo en MongoDB Compass:

<p align="center"> <img src="https://i.imgur.com/2xLwbA1.png" width="700" alt="MongoDB Compass"/> </p>
🔬 Ejemplo de datos JSON
👉 Crear paciente
json
Copiar código
{
  "nombre": "Carlos",
  "apellido": "Ramirez",
  "dni": "98765432",
  "telefono": "945123678",
  "correo": "carlos.ramirez@example.com",
  "direccion": "Av. Los Robles 456"
}
👉 Crear cita
json
Copiar código
{
  "fecha": "2025-10-25",
  "hora": "09:30:00",
  "motivo": "Chequeo general",
  "paciente": { "id": "6714d9fbb23d91a3b2c3d0e1" },
  "medico": { "id": "6714da12b23d91a3b2c3d0e2" }
}
💡 Pruebas recomendadas
Herramienta	Acción
🧭 MongoDB Compass	Visualiza colecciones y documentos creados automáticamente
🔥 Postman	Prueba los endpoints CRUD
🌐 Navegador	Usa las vistas Thymeleaf /view/...

📈 Resultados de la migración a MongoDB
✅ Se reemplazó completamente JPA/MySQL por MongoDB
✅ Se mantuvo la estructura MVC original
✅ CRUDs 100 % funcionales con colecciones dinámicas
✅ Rendimiento optimizado y configuración simplificada
✅ Verificación exitosa con Postman y Compass

🧾 Conclusiones
Logré migrar con éxito el sistema completo a MongoDB manteniendo la estructura y estabilidad.

MongoDB simplificó la persistencia de datos al no requerir esquemas fijos ni SQL.

La aplicación ahora es más ligera, eficiente y escalable.

Pude comprobar la flexibilidad de Spring Boot al integrarse con diferentes motores de base de datos.

Todas las pruebas en Postman y MongoDB Compass confirmaron un funcionamiento estable y correcto.

👨‍💻 Autor
Samir Haziel Alfonso Solorzano
🎓 Desarrollador Backend – Java | Spring Boot
📧 hazielcode.dev@gmail.com
🌐 GitHub – Hazielcode

<p align="center"> <img src="https://i.imgur.com/3Yh7eXb.png" width="120" alt="Spring Boot Logo"/> </p>
<p align="center"> ⭐ <b>Si este proyecto te resultó útil, no olvides dejar una estrella en el repositorio.</b> ⭐ </p> ```

🌐 Repositorio Oficial – NOMERCY SYSTEM
</div> ```

