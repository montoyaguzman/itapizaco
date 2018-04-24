import javax.swing.*;

public class ParesImparesMA {
public static void main(String[] args) {

int x,y,suma1,suma2;
x=2;
y=1;
suma1=0;
suma2=0;
String Respuesta=JOptionPane.showInputDialog(" ¿Dame un número? ");
int numero=Integer.parseInt(Respuesta);
suma1=x+suma1;
suma2=y+numero;
	
JOptionPane.showMessageDialog(null,"Los números pares son: ");
while (x<=numero){
JOptionPane.showMessageDialog(null,x);		  
x=x+2;
}
JOptionPane.showMessageDialog(null, " Los números impares son: ");
while (y<=numero){
JOptionPane.showMessageDialog(null,y);		  
y=y+2;
}
JOptionPane.showMessageDialog(null,"LA SUMA DE LOS PARES ES: " + x);
JOptionPane.showMessageDialog(null, "LA SUMA DE LOS IMPARES ES: " + y);
}
}