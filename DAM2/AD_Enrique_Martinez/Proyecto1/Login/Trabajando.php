TRABAJANDO...
<?php
	session_start();
	var_export($_SESSION);

	if ($_SESSION['user']!="afs" || $_SESSION['pass']!="1234") 
	{
		echo header('Location:login.php');
	}
?>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<form  action="cerrarSesion.php" method="post">
		<input type="submit" value="cerrar sesión">
	</form>
</body>
</html>