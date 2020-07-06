# Enunciados

**Ejercicio 1**

Mostrar por consola los 10 primeros números enteros y los 10 primeros números impares

**Ejercicio 2**

Leer 10 palabras y mostrarlas en orden inverso al que fueron ingresadas.

**Ejercicio 3**

Leer 10 palabras, luego leer una nueva palabra e indicar si la misma ya había sido ingresada en las 10 primeras.

**Ejercicio 4**

Leer un entero y luego una lista de 20 enteros. Guardar los mayores al número inicial y mostrarlos al final. Usar arrays, no otras colecciones.

**Ejercicio 5**

![Diagrama](./img/diagramaClases01.png)

De acuerdo al diagrama de clases resolver:

Cargar una lista de empleados (máximo 20) preguntado en cada uno si son administrativos o vendedores y cargar todos los datos respectivos.

Luego listar los empleados indicando: dni, nombre, apellido y sueldo.
El sueldo debe calcularse en el método getSueldo() de la siguiente forma:
* Si es administrativo: sueldoBase \* ((hsExtra \* 1.5)+hsMes) / hsMes
* Si es vendedor: sueldoBase + (porcenComision\*totalVtas/100)

Restricciones
* Utilizar un único array para almacenar a todos los empleados. No usar colecciones dinámicas.
* Hacer uso de las ventajas de la programación orientada a objetos: herencia, redefinición y polimorfismo.
* Las clases lógicas (las del diagrama) no pueden tener entrada o salida de datos por pantalla de ningún tipo. Esto debe ser realizado por otra clase que cree los objetos de las clases lógicas y les asigne los datos necesarios.

**Ejercicio 6**

Resolver los ejercicios 4 y 5 usando LinkedList o ArrayList en lugar de Arrays.

**Ejercicio 7**

Completar el desarrolo del Ejemplo 5 de Acceso a Datos.
Pueden encontrar el código en este [link](../ejemplos/Ej5AccesoADatos)
1. En primer lugar debe seguir estas [instrucciones](../ejemplos/Ej5AccesoADatos/src/steps.md)
2. Para ello usará los archivos del directorio [db](../ejemplos/Ej5AccesoADatos/db) para crear la base de datos y usuario para el ejercicio.
3. Luego debe completar la funcionalidad del ejercicio [planteada en el menú](../ejemplos/Ej5AccesoADatos/src/ui/Menu.java) con los comandos
      * search
      * new
      * edit
      * delete
4. Los comandos deben cumplir con la descripción indicada en el método getCommand() de la clase Menu.java
5. Algunos como new se encuentran parcialmente implementados. Se recomienda seguir ese orden ya que la dificultad es incremental.
6. Deben enfocarse en el uso de capas y de acceso a base de datos, no es necesario hacer validaciones de entrada de datos ni enfocarse en la estética de la entrada o salida de datos.
7. Para más información sobre el ejercicio consultar estos videos:
      * [recorrido del ejemplo](https://youtu.be/Rj65U8Vupjs)
      * [enunciado](https://youtu.be/QTO1kfTv92A)
8. Para una explicación más detallada de capas y jdbc pueden consultar los videos de esta lísta de reproducción: [jdbc](https://www.youtube.com/playlist?list=PLm49vB0eFOFHWj_wQzXNL1pmYaI3jt10E)
