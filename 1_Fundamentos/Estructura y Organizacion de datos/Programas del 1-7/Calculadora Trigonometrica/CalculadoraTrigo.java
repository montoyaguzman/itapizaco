import java.io.*;

class CalculadoraTrigo 
{
	public static void main (String a[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
      
      double co = 0, ca = 0, h = 0;
      double result;
      
      System.out.print("--- MENÚ TRIGONOMETRICO ---\n\n"
                       +"1.- Seno\n"
                       +"2.- Coseno\n"
                       +"3.- Tangente\n"
                       +"4.- Cotangente\n"
                       +"5.- Secante\n"
                       +"6.- Cosecante\n\n");
            
      System.out.print("¿Qué operacion desea realizar?: ");
      int ope = Integer.parseInt(br.readLine());
   
      System.out.print("Valor cateto opuesto: ");
      co = Integer.parseInt(br.readLine());
      
      System.out.print("Valor del catedo adyacente: ");
      ca = Integer.parseInt(br.readLine());
      
      System.out.print("Valor de la Hipotenusa: ");
      h = Integer.parseInt(br.readLine());
      
      switch (ope)
      {
         case 1: //CALCULA SENO
         {
            result = co / h;
            System.out.print("Valor de la seno: "+result);
         }break;
         case 2: //CALCULA COSENO
         {
            result = ca / h;
            System.out.print("Valor de la coseno: "+result);
         }break;
         case 3: //CALCULA TANGENTE
         {
            result = co / ca;
            System.out.print("Valor de la tangente: "+result);
         }break;
         case 4: //CALCULA COTANGENTE
         {
            result = ca / co;
            System.out.print("Valor de la cotangente: "+result);
         }break;
         case 5: //CALCULA SECANTE
         {
            result = h / ca;
            System.out.print("Valor de la secante: "+result);
         }break;
         case 6: //CALCULA COSECANTE
         {
            result = h / co;
            System.out.print("Valor de la cosecante: "+result);
         }break;
         default:
         {
            System.out.print("Opción no válida!\nIntente de nuevo!");
         }break;
      
      }
   }
}