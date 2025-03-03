<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Apuestas</title>
</head>
<body>
    <h1>CARA O CRUZ 2.0</h1>
    <form action="caracruz.php" method="POST" id="form1">
        <?php
            $sel="";
            $pot = isset($_POST["pot"]) ? $_POST["pot"] : "";
            if($pot!=""&&isset($_POST["mov"]) && $_POST["mov"] == "GO"){
                if(ctype_digit($_POST["money"])&&intval($_POST["money"])>intval($pot))echo "El dinero tiene que ser menor o Igual que el POT <br/>";
                if (ctype_digit($_POST["money"])&&intval($_POST["money"])<=intval($pot)&&isset($_POST["sel"])){
                    $sel = rand(0, 1) == 0 ? "CARA" : "CRUZ";
                    $pot = $_POST["sel"]==$sel?intval($pot)+intval($_POST["money"]):intval($pot)-intval($_POST["money"]);
                }
                if(!ctype_digit($_POST["money"]))echo "El Dinero no es Válido <br/>";
                if(!isset($_POST["sel"]))echo "Tienes que seleccionar Cara o Cruz <br/>";
            }
            if ($pot == "")echo "Reinicia para Empezar <br/>";
            if ($pot != "" && intval($pot) <= 0) {$pot = 0;echo "Tu dinero es 0, Reinicia <br/>";}
        ?>
        <input type="hidden" value="" id="mov" name="mov"/>
        <input type="hidden" value="<?php echo $pot?>" name="pot" id="pot"/>
        <fieldset>
            <legend>MONEDA</legend>
            <input type="text" <?php if(isset($_POST["mov"])&&$_POST["mov"]=="GO") echo "value='$sel'"?> readonly/>
        </fieldset>
        <fieldset>
            <legend>POSTURA</legend>
            <button type="button" onclick="potF()">Apostar</button>&nbsp;Dinero:<input type="text" name="money"/>&nbsp;Cara:<input type="radio" name="sel" value="CARA"/>&nbsp;Cruz:<input name="sel" value="CRUZ" type="radio"/>
        </fieldset>
        <fieldset>
            <legend>POT</legend>
            <br>
            <?php echo $pot?>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <button type="button" onclick="restartG()">Reiniciar</button>
            <br>
        </fieldset>
    </form>
    <script>
        function potF(){
            document.getElementById("mov").value="GO"
            document.getElementById("form1").submit();
        }
        function restartG(){
            document.getElementById("pot").value="100"
            document.getElementById("form1").submit();
        }
    </script>
</body>
</html>