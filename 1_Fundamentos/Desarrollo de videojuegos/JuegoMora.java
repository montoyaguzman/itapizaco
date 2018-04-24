import java.awt.*;
import java.applet.*;

public class JuegoMora extends Applet implements Runnable
{
   Graphics u;
   int a1, b1;
   int yb,xb;
   Thread hilo;
   int x,y;
   Image img,cancha,bu;
   boolean b,v,vv;
   
   public void init(){
      img = getImage(getCodeBase(),"caz.gif");
      cancha = getImage(getCodeBase(),"ctenis.jpg");
      x=20;
      y=50;
      v=b=true;
      vv=false;
      xb=yb=a1=b1=0;
      setFont(new Font("Helvetica",Font.BOLD,28));
   }
   
   public void stop(){
      if (hilo!=null)
      {
         hilo.stop();
         hilo=null;
      }
  }   
  
  public void start(){
      if (hilo==null)
      {
         hilo = new Thread(this);
         hilo.start();
      }
  }
  
  public boolean keyDown (Event ev, int x){
      switch(x){
      case Event.DOWN: yb+=5;
         break;
      case Event.UP: yb-=5;
         break;
      case Event.RIGHT: xb+=5;
         break;
      case Event.LEFT: xb-=5;
         break;      
      }
         return true;
   }

   public void run(){
      while (!vv){
         try{
            Thread.sleep(30);
         }
         catch(InterruptedException e){}
         
         if (b) x+=10;
         else x-=10;
         if (v) y+=10;
         else y-=10;
         
         repaint();
         if (x<20)
         {
            b=true;
            a1++;
            play (getCodeBase(),"temakyo.au");
         }
         if (x>600)
         {
            b=false;
            b1++;
            play (getCodeBase(),"temakyo.au");
         }
         if (y<20) v=true;
         if (y>400) v=false;
         
         if (y>140+yb && y<450+yb && x<=270+xb && x>=280+xb) //falta &&
            b=false;
         
         if (y>140+yb && y<450+yb && x<=300+xb && x>=280+xb) //falta &&
            b=true;
            
         if(a1>=12 || b1>=8){
            vv=true;
            play(getCodeBase(),"temakyo.au");
            repaint();
         }   
      }     
   }
   
   public void update(Graphics g){
      paint(g);
   }
   
   public void paint(Graphics g){
      if(u==null){
         bu=createImage(700,500);
         u=bu.getGraphics();
      }
      u.drawImage(cancha,10,10,650,450,this);
      u.drawImage(img,x,y,30,30,this);
      u.setColor(Color.GREEN);
      u.drawString(" "+b1,10,30);
      u.setColor(Color.YELLOW);
      u.drawString(" "+a1,620,30);
      u.fillRect(xb+300,yb+150,10,300);
      
      if (vv){
         u.setFont(new Font("Helvetica",Font.BOLD,46));
         u.drawString("GAME OVER",200,200);
      }
      g.drawImage(bu,0,0,this);
   }      
}
  