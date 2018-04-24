import java.util.Scanner;
 
// Declaración de la clase
public class Identificador1
{
// El método 'main' inicia la ejecuación de la aplicación en Java
public static void main( String[] args )
{
  // Variables
  int numero1; // Primer número entero
  int numero2; // Segundo número entero
 
  // Instanciación de un objeto de tipo 'Scanner'
  Scanner entrada;
  entrada = new Scanner( System.in );
 
  // Petición de los datos al usuario
  System.out.print( "Digite el pimer número entero: " );
  numero1 = entrada.nextInt();
 
  System.out.print( "Digite el segundo número entero: " );
  numero2 = entrada.nextInt();
 
  if( numero1 > numero2)
  {
     System.out.printf( "%d es más grande.\n", numero1 );
  }
 
  if( numero2 > numero1)
  {
     System.out.printf( "%d es mas grande.\n", numero2 );
  }
 
  if( numero1 == numero2 )
  {
     System.out.printf( "Estos números son iguales.\n");
  }
 
  System.exit(0); // Salida
 
} // Fin del método 'main'
 
} // Fin de la declaración del cuerpo de la clase