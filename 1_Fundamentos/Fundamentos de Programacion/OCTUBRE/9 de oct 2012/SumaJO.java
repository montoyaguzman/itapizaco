import javax.swing.JOptionPane; 

public class SumaJO { 

public static void main( String args[] ) 
{ 
String Numero1; 
String Numero2; 
int intNumero1; 
int intNumero2; 
int suma; 

Numero1 = JOptionPane.showInputDialog( "Ingrese el entero 1" ); 
Numero2 = JOptionPane.showInputDialog( "Ingrese el entero 2" ); 
intNumero1 = Integer.parseInt( Numero1 ); 
intNumero2 = Integer.parseInt( Numero2 ); 

suma = intNumero1 + intNumero2; 

JOptionPane.showMessageDialog( 
null, "La suma es " + suma, "Resultado,", 
JOptionPane.PLAIN_MESSAGE ); 
System.exit( 0 ); 
} 
}