<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ganaste</title>
</head>
<body>
<form method="POST" id="form6">
	<?php
     echo '<img onclick="go()" src="../victoria.jpg">';
     echo '<img onclick="go1()" src="../back.png">';
      ?>

      	</form>
      	<script type="text/javascript">
      		function go1()
      		{
      			document.getElementById("form6").action="Ejpuertas1.php";
      			document.getElementById("form6").submit();
      		}
      	</script>
</body>
</html>