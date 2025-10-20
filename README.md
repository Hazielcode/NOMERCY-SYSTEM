<h1 align="center">🏥 HospitalSystem</h1>

<p align="center">
  <img src="https://i.imgur.com/8M9r1nV.png" width="120" alt="Hospital Icon"/>
</p>

<p align="center">
  <b>Sistema de gestión hospitalaria moderno, escalable y eficiente</b><br>
  Desarrollado con Spring Boot 3.5, MongoDB, Thymeleaf y Bootstrap
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java" alt="Java 17"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-3.5-brightgreen?style=flat-square&logo=spring" alt="Spring Boot 3.5"/>
  <img src="https://img.shields.io/badge/MongoDB-7.0-green?style=flat-square&logo=mongodb" alt="MongoDB"/>
  <img src="https://img.shields.io/badge/License-MIT-blue?style=flat-square" alt="License"/>
</p>

---

## 📋 Tabla de Contenidos

- [Descripción General](#-descripción-general)
- [Características Principales](#-características-principales)
- [Tecnologías](#️-tecnologías)
- [Arquitectura](#-arquitectura)
- [Instalación](#-instalación)
- [Configuración](#️-configuración)
- [Uso](#-uso)
- [API Reference](#-api-reference)
- [Ejemplos](#-ejemplos)
- [Capturas de Pantalla](#-capturas-de-pantalla)
- [Pruebas](#-pruebas)
- [Roadmap](#-roadmap)
- [Contribuir](#-contribuir)
- [Autor](#-autor)
- [Licencia](#-licencia)

---

## 🎯 Descripción General

**HospitalSystem** es una aplicación web full-stack diseñada para la gestión integral de instituciones hospitalarias. El sistema proporciona una interfaz intuitiva y moderna para administrar el flujo de trabajo médico diario, optimizando la gestión de recursos humanos y la atención al paciente.

### ¿Qué puedes hacer con HospitalSystem?

- **Gestión de Pacientes**: Registro completo con historial médico y datos de contacto
- **Administración de Personal Médico**: Control de médicos, especialidades y disponibilidad
- **Sistema de Citas**: Programación y seguimiento de consultas médicas
- **Gestión de Especialidades**: Organización por áreas médicas especializadas
- **Reportes en Tiempo Real**: Visualización de estadísticas y métricas del hospital

### ¿Por qué MongoDB?

La elección de MongoDB como motor de base de datos NoSQL ofrece:

- ✅ Estructura flexible sin esquemas rígidos
- ✅ Escalabilidad horizontal para crecimiento futuro
- ✅ Alto rendimiento en operaciones de lectura/escritura
- ✅ Almacenamiento eficiente de documentos complejos
- ✅ Integración nativa con Spring Boot

---

## ✨ Características Principales

| Módulo | Funcionalidad |
|--------|---------------|
| 👥 **Pacientes** | CRUD completo, búsqueda avanzada, historial médico |
| 👨‍⚕️ **Médicos** | Gestión de perfiles, especialidades, horarios |
| 📅 **Citas** | Programación, cancelación, reprogramación automática |
| 🏥 **Especialidades** | Categorización por áreas médicas |
| 📊 **Dashboard** | Métricas en tiempo real, estadísticas visuales |
| 🔍 **Búsqueda** | Filtros avanzados por múltiples criterios |
| 📱 **Responsive** | Diseño adaptable a dispositivos móviles |

---

## 🛠️ Tecnologías

### Backend
- **Java 17** - Lenguaje de programación principal
- **Spring Boot 3.5** - Framework de desarrollo
- **Spring Data MongoDB** - Integración con MongoDB
- **Spring Web** - Controladores REST
- **Lombok** - Reducción de código boilerplate
- **Validation API** - Validación de datos

### Frontend
- **Thymeleaf** - Motor de plantillas
- **Bootstrap 5** - Framework CSS
- **JavaScript ES6** - Interactividad del cliente
- **FontAwesome** - Iconografía

### Base de Datos
- **MongoDB 7.0** - Base de datos NoSQL
- **MongoDB Compass** - Cliente visual (desarrollo)
- **MongoDB Atlas** - Cloud database (producción)

### Herramientas
- **Gradle** - Gestión de dependencias y build
- **IntelliJ IDEA** - IDE de desarrollo
- **Postman** - Testing de APIs
- **Git** - Control de versiones

---

## 🏗 Arquitectura

```
HospitalSystem/
│
├── 📂 src/main/java/com/hospital/
│   ├── 📂 controller/          # Controladores REST y vistas
│   │   ├── ApiController.java
│   │   └── ViewController.java
│   │
│   ├── 📂 model/                # Entidades MongoDB
│   │   ├── Paciente.java
│   │   ├── Medico.java
│   │   ├── Cita.java
│   │   └── Especialidad.java
│   │
│   ├── 📂 repository/           # Repositorios MongoDB
│   │   ├── PacienteRepository.java
│   │   ├── MedicoRepository.java
│   │   ├── CitaRepository.java
│   │   └── EspecialidadRepository.java
│   │
│   ├── 📂 service/              # Lógica de negocio
│   │   ├── PacienteService.java
│   │   ├── MedicoService.java
│   │   ├── CitaService.java
│   │   └── EspecialidadService.java
│   │
│   ├── 📂 dto/                  # Data Transfer Objects
│   ├── 📂 exception/            # Manejo de excepciones
│   ├── 📂 config/               # Configuraciones
│   └── HospitalSystemApplication.java
│
├── 📂 src/main/resources/
│   ├── 📂 templates/            # Vistas Thymeleaf
│   │   ├── index.html
│   │   ├── pacientes.html
│   │   ├── medicos.html
│   │   ├── especialidades.html
│   │   └── citas.html
│   │
│   ├── 📂 static/               # Recursos estáticos
│   │   ├── 📂 css/
│   │   ├── 📂 js/
│   │   └── 📂 images/
│   │
│   └── application.properties   # Configuración de la app
│
├── 📂 src/test/                 # Tests unitarios
├── build.gradle                 # Configuración Gradle
└── README.md
```

### Patrón de Diseño: MVC (Model-View-Controller)

- **Model**: Entidades MongoDB con anotaciones `@Document`
- **View**: Plantillas Thymeleaf + Bootstrap
- **Controller**: REST APIs + Controladores de vista

---

## 🚀 Instalación

### Prerrequisitos

Antes de comenzar, asegúrate de tener instalado:

- ☕ **Java JDK 17** o superior - [Descargar](https://www.oracle.com/java/technologies/downloads/)
- 🍃 **MongoDB 7.0+** - [Descargar](https://www.mongodb.com/try/download/community)
- 🧭 **MongoDB Compass** (opcional) - [Descargar](https://www.mongodb.com/products/compass)
- 🧱 **Gradle 8.0+** (incluido en el wrapper)

### Pasos de Instalación

#### 1. Clonar el repositorio

```bash
git clone https://github.com/Hazielcode/NOMERCY-SYSTEM.git
cd NOMERCY-SYSTEM
```

#### 2. Verificar MongoDB

Asegúrate de que MongoDB esté corriendo:

```bash
# En Windows
net start MongoDB

# En macOS/Linux
sudo systemctl start mongod
```

Verifica la conexión:

```bash
mongosh
> show dbs
> use hospitaldb
> exit
```

#### 3. Configurar la aplicación

Edita el archivo `src/main/resources/application.properties`:

```properties
# Configuración de la aplicación
spring.application.name=HospitalSystem

# Configuración de MongoDB
spring.data.mongodb.uri=mongodb://localhost:27017/hospitaldb
spring.data.mongodb.database=hospitaldb

# Puerto del servidor
server.port=8080

# Logging
logging.level.org.springframework.data.mongodb=DEBUG

# Thymeleaf
spring.thymeleaf.cache=false
```

#### 4. Construir el proyecto

```bash
# Windows
gradlew clean build

# macOS/Linux
./gradlew clean build
```

#### 5. Ejecutar la aplicación

```bash
# Windows
gradlew bootRun

# macOS/Linux
./gradlew bootRun
```

#### 6. Acceder a la aplicación

Abre tu navegador en:

```
http://localhost:8080
```

---

## ⚙️ Configuración

### Variables de Entorno

Para entornos de producción, configura las siguientes variables:

```bash
# MongoDB URI
MONGODB_URI=mongodb://username:password@host:port/database

# Puerto de la aplicación
SERVER_PORT=8080

# Perfil activo
SPRING_PROFILES_ACTIVE=production
```

### Configuración con MongoDB Atlas (Cloud)

```properties
spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster.mongodb.net/hospitaldb?retryWrites=true&w=majority
spring.data.mongodb.database=hospitaldb
```

### Configuración de Seguridad (Opcional)

Para añadir seguridad básica, agrega en `application.properties`:

```properties
spring.security.user.name=admin
spring.security.user.password=admin123
```

---

## 📖 Uso

### Interfaz Web

#### Página Principal
Accede al dashboard desde `http://localhost:8080/`

#### Gestión de Pacientes
1. Navega a `/view/pacientes`
2. Haz clic en "Nuevo Paciente"
3. Completa el formulario
4. Guarda los cambios

#### Programar una Cita
1. Ve a `/view/citas`
2. Selecciona "Nueva Cita"
3. Elige paciente, médico, fecha y hora
4. Confirma la cita

### Rutas Disponibles

| Tipo | Ruta | Descripción |
|------|------|-------------|
| 🏠 Vista | `/` | Página de inicio |
| 👥 Vista | `/view/pacientes` | Gestión de pacientes |
| 👨‍⚕️ Vista | `/view/medicos` | Gestión de médicos |
| 🏥 Vista | `/view/especialidades` | Gestión de especialidades |
| 📅 Vista | `/view/citas` | Gestión de citas |

---

## 🔌 API Reference

### Pacientes

#### Listar todos los pacientes
```http
GET /api/pacientes
```

#### Obtener un paciente
```http
GET /api/pacientes/{id}
```

#### Crear paciente
```http
POST /api/pacientes
Content-Type: application/json

{
  "nombre": "Carlos",
  "apellido": "Ramirez",
  "dni": "98765432",
  "telefono": "945123678",
  "correo": "carlos.ramirez@example.com",
  "direccion": "Av. Los Robles 456"
}
```

#### Actualizar paciente
```http
PUT /api/pacientes/{id}
Content-Type: application/json

{
  "nombre": "Carlos Actualizado",
  "apellido": "Ramirez",
  ...
}
```

#### Eliminar paciente
```http
DELETE /api/pacientes/{id}
```

### Médicos

#### Listar todos los médicos
```http
GET /api/medicos
```

#### Crear médico
```http
POST /api/medicos
Content-Type: application/json

{
  "nombre": "Dr. Juan",
  "apellido": "Pérez",
  "especialidad": "Cardiología",
  "telefono": "987654321",
  "correo": "juan.perez@hospital.com"
}
```

### Citas

#### Listar todas las citas
```http
GET /api/citas
```

#### Crear cita
```http
POST /api/citas
Content-Type: application/json

{
  "fecha": "2025-10-25",
  "hora": "09:30:00",
  "motivo": "Chequeo general",
  "paciente": {
    "id": "6714d9fbb23d91a3b2c3d0e1"
  },
  "medico": {
    "id": "6714da12b23d91a3b2c3d0e2"
  }
}
```

### Especialidades

#### Listar especialidades
```http
GET /api/especialidades
```

#### Crear especialidad
```http
POST /api/especialidades
Content-Type: application/json

{
  "nombre": "Cardiología",
  "descripcion": "Especialidad médica del corazón"
}
```

---

## 💡 Ejemplos

### Ejemplo 1: Crear y Asignar Cita

```json
// 1. Crear paciente
POST /api/pacientes
{
  "nombre": "María",
  "apellido": "González",
  "dni": "12345678",
  "telefono": "999888777",
  "correo": "maria@email.com",
  "direccion": "Calle Principal 123"
}

// Respuesta: { "id": "abc123..." }

// 2. Crear médico
POST /api/medicos
{
  "nombre": "Dr. Pedro",
  "apellido": "Martínez",
  "especialidad": "Medicina General",
  "telefono": "988777666",
  "correo": "pedro.med@hospital.com"
}

// Respuesta: { "id": "def456..." }

// 3. Crear cita
POST /api/citas
{
  "fecha": "2025-11-01",
  "hora": "10:00:00",
  "motivo": "Consulta de rutina",
  "paciente": { "id": "abc123..." },
  "medico": { "id": "def456..." }
}
```

### Ejemplo 2: Buscar Pacientes por DNI

```bash
curl -X GET "http://localhost:8080/api/pacientes?dni=12345678"
```

---

## 📸 Capturas de Pantalla

### Dashboard Principal
<p align="center">
  <img src="https://i.imgur.com/dashboard.png" width="700" alt="Dashboard"/>
</p>

### MongoDB Compass - Colecciones
<p align="center">
  <img src="https://i.imgur.com/2xLwbA1.png" width="700" alt="MongoDB Compass"/>
</p>

### Gestión de Pacientes
<p align="center">
  <img src="https://i.imgur.com/pacientes.png" width="700" alt="Pacientes"/>
</p>

---

## 🧪 Pruebas

### Pruebas con Postman

1. Importa la colección de Postman (disponible en `/docs/postman_collection.json`)
2. Configura la variable de entorno `BASE_URL=http://localhost:8080`
3. Ejecuta los tests automatizados

### Pruebas con MongoDB Compass

1. Conecta a `mongodb://localhost:27017`
2. Selecciona la base de datos `hospitaldb`
3. Verifica las colecciones creadas:
   - ✅ `pacientes`
   - ✅ `medicos`
   - ✅ `especialidades`
   - ✅ `citas`

### Verificación Rápida

```bash
# Verificar que el servidor está corriendo
curl http://localhost:8080/api/pacientes

# Crear un paciente de prueba
curl -X POST http://localhost:8080/api/pacientes \
  -H "Content-Type: application/json" \
  -d '{"nombre":"Test","apellido":"User","dni":"11111111"}'
```

---

## 🗺 Roadmap

### Versión 2.0 (Planificada)

- [ ] 🔐 Sistema de autenticación y roles (Spring Security)
- [ ] 📧 Notificaciones por email
- [ ] 📱 API REST documentada con Swagger/OpenAPI
- [ ] 📊 Reportes en PDF
- [ ] 🔔 Sistema de recordatorios de citas
- [ ] 💳 Módulo de facturación
- [ ] 📈 Dashboard con gráficos avanzados (Chart.js)
- [ ] 🌍 Internacionalización (i18n)
- [ ] 🐳 Dockerización completa
- [ ] ☁️ Deploy automático en la nube

### Ideas Futuras

- 🤖 Chatbot de atención al paciente
- 📲 Aplicación móvil (React Native)
- 🔗 Integración con sistemas externos (laboratorios, farmacias)
- 🧬 Almacenamiento de historial médico completo
- 📷 Carga de imágenes médicas

---

## 🤝 Contribuir

Las contribuciones son bienvenidas. Para cambios importantes:

1. **Fork** el proyecto
2. Crea una **rama** para tu feature (`git checkout -b feature/AmazingFeature`)
3. **Commit** tus cambios (`git commit -m 'Add: nueva funcionalidad'`)
4. **Push** a la rama (`git push origin feature/AmazingFeature`)
5. Abre un **Pull Request**

### Guía de Estilo

- Usa nomenclatura en español para clases y métodos
- Sigue las convenciones de Java (camelCase, PascalCase)
- Comenta código complejo
- Escribe tests para nuevas funcionalidades

---

## 👨‍💻 Autor

<p align="center">
  <img src="https://i.imgur.com/author.png" width="120" alt="Author"/>
</p>

**Samir Haziel Alfonso Solorzano**

🎓 Desarrollador Backend Especializado en Java & Spring Boot  
💼 Apasionado por la arquitectura de software y bases de datos NoSQL

📧 **Email**: hazielcode.dev@gmail.com  
🐙 **GitHub**: [@Hazielcode](https://github.com/Hazielcode)  
💼 **LinkedIn**: [Samir Haziel](https://linkedin.com/in/hazielcode)  
🌐 **Portfolio**: [hazielcode.dev](https://hazielcode.dev)

---

## 📄 Licencia

Este proyecto está bajo la Licencia MIT. Ver el archivo `LICENSE` para más detalles.

```
MIT License

Copyright (c) 2025 Samir Haziel Alfonso Solorzano

Se concede permiso, de forma gratuita, a cualquier persona que obtenga una copia
de este software y archivos de documentación asociados (el "Software"), para usar
el Software sin restricciones...
```

---

## 🌟 Agradecimientos

- Gracias a la comunidad de **Spring Boot** por la excelente documentación
- A **MongoDB** por su plataforma flexible y escalable
- A todos los que contribuyeron con feedback y sugerencias

---

## 📊 Estadísticas del Proyecto

![GitHub stars](https://img.shields.io/github/stars/Hazielcode/NOMERCY-SYSTEM?style=social)
![GitHub forks](https://img.shields.io/github/forks/Hazielcode/NOMERCY-SYSTEM?style=social)
![GitHub watchers](https://img.shields.io/github/watchers/Hazielcode/NOMERCY-SYSTEM?style=social)

---

<p align="center">
  <img src="https://i.imgur.com/3Yh7eXb.png" width="120" alt="Spring Boot Logo"/>
</p>

<p align="center">
  ⭐ <b>Si este proyecto te resultó útil, no olvides dejar una estrella en el repositorio</b> ⭐
</p>

<p align="center">
  <b>Desarrollado con ❤️ por Hazielcode</b>
</p>

---

<p align="center">
  <sub>HospitalSystem v1.0.0 - 2025</sub>
</p>
