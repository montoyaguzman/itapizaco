import java.util.*;

public class Msuma1 {
public static void main (String args[]) {

Random r1 = new Random();
Random r2 = new Random();
int n;

int [][]matriz1 = new int[3][3];
int matriz2[][] = new int[3][3];
int matriz3[][] = new int[3][3];

for (int i=0; i<3; i++){
for (int j=0; i<3; i++){

matriz1[i][j] = (int)(r1.nextInt(10)*1);
matriz2[i][j] = (int)(r2.nextInt(10)*1);
matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
}
}
System.out.println ("Maatriz 1");
for (int i=0; i<3; i++) {
for (int j=0; j<3; j++){
System.out.println (matriz1[i][i]+"");
}
System.out.println();
}	
System.out.println ("Maatriz 2");
for (int i=0; i<3; i++) {
for (int j=0; j<3; j++){
System.out.println (matriz2[i][i]+"");
}
System.out.println();
}
System.out.println ("Maatriz 3");
for (int i=0; i<3; i++) {
for (int j=0; j<3; j++){
System.out.println (matriz3[i][i]+"");
}
System.out.println();
}
}
}