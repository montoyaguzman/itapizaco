import java.io;    //*___*

public class JuegoNombres{
public static void main (String args[]){

String Primernombre="";
String Apellido="";
String Segapellido="";
String nombrecompleto="";

String iniciales,rfc;

int numletras;

BufferedReader lectura;}

lectura= new BufferedReader (new  InputStreamReader(System.in));
//

try{
System.out.println("¿Cuál es tu nombre?");
Primernombre=lectura.readLine();
System.out.println("OK, ¿Cuál es tu apellido?");
Apellido=lectura.readLine();
System.out.println("¿Cuál es tu segundo Apellido?");
Segapellido=lectura.readLine();System.out.println();

System.out.println(\nEn matuscula +Primernombre.yoUppenCase()+"es un nombre bonito!");

nombrecompleto=primernombre;
nombrecompleto=nombrecompleto.concat("").concat(Apellido)+""concat(Segapellido);
System.out.println("\nTu nombre completo es"+nombrecompleto+".");
System.out.println("\n alguna se escribe Asá-:"+Apellido+".");

Segapellido+""+primernombre+"");

iniciales=primernombre.chartA(1)