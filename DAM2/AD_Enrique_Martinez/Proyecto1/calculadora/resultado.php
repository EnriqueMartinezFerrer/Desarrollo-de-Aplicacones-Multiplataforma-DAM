<!DOCTYPE html>
<html>
<head>
	<title>Resultado</title>
</head>
<body>
	<?php
	//Capturar valores
	$numero1 = $_POST["numero1"];
	$numero2 = $_POST["numero2"];
	$operacion = $_POST["operacion"];

	//Verificar operación
	$resultado = 0;
	if ($operacion == "sumar") $resultado = $numero1 + $numero2;
		elseif ($operacion == "restar") $resultado = $numero1 - $numero2;
		elseif ($operacion == "dividir") $resultado = $numero1 / $numero2;
		elseif ($operacion == "multiplicar") $resultado = $numero1 * $numero2;

		//Mostrar resultado
		echo "<p><b>resultado de $operacion $numero1 y $numero2:</b> $resultado</p>";
	?>

</body>
</html>