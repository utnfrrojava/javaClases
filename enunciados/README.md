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

Resolver los ejercicios 4 y 5 usando ArrayList en lugar de Arrays.
