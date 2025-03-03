<?php
// Establecer la conexión con la base de datos
require_once ("arcade_db.php");
$db = conectarDB();

try {
  // Consultar los mazos disponibles
  $sql = "SELECT nombre FROM mazo";
  $resultado = $db->query($sql);

  // Verificar si la consulta devolvió filas
  if ($resultado->rowCount() > 0) {
    // Generar las opciones del select
    $options = "";
    while ($fila = $resultado->fetch(PDO::FETCH_ASSOC)) {
      $nombreMazo = $fila["nombre"];
      $options .= "<option value='$nombreMazo'>$nombreMazo</option>";
    }
  } else {
    echo "No se encontraron mazos.";
  }
} catch (PDOException $e) {
  echo "Error al ejecutar la consulta: " . $e->getMessage();
}

// Cerrar la conexión
$db = null;
?>

<!DOCTYPE html>
<html>
  <head>
    <title>Seleccionar mazo - Juego Timeline</title>
  </head>
  <body>

    <h1>Seleccionar mazo</h1>
    <form action="juego_timeline.php" method="get">
      <label for="mazo">Mazo:</label>
      <select name="mazo" id="nombre">
        <?php echo $options; ?>
      </select>
      <br>
      <label for="nombre">Nombre:</label>
      <input type="text" name="nombre" id="nombre">
      <br>
      <input type="submit" value="Jugar">
    </form>
  </body>
</html>
