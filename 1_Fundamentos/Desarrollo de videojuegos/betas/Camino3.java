import java.awt.*;
import java.applet.*;

public class Camino2 extends Applet{

   int x,y,x2,y2;
   boolean b;
   Image img,fin;
   
   public void init()
   {
      setSize(1350,800);
      x = 50;
      y = 315;
      x2 = 1220;
      y2 = 210;
      b = true;
      
      Color micolor = new Color(204, 229, 255);
      setBackground(micolor);
      img = getImage(getCodeBase(),"imagenes/pokemon2.gif");
      fin = getImage(getCodeBase(),"imagenes/fin.jpg");
   }
   
   
   public boolean keyDown(Event ev, int key)
   {  
       
      switch(key)
      {
      //BAJAR
         case Event.DOWN:
            if (((x >= 50 && x<=310) && (y == 315)) || ((y == 35) && (x > 315) &&(x < 515)) || ((y == 515)  && ((x >= 515) && (x <= 715))))
            {
               y+=0;
            }
            else{
               y+=5;
            }
         break;
      //SUBIR
         case Event.UP: 
            if ((x >= 50 && x<310) || ((x == 310) && (y == 35) || (y == 0)) || ((x > 310) && (y == 35) &&(y <= 515)) || ((x > 515)  && ((x >= 515) && (x < 715))))
            {
               y-=0;
            }
            else
            {
               y-=5;
            }
         break;
      //DERECHA
      case Event.RIGHT: 
         if (((x >= 310) && (y > 35) &&(y <= 315)) || (x == 515 && y == 35) || ((x == 515) && ((y > 35) && (y < 510))))
         {
            x+=0;
         }
         else{
            x+=5;
         }
      break;
      //IZQUIERDA
      case Event.LEFT: 
         if ((x <= 50) || ((x <= 310) && (y != 315)) || ((x == 515) && (y > 35)))
         {
            x-=0;
         }
         else{
            x-=5;
         }
      break;
   }
      repaint();
      return true;
   }
   
   public void paint(Graphics g){  
      //CAMINO
      g.setColor(Color.BLACK);
      
      g.drawLine(150,300,300,300);
      g.drawLine(150,390,400,390);
      
      g.drawLine(300,300,300,20);
      g.drawLine(400,390,400,110);
      
      g.drawLine(300,20,600,20);
      g.drawLine(400,110,500,110);
      
      g.drawLine(600,20,600,500);
      g.drawLine(500,110,500,590);
      
      g.drawLine(600,500,700,500);
      g.drawLine(500,590,800,590);
      
      g.drawLine(700,500,700,200);
      g.drawLine(800,590,800,290);
      
      g.drawLine(700,200,1200,200);
      g.drawLine(800,290,1200,290);
      
      //IMAGEN
      g.drawImage(img,x,y,this);
      g.drawImage(fin,x2,y2,this);
      
      //MEDIDAS
      if (b) g.drawString(" "+x+","+y,20,20);
   }
}

