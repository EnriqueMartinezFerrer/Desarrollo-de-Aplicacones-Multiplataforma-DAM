<!DOCTYPE html>
<?php
session_start();
var_export($_SESSION);
var_export($_POST);
if(isset($_POST['sNombre']))
{
	$loginOK=false;
	if ($_POST["sNombre"]=="afs") {
		$passDB = "1234";
		if ($passDB==$_POST["sPassword"])
		 {
			$loginOK=true;
			$_SESSION['user']=$_POST['sNombre'];
			$_SESSION['pass']=$_POST['sPassword'];
			echo header('Location:Trabajando.php');
		}
		
	}
}
?>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
</head>
	<body>
		<form action="login.php" method="post">
			<label>USER:</label><input type="text" name="sNombre"/>
			<br/>
			<label>PASS</label><input type="password" name="sPassword"/>
			<br/>
			<input type="submit" value="login"/>
			<br/>
			<label><?php
			if (isset($_POST["sNombre"])) 
			{
				echo( ($loginOK)?"ESTÁS DENTRO":"ERROR CREDENCIALES" );
			}
			?></label>
		
		</form>


	</body>
</html>