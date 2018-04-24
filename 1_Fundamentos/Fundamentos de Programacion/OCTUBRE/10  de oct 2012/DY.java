import javax.swing.JOptionPane; 

public class DY { 
public static void main(String args[]) 
{ 
String primerNumero, segundoNumero, tercerNumero,opci; 
double a, b,c,d=0,e=0,f=0,g=0,h=0,suma,op=0; 
suma=0; 
op=0; 
do{ 
primerNumero=JOptionPane.showInputDialog("Escribe coeficiente a" ); 
segundoNumero=JOptionPane.showInputDialog("Escribe coeficiente b" ); 
tercerNumero=JOptionPane.showInputDialog("Escribe coeficiente c" ); 
a=Integer.parseInt(primerNumero); 
b=Integer.parseInt(segundoNumero); 
c=Integer.parseInt(tercerNumero); 
d=((b*b)-(4*a*c)); 
e=((2)*(a)); 

if(d<0) 
{ 
opci=JOptionPane.showInputDialog("\n LA RAIZ ES IMAGINARIA" ); 
}

else if(d>0){ 
opci=JOptionPane.showInputDialog("\n EXISTEN 2 RAICES REALES" );
h=Math.sqrt(d);
f=(((-b)+(h))/e); 
g=(((-b)-(h))/e);  
opci=JOptionPane.showInputDialog("\n EL DISCRIMINANTE ES: "+d); 
JOptionPane.showMessageDialog(null,"La raiz x1: "+f,"+Resultado",JOptionPane.INFORMATION_MESSAGE); 
JOptionPane.showMessageDialog(null,"la raiz x2: "+g,"+Resultado",JOptionPane.INFORMATION_MESSAGE);
} 
else if(d==0){ 
opci=JOptionPane.showInputDialog("\n EXISTEN 1 RAIZ REAL" ); 
h=Math.sqrt(d);
f=(((-b)+(h))/e); 
g=(((-b)-(h))/e);
opci=JOptionPane.showInputDialog("\n EL DISCRIMINANTE ES: "+d); 
JOptionPane.showMessageDialog(null,"La raiz x1: "+f,"+Resultado",JOptionPane.INFORMATION_MESSAGE); 
JOptionPane.showMessageDialog(null,"la raiz x2: "+g,"+Resultado",JOptionPane.INFORMATION_MESSAGE);

opci=JOptionPane.showInputDialog("\n Repetir? 1-Si 2-No:" ); 
op=Integer.parseInt(opci); 
}

}while(op==1); 
} 
} 