import java.io.*;
public class CalculadoraA
{
OperacionA calculadoraA = new OperacionA();
	private float Num1;
	private float Num2;
	private float result;
	private int operacion;

//OperacionA calculadoraA = new OperacionA();
	
	public void eligeOperacion(int x)
	{
		operacion=x;
	}
	public void realizaOperacion() throws IOException
	{
		
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		
		//System.out.println("DEME NUMERO UNO");
		//float num1=Float.parseFloat(br.readLine());
		//System.out.println("DEME NUMERO DOS");
		//float num2=Float.parseFloat(br.readLine());
		
			
		switch(operacion)
		{
			 	
			case 1:
			{
				System.out.println("DEME NUMERO UNO");
				float num1=Float.parseFloat(br.readLine());
				System.out.println("DEME NUMERO DOS");
				float num2=Float.parseFloat(br.readLine());
				calculadoraA.leeNum1(num1);
				calculadoraA.leeNum2(num2);
				calculadoraA.realizaSuma();
				result=calculadoraA.muestraresult();
			 }
			break;
				case 2:
			 	{
					System.out.println("DEME NUMERO UNO");
					float num1=Float.parseFloat(br.readLine());
					System.out.println("DEME NUMERO DOS");
					float num2=Float.parseFloat(br.readLine());
			 		calculadoraA.leeNum1(num1);
					calculadoraA.leeNum2(num2);	
					calculadoraA.realizaResta();
					result=calculadoraA.muestraresult();
				}
			 	break;
			 	case 3:
			 	{
					System.out.println("DEME NUMERO UNO");
					float num1=Float.parseFloat(br.readLine());
					System.out.println("DEME NUMERO DOS");
					float num2=Float.parseFloat(br.readLine());
					calculadoraA.leeNum1(num1);
					calculadoraA.leeNum2(num2);
					calculadoraA.realizaMultiplicacion();
					result=calculadoraA.muestraresult();
			 
			 	}
			 	break;
				case 4:
				{
					System.out.println("DEME NUMERO UNO");
					float num1=Float.parseFloat(br.readLine());
					System.out.println("DEME NUMERO DOS");
					float num2=Float.parseFloat(br.readLine());
					calculadoraA.leeNum1(num1);
					calculadoraA.leeNum2(num2);
					calculadoraA.realizaDivision();
					result=calculadoraA.muestraresult();
				}
				default:
				{
					System.out.println("ESA OPERACION NO EXISTE, ESTA CALCULADORA ES CEBOLLERA ¡JEJE!");
				}
			}
		}
		public void imprimeResult()
		{
			
			if(operacion<5)
			System.out.print("EL RESULTADO ES:"+result);
		}
	}

