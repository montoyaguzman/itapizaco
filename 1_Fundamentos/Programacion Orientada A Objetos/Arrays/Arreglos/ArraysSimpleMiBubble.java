public class ArraysSimpleMiBubble
{
	public static void main (String args[])
	{
		int i=0;
		int auxiliar;
		int a[]={30,45,67,12,34,56,78,79,10};
		int aO[]=new int[0];
		for (i=0; i<9; i++)
		{
			System.out.println("a["+i+"]= "+a[i]);
		}
      for(int j=0; j <9-i; j++)  
      {  
      	if(a[j]>a[j+1])  
      	{  
				auxiliar = a[j];  
				a[j] = a[j+1];  
				a[j+1] = auxiliar;
			}
			for(i=0; i<9; i++)
			{  
    			  System.out.println("a["+i+"]= "+aO[i]);
			}
		}
}
}
