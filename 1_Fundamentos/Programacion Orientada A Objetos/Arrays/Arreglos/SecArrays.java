import java.io.*;
public class SecArrays
{
	public static void main (String args[]) throws IOException
	{
		BufferedReader br= new BufferedReader (new InputStreamReader(System.in));
		
		int []b = new int[10];		
		for(int i=0;i<10;i++)
		{
			//System.out.println("Agregue el elemento "+(i+1)+" de la lista");
			b[i]=i*2;//Integer.parseInt(br.readLine());
		}
			
		for(int i=0;i<10;i++)
		{
			b[i]=(i*2);
			System.out.println("b["+i+"]= "+b[i]);
		}
	}
}