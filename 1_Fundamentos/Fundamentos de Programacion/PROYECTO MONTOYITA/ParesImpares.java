public class ParesImpares {
public static void main(String[] args) {
int x,y,suma1,suma2;
x=1;
y=2;
suma1=(100/2)*(2*100+2);
suma2(100/2)*(2*100);
		
System.out.print(" LOS PRIMEROS 100 NUMEROS IMPARES SON: \n ");

while (x<=200){

System.out.print(x);		  
System.out.print(" \t ");

x=x+2;	
}
	
System.out.print(" \n ");
System.out.print("LOS PRIMEROS 100 NUMEROS PARES SON: \n");

while (y<=200){

System.out.print(y);		  
System.out.print(" \t ");

y=y+2;	
}			 

System.out.print(" \n ");
System.out.print("LA SUMA DE LOS IMPARES ES: "+suma1);

System.out.print(" \n ");
System.out.print("LA SUMA DE LOS PARES ES: "+suma2);

}
}


