<?php
session_start();

if ($_SESSION['NOMBRE_USUARIO'])
{
echo "<br>Bienvenido ".$_SESSION['NOMBRE_USUARIO'];
?>
  <html>
	<head>
		<meta charset="utf-8" />
		<title>Principal</title>
	</head>  
	<body>

	<div>
	    <h1>PAGINA PRINCIPAL</h1>
	    <br>
	    <span>Aqui iria tu menu o lo que sea</span>
	    <br>
	    <a href="cerrarSesion.php">CERRAR SESION</a>
	    <br>
	    <span>Texto, imagenes y contenido de la pagina web</span>
	</div>
	
	</body>
</html>
<?php
} 
else
{
	echo "<br>No has iniciado sesion";
	header("Refresh: 3; url = index.php");	
}
?>	



        
	