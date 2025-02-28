
# Analizador Léxico

**Descripción:**
Este proyecto implementa un analizador léxico utilizando Autómatas Finitos Deterministas (AFD). Un analizador léxico es una herramienta fundamental en el proceso de compilación que se encarga de convertir una secuencia de caracteres en una secuencia de tokens, identificando las unidades léxicas del lenguaje de programación.

## Contenido del Repositorio

El repositorio incluye los siguientes directorios y archivos:

- **`src/main/java/`**: Contiene el código fuente del proyecto, desarrollado en Java.
- **`target/`**: Directorio que almacena los archivos compilados y otros artefactos generados durante el proceso de construcción.
- **`letras azules fondo blanco.jpg`**: Imagen que posiblemente se utiliza en la interfaz o documentación del proyecto.
- **`log.txt`**: Archivo de registro que puede contener logs generados durante la ejecución del analizador.
- **`pom.xml`**: Archivo de configuración de Maven que gestiona las dependencias y la construcción del proyecto.

## Requisitos Previos

Para ejecutar este proyecto, necesitarás:

- **Java Development Kit (JDK)**: Versión 8 o superior.
- **Maven**: Herramienta de automatización de compilación para proyectos Java.

## Instalación y Ejecución

1. **Clonar el repositorio:**

   ```bash
   git clone https://github.com/carlosGJAlcala/AnalizadorLexico.git
   cd AnalizadorLexico
   ```

2. **Compilar el proyecto utilizando Maven:**

   ```bash
   mvn clean install
   ```

   Este comando descargará las dependencias necesarias y compilará el proyecto.

3. **Ejecutar el analizador léxico:**

   ```bash
   java -jar target/AnalizadorLexico-1.0-SNAPSHOT.jar
   ```

   Asegúrate de reemplazar `AnalizadorLexico-1.0-SNAPSHOT.jar` con el nombre exacto del archivo JAR generado durante la compilación.

## Uso

El analizador léxico procesa archivos de código fuente para identificar y clasificar los tokens presentes. Para utilizarlo:

- Prepara un archivo de código fuente que desees analizar.
- Ejecuta el analizador proporcionando el archivo como argumento en la línea de comandos:

  ```bash
  java -jar target/AnalizadorLexico-1.0-SNAPSHOT.jar ruta/al/archivo_de_codigo.txt
  ```

- Revisa la salida generada para ver la lista de tokens identificados y cualquier posible error léxico encontrado.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas colaborar:

1. Realiza un fork del repositorio.
2. Crea una nueva rama para tus modificaciones.
3. Envía un pull request detallando los cambios propuestos.

## Licencia

Este proyecto se distribuye bajo la licencia MIT. Para más detalles, consulta el archivo `LICENSE` en el repositorio.

