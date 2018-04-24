import java.awt.*;
import java.applet.*;

public class MoverImagenTeclas extends Applet{

   int x,y;
   boolean b;
   Image img;
   
   public void init(){
      x=50;
      y=50;
      b=false;
      setBackground(Color.red);
      img = getImage(getCodeBase(),"imagenes/pokemon2.gif");
   }
   
   public boolean keyDown(Event ev, int key){
      switch(key){
      
      case Event.DOWN: y+=5;
         break;
      case Event.UP: y-=5;
         break;
      case Event.RIGHT: x+=5;
         break;
      case Event.LEFT: x-=5;
         break;
      case Event.F1: b=true;
         break;
      case Event.F2: b=false;
         break;   
   }
      repaint();
      return true;
   }
   
   public void paint(Graphics g){  
      g.drawImage(img,x,y,this);
      if (b) g.drawString(" "+x+","+y,20,20);
   }
}












