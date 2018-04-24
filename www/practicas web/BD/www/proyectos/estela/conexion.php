<?php
   $host= "localhost";
   $hostuser="root";
   $hostpw ="";
   $hostdb ="registro";

   $conexion = mysqli_connect($host,$hostuser,$hostpw,$hostdb);
   
   if($conexion){
      echo "<br>Conexion exitosa";   
   }
   else{
      echo "<br>NI MADRES NO SE PUEDE";
   }
 ?>