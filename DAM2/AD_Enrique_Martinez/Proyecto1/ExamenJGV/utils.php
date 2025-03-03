<?php

function verificarLinea($carton, $bolas, $comprobarVertical, $comprobarHorizontal){
    //La lista se convierte a nested
    $filas = [
        [$carton[0], $carton[1], $carton[2], $carton[3]],
        [$carton[4], $carton[5], $carton[6], $carton[7]],
        [$carton[8], $carton[9], $carton[10], $carton[11]],
    ];

    //COMPROBACIÓN HORIZONTAL
    if($comprobarHorizontal){
        for($y=0; $y<3; $y++){
            $fila = $filas[$y];
            if(in_array($fila[0], $bolas) && in_array($fila[1], $bolas) && in_array($fila[2], $bolas) && in_array($fila[3], $bolas)){
                return "horizontal";
            }
        }
    }
    
    //COMPROBACIÓN VERTICAL
    if($comprobarVertical){
        for($y=0; $y<3; $y++){
            $valor1 = $filas[0][$y];
            $valor2 = $filas[1][$y];
            $valor3 = $filas[2][$y];
            if(in_array($valor1, $bolas) && in_array($valor2, $bolas) && in_array($valor3, $bolas)){
                return "vertical";
            }
        }
    }
    
    return "";
}

function imprimirBolas($bolas){
    sort($bolas);
    foreach($bolas as $bola){
        echo "<input name='bolas[]' class='bola' value='$bola' readonly>";
    }
}

function generarCarton($carton, $numeroCarton){
    if(count($carton) != 0){
        $avance = 0;
        $cartasCorrectas = 0;
        for($i=0; $i<3; $i++){
            for($j=0; $j<4; $j++){
                global $bolas;
                if(in_array($carton[$avance], $bolas)){
                    $color = "red";
                    $cartasCorrectas = (int) $cartasCorrectas + 1;
                } else {
                    $color = "0099ff";
                }

                echo "<input style='background-color:$color' name='$numeroCarton' class='casilla' value='". $carton[$avance] ."' readonly/>";
                $avance++;
            }
            echo "<br>";
        }
        echo $cartasCorrectas;
        if($cartasCorrectas == 12){
            global $finalJuego;
            $finalJuego = true;
        }
    } else {
        for($i=0; $i<3; $i++){
            for($j=0; $j<4; $j++){
                do {
                    $valorAleatorio = rand(1, 69);
                } while(in_array($valorAleatorio, $carton));
                array_push($carton, $valorAleatorio);

                global $bolas;
                if(in_array($valorAleatorio, $bolas)){
                    $color = "red";
                } else {
                    $color = "0099ff";
                }
                
                echo "<input style='background-color:$color' name='$numeroCarton' class='casilla' value='$valorAleatorio' readonly/>";
            }
            echo "<br>";
        }
        
    }
    return $carton;
    
}


?>