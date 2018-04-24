import java.io.*;

public class JuegoNombres1{
public static void main (String [] args) {

String primernombre="";

String apellido="";

String segundoapellido="";

String nombrecompleto="";

String iniciales,rfc;
                                                                                                                                                    
int numletras;

BufferedReader lectura;

lectura=new BufferedReader (new InputStreamReader(System.in));

try {

System.out.println(" cual es tu nombre?");

primernombre=lectura.readLine();

System.out.println(" cual es tu apellido?");
 
apellido=lectura.readLine();

System.out.println(" ¿Cuál es tu segundo apellido?");
 
segundoapellido=lectura.readLine(); System.out.println();

System.out.println("\n en mayuscula"+ primernombre.toUpperCase()+"!");

System.out.println("\n \t"+ primernombre.toUpperCase()+"es un nombre bonito");

nombrecompleto=primernombre;

nombrecompleto=nombrecompleto.concat(" ").concat(apellido)+" ".concat (segundoapellido);

System.out.println("\n tu nombre completo es "+ nombrecompleto +".");

System.out.println("\n \t algunas veces se escribe asi"+ apellido+segundoapellido+" "+primernombre+" ");


rfc=apellido.charAt(0)+""+apellido.charAt(1)+""+segundoapellido.charAt(0)+apellido.charAt(0);

System.out.println("\n \t tus iniciales son "+ iniciales +".");

System.out.println("\n t tu RFC es"+ rfc.toUpperCase());

numletras=primernombre.length()+apellido.length()+segundoapellido.length();

System.out.println("\n \t tienes" +numletras+" letras en tu nombre y apellidos");

System.out.println("\n adios!!");
lectura.close();
}

catch (IOException ioe){

System.out.println("error"); }

}
}


