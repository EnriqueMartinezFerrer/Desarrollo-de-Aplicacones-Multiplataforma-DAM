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
	var_export($aInputs);
}
	?>
</head>
<body>
<form action="wordle.php" method="post">
	<?php
		for ($i=0; $i < strlen($palabra); $i++) { 
			$color=(isset($aInputs[$i]))?$aInputs[$i]: "white";
			$valor=(isset($_POST['letra'.$i]))?$_POST['letra'.$i]:"";
			echo '<input type="text" name="letra'.$i.'" style="background-color='.$color.';" value"'.$valor.'"/>';
		}
	?>
	<input type="text" name="letra1"/>
	<input type="text" name="letra2"/>
	<input type="text" name="letra3"/>
	<input type="text" name="letra4"/>
	<input type="text" name="letra5"/>
	<input type="submit1"/>
</form>
</body>
</html>