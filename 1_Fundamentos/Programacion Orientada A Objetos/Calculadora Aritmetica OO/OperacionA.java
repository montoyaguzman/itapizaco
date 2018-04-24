public class OperacionA
{
	private float num1;
	private float num2;
	private float result;
	private int operacion;
	
	//METODOS DE ENTRADA
	
	public void leeNum1(float a)
	{
		num1=a;
	}
	public void leeNum2(float b)
	{
		num2=b;
	}
	public void realizaSuma ()
	{
		result=num1+num2;
	}
	public void realizaResta ()
	{
		result=num1-num2;
	}
	public void realizaMultiplicacion ()
	{
		result=num1*num2;
	}
	public void realizaDivision ()
	{
		result=num1/num2;
	}
	
	public float muestraresult() 
	{
		return result;
   }
}