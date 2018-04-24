import java.io.*;

public class Funcion2{
public static void main(String args[])throws IOException{
BufferedReader x=new BufferedReader(new InputStreamReader (System.in));
String valor;
int a,b,c,d;
double e,rp,rn,sp,sn,md;
System.out.println("Ingrese el Nro A:");
valor = x.readLine(); //leer el objeto x
a=Integer.parseInt(valor); //este es el procedimiento para el primer valor a
System.out.println("Ingrese el Nro B");
valor=x.readLine();
b=Integer.parseInt(valor);
System.out.println("Ingrese el Nro C");
valor=x.readLine();
c=Integer.parseInt(valor);
d= b*b-4*a*c; //Descriminante B2-4AC
if (d > 0)
System.out.println("El Descriminante es: "+d);
else System.out.println("El Descriminante debe de ser mayor a 0 " +d);

e=Math.sqrt(d);//raiz del descrimante
System.out.println("Raiz del Descrimannte : "+e);
md=(2*a);
sp=-b+e;
rp=-sp/(md);
System.out.println("La Raiz Positiva es: "+rp); 
sn=-b-e;
rn=-sn/(md);
System.out.println("La Raiz Negativa es: "+rn); 

}
}