import java.util. Scanner;

class factorialS{ 
public static void main(String args[]){ 

int num,factorial=1; 

Scanner leer=new Scanner(System.in); 
System.out.print("Ingrese numero:"); 

num=leer.nextInt(); 


for(int i=1;i<=num;i++){ 
factorial=factorial*i; 
} 
System.out.print("Factorial de " +num+ "  es " +factorial); 
} 
}