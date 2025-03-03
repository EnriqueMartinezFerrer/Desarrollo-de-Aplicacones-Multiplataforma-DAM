


<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width">
  <title>JS Bin</title>
  <style>
    img{
      width: 100%;
    }
    body {
      background: url(mundo4.jpg)  ; 
      background-size: cover;
      background-repeat: no-repeat;
      margin: 0;
      height: 100vh;
    }
  </style>
</head>
<body>
<?php
$x ='<img src =  Imagenes/Historia/1989.jfif>';
echo '<img src = Imagenes/Historia/1945.jfif>';
echo '<img src = Imagenes/Historia/1969.jfif>';
echo '<img src = Imagenes/Historia/1804.jfif>';
echo '<img src = Imagenes/Historia/1643.jfif>';
echo '<img src = Imagenes/Historia/1534.jfif>';
echo '<img src = Imagenes/Historia/1949.jfif>';
echo '<img src = Imagenes/Historia/1969.jfif>';
echo '<img src = Imagenes/Historia/1854.jfif>';
echo '<img src = Imagenes/Historia/1492.jfif>';
echo '<img src = Imagenes/Historia/1885.jfif>';
echo '<img src = Imagenes/Historia/1886.jfif>';
echo '<img src = Imagenes/Historia/1859.jfif>';

$cards = array(
    "1989"  => "Entrada de los aliados en Berlin",
    "1945"  => "Año de caida del muro de Berlin",
    "1769"  => "Invención de la maquina de vapor",
    "1804"  => "Napoleon Bonaparte",
    "1643"  => "TerciosDerrota",
    "1534"  => "Tercios",
    "1949"  => "OTAN",
    "1969"  => "Llegada del hombre a la luna",
    "1854"  => "Telefono",
    "1492"  => "America",
    "1885"  => "Automovil",
    "1886"  => "Invención de la Cocacola",
    "1859"  => "Submarino"
);
foreach($cards as $x => $x_value) {
  echo "Key=" . $x . ", Value=" . $x_value;
  echo "<br>";
}
$fecha = array_rand($cards,3); // get a random key
echo $cards[$fecha[0]]."<br>";// get the corresponding value
echo $cards[$fecha[1]]."<br>";
echo $cards[$fecha[2]];
echo '<img src="Imagenes/Historia">';

?>
</body>
</html>