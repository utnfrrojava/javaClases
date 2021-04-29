# Enunciados

**Ejercicio 1**

Mostrar por consola los 10 primeros números enteros y los 10 primeros números impares

**Ejercicio 2**

Leer 10 palabras y mostrarlas en orden inverso al que fueron ingresadas.

**Ejercicio 3**

Leer 10 palabras, luego leer una nueva palabra e indicar si la misma ya había sido ingresada en las 10 primeras.

**Ejercicio 4**

Leer un entero y luego una lista de 20 enteros. Guardar los mayores al número inicial y mostrarlos al final. Usar arrays, no otras colecciones.

**Ejercicio 5a**

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

**Ejercicio 5b**

Resolver los ejercicios 4 y 5 usando LinkedList o ArrayList en lugar de Arrays.

**Ejercicio 6a**

Resolver:
1. Crear una clase Product que contenga los siguientes atributos: id:int, name:String, description:String, price:double, stock: int, shippingIncluded: boolean
2. Crear la base de datos javaMarket con la tabla Product para almacenar objetos de la clase Product con id autoincremental y los demás atributos según corresponda.
3. Cargar al menos 3 registros en la base de datos para realizar el desarrollo.

Crear una app que se conecte a la DB y permita:
1. list. Listar todos los productos indicando: id, name y price.
2. search. Mostrar los datos completos de un Product. El usuario debe ingresar un id y la app debe mostrar todos los datos de ese articulo.
3. new. Cargar nuevos Products (sin id) e insertarlos en la tabla. Durante la inserción debe recuperar el id generado en la BD y mostrarlo al usuario (no puede realizar un nuevo select)
4. delete. Eliminar un Product. El usuario debe ingresar un id y la app debe eliminar el registro
5. update. Modificar un Product. El usuario debe ingresar un id y la app debe mostrar los datos actuales y preguntar los nuevos datos. Finalmente debe aplicar el cambio en la base de datos.

Restricciones:
* Todo el manejo de la base de datos debe hacerse en una clase que no sea el programa principal ni la clase Product.
* La clase Product no puede contener código para leer o escribir datos de/a la interfaz, ni de o hacia la DB.
* Cada operación debe realizarse en un método (puede invocar a otros si desea reusar el código).
* Cada método solo puede recibir y/o devolver objetos Product o una colección (array, ArrayList, LinkedList, etc) de objetos Product. Por ejemplo el listar no necesita recibir nada y devuelve una colección de Product, el mostrar recibe un bbjeto Product con el id y devuelve uno completo.
* El archivo .jar del conector a la DB debe ubicarse localmente en el proyecto.

Sugerencias:
* No preocuparse por validaciones.
* Hacer un menu simple que itere y pregunte por las opciones requeridas (agregar una opción para salir)
* Primero cree la clase lógica, luego el menú sin realizar acciones y finalmente desarrollar las acciones una a una por el orden indicado, ya que se han listado en orden de dificultad.

**Ejercicio 6b**

* Al ejercicio 6a en la clase Product agregar el atributo disabledOn:Date.
* Realizar las modificaciones al ejercicio 6a para utilizar el nuevo atributo.
* Crear dos métodos que se encarguen de abrir y cerrar las conexiones a la base de datos y utilizarlos desde los otros métodos.
* Asegurarse de que todos los métodos liberen correctamente los recursos utilizados (cerrar resultsets, statements, conecciones). Esto incluye el manejo de errores con try catch finally.

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


