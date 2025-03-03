<?php

require("utils.php");

$carton1 = array();
$carton2 = array();
$bolas = array();
$iteracion = 0;
$gananciasJugador1 = 0;
$gananciasJugador2 = 0;

$jugador1comprobarVertical = 1;
$jugador1comprobarHorizontal = 1;
$jugador2comprobarVertical = 1;
$jugador2comprobarHorizontal = 1;

$finalJuego = false;

//var_export($_POST);
if(isset($_POST["carton1"])){
    $carton1 = $_POST["carton1"];
    $carton2 = $_POST["carton2"];
    $bolas = $_POST["bolas"];
    $iteracion = $_POST["iteracion"] + 1;

    $jugador1comprobarVertical = $_POST["jugador1comprobarVertical"];
    $jugador1comprobarHorizontal = $_POST["jugador1comprobarHorizontal"];
    $jugador2comprobarVertical = $_POST["jugador2comprobarVertical"];
    $jugador2comprobarHorizontal = $_POST["jugador2comprobarHorizontal"];

    $gananciasJugador1 = (int) $_POST["gananciasJugador1"];
    $gananciasJugador2 = (int) $_POST["gananciasJugador2"];
}

do {
    $numeroBolaAleatorio = rand(1, 69);
} while(in_array($numeroBolaAleatorio, $bolas));
array_push($bolas, $numeroBolaAleatorio);


?>

<!DOCTYPE html>
<html>
    <head>
        <title>Examen JGV</title>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="styles.css">
    </head>
    <body>
        <form action="index.php" method="POST">
            

            <?php
                if($iteracion == 4){
                    //La longitud en este punto será impar, por lo tanto se accede al valor de la mitad
                    echo "<p>La mediana de las bolas sin ordenar es ". $bolas[count($bolas)/2] ."</p>";
                    $iteracion = 0;
                }
            ?>
            <input name="iteracion" type="number" style="display:none" value="<?php echo $iteracion ?>"/>


            <div><?php imprimirBolas($bolas); ?></div>

            <div class="carton jugador1"><?php
                $carton1 = generarCarton($carton1, "carton1[]");
                $resultado = verificarLinea($carton1, $bolas, $jugador1comprobarVertical, $jugador1comprobarHorizontal);
                if($resultado == "horizontal"){
                    if($jugador1comprobarHorizontal) $gananciasJugador1 = (int) $gananciasJugador1 + 10;
                    $jugador1comprobarHorizontal = 0;
                } else if($resultado == "vertical"){
                    if($jugador1comprobarVertical) $gananciasJugador1 = (int) $gananciasJugador1 + 10;
                    $jugador1comprobarVertical = 0;
                    
                } else {
                    echo "<p>Todavía no hay línea</p>";
                }

                echo "<p>Ganancias: <input class='ganancias' type='number' readonly name='gananciasJugador1' value='$gananciasJugador1'></p>";
                echo "<input type='number' style='display:none' name='jugador1comprobarVertical' value='$jugador1comprobarVertical'>";
                echo "<input type='number' style='display:none' name='jugador1comprobarHorizontal' value='$jugador1comprobarHorizontal'>";
                
            ?></div><br>
            <div class="carton jugador2"><?php
                $carton2 = generarCarton($carton2, "carton2[]");
                $resultado = verificarLinea($carton2, $bolas, $jugador2comprobarVertical, $jugador2comprobarHorizontal);
                    if($resultado == "horizontal"){
                        if($jugador2comprobarHorizontal) $gananciasJugador2 = (int) $gananciasJugador2 + 10;
                        $jugador2comprobarHorizontal = 0;
                    } else if($resultado == "vertical"){
                        if($jugador2comprobarVertical) $gananciasJugador2 = (int) $gananciasJugador2 + 10;
                        $jugador2comprobarVertical = 0;
                        

                    } else {
                        echo "<p>Todavía no hay línea</p>";
                    }
                    echo "<p>Ganancias: <input class='ganancias' type='number' readonly name='gananciasJugador2' value='$gananciasJugador2'></p>";
                    echo "<input type='number' style='display:none' name='jugador2comprobarVertical' value='$jugador2comprobarVertical'>";
                    echo "<input type='number' style='display:none' class='ganancias' name='jugador2comprobarHorizontal' value='$jugador2comprobarHorizontal'>";
            
            ?></div>
            <?php
                if($finalJuego){
                    echo "<p>Fin del juego</p>";
                    echo "<p>Ganancias Jugador 1: ". $gananciasJugador1 ."</p>";
                    echo "<p>Ganancias Jugador 2: ". $gananciasJugador2 ."</p>";
                } else {
                    echo "<button type='submit'>Bola</button>";
                }?>
            

        </form>
    </body>
</html>