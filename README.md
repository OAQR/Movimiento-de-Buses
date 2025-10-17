# Movimiento de Buses - Sistema de Gestión de Flotas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white)

## 📜 Descripción General

**Movimiento de Buses** es una aplicación de escritorio robusta desarrollada en Java Swing, diseñada para la gestión integral de una flota de autobuses. El sistema ofrece una solución completa para administrar conductores, horarios y buses, con un sistema de autenticación basado en roles que garantiza un acceso seguro y permisos diferenciados para cada tipo de usuario.

El proyecto destaca por su arquitectura modular, su sistema de almacenamiento dual (MySQL y CSV) para garantizar la disponibilidad de los datos, y una interfaz de usuario limpia y personalizable con temas claro y oscuro.

## ✨ Características Principales

*   **Autenticación y Roles de Usuario:** Sistema de inicio de sesión seguro que asigna roles a los usuarios (Administrador, Supervisor, Conductor), cada uno con su propia interfaz y permisos específicos.
*   **Gestión de Conductores (CRUD):** Funcionalidad completa para registrar, consultar, modificar y eliminar conductores del sistema.
*   **Interfaz de Administrador:** Permite la gestión de horarios, buses y la supervisión general del sistema.
*   **Interfaz de Supervisor:** Enfocada en la gestión y registro de conductores.
*   **Interfaz de Conductor:** Ofrece acceso limitado a la información relevante para el conductor, como horarios y datos personales.
*   **Sistema de Almacenamiento Dual:**
    *   Conexión principal a una base de datos **MySQL** a través de JDBC para persistencia de datos.
    *   Sistema de respaldo (fallback) que utiliza archivos **CSV** para leer y escribir datos si la conexión a la base de datos falla, garantizando la continuidad operativa.
*   **Algoritmos de Ordenamiento:** Implementación de múltiples algoritmos (Bubble Sort, Insertion Sort, Quick Sort, Shell Sort) para la ordenación eficiente de datos en las interfaces.
*   **Sistema de Temas Dinámico:** Permite al usuario cambiar entre un tema claro y uno oscuro en tiempo real, mejorando la experiencia de usuario.
*   **Arquitectura Modular:** El código está organizado siguiendo principios de separación de responsabilidades, con una clara distinción entre la interfaz de usuario, la lógica de negocio y el acceso a datos.

## 🛠️ Tecnologías y Herramientas

*   **Lenguaje de Programación:** Java
*   **Framework de UI:** Java Swing
*   **Base de Datos:** MySQL
*   **Conectividad de Base de Datos:** JDBC
*   **Patrones de Diseño:** Singleton (para la conexión a la base de datos), Modelo-Vista-Controlador (para la estructura de la aplicación).

## 🏗️ Arquitectura del Sistema

El sistema se basa en una arquitectura de tres capas que separa la presentación, la lógica y los datos.

1.  **Capa de Presentación (UI):** Construida con Java Swing, contiene todas las interfaces de usuario (Login, Administrador, Supervisor, etc.) y gestiona la interacción con el usuario.
2.  **Capa de Lógica de Negocio:** Implementa las reglas y funcionalidades del sistema, como la validación de datos, la gestión de roles y la coordinación de operaciones.
3.  **Capa de Acceso a Datos:** Se encarga de la comunicación con la base de datos MySQL y de las operaciones de lectura/escritura en archivos CSV, abstrayendo el origen de los datos del resto de la aplicación.

*(Opcional: Si tienes capturas de pantalla, puedes agregarlas aquí)*
### Diagrama de Flujo de Autenticación
![Auth Flow](URL_A_TU_IMAGEN_DE_AUTENTICACION)

### Diagrama del Modelo de Datos
![Data Model](URL_A_TU_IMAGEN_DEL_MODELO_DE_DATOS)

## 🚀 Cómo Empezar

*(Esta sección es una plantilla. Debes ajustarla a tu proyecto específico)*

### Prerrequisitos
*   JDK 8 o superior.
*   Servidor de base de datos MySQL.
*   Un IDE de Java como IntelliJ IDEA o Eclipse.

### Instalación
1.  Clona el repositorio:
    ```sh
    git clone https://github.com/tu-usuario/Movimiento-de-Buses.git
    ```
2.  Configura la conexión a la base de datos en el archivo de configuración correspondiente, especificando la URL, usuario y contraseña de tu instancia de MySQL.
3.  Importa el script de la base de datos (`schema.sql`) en tu servidor MySQL para crear las tablas necesarias.
4.  Compila y ejecuta el proyecto desde tu IDE.
