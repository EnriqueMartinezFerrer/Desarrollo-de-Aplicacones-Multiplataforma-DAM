<!DOCTYPE html>
<html>
<head>
    
</head>
<body>
    <<?php
    $sum = $_POST['s'];
    $num = $_POST['n'];
    ?>
    
    <?php 
        echo "<table border = '1'<br/> ";
        
            $contador = 0;
                for($i=0;$i<$numero;$i++) {
                    echo"<tr>";
                
                for ($j=0;$j<$numero;$j++){
                        if($i==$j)echo "<td> n </td>";
                    elseif($i+$j==$numero-1)echo "<td> n </td>";
                    elseif($i == $numero/2-0.5 || $j == $numero/2-0.5)echo "<td> n </td>";
                    else{ echo "<td> $numero </td>"; $contador += $numero;}
                }
                echo "</tr>";
            }
    echo $contador;
?>
</body>


</html>