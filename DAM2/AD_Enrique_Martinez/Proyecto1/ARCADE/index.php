<!DOCTYPE html>
<html>
  <head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="style.css">
  </head>
  <body>
    <div class="container">
      <h1 class="heading">Bienvenido al juego timeline</h1>
      <div class="buttons">
        <form action="" method="POST">
          <input type="submit" name="rol1" value="Jugador" class="button-87">
          <input type="submit" name="rol2" value="Admin" class="button-87">
        </form>
      </div>
    </div>

    <?php
      if ($_POST['rol1']) {
        header('Location: jugador.php');
      } elseif ($_POST['rol2']) {
        header('Location: administrador.php');
      }
    ?>
  </body>
</html>
