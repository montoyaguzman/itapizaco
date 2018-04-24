public class Main {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
int tabla[][] = new int [5][5]; //se crea la matriz
// letra numero (+) (*) fin de cadena
tabla [0][0] = 1; tabla [0][1] = 1; tabla [0][2] = 4; tabla [0][3] = 4; tabla [0][4] = 4;
tabla [1][0] = 4; tabla [1][1] = 4; tabla [1][2] = 2; tabla [1][3] = 2; tabla [1][4] = 1;
tabla [2][0] = 3; tabla [2][1] = 3; tabla [2][2] = 4; tabla [2][3] = 4; tabla [2][4] = 4;
tabla [3][0] = 4; tabla [3][1] = 4; tabla [3][2] = 2; tabla [3][3] = 2; tabla [3][4] = 3;
tabla [4][0] = 4; tabla [4][1] = 4; tabla [4][2] = 4; tabla [4][3] = 4; tabla [4][4] = 4;

String cadena = "a+p+7"; // se escribe la cadena para analizarla
int estado = 0, i; // declaracion de variables

for ( i = 0; cadena.length()>i; i++ ) // bucle para analizar la cadena
{
if( cadena.charAt(i) >='a' && cadena.charAt(i) <='z' ) // es el rango para el caracter (letra), en la posicion i
{
estado = tabla[estado][0]; // posicion en la tabla que pertenece a las letras
}
else if(cadena.charAt(i) >='0' && cadena.charAt(i) <='9' ) // es el rango para el caracter (digito), en la posicion i
{
estado = tabla[estado][1]; // posicion en la tabla que pertenece a las letras
}

else if( cadena.charAt(i) =='+' ) // tambien si la posicion i es un operador (+)
{
estado = tabla[estado][2]; // posicion en la tabla que pertenece al operador (+)
}
else if(cadena.charAt(i) =='*' ) // tambien si la posicion i es un operador (*)
{
estado = tabla[estado][3]; // posicion en la tabla que pertenece al operador (*)
}
else {
estado = 4; // posicion de error
break;
}
System.out.println("i: "+i+" estado: "+estado); // imprime la iteracion y el estado que se produce, donde cada iteracion es caracter analizado
}

if( estado !=1 && estado != 3 ) // si no es un estado final 1 o 3 no es aceptada la cadena
System.out.println("palabra no aceptada");
else
System.out.println("palabra aceptada");
}

}