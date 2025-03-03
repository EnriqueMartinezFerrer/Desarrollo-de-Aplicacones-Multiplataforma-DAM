<!DOCTYPE html>
<html>
  <head>
  <?php
          require_once ("dbutils.php");
          $db = conectarDB();
          ?>
    <title>Administrar Cartas</title>
    <meta charset="UTF-8">
    <style>
      /* Establece una fuente predeterminada para todo el documento */
      body {
        font-family: Arial, sans-serif;
      }

      /* Centra el título en la página */
      h1 {
        text-align: center;
        margin-top: 50px;
      }

      /* Ajusta el ancho de la forma y la centra en la página */
      form {
        width: 500px;
        margin: 0 auto;
      }

      /* Ajusta el estilo de los elementos de entrada */
      label {
        display: inline-block;
        width: 150px;
        margin-bottom: 10px;
      }

      input[type="text"], textarea, select {
        width: 100%;
        padding: 10px;
        box-sizing: border-box;
        border-radius: 5px;
        border: 1px solid gray;
      }

      textarea {
        height: 150px;
      }

      /* Alinea el botón al centro */
      input[type="submit"] {
        display: block;
        margin: 0 auto;
      }

    </style>
    <link rel="stylesheet" type="text/css" href="main.css">
  </head>
  <body>
    <h1>ADMINISTRAR CARTAS</h1>

    <form action="dbutils.php" method="POST" enctype="multipart/form-data">
      <label for="nombre">Nombre:</label>
      <input type="text" name="nombre" id="nombre"><br><br>
      <label for="descripcion">Descripción:</label>
      <textarea name="descripcion" id="descripcion"></textarea><br><br>
      <label for="mazo">Selecciona un mazo:</label>
      <select name="mazo" id="mazo">
        <?php
          $comando = $db->prepare("SELECT nombre FROM mazo");
          $comando->execute();
          while($fila = $comando->fetch(PDO::FETCH_ASSOC)){
            echo '<option value="'.$fila['nombre'].'">'.$fila['nombre'].'</option>';
          }
        ?>
      </select><br><br>
      <label for="imagen">Selecciona una imagen:</label>
      <input type="file" name="imagen" id="imagen"><br><br>
      <input type="submit" name="Crear_carta" value="Crear carta" class="button-87">
    </form>

  </body>
</html>