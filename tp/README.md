# Lenguaje de Programación Java - TP Desarrollo

## 1 - Enunciado

Desarrollar una sistema/aplicación web cliente-servidor en Java.

El tema y alcance de la aplicación debe ser definido por cada grupo y aprobado por los docentes antes de iniciar su desarrollo.

El mismo deberá cumplir con los requerimientos técnicos, alcance funcional y requisitos de entrega propuestos a continuación


## 2 - Requerimientos

A continuación se muestra la clasificación para definir el alcance, para simplificar vea al final la tabla indicando que debe incluir para regularidad y aprobación directa.

### 2.1 - Alcance Funcional

#### 2.1.1 - Regularidad
* ***ABMC*** (Alta, Baja, Modificación y Consulta):
  * **ABMC de entidad simple**: de una sóla entidad (no depende de otras entidades). *Para la regularidad deberá crearse al menos uno por cada integrante del grupo*

  *Otros ABMC podrán hacerse por base de datos directamente durante la regularidad pero deberán completarse por sistema para la aprobación*

  * **ABMC de entidad dependiente**: de una entidad que requiera de otra ya existente de la que se hizo ABMC en el item anterior. Ej: ABMC de articulos donde un atributo sea la categoría que a su vez es una entidad. *Para regularizar, grupos de hasta 2 miembros: al menos 1 y para grupos de 3 o 4 miembros: al menos 2*


* ***Caso de Uso NO-ABMC***:
  * Crear un caso de uso (nivel usuario) que sea más complejo que un ABMC
  * El mismo debe requerir controlar alguna regla de negocio de tipo restricción.

  Por ejemplo:
    * En un sistema de hotel una reserva, donde deba verificarse la disponibilidad del tipo de habitación a una fecha.

    * En un sistema de turnos médicos reserva de turnos, verificando que el día y horario estén disponibles.

    * En un sistema de venta de pasajes verificar que el asiento del viaje esté libre.

  *Para regularizar: grupos de hasta 2 miembros: al menos 1, grupos 3 o 4 integrantes: al menos 2*

* ***Listados***:

  Los listados pueden mostrarse por una tabla en una página web y no requieren el uso de ninguna librería para su confexión o exportarlos a ningún formato. Pueden estar integrados dentro de un ABMC o Caso de uso que ya se desarrolló

  * **Listado simple**: debe incluir información de al menos dos de las entidades creadas.

  * **Listado complejo**: el listado debe permitir filtrar o buscar por al menos 1 atributo.

  *Para regularizar: grupos de hasta 2 integrantes: 1 listado simple, grupos de 3 o 4 integrantes 1 listado complejo o 3 simples*

#### 2.1.2 - Aprobación directa

* ***ABMC***: **TODOS** los necesarios para el sistema/aplicación.

* ***Caso de Uso "complejo"*** (nivel resumen):
  * No debe ser un ABMC.

  * Dentro de la lógica del sistema debe realizarse al menos en dos eventos diferentes (cada uno un CU de usuario).

  *Para AD, grupos de hasta 2 integrantes: al menos 1, grupos de 3 o 4 integrantes: al menos 2*

  *Por ejemplo en un sistema de hotel: Reserva, Check-in y Check-out. Estos tres eventos suceden en diferentes momentos y hasta pueden ser realizados por diferentes usuarios. Los Casos de Uso NO-ABMC realizados para regularidad pueden ser utilizados como parte de este CU resumen*

* ***Listados***:

  **Listado complejo**: el listado debe permitir filtrar o buscar por al menos 1 atributo.

  *Para AD grupos de hasta 2 integrantes: 1 listado complejo, grupos de 3 o 4 integrantes 2 listados complejo (sin incluir el de regularidad si lo hicieran en lugar de 3 simples)*

* ***Niveles de acceso***:
  * Se requiere que el sistema cuente con al menos un login y al menos dos niveles de acceso diferentes
  * Al acceder a las distintas partes de la aplicación se **DEBE** controlar que el nivel de acceso sea suficiente.
  Algunos niveles de acceso:
    * Invitado (no requiere login).
    * Usuario (por ejemplo cliente en hotel o en la venta de pasajes).
    * Usuario avanzado (un empleado del negocio, como recepcionista).
    * Administrador: Alguien que tiene permisos completos en la aplicación.

  *El mínimo exigido es* ***dos niveles*** *sin importar la cantidad de integrates del grupo.*

