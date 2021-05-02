# JDBC - Pasos para setear y configurar jdbc

## Pasos para preparar la base de datos
* Descargar e instalar mysql o uno de sus forks (mysql 8 o 5.7, mariadb 10.3, percona server 8 o 5.7)
* Crear la base de datos javaTest con un manager o usando el siguiente código

```sql
CREATE DATABASE /*!32312 IF NOT EXISTS*/ `javaTest` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `javaTest`;

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `tipo_doc` varchar(255) NOT NULL,
  `nro_doc` int NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `estaHabilitado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `persona` VALUES (1,'dni',11111111,'John','Doe',1),(2,'dni',22222222,'Juan','Perez',0);
```

* Crear el usuario para conectarse

```sql
create user java@'%' identified by 'himitsu';

grant select, insert, update, delete on javaTest.* to java@'%';
```

### En casos de falla
En caso que fallara la creación de la db o el usuario puede eliminarlps con el siguiente código y volver a intentarlo.

```sql
DROP DATABASE `javaTest`;
DROP USEr java@'%';
```

## Pasos para setear el conector
1. Descargar Connector/J platform independent y extraer el contenido.
2. Crear el directorio lib dentro del proyecto al mismo nivel de src, eligiendo la opción source folder. Atención no usar folder, usar source folder.
3. Copiar mysql-connector-java-8.0.20.jar dentro de lib/
4. Botón derecho sobre el mysql-connector-java-8.0.20.jar hacer click en Build Path -> Add to build path 
5. Si usa git, agregar el .jar del conector como excepción al .gitignore, (adaptarlo al directorio) por ejemplo en este proyecto
```
# Whitelist connector/j #
!/ejemplos/Ej4JDBC/lib/*.jar
```
