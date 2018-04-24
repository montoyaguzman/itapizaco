import java.applet.*;
import java.awt.*;

public class ImagenRomboCambia extends Applet implements Runnable
{
   Thread hilo;
   int x,y,aumentaX,aumentaY;
   Image img;
   int iw,ih;
   boolean b;
  
   public void init()
   {
      //setBackground(Color.BLACK);
      setSize(580,380);
      x = 20;
      y = 50;
      aumentaX = 10;
      aumentaY = 10;
      String ruta = "imagenes/pokemon.gif";
      img = getImage(getCodeBase(),ruta);
      b=true;
      
    
   }
   
   public void init(Graphics g){
      iw = img.getWidth(this);
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
         x+=aumentaX;
         y+=aumentaY;
         
         try
         {
            Thread.sleep(70);
         }catch(InterruptedException e){}
         repaint();
         
         if (x >= (540-25) || x <= 25) 
         aumentaX*= -1;
         if (y >= (340-25) || y <= 25) 
         aumentaY*= -1;
      }
   }
   
   public void paint (Graphics g)
   { 
      //g.drawString("Squirtle!!!",150,30);
      g.drawImage(img,x,y,50,50,this);
      if (b) g.drawString(" "+x+","+y,20,20);
      
      
      
   }
   
   public boolean mouseDown(Event ev,int x,int y)
   {  
      //setBackground(Color.BLUE);
      String ruta2 = "imagenes/spiderman.jgp";
      return true;
   }

}