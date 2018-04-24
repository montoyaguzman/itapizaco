<?php
session_start();

if ($_SESSION['email'])
{
echo "Bienvenido ".$_SESSION['email'];
?>

<html>
	<head>
		<meta charset="utf-8" />
		<title>Administrador</title>
    <script src="../../../js/jquery-2.2.1.min.js"></script>
    <script src="../../../css/materialize/js/materialize.min.js"></script>
    <link rel="stylesheet" href="../../../css/materialize/css/materialize.css" media="screen, projection">
    <link rel="stylesheet" href="../../../css/font-awesome-4.7.0/css/font-awesome.min.css">
	</head>	


	<body>
		<div class="row">
        <div class="col s12">
        <div class="card-panel blue accent-3">
        	<span class="white-text"><h4><strong>Sesiones de usuarios</strong></h4>
        	</span>
        </div>
        </div>
        </div>

    <div class="row">
      <div class="col s6 offset-s6">
        <a href = "#" >
          <i class="small fa fa-plus-square"></i>    
        </a>
      </div>
    </div>

    <div class ="row">  			
    <div class = "col s10 offset-s1">
      <table class="responsive-table bordered highlight centered">
        <thead>
          <tr class="white-text teal">
            <th>ID</th>
            <th>Nombre</th>
            <th>Descripción</th>
            <th>Tiempo</th>
            <th>Ver</th>
            <th>Modificar</th>
            <th>Eliminar</th>
          </tr>
        </thead>
      </table>
    </div>

  	</body>
</html>

<?php
} 
else
{
  echo "No has iniciado sesion";
  header("Refresh: 3; url = 1_iniciarSesionFormulario.php");  
}
?>

