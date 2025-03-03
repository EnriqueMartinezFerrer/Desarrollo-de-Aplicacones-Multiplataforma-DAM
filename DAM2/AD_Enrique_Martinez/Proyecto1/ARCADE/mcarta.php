<?php
// Obtener el ID de la carta a modificar
$id_carta = $_GET['id'];

// Obtener los datos de la carta de la base de datos
$db = conectarDB();
$comando = $db->prepare("SELECT * FROM cartas WHERE id_carta = :id_carta");
$comando->execute(array(":id_carta" => $id_carta));
$carta = $comando->fetch(PDO::FETCH_ASSOC);

// Obtener los mazos disponibles de la base de datos
$comando = $db->prepare("SELECT * FROM mazos");
$comando->execute();
$mazos = $comando->fetchAll(PDO::FETCH_ASSOC);
?>

<!DOCTYPE html>
<html>
<head>
    <title>Modificar carta</title>
</head>
<body>
    <h1>Modificar carta</h1>
    <form action="dbutils.php" method="POST" enctype="multipart/form-data">
        <input type="hidden" name="id_carta" value="<?php echo $id_carta; ?>">
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre" value="<?php echo $carta['nombre']; ?>"><br><br>
        <label for="descripcion">Descripción:</label>
        <textarea name="descripcion" id="descripcion"><?php echo $carta['descripcion']; ?></textarea><br><br>
        <label for="imagen">Imagen:</label>
        <input type="file" name="imagen" id="imagen"><br><br>
        <label for="mazo">Mazo:</label>
        <select name="mazo" id="mazo">
            <?php foreach ($mazos as $mazo) { ?>
                <option value="<?php echo $mazo['id_mazo']; ?>" <?php if ($mazo['id_mazo'] == $carta['id_mazo']) echo 'selected'; ?>><?php echo $mazo['nombre']; ?></option>
            <?php } ?>
        </select><br><br>
        <input type="submit" name="Modificar_carta" value="Modificar">
    </form>
</body>
</html>