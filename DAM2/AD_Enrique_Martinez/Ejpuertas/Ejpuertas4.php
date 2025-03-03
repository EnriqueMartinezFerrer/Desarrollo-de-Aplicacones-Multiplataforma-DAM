<form method="POST" id="form3">
			<?php
			$npuertas = rand(6,12);
			$alante = rand(0,$npuertas-1);
			do{
				$atras = rand(0,$npuertas-1);
			}
			while($alante==$atras);
				for ($i=0; $i < $npuertas ; $i++) { 
					if ($npuertas==2) {
					
					if ($alante==$i) {
					echo '<img onclick="go()" src="puerta.jpg">';
					
					}else{
					echo '<img onclick="godie()" src="puerta.jpg">';
					}

				}
			
				
			else{  
				if ($alante==$i) {
					echo '<img onclick="go()" src="puerta.jpg">';
				}
				else if ($atras==$i) {
						echo '<img onclick="goback()" src="puerta.jpg">';
					}else{
						echo '<img onclick="godie()" src="puerta.jpg">';
						}
					}
				}
      		?>
      	</form>
      	<script type="text/javascript">
      		function go()
      		{
      			document.getElementById("form3").action="EjpuertasV.php";
      			document.getElementById("form3").submit();
      		}
      		function godie()
      		{
      			document.getElementById("form3").action="muerte.php";
      			document.getElementById("form3").submit();

      		}
      		function goback()
      		{
      			document.getElementById("form3").action="Ejpuertas3.php";
      			document.getElementById("form3").submit();

      		}
      	</script>