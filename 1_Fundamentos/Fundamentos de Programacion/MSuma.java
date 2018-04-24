import javax.swing.*; //hace llamada a JOption
import java.util.*; //hace llamada a scanner

public class MSuma{ //nombre de la clase
public static void main (String args[]){

Random r1= new Random();
Random r2= new Random(); //es una instruccion que genera un numero al azar, este numero va limitado por la instruccion for
int num;
int num1;
int i;
int j;
int matriz1[][]=new int[num][num1];
int matriz2[][]=new int[num][num1]; //Declaracion de matrices
int matriz3[][]=new int[num][num1];


for (i=0; i<num; i++){
for (j=0; j<num1; j++){ //instruccion repetitiva

Scanner leer=new Scanner(System.in); 
JOptionPane.showInputDialog(null,"Ingrese numero");

matriz1[i][j]=(int)(r1.nextInt(10)*1);
matriz2[i][j]=(int)(r2.nextInt(10)*1);    
matriz3[i][j]=matriz1[i][j]+matriz2[i][j];
}
}


JOptionPane.showMessageDialog(null,"Matriz 1"); //impresion matriz1
for (i=0; i<num; i++){     //ciclos repetitivos
for (j=0; j<num1; j++){
JOptionPane.showMessageDialog(null,matriz1[i][i]+"");
}
}
JOptionPane.showMessageDialog(null,"Matriz 2");
for (i=0; i<num; i++){
for (j=0; j<num1; j++){
JOptionPane.showMessageDialog (null,matriz2[i][i]+"");
}
JOptionPane.showMessageDialog(null,"Matriz 3");
}
for (i=0; i<num; i++){
for (j=0; j<num1; j++){
JOptionPane.showMessageDialog (null,matriz3[i][i]+"");
}
}
}
}