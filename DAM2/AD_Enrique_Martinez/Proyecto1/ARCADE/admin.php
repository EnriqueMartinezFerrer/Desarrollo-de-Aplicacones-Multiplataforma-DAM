<!DOCTYPE html>
<html>
  <meta charset="UTF-8">
  <head>
  <title>Pagina de Admin</title>
  <style>
    /* Establece una fuente predeterminada para todo el documento */
    body {
      font-family: Arial, sans-serif;
    }

/* Centra el tÃ­tulo en la pÃĄgina */
h1 {
  text-align: center;
  margin-top: 50px;
}

/* Ajusta el ancho de la forma y la centra en la pÃĄgina */
form {
  width: 500px;
  margin: 0 auto;
  text-align: left;
}

/* Ajusta el estilo de los elementos de entrada */
input[type="text"], textarea {
  width: 100%;
  padding: 10px;
  margin-bottom: 20px;
  box-sizing: border-box;
  border-radius: 5px;
  border: 1px solid gray;
}

/* Alinea los botones a la derecha */
input[type="submit"] {
  float: right;
}

/* Ajusta el estilo del select */
select {
  width: 100%;
  padding: 10px;
  margin-bottom: 20px;
  border-radius: 5px;
  border: 1px solid gray;
}
  </style>
  <link rel="stylesheet" type="text/css" href="main.css">
</head>

  <body>
    <h1>ADMINISTRAR MAZOS</h1>

    <form action="" method="POST">
      <p>Nombre: <input type="text" name="nombre" id="nombre"></p>
      <p>Descripción:</p>
      <textarea name="descripcion"></textarea>
      <br>
      <p>Selecciona un mazo: 
      <select id="seleccion">
        <?php
          require_once ("arcade_db.php");
          $db = conectarDB();
          $comando = $db->prepare("SELECT nombre FROM mazo");
          $comando->execute();
          while($fila = $comando->fetch(PDO::FETCH_ASSOC)){
            echo '<option value="'.$fila['nombre'].'">'.$fila['nombre'].'</option>';
          }
        ?>
      </select>
      </p>
      <br>
      <input type="submit" name="Crear_mazo" value="Crear mazo" class="button-87">
      <input type="submit" name="Eliminar_mazo" value="Eliminar mazo" class="button-87">
      <input type="submit" name="Modificar_mazo" value="Modificar mazo" class="button-87">
      
    </form>
    <br>
    <script>
      document.getElementById("seleccion").addEventListener("change", function(){
        document.getElementById("nombre").value = this.value;
      });
    </script>

  </body>
</html>