* ***Manejo de errores***:
  Es necesario que el usuario reciba notificación cuando un error ocurre en cualquier nivel de la aplicación. Esto **DEBE** hacerse utilizando excepciones y bloques try-catch-finally.
  *Por ejemplo un mensaje "La operación no pudo compltarse" ante un error al conectarse a la DB.*

  *Esto deberá implementarse sin importar la cantidad de integrantes del grupo*

* ***Requerimiento Adicional Grupos de 3 y 4 integrantes***:
  Los grupos de 3 y 4 integrantes **DEBEN** implementar al menos uno de los *Requerimientos Extra - Aprobación Directa* de forma obligatoria. Podrán elegir cual de ellos implementar.

* ***Publicar la aplicación***
  Al completar el desarrollo debe publicarse a un servidor gratuito como jelastic, eatj, openshift, heroku, etc.

#### 2.1.3 - Requerimientos Extra - Aprobación Directa:
Estos requerimientos extra podrán implementarse (algunos o todos) en caso de:
  * Fallar al implementar algunos de los requerimientos funcionales obligatorios para la aprobación directa por errores en el código (luego de haber sido validado con el docente).
  * Intentar mejorar la nota.
  * Ser grupo de 3 o 4 integrantes (obligatorio 1 requerimiento extra)


* ***Manejo de archivos***:
  El sistema debe manejar archivos.

  *Por ejemplo: en un sistema de hotel subir y visualizar imágenes de las habitaciones, en un carrito de compra cargar imágenes de los artículos y visualizarlas durante la compra o simplemente las imágenes de un perfil del usuario.*


* ***Uso de custom exceptions***:
  * Manejar los errores y notificaciones al usuario mediante subclases de exceptions creadas para la aplicación.
  * Validar reglas de negocio mediante custom exceptions.


* ***Log de errores***:
  * Guardar los errores y excepciones en un log de errores mediante una librería adecuada para ello que gestione niveles de errores y formatos del archivo de logs.


* ***Envío de emails***:
  Enviar al menos una notificación por email durante alguna acción del sistema.

  *Por ejemplo en un sistema de hotel, luego de la reserva enviar un mail confirmando dicha reserva. En un carrito de compra, luego de una compra enviar un mail con la factura*

### 2.2 - Requerimientos Técnicos:

* Ser cliente-servidor
* Debe ser utilizada en un browser
* Ejecutarse en un servidor de aplicaciones Java (por ejemplo Apache Tomcat).
* Usar JSP y/o JSTL.
* Usar Servlets.
* Usar html5 y CSS 3 se recomienda utilzar un framework CSS (como Foundation, Bootstrap, Bulma, Material, etc).
* Conectarse a una base de datos persistente mediante un driver.
* Estructurarse en capas. Se recomienda separar al menos en acceso a base de datos, lógica e interfaz de usuario.
* Contar con niveles de acceso y control de acceso
* Manejo de errores
* Publicar el sitio en un servidor gratuito.

Se pueden utilizar otras tecnologías, arquitecturas y frameworks pero debe pactarse con los docentes de antemano el alcance del trabajo práctico acorde a las tecnologías a utilizar.




## 3 - Alcance y Entregas
### 3.1 - Definición de Alcance

El equipo deberá definir el alcance del trabajo práctico con el equipo docente. Indicando para cada requerimiento el nombre de los caso de uso/user story que se desarrollará para complirlo

Las mismas podrán volverse a pactar con los profesores enviando las correcciones a la misma indicando, causas del cambio y que se cambia.


### 3.2 - Entrega Inicial

Para iniciar el proyecto deberá enviarse entregarse en PDF un documento donde debe figurar
  * Listado de integrantes: indicar legajo, apellido y nombres.
  * Enunciado general del tp. Uno o dos parrafos describiendo el sistema.
  * Imagen con un borrador del modelo de dominio/modelo de datos.
  * Lista del NOMBRE de los Casos de Uso/User Stories de cada requerimiento funcional para la REGULARIDAD.
  * Lista del NOMBRE de los Casos de Uso/User Stories de cada requerimiento funcional para la AP DIRECTA.
  * Para los listados podrá usarse una tabla como la del checklist más abajo. En caso que el nombre del CU no sea representativo de su complejidad pueden describirlo en 1 o 2 líneas.


Enviarlo y esperar la autorización del enunciado por parte de los docentes. Una vez hecho esto puede comenzar el desarrollo del mismo.

#### 3.2.1 Checklist

##### Regularidad

