CREATE DATABASE CEO;
USE CEO;
CREATE TABLE empleados (
  DNI varchar(15) NOT NULL PRIMARY KEY,
  NOMBRE varchar(20) NOT NULL,
  EMAIL varchar(650) NOT NULL,
  NUMERO int(20) NOT NULL,
  EXPERIENCIA float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO empleados VALUES ("01234567L", "Luis Gonzalez", "luisgonzalez@gmail.com", "656343576", "12.5");
INSERT INTO empleados VALUES ("71476342J", "Macarena Ramírez", "macarena@gmail.com", "692839321", "8");
INSERT INTO empleados VALUES ("63823376M", "Juan José Martínez", "juanjo@gmail.com", "664888233", "4");


SELECT * FROM empleados;
