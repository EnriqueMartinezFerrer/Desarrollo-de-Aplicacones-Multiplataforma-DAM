<!DOCTYPE html>
<html>
  <head>
    <title>Insertar Carta</title>
  </head>
  <body>
<h1>Insertar Carta</h1>
  <form action="insertar_carta.php" method="post" enctype="multipart/form-data">
    <p>Nombre: <input type="text" name="nombre"></p>
    <p>Año: <input type="text" name="anio"></p>
    <p>Imagen: <input type="file" name="imagen"></p>
    <p>Mazo: <input type="text" name="mazo"></p>
    <input type="submit" name="insertar_carta" value="Insertar carta">

  </body>
</html>