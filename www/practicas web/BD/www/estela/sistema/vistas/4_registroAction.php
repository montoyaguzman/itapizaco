<?php

include("../modelo/conexion.php");

$rfc = $_REQUEST['rfc'];
$email = $_REQUEST['email'];
$numEmpleado = $_REQUEST['numEmpleado'];
$nombreUsuario = $_REQUEST['nombreUsuario'];
$contrasena1 = $_REQUEST['contrasena1'];
$contrasena2 = $_REQUEST['contrasena2'];

if ($contrasena1 == $contrasena2)
{	
	$contrasena = $contrasena1;
	
	$sql = "INSERT INTO usuarios(rfc,numEmpleado,correo,usuario,contrasena) 
	VALUES ('$rfc','$numEmpleado','$email','$nombreUsuario','$contrasena');";
	
	$alta = mysqli_query($conexion,$sql);
	
	if($alta){
		echo "<br>INFORMACIÓN REGISTRADA CON EXITO";
		header("Refresh: 3; url = 1_iniciarSesionFormulario.php");
	}
	else{
		echo "<br>NO SE PUDO INSERTAR REGISTRO".mysql_error();
	}
	//echo $sql;
}

else
{
	echo "Las contraseñas no coinciden";
	header("Refresh: 3; url = 4_registroFormulario.php");
}
?>