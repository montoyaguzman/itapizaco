  <html>
	<head>
		<meta charset="utf-8" />
		<script src="../../js/jquery-2.2.1.min.js"></script>
		<script src="css/materialize/js/materialize.min.js"></script>
		<link rel="stylesheet" href="css/materialize/css/materialize.css" media="screen, projection">
		<link rel="stylesheet" href="../../css/font-awesome-4.7.0/css/font-awesome.min.css">
		
		<script type="text/javascript">
			$(document).ready(function(){
			
			$('.button-collapse').sideNav({'edge':'left'})
			});

			$(".dropdown-button").dropdown({});
		</script>

	</head>  

  	<!-- INICIO DEL BODY -->
	<body>

		<!-- ICONOS -->
	    <div class="row">
		    <div class="col l5 offset-l1 s7">
		    	<span class="blue-text text-darken-4 hide-on-large-only"><h5><strong>¡Bienvenido!</strong></h5></span>
		    </div>
	    </div>

	    <div class="row hide-on-large-only">	
	    </div>

 		<!-- MENU -->
		<div class="row">
		 	<div class="col l8 offset-l1 s10 offset-s1">			
			<!-- OPCIONES DROPDOWN -->
				<ul id="recetario" class="dropdown-content">
				  <li><a href="#" style="color:#0d47a1">Opcion 1.1</a></li>
				  <li><a href="#" style="color:#0d47a1">Opcion 1.2</a></li>
				</ul>
				<ul id="clasificador" class="dropdown-content">
				  <li><a href="#" style="color:#0d47a1">Opcion 3.1</a></li>
				  <li><a href="#" style="color:#0d47a1">Opcion 3.2</a></li>
				  <li><a href="#" style="color:#0d47a1">Opcion 3.3</a></li>
			 	  <li><a href="#" style="color:#0d47a1">Opcion 3.4</a></li>
				  <li><a href="1#" style="color:#0d47a1">Opcion 3.5</a></li>
				</ul>
			<!-- -->
				<nav>
					<div class="nav-wrapper blue accent-3">
						<a href="#" class="brand-logo">&nbsp;<span class="hide-on-large-only">Cookie Chef</span></a>
						<a href="#"class="button-collapse" data-activates="menu">
						<i class="mdi-navigation-menu"></i>
						</a>
						<ul class="hide-on-med-and-down right">
							<li><a href="#">Inicio</a></li>
							<li><a class="dropdown-button" href="#!" data-activates="recetario">Opcion 1<i class="material-icons right">arrow_drop_down</i></a></li>
							<li><a href="#">Opcion 2</a></li>
							<li><a class="dropdown-button" href="#!" data-activates="clasificador">Opcion 3<i class="material-icons right">arrow_drop_down</i></a></li>
							<li><a href="#">Opcion 4</a></li>
						</ul>
						
						<!-- SIDE MENU -->	
						<ul class="side-nav blue darken-3 white-text" id="menu">
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-home fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Inicio
									</strong>
								</a>
							</li>
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-cutlery fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 1
									</strong>
								</a>
							</li>
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-play-circle-o fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 2
									</strong>
								</a>
							</li>
							<li>
								<a href="#>
								<i id="iconoLateral" class="fa fa-calendar fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 3
									</strong>
								</a>
							</li>
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-heart fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 4
									</strong>
								</a>
							</li>
							<li>
								<a href="#>
								<i id="iconoLateral" class="fa fa-cutlery fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 5
									</strong>
								</a>
							</li>
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-medkit fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 6
									</strong>
								</a>
							</li>
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-check fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 7
									</strong>
								</a>
							</li>

							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-star fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 8
									</strong>
								</a>
							</li>
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-phone fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 9
									</strong>
								</a>
							</li>
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-certificate fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 10
									</strong>
								</a>
							</li>
							<li>
								<a href="#">
								<i id="iconoLateral" class="fa fa-share-alt fa-2x"></i>
									<strong style="color:#ffffff">
										&nbsp;Opcion 11
									</strong>
								</a>	
							</li>
						</ul>
					</div>
				</nav>
			</div>

			
		</div>
	</body>
</html>	
     
	