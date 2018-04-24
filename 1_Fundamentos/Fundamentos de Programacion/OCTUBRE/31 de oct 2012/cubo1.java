import javax.swing.*;

public class cubo1{
public static void main (String args[]){

String Respuesta=JOptionPane.showInputDialog("Dame un numero");
double num = Double.parseDouble(Respuesta);


for ( double i=0; i<=num;i++){


JOptionPane.showMessageDialog(null, "El cubo de "  +i+ " es: "+cubo(i)); //llamada

}
}

public static double cubo (double resul){ //declaracion
{

resul=resul*resul*resul;
}
return resul;
}
}