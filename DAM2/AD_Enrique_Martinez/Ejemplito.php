<?php

    function conectarDB(){
        try{
            $db = new PDO("mysql:host=localhost;dbname=DB_FRUITIS;charset=utf8mb4","root","");
            $db->setAttribute(PDO::ATTR_ERRMODE,PDO::ERRMODE_EXCEPTION);
            return $db;
        }
        catch(PDOException $ex){
            echo ("Error al conectar".$ex->getMessage());
        }
    }
function getHortalizaFromTamColor($conDb, $tam, $color)
{
     try
  {
    $sql = "SELECT * FROM HORTALIZAS WHERE TAM=:tamAux and COLOR=:colorAux";
    $stmt = $conDb->prepare($sql,array(PDO::ATTR_CURSOR=>PDO::CURSOR_FWDONLY));
    $stmt->execute(array(":tamAux"=>$tam));
    while($fila = $stmt->fetchAll())
   {vectorTotal[]=$fila;
    $
   }
   }
  catch (PDOException $ex)
  {
    echo ("Error getHortalizaFromTam2".$ex->getMessage());
  }
  return $fila;
}
function getHortalizaFromTam($conDb, $tam)
{
  try
  {
    $sql = "SELECT * FROM HORTALIZAS WHERE TAM=".$tam;
    $stmt = $conDb->query($sql);
    $fila = $stmt->fetch(PDO::FETCH_ASSOC);
   }
  catch (PDOException $ex)
  {
    echo ("Error al conectar".$ex->getMessage());
  }
  return $fila;
}
function getAllHortalizasFromTam($conDb, $tam)
{
  $vectorTotal = array();
  try
  {
    $sql = "SELECT * FROM HORTALIZAS WHERE TAM=".$tam;
    $stmt = $conDb->query($sql);
    while($fila = $stmt->fetch(PDO::FETCH_ASSOC))
    {
      $vectorTotal[]=$fila;
    }
   }
  catch (PDOException $ex)
  {
    echo ("Error al conectar".$ex->getMessage());
  }
  return $vectorTotal;
}
function getAllHortalizasFromTam2($conDb, $tam)
{
  $vectorTotal = array();
  try
  {
    $sql = "SELECT * FROM HORTALIZAS WHERE TAM=:tamAux";
    $stmt = $conDb->prepare($sql,array(PDO::ATTR_CURSOR=>PDO::CURSOR_FWDONLY));
    $stmt->execute(array(":tamAux"=>$tam));
    while($fila = $stmt->fetch(PDO::FETCH_ASSOC))
    {
      $vectorTotal[]=$fila;
    }
   }
  catch (PDOException $ex)
  {
    echo ("Error al conectar".$ex->getMessage());
  }
  return $vectorTotal;
}





//UPDATE
function modificarHortalizaFromTamAndColor($conDb, $tam,$color)
{
  $vectorTotal = array();
  try
  {
    $sql = "UPDATE HORTALIZAS SET NOMBRE=? WHERE COLOR=? AND TAM=?;";
    $stmt = $conDb->prepare($sql);
    $stmt->db2_bind_param($nombre, $color, $tam);
    $stmt ->execute();
    while($fila = $stmt->fetch(PDO::FETCH_ASSOC))
    {
      $vectorTotal[]=$fila;
    }
   }
  catch (PDOException $ex)
  {
    echo ("Error al conectar".$ex->getMessage());
  }
  return $vectorTotal;
}
?>