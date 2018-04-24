</!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">

   <title>mundo</title>
<body background="mundo7.jpg" style="background-attachment:fixed">

</head>

<?php
    include("conexion.php");

    if(isset($_POST['registrarse']))
    {
        $correUsuario = $_POST['usermail'];
        $nombreUsuario = $_POST['nickname'];
        $contraUsuario = $_POST['userpass'];
        
        if($correUsuario != "" && $nombreUsuario != "" && $contraUsuario != "")
        {
            $sql = "SELECT CORREO_USUARIO FROM general WHERE CORREO_USUARIO = '$correUsuario';";
            $resultado = mysqli_query($con,$sql);
            $repetidos = mysqli_num_rows($resultado);

            if ($repetidos == 0)
            {
                $alta = "INSERT INTO general(CORREO_USUARIO, NOMBRE_USUARIO, CONTRA_USUARIO) VALUES ('$correUsuario','$nombreUsuario','$contraUsuario')";
                $alta1 = mysqli_query($con,$alta);

                if($alta1)
                {
                    echo "<br>Registro exitoso";
                }
                else
                {
                    echo "<br>Registro fallido".mysql_error();
                }
            }
            else
            {
                echo "<br>Ese correo ya fue registrado";
            }
        }
        else
        {
    	   echo "<br>Por favor llena todos los espacios";
        }
    }

    if(isset($_POST['ingresar']))
    {
        $usermail = $_REQUEST['usermail'];
        $userpass = $_REQUEST['userpass'];

        if($usermail != "" && $userpass != "")
        {
            $sql = "SELECT * FROM general WHERE CORREO_USUARIO = '$usermail'";
            $consulta = mysqli_query ($con,$sql);
            $datosUsuario = mysqli_fetch_array($consulta);

            if ($userpass == $datosUsuario['CONTRA_USUARIO'])
            {
                echo "<br>Sesion exitosa";
                session_start();
                $_SESSION ['NOMBRE_USUARIO'] = $datosUsuario['NOMBRE_USUARIO'];
                header("Refresh: 3; url = principal.php");
            }
            else
            {
                echo "<br>Usuario o contraseña incorrecta";
                header("Refresh: 3; url = index.php");
            }
        }
        else
        {
            echo "<br>Por favor llena todos los espacios";
            header("Refresh: 3; url = index.php");
        }    
    }

?>
</body>
</html>