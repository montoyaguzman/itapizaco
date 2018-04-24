import java.util.Scanner;
public class listaDinamica
{
	public static void main (String args [])
	{
ListaDin d=new ListaDin();
int s, m;
Scanner leer= new Scanner (System.in);
System.out.println("Que decea hacer? ");
do {
System.out.println("1.-Insertar un dato ");
System.out.println("2.-Visualizar un dato ");
System.out.println("3.-Ordenar un dato ");
System.out.println("4.- Reinsertar un numero");
System.out.println("5.-Eliminar un dato");
System.out.println("Seleccione una opción: ");
s = leer.nextInt();
switch (s)
{
case 1: d.inserta();
break;
case 2: d.visualizar();
break;
case 3: d.ordenar();
break;
case 4: d.reinsertar();
break;
case 5: d.eliminar();
break;
}
System.out.print("¿Desea salir del menú?: 1.-No, 2.-Si ");
m =leer.nextInt();
} while (m == 1);
}

}

