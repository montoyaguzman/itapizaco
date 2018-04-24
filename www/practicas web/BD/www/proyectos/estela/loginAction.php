<?php
  include("conexion.php");

  $correo = $_POST['correo'];
  $contrasena = $_POST['contrasena'];

  /*echo $correo;
  echo "\n";
  echo $contrasena;*/

  if (isset($_POST['registrar'])){
    if ($correo == '' or $contrasena == ''){ 
      echo "<br>Llena los datos completos";
    }else{
      $sql = "INSERT INTO usuarios(correo,contrasena) VALUES ('$correo','$contrasena');";

      $alta = mysqli_query($conexion,$sql);

      if($alta){
        echo "<br>INFORMACIÓN REGISTRADA CON EXITO";
      }
      else{
        echo "<br>NO SE PUDO INSERTAR REGISTRO, POSIBLE USUARIO REPETIDO";
      }
    }
  }
  ?>