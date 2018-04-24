import javax.swing.*;

public class cubo{
public static void main (String args[]){

String Respuesta=JOptionPane.showInputDialog("Dame un numero");
int num = Integer.parseInt(Respuesta);

for ( int i=0; i<=num;i++){
System.out.println ("El cubo de "  +i+ " es: "+cubo(i)); //llamada
}
}

public static int cubo (int resul){ //declaracion
{

resul=resul*resul*resul;
}
return resul;
}
}