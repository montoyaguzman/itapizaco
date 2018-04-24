  <html>
	<head>
		<meta charset="utf-8" />
		<title>Registro de usuario</title>
		<script src="../../js/jquery-2.2.1.min.js"></script>
		<script src="css/materialize/js/materialize.min.js"></script>
		<link rel="stylesheet" href="css/materialize/css/materialize.css" media="screen, projection">
		<link rel="stylesheet" href="../../css/font-awesome-4.7.0/css/font-awesome.min.css">

		<!-- COLOR DE ICONOS -->
		<style type="text/css">
			i{
				color:#2196f3;
			}
		</style>

	</head>  

  	<!-- INICIO DEL BODY -->
	<body>
	
	<main>
		<!-- PANEL -->
		<?php include("panel.php"); ?>

		<div class="row">
	    	<div class="col l10 offset-l1 m10 offset-m1 s10 offset-s1">
	    		<div class="z-depth-3 col l12 m12 s12">
					<div class="row">
			    		<form class="col l12 m12 s12" method="post" enctype="multipart/form-data" id="formulario" name="formulario" action="4_registroAction">
			    			<div class="card-panel teal">
		       					<span class="white-text center-align"><h5><strong>Registro de usuario</strong></h5></span>
							</div>
							<br>
				            <div class="row">
				            	<div class="input-field col l6 offset-l3 m8 offset-m2 s12">
				            		<i class="fa fa-id-card material-icons prefix" aria-hidden="true"></i>
						        	<input id="rfc" name = "rfc" type="text" class="validate">
						        	<label for="rfc">RFC</label>
							   
				           		</div>
				            	<div class="input-field col l6 offset-l3 m8 offset-m2 s12">
				            		<i class="fa fa-envelope material-icons prefix" aria-hidden="true"></i>
						        	<input id="email" name = "email" type="email" class="validate">
						        	<label for="email" data-error="dirección inválida" data-success="dirección válida">Correo</label>
							   
				           		</div>
				           		<div class="input-field col l6 offset-l3 m8 offset-m2 s12">
				           			<i class="fa fa-user-secret prefix" aria-hidden="true"></i>
						        	<input id="numEmpleado" name="numEmpleado" type="text" class="validate">
						        	<label for="numEmpleado">Numero de empleado</label>
				           		</div>
				           		<div class="input-field col l6 offset-l3 m8 offset-m2 s12">
				            		<i class="fa fa-user material-icons prefix" aria-hidden="true"></i>
						        	<input id="nombreUsuario" name="nombreUsuario" type="text" class="validate">
						        	<label for="nombreUsuario">Nombre de usuario</label>
				           		</div>
				           		<div class="row"></div>
				           		<div class="input-field col l6 offset-l3 m8 offset-m2 s12">
				           			<i class="fa fa-key material-icons prefix" aria-hidden="true"></i>
				          	    	<input id="contrasena1" name="contrasena1" type="password" class="validate">
				          			<label for="contrasena1">Elige una contraseña</label>
				           		</div>
				           		<div class="row"></div>
				           		<div class="input-field col l6 offset-l3 m8 offset-m2 s12">
				           			<i class="fa fa-key material-icons prefix" aria-hidden="true"></i>
				          	    	<input id="contrasena2" name="contrasena2" type="password" class="validate">
				          			<label for="contrasena2">Repetir contraseña</label>
				           		</div>
				           		<div class="row"></div>
				           		<div class="row">
				           			<div class="col l6 offset-l3">
				           				
				           				
				           				<button class="waves-effect waves-light btn blue accent-3" id="registrar" name="registrar">Registrar</button> 
				           								           				<!--
				           				<a class="btn" id="registrar" name="registrar">
				           				Registar
				           				</a>
										-->

				           			</div>	
				           		</div>   	
				      		</div>
			      		</form>
			      	</div>
			    </div>  	
      		</div>
      	</div>


    </main>

	</body>
		
</html>	

        
	