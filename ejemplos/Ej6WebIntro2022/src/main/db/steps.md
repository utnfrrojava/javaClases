# JDBC - Pasos para setear y configurar jdbc

## Pasos para preparar la base de datos
* Descargar e instalar mysql o uno de sus forks (mysql 8 o 5.7, mariadb 10.3, percona server 8 o 5.7)
* Crear la base de datos java con usando el código del archivo db/dbJava.sql del proyecto.
* Crear el usuario java para conectarse usando el código del archivo db/userJava.sql del proyecto.

### En casos de falla
En caso que fallara la creación de la db o el usuario puede eliminarlps con el siguiente código y volver a intentarlo.

```sql
DROP DATABASE `java`;
DROP USEr java@localhost;
```

## Pasos para setear el conector
1. Descargar Connector/J platform independent y extraer el contenido.
2. Crear el directorio lib dentro del proyecto al mismo nivel de src, eligiendo la opción source folder. Atención no usar folder, usar source folder.
3. Copiar mysql-connector-java-8.0.20.jar dentro de lib/
4. Botón derecho sobre el mysql-connector-java-8.0.20.jar hacer click en Build Path -> Add to build path 
5. Si usa git, agregar el .jar del conector como excepción al .gitignore, (adaptarlo al directorio) por ejemplo en este proyecto
```
# Whitelist connector/j #
!/ejemplos/*/lib/*.jar
```
