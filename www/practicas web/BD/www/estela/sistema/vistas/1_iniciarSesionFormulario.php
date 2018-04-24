<!DOCTYPE HTML>
  <html>
	<head>
		<meta charset="utf-8" />
		<title>Iniciar sesión</title>
		<script src="../../js/jquery-2.2.1.min.js"></script>
		<script src="../../css/materialize/js/materialize.min.js"></script>
		<link rel="stylesheet" href="../../css/materialize/css/materialize.css" media="screen, projection">
		
		<style type="text/css">
			.caja { float:left;margin-left:5px; }
		</style>

	</head>  

  	
	<body>
	
	<main>
		<!-- PANEL -->
		<?php 
			include("panel.php"); 
		?>

	    <!-- PRIMER CONTENEDOR -->
	    <div class="row">
		    <!-- ROW PRINCIPAL-->
		    <div class="card-panel z-depth-4 col s10 offset-s1 m10 offset-m1 l10 offset-l1">
				<!-- ROW 1-->
				<div class="col l4">
					<div class="input-field">
						<h5><span class="blue-text text-darken-3"><strong>Bienvenido - Iniciar sesión</strong></span></h5>
			    	</div>
			    	<!-- FORMULARIO -->
			    	<div class="row">
				    	<form method="post" action="1_iniciarSesionAction.php">
					    	<br>
					    	<div class="row">
						    	<div class="input-field">
							        <input id="email" name="email" type="text" class="validate">
							        <label for="email" class="activate">Correo</label>
							    </div>
							</div>
							<div class="row">    
							    <div class="input-field">
							        <input id="contrasena" name="contrasena" type="password" class="validate">
							       	<label for="contrasena" class="activate">Contraseña</label>
							    </div>
							</div>    
						    <div class="row"></div>
		            			<button class="waves-effect waves-light btn blue accent-3" id="ingresar" name="ingresar">Ingresar</button>
				        </form>
				    </div>
				    <div class="row">
				    	<a href="4_registroFormulario.php"><h6><span><strong>Registrarse</strong></span></h6></a>
				    	<a href="2_comoRecuperarContrasenaFormulario.php"><h6><span><strong>¿Olvidaste tu contraseña?</strong></span></h6></a>
				    </div>
					<br>
			</div>
	</div>
	<!-- FIN ROW PRINCIPAL-->
    </main>

    <!--#include file='piePagina.shtml' -->

	</body>
</html>	

        