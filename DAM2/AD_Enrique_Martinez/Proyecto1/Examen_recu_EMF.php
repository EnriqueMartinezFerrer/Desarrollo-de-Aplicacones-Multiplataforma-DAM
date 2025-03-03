<?php 


	$monedas = "";
	$apostar = "";
	$total = "";
	$dinero = "";

	if (isset($_POST['adelante'])) {
    	$monedas = $_POST['monedas'];
    	$apostar = $_POST['adelante'];
    	$dinero = $_POST['Dinero'];
    	$total = $_POST['total'];


    $opcion = rand(0, 1);
    if($opcion == 0){
        $monedas = 'Cara';
    }else{
        $monedas = 'Cruz';
    }
    if($monedas == $_POST['']){
        $total = $total + $dinero;
    } else {
        $total = $total - $dinero;
    }



}

	if(isset($_POST['reset'])){
    	$monedas = "";
    	$apostar = "";
    	$total = 100;
	}


?>

			

<p>CARA O CRUZ 2.0  </p>
	<form action="" method="post">
	<fieldset>
			<legend><font color="blue">MONEDA</font></legend>
       <input type="text" readonly name="monedas" value="<?php echo $monedas; ?>" >

			<br><br>
			
		</fieldset>
		
				<fieldset>
			<legend><font color="blue">POSTURA</font></legend>
			<input type="submit" value="apostar" name="adelante">
			Dinero:<input type="text"  name="Dinero" value="<?php echo $dinero; ?>">

			cara<input type="radio" name="Opcion" value="Cara" checked>
			cruz<input type="radio" name="Opcion" value="Cruz">
			</fieldset>
			<fieldset>
			<legend><font color="blue">POT</font></legend>
			<input type="text" value="<?php echo $total; ?>" name="total">
			<input type="submit" value="Reiniciar" name="reset">
			<br><br>
			</fieldset>
		</form>
		
