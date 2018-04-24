/*
Crear un programa en java que calcule el Biorritmo de un usuario, 
y subir el código en PDF junto con dos ejemplos de ejecuciones (capturar ventana),


Debe contener al menos las clases para:

Días de vida
Gráfica de Senoide
Además subir diagramas de clases en UML (en el mismo archivo)


*/

import java.applet.*;
import java.awt.*;

public class Grafica extends Applet
{
   public void init()
   {
     //setBackground(Color.YELLOW);
     setSize(900,600);
   } 
   
   public void paint (Graphics g)
   {
      double y;
      int xx, yy;
      double esc = 120;
      int xc = 50;
      g.drawLine(xc,150,450,150);
      g.drawLine(xc,40,xc,260);
      g.setColor(Color.BLUE);
      
      /*double diaA = 28;
      double mesA = 9;
      double anioA = 2016;
      double diasN = 29;
      double mesN = 9;
      double anioN = 1993;*/
      double diasVividos = 8400;
      
      for (double x1 = -5.0; x1 <= 5.0; x1+=0.02)
      {
         double x = 0;
         for(double i=diasVividos-20; i<=diasVividos+20; i++)
         {
            //double ciclo=diasVividos%23;
            x=(i*2*Math.PI)/23;
            System.out.println("X---> "+i+"Y--->"+x);
         }
         y=Math.sin(x1)*(-1);
         xx=(int)(x1*80)+200;
         yy=(int)(y*esc)+150;
         g.fillRect(xx+xc,yy,2,2);
      }
      
      g.setColor(Color.RED);
      for (double x1 = -5.0; x1 <= 5.0; x1+=0.02)
      {
         double x = 0;
         for(double i=diasVividos-20; i<=diasVividos+20; i++)
         {
            //double ciclo=diasVividos%23;
            x=(i*2*Math.PI)/28;
            System.out.println("---> "+x);
         }
         y=Math.sin(x1)*(-1);
         xx=(int)(x1*esc)+200;
         yy=(int)(y*esc)+170;
         g.fillRect(xx+xc,yy,2,2);
      }
      
      g.setColor(Color.GREEN);
      for (double x1 = -5.0; x1 <= 5.0; x1+=0.02)
      {
         double x = 0;
         for(double i=diasVividos-20; i<=diasVividos+20; i++)
         {
            //double ciclo=diasVividos%23;
            x=(i*2*Math.PI)/28;
            System.out.println("---> "+x);
         }
         y=Math.sin(x1)*(-1);
         xx=(int)(x1*100)+200;
         yy=(int)(y*esc)+150;
         g.fillRect(xx+xc,yy,2,2);
      }
      
   }
}