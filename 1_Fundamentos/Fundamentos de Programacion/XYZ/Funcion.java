import javax.swing.JOptionPane; 


public class Funcion { 
public static void main(String args[]) 
{ 
String primerNumero, segundoNumero, tercerNumero,opci; 
double a, b,c,d=0,e=0,f=0,g=0,h=0,suma,op=0; 
suma=0; 
op=0; 
do{ 

primerNumero=JOptionPane.showInputDialog("Dame tu coeficiente a" ); 
segundoNumero=JOptionPane.showInputDialog("Dame tu coeficiente b" ); 
tercerNumero=JOptionPane.showInputDialog("Dame tu coeficiente c" ); 

a=Integer.parseInt(primerNumero); 
b=Integer.parseInt(segundoNumero); 
c=Integer.parseInt(tercerNumero); 
d=((b*b)-(4*a*c)); 
e=((2)*(a)); 

if (h>0){
JOptionPane.showMessageDialog(null,"LA ECUACION TIENE DOS RAICES REALES"); 
}else
if (h==0){
JOptionPane.showMessageDialog(null,"LA ECUACION TIENE 1 RAIZ REAL"); 
}else
if (h<0){
JOptionPane.showMessageDialog(null,"LA ECUACION TIENE RAICES IMAGINARIAS"); 
}else

if(d<0){ 
opci=JOptionPane.showInputDialog("\n LA RAIZ ES IMAGINARIA, Repetir 1-Si 2-No:" ); 
op=Integer.parseInt(opci); 
}else
h=Math.sqrt(d); 
f=(((-b)+(h))/e); 
g=(((-b)-(h))/e); 

JOptionPane.showMessageDialog(null,"La discriminante es: " +d); 
JOptionPane.showMessageDialog(null,"La raiz x1: "+f,"es el resultado"); 
JOptionPane.showMessageDialog(null,"la raiz x2: "+g,"es elresultado"); 


opci=JOptionPane.showInputDialog("\n Repetir? 1-Si 2-No: " ); 
op=Integer.parseInt(opci); 
} 
} 
while(op==1); 


}
}