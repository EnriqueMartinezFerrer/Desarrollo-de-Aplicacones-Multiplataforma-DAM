<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<?php
	session_start();
	var_export($_SESSION);

	if ($_SESSION['user']!="afs" || $_SESSION['pass']!="1234") 
	{
		echo header('Location:login.php');
	}
?>
</head>
<body>
	<h1 align="center">Timeline</h1>
	<br><br><br><br><br>
<table border="1" cellpadding="100" cellspacing="10">
            <tr>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
</table>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<table border="1" cellpadding="100" cellspacing="10" align="center">
            <tr>
                <th></th>
                <th></th>
                <th></th>
			</tr>
</table>
</body>
</html>