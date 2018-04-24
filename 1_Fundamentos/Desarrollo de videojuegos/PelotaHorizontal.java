import java.applet.*;
import java.awt.*;

public class PelotaHorizontal extends Applet implements Runnable
{
   Thread hilo;
   int x,y;
   boolean b;
   
   public void init()
   {
      //setBackground(Color.BLACK);
      setSize(1120,620);
      x = 20;
      y = 50;
      b = true;
   }
     
   public void start()
   {
      if (hilo == null)
      {
         hilo = new Thread(this);
         hilo.start();
      }
   }
   
   public void stop()
   {
      if (hilo != null)
      {
         hilo.stop();
         hilo = null;
      }
   }
   
   public void run()
   {
      while(true)
      {
         if (b)
         {
            x+=10;
            //y+=10;
         } 
         else
         {
            x-=10;
            //y-=10;
         }
         try
         {
            Thread.sleep(70);
         }catch(InterruptedException e){}
         repaint();
         if (x < 20)
         b = true;   
         if (x > 500)
         b = false;
      }
   }
   
   public void paint (Graphics g)
   {
      g.drawRect(10,10,550,350);
      g.setColor(Color.BLACK);
      g.fillOval(x,y,50,50);
   }
   

}