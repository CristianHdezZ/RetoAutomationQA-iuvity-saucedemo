# RetoAutomationQA-iuvity
#**Test Automation - Screenplay Pattern - Web**

## Pre-requisitos
1. Java 8
2. Gradle 5.2.1 o Superior
3. IDE de desarrollo
	- a) Eclipse 
	- b) IntelliJ

## Descripción

Este proyecto es un reto de automatización a nivel Web, se encuentra creado bajo el patrón de diseño Screenplay e integra varios frameworks como Serenity y Cucumber dentro del manejador de proyecto Gradle.

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (userinterface). La estructura completa del proyecto es la siguiente:
```
    + ## exceptions
        Clases que controlan las posibles excepciones técnicas y de negocios que se presentan durante la ejecución de pruebas
    + ## model
        Clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario
    + ## tasks
        Clases que representan tareas que realiza el actor a nivel de proceso de negocio
    + ## interactions
        Clases que representan las interacciones directas con la interfaz de usuario
    + ## userinterface
        Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario o aplicacion Web
    + ## questions
        Objetos usados para consultar acerca del estado de la aplicación o verificar el resultado esperado de la ejecución de prueba.
    + ## util
        Clases de utilidad
    + ## runners
        Clases que permiten correr los tests
    + ## step definitions
        Clases que mapean las líneas Gherkin a código java y donde se llaman todas las tareas(tasks) y preguntas(questions) creadas para la ejecución de 
la prueba
    + ## features
        La representación de las historias de usuarios en archivos cucumber o .feature
```


  
Este proyecto cuenta con la ejecución de un feature:

- **saucedemo.feature**: En este feature se realiza la ejecución de dos escenario donde:
  1. Se agregan 6 prodcutos en un carro de compra, para una compra exitosa en la web **https://www.saucedemo.com/** a través de una data de prueba que se carga por medio de un excel.
  2. Se realiza el flujo de agregar prodcutos al carro de compra y luego cancelar y remover los productos	

---
  
---
## Instalación

Para instalar el proyecto deben seguir los siguientes pasos:
  
**1. Clonar el proyecto**

```
git clone https://github.com/CristianHdezZ/RetoAutomationQA-iuvity-saucedemo.git
```

**2. Importar el proyecto**
  
Para importar el proyecto debe hacerlo desde el IDE de su preferencia seleccionando la carpeta **"TestQA-RetoSaucedemo"** como un proyecto Gradle. 
  
  
**3. Ejecutar el proyecto** 

Para ejecutar el proyecto debe hacerlo a través de uno de los siguientes pasos: 
  
**3.1 A través de línea de comando**
  
Si se desea realizar a través de la línea de comando se debe ejecutar desde una consola de comandos (de su preferencia) con el comando: 

```
gradle clean test aggregate --info
```
  
**3.2 A través de IDE** 
  
Si se desea realizar la ejecución a través del IDE de desarrollo, se debe seleccionar la clase **"SaucedemoRunner"** y dar clic derecho, seleccionar la opción que permita correr la prueba. 
  
---
  
---
## ️Autores
* **Cristian Hernandez Z.** - **TCS** - [CristianHdezZ](https://github.com/CristianHdezZ/)
---

