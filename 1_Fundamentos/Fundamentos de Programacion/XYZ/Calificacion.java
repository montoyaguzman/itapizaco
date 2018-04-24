import javax.swing.JOptionPane; 

public class Calificacion{
public static void main (String[]args){

String cal=""; 
cal=JOptionPane.showInputDialog("Introduce tu calificacion"); 

int grade = 92;
switch(grade){
case 100:
System.out.println( "Excellent!" );
break;
case 90:
System.out.println( "Good Job!" );
break;
case 80:
System.out.println( "Study Harder!" );
break;
case 70:
System.out.println( "Pasaste!" );
break;
default:
System.out.println( "Sorry, You Failed" );
}
}
}