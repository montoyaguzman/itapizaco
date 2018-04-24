<?php 
session_start();

if ($_SESSION['NOMBRE_USUARIO'])
{	
	session_destroy();
	echo '<script language = javascript>
	alert("su sesion ha terminado correctamente")
	self.location = "index.php"
	</script>';}
else
{
	echo '<script language = javascript>
	alert("No ha iniciado ninguna sesión, por favor inicie sesion aqui")
	self.location = "index.php"
	</script>';}
?>