import java.awt.*;
import java.applet.*;

public class DibujaRectangulos extends Applet
{

   final int MAX = 20;
   Point inis[] = new Point[MAX];
   Point finis[] = new Point[MAX];
   Point inicial;
   Point actual;
   
   int pl = 0;
   
   public void init()
   {
      setBackground(Color.white);
   }
   
   public boolean mouseDown(Event ev,int x,int y)
   {
      inicial = new Point(x,y);
      return true;
   }

   public boolean mouseUp(Event ev, int x, int y)
   {
      if(pl < MAX)
      addline(x,y);
      return true;
   }

   public boolean mouseDrag(Event ev, int x, int y)
   {
      actual = new Point(x,y);
      repaint();
      return true;   
   }
   
   void addline(int x, int y)
   {
      inis[pl] = inicial;
      finis[pl] = new Point(x,y);
      pl++;
      actual = null;
      
      repaint();
   }
   
   public void paint (Graphics g)
   {
      for (int i = 0; i<pl; i++)
      {
         g.drawRoundRect(inis[i].x,inis[i].y,finis[i].x,finis[i].y,15,15);
         //g.fillOval(inis[i].x-10,inis[i].y-10,20,20);
         ///g.fillOval(finis[i].x-10,finis[i].y-10,20,20);
      }
      g.setColor(Color.RED);
      if (actual != null)
      g.drawRoundRect(inicial.x,inicial.y,actual.x,actual.y,15,15);
   }
}
