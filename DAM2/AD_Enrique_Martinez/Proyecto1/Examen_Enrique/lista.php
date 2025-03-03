<!DOCTYPE html>
<html>
  <head>
    <title>Listado de viajes</title>
    <link rel="stylesheet" type="text/css" href="main.css">
  </head>
  <body>
    <div class="container">
      <h1>LISTADO DE VIAJES</h1>
      <table>
        <tr>
          <th>Nombre de la atracción</th>
          <th>Nombre del viajero</th>
          <th>Edad</th>
          <th>Fecha y hora</th>
        </tr>
        <?php
          require_once("parque_db.php");
          $db = conectarDB();
          $comando = $db->prepare("SELECT atraccion.nombre as atraccion, viajero.nombre as viajero, edad, fechahora FROM viajero JOIN viaje ON viajero.id = viaje.id_viajero JOIN atraccion ON atraccion.id = viaje.id_atraccion");
          $comando->execute();
          while ($fila = $comando->fetch(PDO::FETCH_ASSOC)) {
            echo "<tr>";
            echo "<td>" . $fila["atraccion"] . "</td>";
            echo "<td>" . $fila["viajero"] . "</td>";
            echo "<td>" . $fila["edad"] . "</td>";
            echo "<td>" . $fila["fechahora"] . "</td>";
            echo "</tr>";
          }
        ?>
      </table>
    </div>
  </body>
</html>