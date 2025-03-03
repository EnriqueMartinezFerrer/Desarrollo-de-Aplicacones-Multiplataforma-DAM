<html>
<head>
<?php
        $color1 = rand(0,255);
        $color2 = rand(0,255);
        $color3 = rand(0,255);
        $numero;
        do{
                $numero=rand(9,15);
            }
    
    ?>

</head>
<body>


	<form name="formulario" method="post" action="/send.php">
  <!-- Campo de texto combinado con lista de opciones -->
  <input type="text" list="items" />
  <!-- Lista de opciones -->
  <datalist id="items">
    <option value="SUMA">Opción 1</option>
    <option value="MULTIPLICACION">Opción 2</option>
    <option value="3">Opción 3</option>
  </datalist>
</form>
</body>
</html><