<html>
	<head>
		<?php
			$color1 = rand(0,255);
			$color2 = rand(0,255);
			$color3 = rand(0,255);
			$numero;
			do{
				$numero=rand(9,15);
			}while($numero%2==0)
		?>
	</head>
	<body>
		<h1>
			EL NUMERO DE LA SUERTE EL <?php echo rand(1,200) ?>
		</h1>
		<h2 style="color: rgb<?php echo $color1?>">
					<?php echo $color2?>,
					<?php echo $color3?>">
			COLOR

		</h2>
		<img src="<?php echo(rand(1,2));?>.jpg">
		<<?php 
		echo "<table border = '1'<br/> ";
        
            $contador = 0;
                for($i=0;$i<$numero;$i++) {
                    echo"<tr>";
                
                for ($j=0;$j<$numero;$j++){
                    if($i==$j)echo "<td> * </td>";
                    elseif($i+$j==$numero-1)echo "<td> * </td>";
                    elseif($i == $numero/2-0.5 || $j == $numero/2-0.5)echo "<td> * </td>";
                    else{ echo "<td> $numero </td>"; $contador += $numero;}
                }
                echo "</tr>";
            }
            echo $contador;
        ?>

	</body>

</html>	