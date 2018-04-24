import java.io.*;

public class ARCA1  {
public static void main (String []args) throws IOException{
String cadena="";
InputStreamReader entra= new InputStreamReader (System.in);
BufferedReader lectura= new BufferedReader(entra);
int cal=0;
System.out.println("¿Cual es tu calificacion?");
cadena= lectura.readLine();
cal= Integer.parseInt (cadena);

if (cal>=90&&cal<=100){
System.out.println("Excelent! " +cal);
}

else if(cal>=80&&cal<=89){
System.out.println("Good Job! " +cal);
}

else if (cal>=70&&cal<=79){
System.out.println("Study Harder " +cal);
}

if (cal<70&&cal>=0){
System.out.println("Your failed " +cal);
}
}
}
 