<!DOCTYPE html>
<html>
  <head>
    <title>Administrar Cartas</title>
    <link rel="stylesheet" type="text/css" href="main.css">
    <style>
      body {
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
      }
  h1 {
    text-align: center;
  }

  form {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    margin-top: 20px;
  }
</style>
  </head>
  <body>
    <h1>ADMINISTRAR CARTAS</h1>
<form action="ccarta.php" method="POST">
  <input type="submit" name="Crear_cartas" value="Crear cartas" class="button-87">
</form>

<form action="mcarta.php" method="POST">
  <input type="submit" name="Modificar_cartas" value="Modificar cartas" class="button-87">
</form>

<form action="elcarta.php" method="POST">
  <input type="submit" name="Eliminar_cartas" value="Eliminar cartas" class="button-87">
</form>
  </body>
</html>
