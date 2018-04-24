import java.io.*;

public class TablaWhile
{
	public static void main(String []args) throws IOException
	{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		int a,b=1,c=0;
	
		System.out.println("¿Que tabla de multiplicar desea?");
		a=Integer.parseInt(br.readLine());
		
		while (b<=10)
		{
			
			
			c=a*b;
			System.out.println(a+"x"+b+"="+c);
			b++;
		}			
			System.out.println("La tabla del "+a+" es:");
	}
}