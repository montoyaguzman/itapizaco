import java.io.*;
public class Torneo
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		System.out.println("¿CUANTOS PARTICIPANTES TENEMOS?");
		int participantes = Integer.parseInt(br.readLine());
		
		String [][]b = new String [participantes][];
		
		for(int i=0; i<participantes; i++)
		{
			System.out.println("Agregue el participante "+(i+1));
			b[i][]=br.readLine();
		}

			System.out.println("Los duelistas de hoy son:");
			
		for(int j=0; j<participantes; j++)
		{
			System.out.println("El duelista "+(j+1)+" es "+b[j]);
		}
		
	}
}
		