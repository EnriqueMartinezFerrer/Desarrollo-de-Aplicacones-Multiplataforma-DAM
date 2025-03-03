<?php

function conectarDB()
{
    try
    {
        $db = new PDO("mysql:host=localhost; dbname=PARQUE", "root", "");
        $db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        return $db;
    }
    catch (PDOException $ex)
    {
        echo ("Error al conectar: " . $ex->getMessage());
    }
}


if(isset($_POST["Crear_atraccion"])){
    $nombre = $_POST["nombre"];
    $tematica = $_POST["tematica"];

    $db = conectarDB();
    $comando = $db->prepare("SELECT * FROM atracciones WHERE nombre = :nombre");
    $comando->execute(array(":nombre" => $nombre));

    if ($comando->rowCount() > 0) {
        echo "Atracción ya existe<br>";
    } else {
        $comando = $db->prepare("INSERT INTO atracciones (nombre, tematica) VALUES (:nombre, :tematica)");
        $comando->execute(array(
            ":nombre" => $nombre,
            ":tematica" => $tematica));

        if ($comando->rowCount() == 1) {
            echo "Atracción creada exitosamente<br>";
        } else {
            echo "Error: " . $comando->errorInfo();
        }
    }
}

if(isset($_POST["Borrar_atraccion"])){
    $nombre = $_POST["nombre"];
    $db = conectarDB();
    $comando = $db -> prepare("DELETE FROM atracciones WHERE nombre = :nombre");
    $comando -> execute(array(
        ":nombre" => $nombre));
    if ($comando->rowCount() == 1) {
        echo "Record deleted successfully<br>";
    } else {
        echo "Error deleting record: " . $comando->errorInfo()[2];
    }
}
if(isset($_POST["Modificar_atraccion"])){
    $nombre = $_POST["nombre"];
    $tematica = $_POST["tematica"];
    $db = conectarDB();
    $comando = $db -> prepare("UPDATE atracciones SET tematica = :tematica WHERE nombre = :nombre");
    $comando -> execute(array(
        ":nombre" => $nombre,
        ":tematica" => $tematica));
    if ($comando->rowCount() == 1) {
        echo "Atracción actualizada exitosamente<br>";
    } else {
        echo "Error al actualizar la atracción: " . $comando->errorInfo()[2];
    }
}

if(isset($_POST["Listar_atracciones"])){
    $db = conectarDB();
    $comando = $db->prepare("SELECT atracciones.nombre as nombre_atraccion, horarios_atraccion.hora, viajes.edad FROM atracciones
                            LEFT JOIN horarios_atraccion ON atracciones.id = horarios_atraccion.id_atraccion
                            LEFT JOIN viajes ON horarios_atraccion.id = viajes.id_horario");
    $comando->execute();

    if ($comando->rowCount() > 0) {
        echo "Nombre de la atracción | Hora del viaje | Edad del viajero<br>";
        while($fila = $comando->fetch(PDO::FETCH_ASSOC)){
            echo $fila['nombre_atraccion'] . " | " . $fila['hora'] . " | " . $fila['edad'] . "<br>";
        }
    } else {
        echo "No hay atracciones disponibles";
    }
}
?>