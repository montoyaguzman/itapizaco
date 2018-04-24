import java.io.*;

public class LeerTresNumerosBR{

public LeerTresNumerosBR()throws IOException{

BufferedReader leer = new BufferedReader
(new InputStreamReader(System.in));

double num1;
double num2;
double num3;

System.out.println("Teclee El Primer Numero: ");
num1= Double.parseDouble(leer.readLine());

System.out.println("Teclee El Segundo Numero: ");
num2= Double.parseDouble(leer.readLine());

System.out.println("Teclee El Tercer Numero: ");
num3= Double.parseDouble(leer.readLine());

while (num1>num2&&num1>num3){
System.out.println("El Mayor Es: " +num1);
break;
}
while (num1<num2&&num1<num3){
System.out.println("El Menor Es: " +num1);
break;
}

while ((num2>num1)&&(num2>num3)){
System.out.println("El Mayor Es: " +num2);
break;
}
while ((num2<num1)&&(num2<num3)){
System.out.println("El Menor Es: " +num2);
break;
}

while ((num3>num1)&&(num3>num2)){ 
System.out.println("El Mayor Es: " +num3);
break;
}
while ((num3<num2)&&(num3<num1)){
System.out.println("El Menor Es: " +num3);
break;
}
while (num1==num2&&num2==num3&&num1==num3){
System.out.println("Numeros Iguales Error");
break;
}
}
public static void main(String args[])throws IOException{
new LeerTresNumerosBR();
}
}