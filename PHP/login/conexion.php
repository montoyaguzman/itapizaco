
<?php

   $BBDD_host= "localhost";
   $BBDD_hostuser="root";
   $BBDD_hostpw ="";
   $BBDD_hostdb ="datos";

   $con = mysqli_connect($BBDD_host,$BBDD_hostuser,$BBDD_hostpw,$BBDD_hostdb);
   
   if($con){
      echo "Conexion exitosa";   
   }
   else{
      echo "<br>NI MADRES NO SE PUEDE";
   }
 ?>