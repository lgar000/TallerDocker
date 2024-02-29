# TALLER DE MODULARIZACIÓN CON VIRTUALIZACIÓN E INTRODUCCIÓN A DOCKER

La finalidad del siguiente taller es comprender los conceptos básicos y funcionales de las imágenes y contenedores en docker, para ello se realizó la construcción de un servidor web Spark que responde peticiones de tipo GET para calcular el seno, coseno de un número, determinar si una palabra es palindrome y calcular la magnitud de un vector de dos dimensiones.

### Prerrequisitos

- Java
- Maven
- Git
- IDE
- Docker
- 
### Instalación

Para hacer uso del proyecto clone el repositorio usando el siguiente comando

```
git clone hhttps://github.com/lgar000/TallerDocker.git
```

Ubiquese en la carpeta en la cual clono el repositorio. A continuación
acceda a la carpeta principal del proyecto mediante el siguiente comando

```
cd TallerDocker
```

Para empaquetar el proyecto ejecute

```
mvn package
```
## Pruebas y funcionamiento

Para descargar la imagen ubiquese en su cdm y ingrese el siguiente comando  pull lngarcia/firstspkwebapprepo:latest, notara que se ha descargado y puede verificarlo accediento a docker desktop

![imagenesDocker](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/imagenesDocker.png)

A partir de esa imagen podemos procedemos a crear una serie de contenedores, mediante el siguiente comando docker run -d -p 34001:46000 --name firstdockercontainer2 lngarcia/firstspkwebapprepo, podemos verificar que han sido creador a traves de consola:

![verificarContenedores](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/verificarContenedores.png)

O podemos verificarlo a través de docker desktop:

![contenedoresDocker](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/contenedoresEnDocker.png)

Para verificar que los contenedores se encuentran funcionando correctamente ingrese a un navegador y pruebe con cada uno de los puertos en los que se encuentra el contenedor

Ingrese localhost:34000 y debería observar la página con los formularios y puede realizar una prueba de su funcionamiento, este mismo procedimiento lo debe repetir con los dos puertos restantes

![funcionandoPuerto34000](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/funcionando34000.png)

Ingrese localhost:34001

![funcionandoPuerto34001](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/funcionandoPuerto34001.png)

Ingrese localhost:34002

![funcionandoPuerto34002](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/funcionandoPuerto34002.png)

Si desea ejecutar el proyecto localmente debe cambiar el puerto localhost:4567.

Aquí podrá verificar la operación seno:

![senPuerto4567](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/senPuerto4567.png)

Operación coseno:

![cosPuerto4567](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/cosPuerto4567.png)

Validar si una palabra es palindromo:

Con la palabra ana:

![palPuerto4567](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/palindromePuerto4567.png)

Con una palbra que no es palindromo

![nopalPuerto4567](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/noPalindromePuerto4567.png)

Calcular el vector de dos dimensiones

![vecPuerto4567](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/vectorPuerto4567.png)

Adicionalmente cuenta con una validación para verificar que los valores ingresados correspondan con los tipos que se esperan:

![vecNumber](https://github.com/lgar000/TallerDocker/blob/main/Imagenes/validacionNumeros.png)

## Diseño

La aplicación utiliza una arquitectura cliente-servidor. Para construir el servidor estamos utilizando Spark. Tenemos la clase SparkWebServer, donde a través de funciones flecha tenemos las rutas definidas para manejar las solicitudes del cliente. En este caso tenemos cuatro rutas definidas, que son: /cos/:numero, /sin/:numero, /palindrome/:palabra, /vector/:numero1/:numero2. Cada de estas realiza las operaciones necesarias para proporcionar una respuesta. Por otro lado en index.html tenemos definidos cuatro formularios, cada uno para una operación, el index.html y functions.js en el lado del cliente se encargan de recopilar datos y enviar solicitudes al servidor. En functions.js tenemos definidas unas funciones en las cuales se realiza una petición fetch al servidor, aquí se manejan las promesas .then() y se .catch() para manejar cualquier error que pueda ocurrir.   

## Construido Con

* [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) - Lenguaje de programación y desarrollo
* [Html](https://developer.mozilla.org/es/docs/Web/HTML) - Lenguaje de marcado para la elaboración de páginas web
* [JavaScript](https://developer.mozilla.org/es/docs/Web/CSS) -JavaScript es un lenguaje de programación interpretado
* [Maven](https://maven.apache.org/) - Gestión de dependencias
* [Intellij](https://www.jetbrains.com/es-es/idea/) - Entorno de desarrollo integrado para el desarrollo de programas informáticos
* [Git](https://rometools.github.io/rome/) - Sistema de control de versiones distribuido
* [Docker](https://www.docker.com/) - Docker es una plataforma de código abierto diseñada para facilitar la creación, implementación y ejecución de aplicaciones en contenedores


## Autor

* **Laura García** - [lgar000](https://github.com/lgar000)