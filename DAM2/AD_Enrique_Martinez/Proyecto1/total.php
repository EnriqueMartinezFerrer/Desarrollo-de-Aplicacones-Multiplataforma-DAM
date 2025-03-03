<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Total</title>
</head>
<body>
	<?php
	$numeros = $_POST['numeros'];
	sort($numeros);
	foreach($numeros as $numero){
		echo "<li>". $numero ."</li>";
	}

	?>
		</ul>
		<p>Mínimo:
		<?php
		echo min($numeros);
		?>
		</p>
		<p>Máximo:
		<?php
		echo max($numeros);
		?>
		</p>
		<p>
			Media:
			<?php
			echo array_sum($numeros)/ count($numeros);
			?>
		</p>
		<p>Mediana:
			<?php 
			 $cantidad = count($numeros);
			 $mitad = $numeros($cantidad/2);

			 if ($cantidad%2) {
			 	echo ($mitad + $numeros[($cantidad/2)-1])/2;
			 } else {
			 	echo $mitad;
			 }
			 ?>
		</p>
</body>
</html>