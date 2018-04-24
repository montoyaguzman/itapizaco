import java.applet.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PruebaV1 extends Applet implements ActionListener
{
   Label resultado;// mens;
   Button calcular;//af,ag;
   TextField diasVividos;//temp;
   Font letrero = new Font("SansSerif", Font.BOLD,18);
   int dias = 0;
 
   public void init()
   {
      setSize(1200,720);
      /*resultado=new Label (" ");
      */
      calcular = new Button("Dibujar bioritmos");
      //ag=new Button("A Grados");
      //diasVividos= new TextField("0.0");
      add(calcular);
      //add(diasVividos);
      //add(resultado);
      calcular.addActionListener(this);
      
            
   }
   
   
   public void actionPerformed(ActionEvent ev) {
      
      String str = ev.getActionCommand();
      if(str.equals("calcular"))
      dias = 2;
      repaint();
         
      /*try {
         double tempActual=Double.parseDouble(temp.getText());
         String str = ev.getActionCommand();
         if (str.equals("A Fahrenheit")) {
            mens.setText("Temperatura "+tempActual+" C = "+
               (tempActual*1.80+32.0)+" F");
         } 
         else if (str.equals("A Grados")) {
            mens.setText("Temperatura "+tempActual+" F = "+
               ((tempActual-32.0)/1.80)+" C");
         }
      } 
      catch (NumberFormatException e) {
         mens.setText("Error");
      }*/
   }
 
   public void start() {
   }
   
   public void paint (Graphics g)
   {
      g.setFont(letrero);
 		if(dias==0)
         g.drawString("Adios", 500, 100);
      else if(dias!=0)
         g.drawString("Hola", 500, 100);
          
   }
}