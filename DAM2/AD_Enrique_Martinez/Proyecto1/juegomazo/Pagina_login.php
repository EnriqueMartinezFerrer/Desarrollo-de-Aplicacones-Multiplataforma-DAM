<!DOCTYPE html>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
    <h1>Bienvenido al juego timeline</h1>
    <p>Elija su rol:</p>
    <form action="" method="POST">
      <input type="submit" name="role" value="Jugador">
      <input type="submit" name="rol" value="Admin">
    </form>

<?php
  if ($_POST['role']) {
    header('Location: jugador.php');
  } elseif ($_POST['rol']) {
    header('Location: admin.php');
  }
?>
  </body>
</html>