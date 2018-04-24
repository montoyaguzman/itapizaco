
public class ArraySimpleCopy
{
	public static void main (String args[])
	{
		//int i=0;
		int a[] = {1,2,3,4,5};
		int b[] = new int [5];
		for (int i=0; i<5; i++)
		{
			System.out.println("a["+i+"]= "+a[i]);
		}
			//System.arrayCopy(a[],0,b[],0,5);
			System.out.println(arrayCopy(a,0,b,0,5));
	}
}
