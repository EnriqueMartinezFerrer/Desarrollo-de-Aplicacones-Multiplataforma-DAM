<?php
session_start(); // start the session

// Obtener el nombre y la puntuación del jugador desde la sesión
$nombre = $_SESSION["nombre"] ?? "";
$puntuacion = $_SESSION["puntuacion"] ?? 0;

// Conectar a la base de datos
require_once("arcade_db.php");
$db = conectarDB();

try {
  // Insertar el registro en la tabla de ranking
  $sql = "INSERT INTO ranking (nombre, puntuacion) VALUES ('$nombre', $puntuacion)";
  $db->exec($sql);
} catch (PDOException $e) {
  echo "Error al insertar el registro en la tabla de ranking: " . $e->getMessage();
}

// Cerrar la conexión a la base de datos
$db = null;
?>

<!DOCTYPE html>
<html>
<head>
	<title>Ranking de Jugadores</title>
	<style>
		body {
			background-color: #000;
			color: #fff;
			font-family: "Courier New", Courier, monospace;
			font-size: 20px;
		}

		table {
			margin: 50px auto;
			border-collapse: collapse;
		}

		th, td {
			padding: 10px;
			border: 1px solid #fff;
			text-align: center;
		}

		th {
			background-color: #ff0;
			color: #000;
		}

		td:first-child {
			text-align: left;
		}
	</style>
</head>
<body>

<h1>Ranking de Jugadores</h1>

<table>
	<thead>
		<tr>
			<th>Posición</th>
			<th>Nombre</th>
			<th>Puntuación</th>
		</tr>
	</thead>
	<tbody>

		<?php
		// Obtener las puntuaciones de los jugadores
		require_once ("arcade_db.php");
        $db = conectarDB();
		$sql = "SELECT nombre, puntuacion FROM ranking ORDER BY puntuacion DESC LIMIT 10";
		$resultado = $db->query($sql);

		// Mostrar el top 10 de los mejores jugadores
		if($resultado->rowCount() > 0) {
			$posicion = 1;
			while ($fila = $resultado->fetch(PDO::FETCH_ASSOC)) {
				$nombre = $fila["nombre"];
				$puntuacion = $fila["puntuacion"];

				echo '<tr>';
				echo '<td>' . $posicion . '</td>';
				echo '<td>' . $nombre . '</td>';
				echo '<td>' . $puntuacion . '</td>';
				echo '</tr>';

				$posicion++;
			}
		} else {
			echo '<tr><td colspan="3">No hay jugadores registrados.</td></tr>';
		}

		// Cerrar la conexión a la base de datos
		$db = null;
		?>
	</tbody>
</table>

<p><a href="juego_timeline.php">Volver al Juego</a></p>

</body>
</html>