<html lang="es">
    <head>
        <meta charset="UTF-8">
        <title>Timeline</title>
    </head>
    <body background="" bgcolor="FFCECB">
        <center>
        <h1></h1>
    </center>
    
<?php
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
foreach($cards as $fecha => $x_value) {
echo '<tr><td>'.$x_value.'<img src="Historia/'.$fecha.'.jpg" width=140 height="140"/></td></tr>';
      }

$fecha = array_rand($cards,3); // get a random key
echo $cards[$fecha[0]]."<br>";// get the corresponding value
echo $cards[$fecha[1]]."<br>";
echo $cards[$fecha[2]];

?>
</body>
</html>