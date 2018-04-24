import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ParImparBuf{

public static void main (String[]args){

	InputStreamReader isr = new InputStreamReader(System.in); 
		BufferedReader br = new BufferedReader(isr);

int numero  = 1;
int limite;
int apares = 0;
int aimpares = 0;
        
System.out.println("Introduce el limite");

limite = dataIn.readLine();
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