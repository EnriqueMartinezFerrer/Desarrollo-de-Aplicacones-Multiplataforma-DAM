<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
</head>
	<body>
		<form method="POST" id="form1">
			<?php
			$a = rand(0,1);
			for ($i=0; $i < 2 ; $i++) { 
				if ($i==$a) {
					echo '<img onclick="go()" src="../puerta.jpg">';
			
					}else{
					echo '<img onclick="godie()" src="../puerta.jpg">';
					}
      				
				}
      		?>
      	</form>
      	<script type="text/javascript">
      		function go()
      		{
      			document.getElementById("form1").action="Ejpuertas2.php";
      			document.getElementById("form1").submit();
      		}
      		function godie()
      		{
      			document.getElementById("form1").action="muerte.php";
      			document.getElementById("form1").submit();

      		}
      	</script>

       

		
	</body>
</html>