<!DOCTYPE html>
<html>
  <head>
    <title>Página de Admin</title>
    <link rel="stylesheet" type="text/css" href="main.css">
  </head>
  <body>
    <div class="container">
      <h1>ADMINISTRAR ATRACCIONES</h1>
      <form action="" method="POST">
        <p>Nombre: <input type="text" name="nombre" id="nombre"></p>
        <p>Temática:</p>
        <textarea name="tematica"></textarea>
        <br>
        <p>Selecciona una atracción: 
        <input type="submit" name="Crear_atraccion" value="Crear atracción" class="button-87">
        <input type="submit" name="Borrar_atraccion" value="Eliminar atracción" class="button-87">
        <input type="submit" name="Modificar_atraccion" value="Modificar atracción" class="button-87">
        <input type="submit" name="Listar_atracciones" value="Listar atracciones" class="button-87">
        <select id="seleccion">
          <?php
            require_once ("parque_db.php");
            $db = conectarDB();
            $comando = $db->prepare("SELECT nombre FROM atracciones");
            $comando->execute();
            while($fila = $comando->fetch(PDO::FETCH_ASSOC)){
              echo '<option value="'.$fila['nombre'].'">'.$fila['nombre'].'</option>';
            }
          ?>
        </select>
        </p>
        <br>
      </form>
    </div>
    <script>
      document.getElementById("seleccion").addEventListener("change", function(){
        document.getElementById("nombre").value = this.value;
      });
    </script>
  </body>
</html>