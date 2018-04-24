import java.applet.*;
import java.awt.*;

public class GraficaV2 extends Applet
{
   public void init()
   {
     setSize(1100,700);
   } 
   
   public void paint (Graphics g)
   {
      double y;
      int xx, yy;
      double escala = 50;
      int xc = 50;
      g.drawLine(xc,150,450,150);
      g.drawLine(xc,40,xc,260);
      int diasVividos = 8400;

      //FISICO
      g.setColor(Color.BLUE);
      diasVividos = diasVividos%23;
      for(double x=diasVividos-10; x<=diasVividos+10; x+=0.01)
      {               
         y=(x*2*Math.PI)/23;
         y=Math.sin(y); 
         y=y*-1;
         //System.out.println("X --> "+x+"    Y -->"+y);
         xx=(int)(x*escala)+250;
         yy=(int)(y*escala*2)+150;
         g.fillRect(xx+xc,yy,2,2);           
      } 
      
      
      //EMOCIONAL
      g.setColor(Color.RED);
      diasVividos = diasVividos%28;
      for(double x=diasVividos-10; x<=diasVividos+10; x+=0.01)
      {               
         y=(x*2*Math.PI)/28;
         y=Math.sin(y); 
         y=y*-1;        
         //System.out.println("X --> "+x+"    Y -->"+y);
         xx=(int)(x*escala)+250;
         yy=(int)(y*escala*2)+150;
         g.fillRect(xx+xc,yy,2,2);           
      }
      
      //INTELECTUAL
      g.setColor(Color.GREEN);
      diasVividos = diasVividos%33;
      for(double x=diasVividos-10; x<=diasVividos+10; x+=0.01)
      {               
         y=(x*2*Math.PI)/33;
         y=Math.sin(y); 
         y=y*-1;      
         //System.out.println("X --> "+x+"    Y -->"+y);
         xx=(int)(x*escala)+250;
         yy=(int)(y*escala*2)+150;
         g.fillRect(xx+xc,yy,2,2);           
      }      
   }
}