<?php
session_start();
$email = $_SESSION['email'];
?>

<html>
	<head>
		<meta charset="utf-8" />
		<title>Sistema de seguridad</title>


	</head>  

	<body>

		<style type="text/css">   
			a:link   
			{   
			 text-decoration:none;   
			}

			a {color:#ffffff;} 
		</style>


	<?php
	if ($email)
	{
		include("../modelo/conexion.php");

		$sql = "SELECT * FROM usuarios where correo='$email';";
		$consulta= mysqli_query($conexion,$sql);
		
		if($datosUsuario = mysqli_fetch_array($consulta))
		{
		?>
			<div class="row">
				<div class="card-panel blue-grey">
					<img class="responsive-img circle" src="<?php echo "../../media/imagenes/perfil/".$datosUsuario['imagen']; ?>"" width="40" height="80">
					<span class="white-text"> <?php echo "Bienvenido ".$email ?> </span>
					<br>
					<a href="5_perfilFormulario.php">EDITAR PERFIL</a>
					<br>
					<span class="white-text"> <a href="1_cerrarSesion.php">CERRAR SESION</a> </span>
				</div>
			</div>

			<?php
			include ("panel.php");
			include ("menu.php");
			?>
			</body>
		</html>	


<?php
		}
	}else{	
	?>
		<div class="row">
			<div class="card-panel black">
				<span class="white-text"><h5><strong>No has iniciado sesion</strong></h5></span>
			</div>
		</div>
	<?php
		header("Refresh: 3; url = 1_iniciarSesionFormulario.php");
	}
	?>