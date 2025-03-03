
<!DOCTYPE html>
<html>
<head>
	<title>Batalla 1</title>
</head>
<body>
<form method="post" action="chofo.php">
	<?php
	$victoria = false;
	$numero = $_POST["numero"];
	$chofi = $_POST["chofi"];
	$operacion = $_POST["operacion"];

	$vrandom=rand(1,3);

	if($chofi=="Menor") {
   	 if("txtDato">"numero") {"continuar"=disabled="true" || "reanudar"=disabled="false"
        if($condic3) {
        }
    }
}

?>
<input type=number name=txtDato placeholder="Número 1" value="<?php echo $vrandom ?>" readonly>
<button name="operacion"  value="continuar" disabled="true">continuar</button>
<button name="operacion"  value="reanudar" disabled="true">reanudar</button>

</body>
</html>