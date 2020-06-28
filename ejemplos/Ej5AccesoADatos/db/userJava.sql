--
-- User java
--

create user 'java'@'localhost' identified by 'himitsu';
GRANT SELECT, INSERT, UPDATE, DELETE ON `java`.* TO 'java'@'localhost';
