# BIENVENID@ A TU FORO ONLINE 

# Challenge Foro Hub

## Descripción

Foro Online es una aplicación diseñada para optimizar la comunicación y el intercambio de ideas entre los usuarios. Con esta herramienta, los usuarios pueden crear temas, responder a ellos y participar activamente en discusiones.
## Tecnologías Utilizadas

- **Sistema Operativo:** Windows 10 ![Windows 10](img/LogoWindows10.png)
- **Entorno de Desarrollo Integrado (IDE):** Intellij IDEA ver. 241.15989.150 ![IDE](img/IDE.png)
- **JDK de Java:** 17.0.11 ![JDK](img/JDK.png)
- **Framework:** Spring Framework ![Spring](img/Spring.png)
- **Gestor de Dependencias :** Maven ![Maven](img/maven.png)
- **mapeo objeto-relacional:** Hibernate ![Hibernate](img/hibernate.png)
- **Gestor de bases de datos :** MySql ![MySql](img/MYSQL.png)
- **Servicios de seguridad :** Spring Security  ![Spring Security ](img/spring_security.png)
- **Creación de tokens :** JWT (JSON Web Tokens) ![JSON Web Tokens](img/JWT.png)
- **Mapeo objeto-relacional :** JPA (Java Persistence API) ![JPA](img/JPA.png)
- **Pruebas de API :** Insomnia ![Insomnia](img/insomnia.jpg)
- **Anotaciones y funciones Spring :** Lombok ![Lombok](img/lombok.png)
- **Versionamiento esquema de base de datos :** Flyway ![Flyway](img/Flyway_logo.svg.png)
- **Documentación de API :** Swagger ![Swagger](img/Swagger.png)

## Características Principales

- **Base de Datos**: Utiliza MySQL como gestor de bases de datos relacional para almacenar y gestionar los datos de la aplicación.

- **Framework Backend**: Se emplea Spring Framework para el desarrollo del backend, aprovechando su potencia en Inyección de Dependencias (DI), Programación Orientada a Aspectos (AOP), y manejo eficiente de transacciones.

- **Seguridad y Autenticación**: Implementación de seguridad robusta con Spring Security para gestionar la autenticación y autorización de usuarios utilizando JWT (JSON Web Tokens).

- **Persistencia de Datos**: Hibernate se utiliza como ORM (Mapeo Objeto-Relacional) para mapear las entidades Java con las tablas de la base de datos MySQL, facilitando las operaciones de persistencia.

- **Gestión de Dependencias**: Maven se utiliza como gestor de dependencias para manejar las bibliotecas y configuraciones del proyecto, asegurando la consistencia y reproducibilidad del entorno de desarrollo.

- **Versionamiento de Esquema de Base de Datos**: Flyway se emplea para el control y migración del esquema de la base de datos MySQL, permitiendo gestionar cambios de manera controlada y automática.

- **Documentación de API**: Se utiliza Swagger para documentar la API REST de manera interactiva, proporcionando una guía detallada de los endpoints disponibles, sus parámetros y respuestas esperadas.

- **Pruebas de API**: Insomnia se utiliza como cliente para realizar pruebas y depurar la API REST, asegurando el correcto funcionamiento de los endpoints y la integridad de los datos.

- **Entorno de Desarrollo**: Intellij IDEA se utiliza como entorno de desarrollo integrado (IDE), proporcionando herramientas avanzadas para la codificación, depuración y gestión del proyecto Java con Spring.

- **JDK de Java**: Se emplea JDK 17 para compilar y ejecutar la aplicación Java, aprovechando las últimas características y mejoras del lenguaje.

- **Lombok**: Se utiliza Lombok para reducir la verbosidad del código Java, generando automáticamente getters, setters, constructores y otros métodos comunes.


### Swagger
La interfaz de Swagger estará disponible en la siguiente URL una vez que el servidor esté en funcionamiento:

```
http://localhost:8080/swagger-ui/index.html
```
![swaggerp.png](img/swaggerp.png)
![swaggerp2.png](img/swaggerp2.png)
![swaggerp3.png](img/swaggerp3.png)

Una vez ejecutes el proyecto, la aplicación estará disponible en:
```
http://localhost:8080

```

A continuación, podrás acceder a los siguientes Endpoints principales:

- **`/login`**: Este endpoint se utiliza para autenticar usuarios. Debes enviar una solicitud POST con un JSON que incluya `username` y `password`.

- **`/usuarios`**: Este endpoint lista usuarios. Es necesario autenticarse utilizando un token JWT para acceder a él.

- **`/topicos`**: Este endpoint maneja la creación, actualización y eliminación de tópicos.

## ¡Importante!

Recuerda primero Logiarte entes de realizar peticiones, ingresando los datos de acuerdo al formato:

![swaggerpL.png](img/swaggerpL.png)

```
{
    "username": "nombre_usuario",
    "password": "contraseña"
}
```
Esta acción generará el token correpondiente y podras enviar las peticiones que desees:


## Autor

Este proyecto fue desarrollado por [Felipe Villalobos Montañez].