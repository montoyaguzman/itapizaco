import java.util.Arrays;
public class MainArreglos
{
	public static void main (String args[])
	{
		ArreglosOp oarreglo = new ArreglosOp();

		int x1[]={1,2,3,4,5};
		//int xR[];

		oarreglo.leeArreglo1(x1);
 
			for (int i=0; i<x1.length; i++)
			{
				//System.out.print(Arrays.toString(x1));
				System.out.println(x1[i]);
			}
	}
}