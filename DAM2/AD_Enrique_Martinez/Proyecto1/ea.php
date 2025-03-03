<html>
    <head>
    </head>
    <body>
        
        <?php
        $numero = $_POST["numero"]; // se crea una varibale y se le mete el valor del input
        if(!($numero%2)){ 
            echo"No puede ser inpar";
            echo"</body> </html>";
            return;
        }
        $signo = $_POST["simbolo"];
        $oper = $_POST["oper"];
        echo "<table border = '1'<br/> ";
        if($oper == "mult"){$contador = 1;}
        else$contador = 0;
                for($i=0;$i<$numero;$i++){
                    echo"<tr>";
                for ($j=0;$j<$numero;$j++){
                    if($i==$j)echo "<td> $signo </td>";
                    elseif($i+$j==$numero-1)echo "<td> $signo </td>";
                    elseif($i == $numero/2-0.5 || $j == $numero/2-0.5)echo "<td> $signo </td>";
                    else{ echo "<td > $numero </td>";
                        if($oper == "mult"){
                            $contador *= $numero;
                        }else if ($oper == "suma")$contador += $numero;}
                        
                        
                }
                echo "</tr>";
            }
            echo "El total es: ".$contador;
        ?>
        
        
    </body>

</html>
