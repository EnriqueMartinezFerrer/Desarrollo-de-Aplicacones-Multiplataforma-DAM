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
if (isset($_POST["id_carta"])) {
  $id_carta = $_POST["id_carta"];

  $db = conectarDB();
  $comando = $db->prepare("DELETE FROM cartas WHERE id_carta = :id_carta");
  $comando->execute(array(":id_carta" => $id_carta));

  if ($comando->rowCount() == 1) {
    echo "Carta eliminada exitosamente";
  } else {
    echo "Error al eliminar la carta: " . $comando->errorInfo()[2];
  }
}

if(isset($_POST["Modificar_carta"])){
    $nombre_carta = $_POST["nombre_carta"];
    $descripcion_carta = $_POST["descripcion_carta"];
    $imagen = $_POST["imagen"];
    $mazo = $_POST["mazo"];
    $id_carta = $_POST["id_carta"];

    $db = conectarDB();
    $comando = $db -> prepare("UPDATE cartas SET nombre_carta = :nombre_carta, descripcion_carta = :descripcion_carta, imagen = :imagen, mazo = :mazo WHERE id_carta = :id_carta");
    $comando -> execute(array(
        ":nombre_carta" => $nombre_carta,
        ":descripcion_carta" => $descripcion_carta,
        ":imagen" => $imagen,
        ":mazo" => $mazo,
        ":id_carta" => $id_carta));
    if ($comando->rowCount() == 1) {
        echo "Carta modificada exitosamente<br>";
    } else {
        echo "Error al modificar la carta: " . $comando->errorInfo()[2];
    }
}
?>