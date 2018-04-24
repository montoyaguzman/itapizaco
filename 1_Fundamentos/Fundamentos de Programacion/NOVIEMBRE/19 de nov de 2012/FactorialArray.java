public class FactorialArray {
public static void main(String[] args) {
     int arregloA[] = {1, 2, 3, 4, 5};
     int arregloB[] = new int[5];

     for(int i = 0; i < arregloA.length; i++){
          arregloB[i] = Factorial( arregloA[i] );
          System.out.println( arregloB[i] );
     }
     }

     public static int Factorial(int n)
     {
           return n == 1 ? n : n * Factorial(n - 1);
     }
}