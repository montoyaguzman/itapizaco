<?php
   require("conexion.php");
   ?>

</!DOCTYPE html>
<html lang="es">
<head>
<title> Registro</title>
<meta charset="utf-8">
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1, maximum-scale=1, minimum-scale=1">
  <link rel="stylesheet" href="estilo.css">


</head>
<body>
   <center><H1> Iniciar sesion </H1> </center>

   <center><img src="man.png" alt=""></center>

   <form action="registro.php" method="POST">
     <label for="correoU"> Correo: <label> <br>
     <input type="email" placeholder="&#128272"; name="usermail"><br>
     <label for="contraU"> Contraseña: </label><br>
     <input type="password" placeholder="&#128272; Contraseña" name="userpass"><br>
     <input type="submit" name="ingresar" value="ingresar"><br><br> 
    </form>
     
     <center><H1> Registrarse</H1></center>
     <form action="registro.php" method="POST">
          <label for="CorreU">Correo: </label> <br>
          <input type="email" name="usermail"> <br>
          <label for="nombreU"> Nombre de usuario: </label><br>
          <input type="text" name="nickname"><br>
          <label for="contraU">Contraseña: </label><br>
          <input type="password" name="userpass"> <br>
          <input type="submit" value="registrarse" name="registrarse">
    </form>
<body>
</body>
</html>


