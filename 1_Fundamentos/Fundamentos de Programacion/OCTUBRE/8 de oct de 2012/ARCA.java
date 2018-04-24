import javax.swing.JOptionPane;
public class ARCA  {
public static void main (String []args)
{
double grade=Integer.parseInt(JOptionPane.showInputDialog("DAME TU CALIFICACION"));

if(grade>=90&&grade<=100){
JOptionPane.showMessageDialog(null, "Excelent!");
}
else if (grade<90&&grade>=80){
JOptionPane.showMessageDialog(null, "Good Job!");
}
else if (grade<80&&grade>=70){
JOptionPane.showMessageDialog(null, "Study Harder!");
}
else if (grade<70&&grade>=0){
JOptionPane.showMessageDialog(null, "Your Failed");
}
else if (grade>100){
JOptionPane.showMessageDialog(null, "No es posible leer esa calificacion");
JOptionPane.showMessageDialog(null, "Verifica tu calificacion");


}
}
}



