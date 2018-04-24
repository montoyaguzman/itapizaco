import java.awt.*;
import java.applet.*;

public class Camino4 extends Applet{

   int x,y,x2,y2;
   boolean b;
   Image img,fin;
   
   public void init()
   {
      setSize(1350,800);
      x = 50;
      y = 315;
      x2 = 1220;
      y2 = 310;
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
//_______BAJAR_______BAJAR_______BAJAR_______BAJAR_______BAJAR_______BAJAR_______BAJAR_______BAJAR_______BAJAR_______BAJAR_______BAJAR_______
         case Event.DOWN:
            if ( (((x>=50)&&(x<=310))&&(y == 315)) || ((y==35)&&((x>315)&&(x<515))) || ((y==515)&&((x>=515)&&(x <= 715))) || (y==320 && x>715))
            {
               y+=0;
            }
            else{
               y+=5;
            }
         break;
//_______SUBIR_______SUBIR_______SUBIR_______SUBIR_______SUBIR_______SUBIR_______SUBIR_______SUBIR_______SUBIR_______SUBIR_______SUBIR_______SUBIR
         case Event.UP: 
            if ( ((x>=50)&&(x<310)) || ((x==310)&&((y==35)||(y==0))) || ((x> 10)&&((y==35)&&(y<=515))) || ((x>515)&&((x>=515)&&(x<715))) || ((x==715)&&(y<325)) || (y==320 && x>715))
            {
               y-=0;
            }
            else
            {
               y-=5;
            }
         break;
//_______DERECHA_______DERECHA_______DERECHA_______DERECHA_______DERECHA_______DERECHA_______DERECHA_______DERECHA_______DERECHA_______DERECHA
      case Event.RIGHT: 
         if ( ((x>=310)&&(y>35)&&(y<=315)) || ((x==515)&&(y==35)) || ((x==515)&&(y>715)) || ((x==715)&&(y>325)) || ((y==320)&&(x<715)) || ((y==320)&&(x>1135)))
         {
            x+=0;
         }
         //else if ( ((x==715)&&((y>35)&&(y<510))) ) { x+=0; } 
         else{
            x+=5;
         }
      break;
//IZQUIERDA_______IZQUIERDA_______IZQUIERDA_______IZQUIERDA_______IZQUIERDA_______IZQUIERDA_______IZQUIERDA_______IZQUIERDA_______IZQUIERDA_______
      case Event.LEFT: 
         if ( (x<=50) || ((x<=310)&&(y!=315)) || ((x==515&&y>=515)) || ((x==715)&&(y<515)) || (x==515&&y>35) || (x==515&&y<515))
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
      
      g.drawLine(700,500,700,300);
      g.drawLine(800,590,800,390);
      
      g.drawLine(700,300,1200,300);
      g.drawLine(800,390,1200,390);
      
      //IMAGEN
      g.drawImage(img,x,y,this);
      g.drawImage(fin,x2,y2,this);
      
      //MEDIDAS
      if (b) g.drawString(" "+x+","+y,20,20);
   }
}

