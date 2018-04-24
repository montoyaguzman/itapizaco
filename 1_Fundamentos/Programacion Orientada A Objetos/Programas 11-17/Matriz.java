import java.io.*;

public class Matriz
{
	public static void main (String args[])
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		
		int i,j,a,l;

		System.out.println("Inserta numero de filas");
		a=Integer.parseInt(br.readLine());
		System.out.println("Inserta numero de columnas");
		l=Integer.parseInt(br.readLine());

		int matriz1[][]=new int[a][l];
		int matriz2[][]=new int[a][l]; //Declaracion de matrices
		int matriz3[][]=new int[a][l];

		System.out.println("Introduce los datos de la matriz 1");

		for ( i = 0; i < matriz1.length; i++)
		{
		for ( j = 0; j < matriz1[i].length; j++)
		{
		matriz1[i][j] = r1.nextInt();//lectura de scanner
		}
		}

		System.out.println("Introduce los datos de la matriz 2");
		for ( i = 0; i < matriz2.length; i++) {
		for ( j = 0; j < matriz2[i].length; j++) {
		matriz2[i][j] = r1.nextInt();//lectura de scanner
		}
		}

		System.out.println("Introduce los datos de la matriz 3");
		for ( i = 0; i < matriz3.length; i++) {
		for ( j = 0; j < matriz3[i].length; j++) {
		matriz3[i][j] = r1.nextInt();//introducir datos por medio de scanner
		}
		}


String cad1 = "";  //ingreso de componentes

for(i = 0; i<matriz1.length; i++){
for(j = 0; j<matriz1[i].length; j++)
cad1+=" "+matriz1[i][j];
cad1+="\n";
}

System.out.println("La matriz 1 es \n"+cad1); //imprime matriz 1


String cad2 = "";  //ingresos de componente

for(i = 0; i< matriz2.length; i++){
for(j = 0; j< matriz2[i].length; j++)
cad2+=" "+matriz2[i][j];
cad2+="\n";
}

System.out.println("La matriz 2 es \n"+cad2);  //imprime matriz 2

String cad3 = "";

for(i = 0; i< matriz3.length; i++){
for(j = 0; j< matriz3[i].length; j++)
cad3+=" "+matriz3[i][j];
cad3+="\n";
}

System.out.println("La matriz 3 es \n"+cad3);  //imprime matriz 3
}
}