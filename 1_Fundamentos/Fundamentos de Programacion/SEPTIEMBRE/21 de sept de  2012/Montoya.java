import java.io.*;

public class Montoya{
public static void main (String[]args){

BufferedReader dataIn = new BufferedReader(new
InputStreamReader(System.in));
String name=" ";

System.out.print("teclea tu nombre:");
try{
name=dataIn.readLine();
} 
catch(IOException e){
System.out.println("error!");
}
System.out.println("Hello " + name + " !");
}
}