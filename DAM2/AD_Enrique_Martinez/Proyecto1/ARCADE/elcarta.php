<?php
// Función para conectar a la base de datos
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

// Consulta para obtener todas las cartas
$consulta = "SELECT * FROM cartas";

// Conexión a la base de datos
$db = conectarDB();

// Preparar la consulta y ejecutarla
$comando = $db->prepare($consulta);
$comando->execute();

// Obtener todas las filas de la tabla
$cartas = $comando->fetchAll(PDO::FETCH_ASSOC);

// Cerrar la conexión
$db = null;
?>

<!DOCTYPE html>
<html>
  <head>
    <title>El Timeline - Cartas</title>
    <link rel="stylesheet" type="text/css" href="main.css">
  </head>
  <body>
    <h1>El Timeline - Cartas</h1>

    <a href="crear_carta.php">Crear nueva carta</a>

    <table>
      <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Descripción</th>
        <th>Imagen</th>
        <th>Mazo</th>
        <th>Acciones</th>
      </tr>
      <?php foreach ($cartas as $carta) { ?>
      <tr>
        <td><?php echo $carta["id"]; ?></td>
        <td><?php echo $carta["nombre"]; ?></td>
        <td><?php echo $carta["descripcion"]; ?></td>
        <td><img src="<?php echo $carta["imagen"]; ?>" width="100" height="100"></td>
        <td><?php echo $carta["mazo"]; ?></td>
        <td>
          <form action="eliminar_carta.php" method="POST">
            <input type="hidden" name="id_carta" value="<?php echo $carta['id']; ?>">
            <input type="submit" name="Eliminar_carta" value="Eliminar">
          </form>
          <button onclick="editarCarta(<?php echo $carta['id']; ?>)">Editar</button>
        </td>
      </tr>
      <?php } ?>
    </table>

    <script>
      function editarCarta(id) {
        // Abrir ventana emergente para editar la carta
        window.open("editar_carta.php?id_carta=" + id, "Editar carta", "width=400,height=400");
      }
    </script>
  </body>
</html>