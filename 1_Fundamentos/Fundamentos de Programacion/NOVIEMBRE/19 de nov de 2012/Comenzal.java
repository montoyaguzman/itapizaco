import javax.swing.JOptionPane;

public class Comenzal{

public static void main (String []args){

double cuenta;
double propina;
double total;

String Respuesta=JOptionPane.showInputDialog("�Cu�nto vale el aperitivo que probaste?");
double aperitivo=Double.parseDouble(Respuesta);

String Respuesta1=JOptionPane.showInputDialog("�Qu� costo tuvo el plato fuerte?");
double pfuerte=Double.parseDouble(Respuesta1);

String Respuesta2=JOptionPane.showInputDialog("�Y el vino?");
double vino=Double.parseDouble(Respuesta2);

String Respuesta3=JOptionPane.showInputDialog("�Cu�nto costo el postre?");
double postre=Double.parseDouble(Respuesta3);


cuenta=aperitivo+pfuerte+vino+postre;
propina=cuenta/100*15;
total=cuenta+propina;


JOptionPane.showMessageDialog(null, "Tu cuenta es de \t"+"$"+cuenta);
JOptionPane.showMessageDialog(null, "La propina es \t"+"$"+propina);
JOptionPane.showMessageDialog(null, "En total debes pagar \t"+"$"+total);
JOptionPane.showMessageDialog(null, "�Que tengas linda noche un placer servirte!");}

}