|Requerimiento|cant. mín.<br>1 o 2 integ|cant. máx.<br>3 o 4 integ|Detalle/Listado de casos incluidos|
|:-|-:|-:|:-|
|ABMC simple|1 x integ|1 x integ|
|ABMC dependiente|1|2|
|CU NO-ABMC|1|2|
|Listado simple|1|3(*)|
|Listado complejo|0|1(*)|

(\*) los grupos de 3 y 4 integrantes deben elegir entre 1 listado complejo o 3 simlples para regularizar.


##### Aprobación Directa

|Requerimiento|cant. mín.<br>1 o 2 integ|cant. máx.<br>3 o 4 integ|Detalle/Listado de casos incluidos|
|:-|-:|-:|:-|
|ABMC|todos|todos|
|CU "Complejo"(nivel resumen)|1|2|
|Listado complejo|1|2|
|Nivel de acceso|2|2|
|Manejo de errores|obligatorio|obligatorio|no requiere detalle|
|requerimiento extra obligatorio (**)|0|1|
|publicar el sitio|olbigatorio|obligatorio|no requiere detalle|

(\*\*) sólo grupos de 3 y 4 integrantes


###### Requerimientos extra - AD
|Requerimiento |Detalle/Listado de casos incluidos|
|:-|:-|
|Manejo de archivos||
|Custom exceptions||
|Log de errores||
|Envio de emails||


### 3.3 - Entrega Regularidad

  1. Para realizar la entrega deberá en primer lugar crear un tag en el repositori de git.

  2. La entrega deberá hacerse enviando por email y telegram a los profesores la URL del tag de git.

  3. En el repositorio debe incluir:
      * El código de la aplicación/sistema
      * Un archivo README.md con lo mismo que el PDF de la entrega inicial.
      * Un archivo .sql con el dump de la base de datos

  4. A continuación se deberá pactar con el docente un fecha para la defensa.

### 3.4 - Entrega Aprobación Directa

  1. Para realizar la entrega deberá en primer lugar crear un tag en el repositori de git.

  2. Debe publicar el desarrollo en un servidor gratuito, jelastic, eatj, openshift, heroku, etc.
  Crear usuarios para cada nivel de acceso que no permita crearse directamente en el sistema.

  2. La entrega deberá hacerse enviando por email y telegram a los profesores:
      * La URL del tag de git.
      * La URL para acceder al sitio publicado.
      * Las claves de usuario para acceder al sistema desarrollado

  3. En el repositorio debe incluir:
      - El código de la aplicación/sistema
      - Un archivo README.md con lo mismo que el PDF de la entrega inicial.
      - Un directorio **db** con un archivo .sql con el dump de la base de datos.
      - Un directorio **doc** con la [documentación requerida]

  5. A continuación se deberá pactar con el docente un fecha para la defensa. Donde deberá llevar:
      * La [documentación requerida] impresa.
      * CD o DVD con el código y documentación.


## 4 - Criterio de correccion

### 4.1 - Código
  * Uso adecuado del lenguaje y la API de Java.
  * Diseño de la arquitectura correcto.
  * Usabilidad del sitio: debe ser fácil de usar y no tener contenido oculto o difícil de acceder
  * Diseño adecuado de la interfaz: uso apropiado de los tags html y de los estilos.
  * Completitud de los requerimientos.
  * Cumplir con los requerimientos mínimos corresponde con 6 puntos.
  * Para mayor nota se deberá realizar mayor cantidad de los mismos o completar los requerimientos extra.

### 4.2 - Repositorio
  * El desarrollo deberá realizarse en una plataforma de git gratuita. Se recomienda GitHub o GitLab.
  * Se evaluará el uso de git: Frecuencia y responsables de los commits.

### 4.3 - Defensa

Todos los miembros del grupo deberán aprobar una defensa del código y funcionalidad del TP con los profesores.

Si algún miembro no puede realizar la defensa correspondiente la misma no se considerará aprobada.

Luego de la defensa el resultado puede ser:
* Desarrollo aprobado - Defensa aprobada: se considerará el TP aprobado y se definirá una nota.
* Desarrollo a revisión - Defensa aprobada: se considera aprobada la defensa y se indicarán cambios a realizar en el código. En este caso deberá corregirse el código y enviarse un nuevo tag con las correcciones indicadas en un plazo acordado con el docente. No deberá repetirse la defensa.
* Desarrollo aprobado - Defensa a repetir: se considera el código adecuado y aprobado. Deberá repetirse la defensa en un plazo acordado con el docente.
* Desarrollo a revisión - Defensa a repetir: se pactará una nueva fecha de entrega y defensa con el docente.

[documentación requerida]: https://goo.gl/BifevO
