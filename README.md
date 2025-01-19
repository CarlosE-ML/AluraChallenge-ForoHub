# AluraChallenge-ForoHub
Un foro es un lugar donde todos los participantes de una plataforma pueden colocar sus preguntas sobre determinados asuntos. Los estudiantes utilizan el foro para resolver sus dudas sobre los cursos y proyectos en los que están participando. Este lugar mágico está lleno de mucho aprendizaje y colaboración entre estudiantes, profesores y moderadores.

---

## Características Principales
1. **Iniciar sesión:** Se loguea el usuario.
2. **Registrar Tópico:** Guarda un nuevo tópico en la base de datos.
3. **Listar Tópico:** Muestra todos los tópicos registrados.
4. **Consultar Tópico:** Obtiene un tópico específico por su ID.
5. **Actualizar Tópico:** Modifica la información de un tópico existente.
6. **Eliminar Tópico:** Borra un tópico mediante su ID.
7. **Conectar a base de datos:** Uso de MySQL con configuración adaptable en application.properties.
8. **Autenticacion y seguridad:** Implementación de Spring Security con autenticación JWT.

---

## Requisitos del Sistema
### Herramientas Necesarias
- **Java Development Kit (JDK)**: Versión 11 o superior.
- **IntelliJ IDEA**: IDE para desarrollar y ejecutar el proyecto.
- **Maven**: Administrador de dependencias integrado en el proyecto.
- **PostgreSQL**: Base de datos para almacenar información sobre topicos y usuarios.

### Dependencias
El proyecto utiliza las siguientes dependencias (declaradas en el archivo `pom.xml`):
- **Spring Boot 3**
- **Spring Web, Data JPA, DevTools, Security**
- **Lombok**
- **Flyway Migration**
- **MySQL**

---

## Configuración del Proyecto
1. **Configurar la Base de Datos MySQL:**
   - Crear una base de datos llamada `foro_hub`.
   - Actualizar las credenciales de conexión en el archivo `application.properties`:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:8080/foro_hub
     spring.datasource.username=tu_usuario
     spring.datasource.password=tu_contraseña
     spring.jpa.hibernate.ddl-auto=update
     ```

2. **Clonar el Proyecto:**
   - Clonar este repositorio en su máquina local y abrirlo en IntelliJ IDEA.

3. **Instalar Dependencias:**
   - Ejecutar el comando `mvn install` para descargar todas las dependencias necesarias.

4. **Ejecutar la Aplicación:**
   - Ejecutar la clase principal del proyecto.

---

## Estructura del Proyecto
### Paquetes Principales
1. **`controller`**:
   - Contiene las clases `Controladores`.
2. **`dominio`**:
   - Contiene las clases de Entidades y la obtencion de datos DTO.
3. **`infra`**:
   - Define las clases de errores, seguridad y spring docs.
4. **`repositorio`**:
   - Contiene interfaces que permiten interactuar con la base de datos.

### Tablas Principales
1. **`topico`**:
   - Almacena información sobre los topicos.
2. **`usuarios`**:
   - Almacena información sobre los usuarios.

---

## Tecnologías Utilizadas
- **Lenguaje:** Java 11
- **Frameworks:** Spring Boot 3
- **Base de Datos:** PostgreSQL
- **Dependencias Adicionales:** Jackson, Spring Data JPA
- **Aplicaciones Externas:** Insomnia, MySQL Workbench

---

## Autor
- Nombre: Carlos EML.
- Contacto: carlosmonteroleon@gmail.com

