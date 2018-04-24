<?php
session_start();
$email = $_SESSION['email'];
?>

<html>
	<head>
		<meta charset="utf-8" />
		<title>Personalizar</title>
		<script src="../../js/jquery-2.2.1.min.js"></script>
		<script src="../../css/materialize/js/materialize.min.js"></script>
		<link rel="stylesheet" href="../../css/materialize/css/materialize.css" media="screen, projection">

    <!-- JAVASCRIPT -->
  <script type="text/javascript">
    $(document).ready(function() {
      $('select').material_select();
      })
  </script>
  <!-- JAVASCRIPT -->

    <!-- JQUERY -->
      <script>  
        window.mostrarVistaPrevia = function mostrarVistaPrevia(){

            var Archivos, Lector;
            //Para navegadores antiguos
            if (typeof FileReader !== "function"){
                jQuery('#infoNombre').text('[Vista previa no disponible]');
                jQuery('#infoTamaño').text('(su navegador no soporta vista previa!)');
                return;
            }

            Archivos = jQuery('#imagen')[0].files;
            if (Archivos.length > 0){

                Lector = new FileReader();
                Lector.onloadend = function(e){
                    var origen, tipo;

                    //Envia la imagen a la pantalla
                    origen = e.target; //objeto FileReader
                    //Prepara la información sobre la imagen
                    tipo = window.obtenerTipoMIME(origen.result.substring(0, 30));

                    jQuery('#infoNombre').text(Archivos[0].name + ' (Tipo: ' + tipo + ')');
                    jQuery('#infoTamaño').text('Tamaño: ' + e.total + ' bytes');
                    //Si el tipo de archivo es válido lo muestra, 
                    //sino muestra un mensaje 
                    if (tipo !== 'image/jpeg' && tipo !== 'image/png' && tipo !== 'image/gif') {
                        jQuery('#vistaPrevia').attr('src', window.imagenVacia);
                        alert('El formato de imagen no es válido: debe seleccionar una imagen JPG, PNG o GIF.');
                    } else {
                        jQuery('#vistaPrevia').attr('src', origen.result);
                        window.obtenerMedidas();
                    }

                };
                Lector.onerror = function(e) {
                    console.log(e)
                }
                Lector.readAsDataURL(Archivos[0]);

            } else {
                var objeto = jQuery('#imagen');
                objeto.replaceWith(objeto.val('').clone());
                jQuery('#vistaPrevia').attr('src', window.imagenVacia);
                jQuery('#infoNombre').text('[Seleccione una imagen]');
                jQuery('#infoTamaño').text('');
            };
        };

        //Lee el tipo MIME de la cabecera de la imagen
        window.obtenerTipoMIME = function obtenerTipoMIME(cabecera) {
            return cabecera.replace(/data:([^;]+).*/, '\$1');
        }

        //Obtiene las medidas de la imagen y las agrega a la 
        //etiqueta infoTamaño
        window.obtenerMedidas = function obtenerMedidas() {
            jQuery('<img/>').bind('load', function(e) {

                var tamaño = jQuery('#infoTamaño').text() + '; Medidas: ' + this.width + 'x' + this.height;

                jQuery('#infoTamaño').text(tamaño);

            }).attr('src', jQuery('#vistaPrevia').attr('src'));
        }

        jQuery(document).ready(function() {

            //Cargamos la imagen "vacía" que actuará como Placeholder
            jQuery('#vistaPrevia').attr('src', "../../media/imagenes/blanco.jpg");

            //El input del archivo lo vigilamos con un "delegado"
            jQuery('#botonera').on('change', '#imagen', function(e) {
                window.mostrarVistaPrevia();
            });

            //El botón Cancelar lo vigilamos normalmente
            jQuery('#cancelar').on('click', function(e) {
                var objeto = jQuery('#imagen');
                objeto.replaceWith(objeto.val('').clone());

                jQuery('#vistaPrevia').attr('src', window.imagenVacia);
                jQuery('#infoNombre').text('[Seleccione una imagen]');
                jQuery('#infoTamaño').text('');
            });

        }); 
      </script>
<!-- JQUERY -->
</head>	

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

<!-- INICIO DEL BODY -->
	<body>

		<div class="row">
        <div class="col s12">
          <div class="card-panel blue accent-3">
          	<span class="white-text"><h4><strong>Editar Perfil</strong></h4>
          	</span>
          </div>
        </div>
    </div>

<!-- INICIO DEL FORMULARIO -->
	    
      <div class="row">
    		<form class="col s10 offset-s1" method="post" action="5_perfilAction.php" enctype="multipart/form-data">
        		
            <div class="row">
              <div class="input-field col s6 m5">
          	     <input id="nombreUsuario" name="nombreUsuario" type="text" class="validate">
          			 <label for="nombreUsuario" class="activate">Nombre de usuario</label>
           		</div>
      			</div>

      			<br>
      			<div class="row">
              <div class="col s12 m2">
                <div class="card-panel teal">
                  <img class = "responsive-img" id="vistaPrevia" src=""/>
                </div>
              </div>
            </div>

            <div id="botonera">
              <div class="row">
                <div class="file-field input-field">
                  <div class="btn blue accent-3">
                    <span>Cargar imagen</span>
                    <input id="imagen" name="imagen" type="file" accept="image/*">
                  </div>
                  <div class="file-path-wrapper">
                    <input class="file-path validate" type="text" id="direccion">
                  </div>
                </div>
              </div>
            </div>

	        <div>
            <button class="waves-effect waves-light btn blue accent-3">Guardar</button>
	        </div>


			</form>
		</div>	
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