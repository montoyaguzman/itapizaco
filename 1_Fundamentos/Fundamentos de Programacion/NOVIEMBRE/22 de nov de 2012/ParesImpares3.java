import javax.swing.*;
public class ParesImpares3 {
public static void main(String[] args) {
int x,y,suma1,suma2;
x=1;
suma1=0;
suma2=0;
String Respuesta=JOptionPane.showInputDialog(" Dame un número ");
int numero=Integer.parseInt(Respuesta);


while (x<=numero){
if (x % 2 == 0) {
JOptionPane.showMessageDialog(null,x+ " Es par");

suma1=suma1+x;
}else{
suma2=suma2+x;

JOptionPane.showMessageDialog(null, x+" Es impar");}
x++;}

JOptionPane.showMessageDialog(null,"LA SUMA DE LOS PARES ES: " + suma1);
JOptionPane.showMessageDialog(null, "LA SUMA DE LOS IMPARES ES: " + suma2);
}
}


