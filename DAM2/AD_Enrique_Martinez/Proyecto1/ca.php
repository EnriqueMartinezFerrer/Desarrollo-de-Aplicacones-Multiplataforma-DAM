<!DOCTYPE html>
<html>
<head>

</head>
<body>

	<h1>
		<<?php  
			var_export($_POST);
			echo "EL VALOR DE a ES: ".$_POST['a'];
			$suma = $_POST['a']+$_POST['b']+$_POST['c'];
			echo "<input type='text' value='Suma Total = $suma'>";

		?>
	</h1>

</body>
</html>