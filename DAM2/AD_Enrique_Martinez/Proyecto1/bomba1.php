<html>
  <?php
  //var_export($_POST);
  $dimension=5;
  ?>
  <head>
    
    <style>
      .bonito {
        width:80px;
        height:80px;
        margin:4px;
        font:30px Arial;
        text-align: center;
      }
    
    </style>
    
    
    
    <script>
    function go(x,y)
    {
      //alert('go:'+x+','+y); 
      //cument.getElementById("lastHit1").value="i"+x+y;
      
      document.getElementById("i"+x+y).value=1;
      var idBanValue= document.getElementById("idBandera").value;
      if (idBanValue ==("i"+x+y) )
      {
        alert ("ENHORABUENA DE LA BUENA");
      }
      else
      {
        document.getElementById("form1").submit();  
      }
      
      
    }
    </script>
  </head>
  <body>
    
    <form id="form1" action="bomba1.php" method="post">
    <input type="hidden" id="lastHit1" name="lastHit"/>
      <?php
      // PRIMERA VEZ
      if (count($_POST) == 0)
      {
        $x = rand(0,$dimension-1);
        $y = rand(0,$dimension-1);
        echo '<input id="idBandera" type="hidden" name="bandera" value="i'.$x.$y.'"/>';
      }
      else
      {
        
  echo '<input  id="idBandera" type="hidden" name="bandera" value="'.$_POST['bandera'].'"/>';
      }
      
      for ($i=0; $i<$dimension; $i++)
      {
        for ($j=0; $j<$dimension; $j++)
        {
          $valor = (isset($_POST["i".$i.$j]))?$_POST["i".$i.$j]:"";
          $varRojo = ponerRojo($valor);
          echo '<input '.$varRojo.' class="bonito" value="'.$valor.'"onclick="go('.$i.','.$j.')" type="text" name="i'.$i.$j.'" id="i'.$i.$j.'"/>';        
        }
        echo "<br/>";
      }
  
 
      
      
      function ponerRojo($valor1)
      {
        if ($valor1==1)
        {
          return "style = 'background-color:red' ";
        }
        else
        {
          return "";  
        }
        
      }
      
      
      
   ?>   
      
      <!--input type="submit" value="dame!"/-->
      
   </form>
    
  </body>
</html>