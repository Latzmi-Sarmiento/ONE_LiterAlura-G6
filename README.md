# Challenge Back-end ONE LiterAlura G6 📚
[![Alura Latam](https://img.shields.io/badge/Alura-Latam-blue?style=flat)](https://www.aluracursos.com/)
[![Static Badge](https://img.shields.io/badge/ONE-Oracle_Next_Education-orange?style=flat&logo=oracle&logoColor=orange)](https://www.oracle.com/co/education/oracle-next-education/) [![Static Badge](https://img.shields.io/badge/IDE-IntelliJ_IDEA-%23ff0534?style=flat&logo=IntelliJ%20IDEA&logoColor=%232196f3)](https://www.jetbrains.com/es-es/idea/) [![Static Badge](https://img.shields.io/badge/Language-Java-%23ff0000?style=flat)](#)
[![Static Badge](https://img.shields.io/badge/Java_Library-Gson_%2F_Json-blue?style=flat&logo=json)](https://mvnrepository.com/artifact/com.google.code.gson/gson)
[![Static Badge](https://img.shields.io/badge/API-Exchange_Rate_API-%23e90000?style=flat)](https://www.exchangerate-api.com/docs/java-currency-api)
[![Static Badge](https://img.shields.io/badge/license-MIT-blue)](#)

## 📋 Descripción del Proyecto
LiterAlura es un proyecto desarrollada en Java como parte del curso de especialización Back-End G6 de Alura - Oracle Next Education (ONE). El objetivo principal del proyecto es permitir la búsqueda y gestión de libros y autores utilizando datos de la API de Gutendex. La aplicación permite a los usuarios buscar libros por título, listar autores almacenados en la base de datos, filtrar autores vivos en un año específico, y buscar libros por idioma.

## 🛠️ Tecnologías Utilizadas
- **IntelliJ IDEA Community Edition y JDK**: Instalar y configurar el entorno de desarrollo Java con IntelliJ IDEA y la versión del JDK 17 o superior.
- **Maven**: Herramienta de gestión de dependencias y construcción de proyectos.
- **Spring Boot**: Utilizar el framework principal para el desarrollo de aplicaciones Java, configurado mediante Spring Initializr.
- **PostgreSQL**: Base de datos utilizada para almacenar información de libros y autores.
- **Gson**: Biblioteca para el manejo de datos en formato JSON.
- **Git y GitHub**: Configurar Git para el control de versiones y alojar el proyecto en GitHub.
- **Postman y Trello**: Usar Postman para probar la API y Trello para gestionar las tareas del proyecto.


## 👩‍💻 Desarrollo del Proyecto
1. **Conectar y Configurar la API**: Utilizar la API de Gutendex para obtener datos de libros. Para interactuar con la API se utilizan clases de Java para manejar solicitudes HTTP y procesar las respuestas.
- **Cliente para Solicitudes (HttpClient)**:Se utiliza la clase HttpClient de Java para realizar solicitudes HTTP a la API de Gutendex, facilitando la obtención de datos.
- **Solicitud (HttpRequest)**: La clase HttpRequest se utiliza para configurar y personalizar las solicitudes enviadas a la API de Gutendex, incluyendo parámetros y URL de consulta.
- **Respuesta (HttpResponse)**: La clase HttpResponse maneja las respuestas de la API, proporcionando acceso al código de estado, encabezados y cuerpo de la respuesta.
- **Conversión de Datos JSON**: Análisis y conversión de datos JSON obtenidos de la API a objetos Java.

2. **Implementar Funcionalidades**:
- **Búsqueda de libro por título**: Permite al usuario buscar libros por título utilizando la API de Gutendex. El primer resultado obtenido se convierte en un objeto Libro con los siguientes atributos
- **Lista de todos los libros**: Presenta en la consola un listado de todos los libros que han sido buscados y almacenados en la base de datos.
- **Lista de autores**: Permite listar todos los autores de los libros buscados y almacenados en la base de datos.
- **Listar autores vivos en determinado año**:Permite listar autores que estaban vivos en un año determinado informado por el usuario.
- **Buscar libros por idiomas**:Permite al usuario ver un listado de libros basados en el idioma en el que fueron escritos.

3. **Interfaz de Usuario**: Crear un menú interactivo en consola que permita al usuario seleccionar opciones para buscar y consultar libros y autores.

4. **Documentación**: Documentar el proyecto en GitHub, incluyendo instrucciones de uso, dependencias y una descripción del funcionamiento en un README.

5. **Funcionalidades Extra**
- **Generación de Estadísticas**:Implementación de funcionalidades para generar estadísticas de los libros y autores, como los libros más descargados o los autores más prolíficos.
-**Búsqueda de Autor por Nombre**:Permitir la búsqueda de autores por nombre, mostrando detalles completos del autor y sus libros asociados.
- **Listado de Autores por Diversos Criterios**:Añadir funcionalidades para listar autores según diversos criterios adicionales, como autores por nacionalidad, género literario, etc.

## 🚀 Cómo Ejecutar el Proyecto
Para ejecutar el proyecto, sigue estos pasos:

- **Clona o descarga desde GitHub**: Clona o descarga el repositorio en tu disco local https://github.com/Latzmi-Sarmiento/ONE_LiterAlura-G6.git
- **Importa el proyecto**: Importa el proyecto en tu IDE (recomendado IntelliJ IDEA) y configura las dependencias.
- **Ejecutar el Proyecto**: Usa tu IDE para compilar y ejecutar la clase LiteraturaApplication.

## ✅ Insignia de Entregado para este Challenge


## 💬 Datos de Contacto
Email:latzmisarmiento@gmail.com

Autor: Latzmi Sarmiento Palomino
