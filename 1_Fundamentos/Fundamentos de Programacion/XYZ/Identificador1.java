import java.util.Scanner;
 
// Declaraci�n de la clase
public class Identificador1
{
// El m�todo 'main' inicia la ejecuaci�n de la aplicaci�n en Java
public static void main( String[] args )
{
  // Variables
  int numero1; // Primer n�mero entero
  int numero2; // Segundo n�mero entero
 
  // Instanciaci�n de un objeto de tipo 'Scanner'
  Scanner entrada;
  entrada = new Scanner( System.in );
 
  // Petici�n de los datos al usuario
  System.out.print( "Digite el pimer n�mero entero: " );
  numero1 = entrada.nextInt();
 
  System.out.print( "Digite el segundo n�mero entero: " );
  numero2 = entrada.nextInt();
 
  if( numero1 > numero2)
  {
     System.out.printf( "%d es m�s grande.\n", numero1 );
  }
 
  if( numero2 > numero1)
  {
     System.out.printf( "%d es mas grande.\n", numero2 );
  }
 
  if( numero1 == numero2 )
  {
     System.out.printf( "Estos n�meros son iguales.\n");
  }
 
  System.exit(0); // Salida
 
} // Fin del m�todo 'main'
 
} // Fin de la declaraci�n del cuerpo de la clase