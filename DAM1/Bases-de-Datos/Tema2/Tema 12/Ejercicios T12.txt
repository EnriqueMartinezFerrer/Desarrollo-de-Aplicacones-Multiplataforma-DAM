USE java;
CREATE OR REPLACE TABLE copiaJugadores (
	`ID` int(5) unsigned NOT NULL,
	`EQUIPO` int(5) unsigned NOT NULL,
	`NOMBRE` varchar(40) COLLATE utf8mb3_spanish_ci NOT NULL,
	`DORSAL` int(2) unsigned DEFAULT NULL,
	`EDAD` int(3) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish_ci;

CREATE OR REPLACE TRIGGER guardarFilaJugador AFTER DELETE ON jugadores FOR EACH ROW
	INSERT INTO copiaJugadores VALUES (
		1,
		OLD.EQUIPO,
		OLD.NOMBRE,
		OLD.DORSAL,
		OLD.EDAD
	);


----------------------------------------------------------


USE java;
DELIMITER $$
CREATE OR REPLACE FUNCTION insertar_jugador(fila ROW TYPE OF jugadores)
RETURNS INT(2)
MODIFIES SQL DATA
BEGIN
DECLARE EXIT HANDLER FOR 1062 RETURN -1;
INSERT INTO jugadores SET id = fila.id,
	equipo = fila.equipo,
	nombre = fila.nombre,
	dorsal = fila.dorsal,
	edad = fila.edad;
RETURN ROW_COUNT();
END $$
DELIMITER ;

SELECT insertar_jugador((100,3,"nasdfadf",100,40));


-----------------------------------------------------------------------


USE ebanca;
DELIMITER $$
CREATE OR REPLACE TRIGGER verificar_datos_movimiento BEFORE INSERT ON movimiento FOR EACH ROW
BEGIN
	
	IF NEW.id_movimiento IS NULL OR NEW.id_movimiento IN (
		SELECT id_movimiento
		FROM movimiento
	) THEN SET NEW.id_movimiento = (
		SELECT MAX(id_movimiento) + 1
		FROM movimiento
	);
	END IF;


	IF NEW.fecha IS NULL OR NEW.fecha > NOW() THEN
		SET NEW.fecha = NOW();
	END IF;


	IF NEW.dni IS NULL THEN
		SET NEW.dni = 262;
	END IF;


	IF NEW.cod_cuenta IS NULL THEN
		SET NEW.cod_cuenta = 0;
	END IF;


	IF NOT EXISTS(
		SELECT * FROM tiene
		WHERE dni = NEW.dni AND cod_cuenta = NEW.cod_cuenta
	) THEN
		SET NEW.dni = 262;
		SET NEW.cod_cuenta = 0;
	END IF;
END $$
DELIMITER ;

---------------------------------------------------------------


USE bd5;
DELIMITER $$
CREATE OR REPLACE TRIGGER verificarDepartamento BEFORE INSERT ON
	departamentos FOR EACH ROW
BEGIN

	IF NEW.departamento IN (
		SELECT departamento
		FROM departamentos
	) THEN SET NEW.departamento = (
		SELECT MAX(departamento) + 1
		FROM departamentos
	);
	END IF;

	IF NEW.descripcion IN (
		SELECT descripcion
		FROM departamentos
		WHERE descripcion IS NOT NULL
	) THEN SET NEW.descripcion = NULL;
	END IF;

	IF NEW.localidad NOT IN ("Madrid", "Barcelona", "Alicante") THEN
		SET NEW.localidad = "Madrid";
	END IF;
END $$
DELIMITER ;

INSERT IGNORE INTO departamentos VALUES (122, NULL, "Betis");


------------------------------------------------------------------------

USE liga;
DELIMITER $$
CREATE OR REPLACE PROCEDURE cursorTabla()
READS SQL DATA
BEGIN
DECLARE finalTabla BOOLEAN DEFAULT 0;
DECLARE comando TEXT DEFAULT "";
DECLARE alt DECIMAL(3,2);
DECLARE cursorAlturas CURSOR FOR SELECT DISTINCT altura FROM jugador WHERE altura IS NOT NULL ORDER BY 1 DESC;
DECLARE CONTINUE HANDLER FOR NOT FOUND SET finalTabla = 1;
SET comando = "SELECT e.nombre ";
OPEN cursorAlturas;
bucle:LOOP
	SET finalTabla = 0;
	FETCH cursorAlturas INTO alt;
	IF finalTabla = 1 THEN LEAVE bucle;END IF;
	SET comando = CONCAT(comando, ", SUM(altura = ",alt,") AS '", alt,"'");
END LOOP bucle;
CLOSE cursorAlturas;
SET comando = CONCAT(comando, " FROM equipo e INNER JOIN jugador ON id_equipo = equipo GROUP BY 1;");
PREPARE tarea FROM comando;
EXECUTE tarea;
DEALLOCATE PREPARE tarea;
END $$
DELIMITER ;
CALL cursorTabla();