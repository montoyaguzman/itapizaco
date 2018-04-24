import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class automata{
public static void main (String args []){

int c=0;
String cad
cad=JOptionPane.showInputDialog("ESCRIBE LA CADENA: ");

int tam=cad.length();
char arr[]=new char [tam];
arr=cad.toCharArray();
for (int i=1;i<tam; i++)
if (arr [i]=='b')

c++;
if ((arr[0]=='a') && (c==tam-1))
JOptionPane.showMessageDialog(null, "LA CADENA ES ACEPTADA");

else 
JOptionPane.showMessageDialog(null, "LA CADENA NO ES ACEPTADA");
}

}