import java.util.Scanner;

public class CalificacionFinal {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int x,suma,calificacion,promedio;
        x=1;
        suma=0;
        while (x<=6) {
            System.out.print("Ingrese calificacion:");
            calificacion=teclado.nextInt();
            suma=suma+calificacion;
            x=x+1;
        }
        promedio=suma/6;
        System.out.print("La suma de los 10 valores es: ");
        System.out.println(suma);
        System.out.print("El promedio es: ");
        System.out.print(promedio);
    }
}
