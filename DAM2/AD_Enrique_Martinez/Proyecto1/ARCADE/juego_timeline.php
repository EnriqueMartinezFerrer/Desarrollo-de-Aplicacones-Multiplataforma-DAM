<!DOCTYPE html>
<html>
<head>
	<title>Juego Timeline</title>
</head>
<body>

<h1>Juego Timeline</h1>

<?php

// Obtener el nombre y la puntuación del jugador
if(isset($_POST['nombre'])) {
   $nombre = $_POST['nombre'];
} else {
   $nombre = '';
}
$puntuacion = "puntuacion";

// Almacenar el nombre y la puntuación en la sesión
session_start();
$_SESSION["nombre"] = $nombre;
$_SESSION["puntuacion"] = $puntuacion;

// Obtener el nombre del mazo seleccionado
$mazo_nombre = $_GET["mazo"];

// Conectar a la base de datos
require_once ("arcade_db.php");
$db = conectarDB();

try {
  // Obtener el nombre del mazo
  $sql = "SELECT nombre FROM mazo WHERE nombre = '$mazo_nombre'";
  $resultado = $db->query($sql);
  $fila = $resultado->fetch(PDO::FETCH_ASSOC);
  $mazo_nombre = $fila["nombre"];

  // Mostrar el nombre del mazo seleccionado
  echo "<p>Has seleccionado el mazo '$mazo_nombre'.</p>";

  // Generar una puntuación aleatoria
  if (isset($_POST["generar_puntuacion"])) {
    $puntuacion = rand(0, 9999);
    echo "<p>Tu puntuación es: $puntuacion</p>";

    // Guardar la puntuación en la sesión
    $_SESSION["puntuacion"] = $puntuacion;
  }

} catch (PDOException $e) {
  echo "Error al ejecutar la consulta: " . $e->getMessage();
}

// Cerrar la conexión a la base de datos
$db = null;
?>

<form action="" method="post">
	<input type="submit" name="generar_puntuacion" value="Generar Puntuación">
</form>

<p><a href="ranking.php">Ver Ranking</a></p>

</body>
</html>
