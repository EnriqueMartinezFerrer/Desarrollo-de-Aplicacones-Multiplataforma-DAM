<!DOCTYPE html>
<html>
<head>
	<title>Pantalla Principal</title>
		<link rel="stylesheet" href="styles.css"/>
		<script src="script.js"></script>
</head>
<body>

<h1 align="center">Arrastra la imagen</h1>

<section class="mano">
<div class="cartaInicio" draggable = "true" id="holaa" ondragstart="drag(event)" id="cartaInicio" >
	
	<?php
	$arrayCartas = array("'descubrimientoAmerica.jpg'","'campeones.jpg'","'guerraIndependencia.jpg'");
	$urlImagen = array_rand($arrayCartas);
	$carta = $arrayCartas[$urlImagen];
        
        echo "<img src =".$carta."draggable = 'true' id='holaa' ondragstart='drag(event)'' id='1492'>";

        ?>
    </div>
<br><?php
	echo $carta
?>

<div class="cartaInicio" draggable = "true" id="holaa" ondragstart="drag(event)" id="cartaInicio" >
	
	<?php
	$arrayCartas = array("'descubrimientoAmerica.jpg'","'campeones.jpg'","'guerraIndependencia.jpg'","'luna.jpg'","'fuego.jpg'");
	$urlImagen = array_rand($arrayCartas); //Es un número que mas adelante nos dirá una posicion
	echo $urlImagen; 

	for ($i=1; $i <5 ; $i++) { 
		$arrayCartas[i]
	}


	$carta = $arrayCartas[$urlImagen]; //Imprime la posicion x del array
        echo "<img src =".$carta."draggable = 'true' id='holaa' ondragstart='drag(event)'' id='1492'>";
		


        ?>
</div>


<br><?php
	echo $carta
?>


<div class="cartaInicio" draggable = "true" id="holaa" ondragstart="drag(event)" id="cartaInicio" >
	<?php
	$imagen= rand (1,3);
	switch ($imagen) {
    case 1:
        echo "<img src = 'descubrimientoAmerica.jpg' draggable = 'true' ondragstart='drag(event)'' id='1492'>";
        break;
    case 2:
         echo "<img src = 'campeones.jpg' draggable = 'true' id='holaa' ondragstart='drag(event)'' id='1492'>";
        break;
    case 3:
         echo "<img src = 'guerraIndependencia.jpg' draggable = 'true' id='holaa' ondragstart='drag(event)'' id='1492'>";
        break;
    }
?>


    </div>
</section>
</div>
<br>
<br>
<br>
<br>
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
		<div class="caja" id="6" ondrop="drop(event)" ondragover="allowDrop(event)">
		
	</div>
		<div class="caja" id="6" ondrop="drop(event)" ondragover="allowDrop(event)">
		
	</div>
		<div class="caja" id="6" ondrop="drop(event)" ondragover="allowDrop(event)">
		
	</div>
	


	
</section>
</body>
</html>