import java.awt.*;
import java.applet.*;

public class Camino extends Applet{

   int x,y;
   int x2,y2;
   boolean b;
   Image img,fin;
   
   public void init(){
      setSize(1350,800);
      x = 50;
      y = 315;
      x2 = 1220;
      y2 = 210;
      b = false;
      
      Color micolor = new Color(204, 229, 255);
      setBackground(micolor);
      img = getImage(getCodeBase(),"imagenes/pokemon2.gif");
      fin = getImage(getCodeBase(),"imagenes/fin.jpg");
      
   }
   
   public void dibujaCamino(Graphics camino)
	   {
         camino.setColor(Color.YELLOW);
         camino.drawLine(300,300,300,300);
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
      //g.drawLine(400,390,400,100);
      //g.drawLine(400,390,400,100);
      //IMAGEN
      g.drawImage(img,x,y,this);
      g.drawImage(fin,x2,y2,this);
      //MEDIDAS
      if (b) g.drawString(" "+x+","+y,20,20);
   }
}

