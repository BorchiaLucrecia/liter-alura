## LiterAlura 
Alumno: Borchia Leila Lucrecia  
Curso: Alura Latam + Oracle Especialización Backend

***Descripción***  
LiterAlura es un catálogo de libros que permite a los usuarios interactuar a través de la consola. 
El objetivo del proyecto es consumir una API de libros ( [Gutendex.com](https://gutendex.com/) ), manipular los datos JSON, almacenarlos en una base de datos y
ofrecer diversas opciones de interacción a los usuarios.

***Objetivo***  
Desarrollar un Catálogo de Libros con al menos 5 opciones de interacción que se detallen a continuación:

      1. Buscar libro por título  
      2. Listar libros registrados  
      3. Listar autores registrados  
      4. Listar autores vivos en un determinado año  
      5. Listar libros por idioma  
      6.  Estadísticas de los libros registrados  
      7.  Listar libros más descargados de la API Gutendex  
      8.  Listar libros más descargados en nuestro registro  
      9.  Buscar autor por nombre  
      
***Pasos del Proyecto***  
      Configuración del Ambiente Java: Preparar el entorno de desarrollo con Java.  
      Creación del Proyecto: Iniciar un proyecto con Spring Boot.  
      Consumo de la API: Realizar solicitudes a la API de libros.  
      Análisis de la Respuesta JSON: Procesar y analizar los datos obtenidos de la API.  
      Inserción y Consulta en la Base de Datos: Almacenar y recuperar datos en una base de datos PostgreSQL.  
      Exhibición de Resultados a los Usuarios: Mostrar los resultados de las consultas a través de la consola.  
      Configuración del Entorno
      
***Requisitos***  
      *  Java 22  
      *  Maven  
      *  PostgreSQL  
      *  Variables de Entorno: Para proteger la información sensible, configurar las siguientes variables de entorno:

      export LITERALURA_DB_URL=jdbc:postgresql://localhost/literalura
      export LITERALURA_DB_USERNAME=postgres
      export LITERALURA_DB_PASSWORD=yourpassword
      Archivo application.properties

      spring.application.name=LiterAlura
      
      spring.datasource.url=${LITERALURA_DB_URL}
      spring.datasource.username=${LITERALURA_DB_USERNAME}
      spring.datasource.password=${LITERALURA_DB_PASSWORD}
      spring.datasource.driver-class-name=org.postgresql.Driver
      
      spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
      spring.jpa.hibernate.ddl-auto=update
      
***Ejecución del Proyecto***
      Para ejecutar el proyecto, utiliza el siguiente comando:  
      
            mvn spring-boot:run

***Estructura del Proyecto***  
      *  controllers: Controladores para manejar las solicitudes de los usuarios.  
      *  services: Servicios para la lógica de negocio y consumo de la API.  
      *  models: Modelos para representar las entidades de libros y autores.  
      *  repositories: Repositorios para la interacción con la base de datos.  
