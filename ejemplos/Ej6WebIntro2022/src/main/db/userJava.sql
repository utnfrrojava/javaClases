--
-- User java
--
drop user if exists 'java'@'%';
create user 'java'@'%' identified by 'himitsu';
GRANT SELECT, INSERT, UPDATE, DELETE ON `java`.* TO 'java'@'%';
