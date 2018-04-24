import java.io;
public class CalculadoraAr
{
	private float num1;
	private float num2;
	private float result;
	private int operacion;

	//Metodos de entrada
	void eligeOperacion(char x)
	{
		operacion=x;
	}
		void realizaOperacion()
		{
			
			float a,b,result,operacion;
			
			BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
			
			System.out.println("¿Què operacion deseas?");
			operacion=br.readLine();
			switch(operacion)
			{
			 	
				case 1:
				{
			 		CalculadoraA.realizaSuma();
					result=Calculadora.muestraResult();
			 	}
			 	break;
				case 2:
			 	{
					CalculadoraA.realizaResta();
					result=Calculadora.muestraResult();
				}
			 	break;
			 	case 3:
			 	{
				 	CalculadoraA.realizaMult();
					result=Calculadora.muestraResult();			 
			 	}
			 	break;
				case 4:
				{
					CalculadoraA.realizaDivi();
					result=Calculadora.muestraResult();
				}
			}		
		}
	
	void leeNum1(float a);
	{
		num1=a;
	}
	void leeNum1 (float b);
	{
		num2=b;
	}
	
	void realizaSuma()
	{
		result=num1+num2;
	}
	
	void realizaResta()
	{
		result=num1-num2;
	}
	
	void realizaMult()
	{
		result=num1*num2;
	}
	
	public void realizaDivi()
	{
		result=num1/num2;
	}
	
	public void imprimeResultado() 
	{
 		System.out.print(resultado);
	}

	
	 public static void main(String[] args) 
	 {
         CalculadoraAr laClase = new CalculadoraAr();
         laClase.leenum1(10);
         laClase.leenum2(5);
         //laClase.eligeOperacion('m');
         laClase.realizaOperacion();
         laClase.imprimeResultado();
	}
}