<?php

function conectarDB()
{
    try
    {
        $db = new PDO("mysql:host=localhost; dbname=TIMELINE", "root", "");
        $db->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
        return $db;
    }
    catch (PDOException $ex)
    {
        echo ("Error al conectar: " . $ex->getMessage());
    }
}

if(isset($_POST["Crear_mazo"])){
    $nombre = $_POST["nombre"];
    $descripcion = $_POST["descripcion"];

    $db = conectarDB();
    $comando = $db->prepare("SELECT * FROM mazo WHERE nombre = :nombre");
    $comando->execute(array(":nombre" => $nombre));

    if ($comando->rowCount() > 0) {
        echo "Mazo already exists<br>";
    } else {
        $comando = $db->prepare("INSERT INTO mazo (nombre, descripcion) VALUES (:nombre, :descripcion)");
        $comando->execute(array(
            ":nombre" => $nombre,
            ":descripcion" => $descripcion));

        if ($comando->rowCount() == 1) {
            echo "Record inserted successfully<br>";
        } else {
            echo "Error: " . $comando->errorInfo();
        }
    }
}

if(isset($_POST["Eliminar_mazo"])){
    $nombre = $_POST["nombre"];
    $db = conectarDB();
    $comando = $db->prepare("DELETE FROM mazo WHERE nombre = :nombre");
    $comando->execute(array(
        ":nombre" => $nombre));

    if ($comando->rowCount() == 1) {
        echo "Record deleted successfully<br>";
    } else {
        echo "Error deleting record: " . $comando->errorInfo()[2];
    }
}

if(isset($_POST["Modificar_mazo"])){
    $nombre = $_POST["nombre"];
    $descripcion = $_POST["descripcion"];
    $db = conectarDB();
    $comando = $db -> prepare("UPDATE mazo SET descripcion = :descripcion WHERE nombre = :nombre");
    $comando -> execute(array(
        ":nombre" => $nombre,
        ":descripcion" => $descripcion));
    if ($comando->rowCount() == 1) {
        echo "Record updated successfully<br>";
    } else {
        echo "Error updating record: " . $comando->errorInfo()[2];
    }
}


if(isset($_POST["insertar_carta"])){
    $nombre = $_POST["nombre"];
    $anio = $_POST["anio"];
    $imagen = $_FILES["imagen"]["name"];
    $ruta = $_FILES["imagen"]["tmp_name"];
    $destino = "imagenes/".$imagen;

    move_uploaded_file($ruta, $destino);

    $mazo = $_POST["mazo"];

    $db = conectarDB();

    // Obtener ID del mazo
    $comandoMazo = $db->prepare("SELECT id FROM mazos WHERE nombre = :mazo");
    $comandoMazo->execute(array(":mazo" => $mazo));
    $filaMazo = $comandoMazo->fetch();
    $idMazo = $filaMazo["id"];

    // Insertar carta en la tabla de cartas
    $comando = $db->prepare("INSERT INTO cartas (nombre, anio, imagen, mazo) VALUES (:nombre, :anio, :imagen, :mazo)");
    $comando->execute(array(
        ":nombre" => $nombre,
        ":anio" => $anio,
        ":imagen" => $destino,
        ":mazo" => $idMazo));

    if ($comando->rowCount() == 1) {
        echo "Record inserted successfully<br>";
    } else {
        echo "Error: " . $comando->errorInfo();
    }
}
?>