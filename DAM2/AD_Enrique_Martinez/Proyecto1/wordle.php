<!DOCTYPE html>
<html>
<head>
	<?php
	$palabra = "RUEDA";
	$aInputs=array();
	if(isset($_POST['boton'])){
	var_export($_POST);
	for ($i=0; $i < strlen($palabra); $i++) { 
		echo $palabra[$i];
		if($palabra[$i]==$_POST['letra'.$i]){
			$aInputs[$i] =="green";
		}else{
			$aInputs[$i] =="white";
		}
	}
	$intentos = $_POST['intentosPost']+1;
}
	
	{
		$intentos = 0;
	}
	?>

</head>
<body>
<form action="wordle.php" method="post">
	<input type="hidden" name="intentosPost" value="<?php echo $intentos; ?>"/>
	<label>Numero de Intentos <?php echo "intentos";?></label>
	<?php
		for ($i=0; $i < strlen($palabra); $i++) { 
			$color=(isset($aInputs[$i]))?$aInputs[$i]: "white";	
			$valor=(isset($_POST['letra'.$i]))?$_POST['letra'.$i]:"";
			echo '<input type="text" value="'.$valor.'" name="letra'.$i.'" style="background-color:'.$color.'"/>';
		}
	?>
	<input type="submit" name="boton"/>
</form>
</body>
</html>