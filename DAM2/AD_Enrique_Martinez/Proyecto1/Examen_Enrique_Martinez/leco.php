<?php

$vrandom=rand(1,12);

$page='
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ejercicio 2</title>
</head>
<body>
<h2>Ejercicio 2</h2>
<h4>Convertir un número en mes</h4>
<hr>
<table width=400 >
  <tr>
      <td width=200>
          <b>Número a convertir</b>
      </td>
      <td>
          <input type="text" name="txtN1" size="10" maxlenght="3" value="'.$vrandom.'">
      </td>
      <td>
          <input type="submit" name="BRandom" value="Número Random">
      </td>
  </tr>
  <tr>
      <td>
          <input type="submit" name="BRandom" value="Enviar">
      </td>
  </tr>
</table>
</body>
</html>';

echo $page;

?>