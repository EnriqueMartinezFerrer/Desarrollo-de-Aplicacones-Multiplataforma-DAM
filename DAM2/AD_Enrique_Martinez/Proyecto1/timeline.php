<html lang="es">
    <head>
        <meta charset="UTF-8">
        <?php
    session_start();
    var_export($_SESSION);

    if ($_SESSION['user']!="afs" || $_SESSION['pass']!="1234") 
    {
        echo header('Location:login.php');
    }
?>s      
        <title>Timeline</title>
    </head>
    <body>
        <h1 align="center">Timeline</h1>
<table border="1" cellpadding="100" cellspacing="10" align="center">
            <tr>
                <th></th>
                <th></th>
                <th></th>
            </tr>
</table>
        <center>
        <h1></h1>
    </center>
<div class="cartaInicio" draggable = "true" id="holaa" ondragstart="drag(event)" id="cartaInicio">
<?php
$cards = array(
    "1989"  => "Entrada de los aliados en Berlin",
    "1945"  => "Año de caida del muro de Berlin",
    "1769"  => "Invención de la maquina de vapor",
    "1804"  => "Napoleon Bonaparte es nombrado emperador",
    "1643"  => "primera derrota de los Tercios",
    "1534"  => "creacion de los Tercios",
    "1949"  => "Creacion de la OTAN",
    "1969"  => "Llegada del hombre a la luna",
    "1854"  => "Creacion de telefono",
    "1492"  => "Descubrimiento de America",
    "1885"  => "Primer Automovil",
    "1886"  => "Invención de la Cocacola",
    "1859"  => "El Primer Submarino"
);
foreach($cards as $fecha => $x_value) {
echo '<tr><td>'.$x_value.'<img src="Historia/'.$fecha.'.jpg" width=140 height="140"/></td></tr>';
      }

$fecha = array_rand($cards,3); // get a random key
echo $cards[$fecha[0]]."<br>";// get the corresponding value
echo $cards[$fecha[1]]."<br>";
echo $cards[$fecha[2]];

?>
<section class = "conjunto">
<div class="caja" id="0" ondrop="drop(event)" ondragover="allowDrop(event)">
    
    </div>
    <div class="caja" id="1" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
    <div class="caja" id="2" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
    <div class="caja" id="3" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
    <div class="caja" id="4" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
    <div class="caja" id="5" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
    <div class="caja" id="6" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
        <div class="caja" id="7" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
        <div class="caja" id="8" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
        <div class="caja" id="9" ondrop="drop(event)" ondragover="allowDrop(event)">
        
    </div>
</div>
</section>
</body>
</html>