import java.util.Random;
 
public class matriz1
{
	public static void main(String [] args) throws Exception
	{
		int matriz[][] = new int[5][5];
		int r=0;		
		Random rnd= new Random();		
		for (int i=0; i < 5; i++)
		{
			for (int j=0; j < 5; j++)
				matriz[i][j] = rnd.nextInt(25)+1;			
		}
	}
}