import java.util.Scanner;

public class Sumaparimpar {

public static void main(String[] args) {

Scanner teclado = new Scanner(System.in);
int numero  = 1;
int limite;
int apares = 0;
int aimpares = 0;
        
        
System.out.println("Introduce el limite");
limite = teclado.nextInt();
while (numero <= limite) {
if (numero % 2 == 0) {
System.out.println("NUMERO PAR: "+ numero);
                
apares = apares + numero;
} else {
aimpares = aimpares + numero;
System.out.println("NUMERO IMPAR: "+numero);
}            
numero++;}
        
System.out.println("La suma de los pares es: " + apares);
System.out.println("La suma de los impares es: " + aimpares);
}
}