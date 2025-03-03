CREATE DATABASE cod;
USE cod;
CREATE TABLE mapas (
  ID int(15) NOT NULL PRIMARY KEY,
  NOMBRE varchar(20) NOT NULL,
  DESCRIPCIÓN varchar(650) NOT NULL,
  IMAGEN varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO mapas VALUES (1, "Natch der untoten", "Nacht der Untoten se encuentra en un aeródromo abandonado donde hasta cuatro jugadores deben defenderse contra un número infinito de oleadas de muertos vivientes durante el mayor tiempo posible.
En World at War, los jugadores son soldados desconocidos, mientras que en Black Ops y Black Ops III son la tripulación de Ultimis, que fueron vistos por primera vez en la versión World at War de Shi No Numa.", "imagenes/codww.jpg");
INSERT INTO mapas VALUES (2, "Kino der toten", "Kino der Toten es el quinto mapa de Zombies en general, incluido en Call of Duty: Black Ops y Call of Duty: Black Ops III. El mapa tiene lugar en las instalaciones Kino del Grupo 935, en un teatro abandonado en Alemania.", "imagenes/codbo.jpg");
INSERT INTO mapas VALUES (3, "Origins", "Un sitio de excavación dejado atrás después de que los alemanes desenterraran el nuevo y misterioso Elemento 115 y desataran el mayor mal que el mundo jamás haya visto.", "imagenes/codbo2.jpg");
INSERT INTO mapas VALUES (4, "Shadows of evil", "El escenario tiene lugar en la ciudad ficticia de Morg de la década de 1940, donde presenta a cuatro nuevos personajes, Nero Blackstone, Jessica Rose, Jack Vincent y Floyd Campbell, mientras son transportados a un reino de pesadilla por Shadowman, un ser sobrenatural y el líder de los Apothicans.", "imagenes/codbo3.jpg");
INSERT INTO mapas VALUES (5, "Blood of the dead", "En su misión de asegurar un mañana mejor, Richtofen, Dempsey, Takeo y Nikolai viajan a un laboratorio secreto debajo del icónico Alcatraz, donde se dan cuenta de que el futuro que buscaban asegurar ahora está en serio peligro.", "imagenes/codbo4.jpg");

SELECT * FROM mapas;