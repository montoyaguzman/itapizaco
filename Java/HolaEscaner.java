import java.util.Scanner;

public class HolaEscaner {
    public static void main(String[] ar) {
    	
      Scanner teclado = new Scanner(System.in);
    	
      String nom="";
    	System.out.print("Ingrese su nombre:");
    	nom = teclado.next();
    	System.out.print("hola "+nom);
    }
}