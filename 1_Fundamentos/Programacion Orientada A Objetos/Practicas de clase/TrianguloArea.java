import java.io.*;
public class TrianguloArea
{
	static double Hipotenusa (double cat1, double cat2)
	{
		double auxiliar;
		auxiliar= (cat1*cat1)+(cat2*cat2);
		return Math.sqrt(auxiliar);
	}
	public static void main (String []args) throws IOException
	{
		float cat1, cat2,hipotenusa=0;	
		BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
		System.out.println("DEME CATETO 1");
		cat1=Float.parseFloat(br.readLine());
		System.out.println("DEME CATETO 2");
		cat1=Float.parseFloat(br.readLine());
	
	
		System.out.println(auxiliar);
	}
}	
		
		
		
		
		