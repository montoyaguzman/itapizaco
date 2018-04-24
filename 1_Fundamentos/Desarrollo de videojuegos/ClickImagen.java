import java.applet.*;
import java.awt.*;
	
public class ClickImagen extends Applet implements Runnable{
   
   Thread hilo;
   int x,y;
   boolean b,v;
   Image cambio,actual;
   boolean bb;
      
   public void init() {
      x=20;
      y=50;
      v=b=true;
      cambio=getImage(getCodeBase(),"imagenes/pokemon2.gif ");
      actual=getImage(getCodeBase(),"imagenes/fin.jpg ");
   }
   
   public void stop() {
      if (hilo!=null){
         hilo.stop();
         hilo=null;
      }
   }
    
   public void start() {
      if (hilo==null){
         hilo = new Thread(this);
         hilo.start();
      }
   }
   
   public boolean mouseDown(Event ev,int mx,int my)
   {
      if (mx>x && my>y && mx<(x+50) && my<(y+50))
         bb=!bb;
         return true;
   }
   
   
   public void run() {
      while (true){
      if (b) x+=10;
      else x-=10;
      if (v) y+=10;
      else y-=10; 
      
      try {
         Thread.sleep(80);
      }catch (InterruptedException e) {}
         repaint();
         if (x<20) b=true;
         if (x>500) b=false;
         if (y<20) v=true;
         if (y>400) v=false;
      }
   }
   
   public void paint(Graphics g) {
      g.drawRect(10,10,550,450);
      g.setColor(Color.red);
         
   if (bb)
      g.drawImage(cambio,x,y,50,50,this);
   else
      g.drawImage(actual,x,y,50,50,this);
   }
   
   
}
   

