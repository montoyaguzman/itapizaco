import java.applet.*;
import java.awt.*;

public class GrafisFuns extends Applet
{
   public void paint (Graphics g)
   {
      double y;
      int xx, yy;
      double esc = 80;
      int xc = 50;
      g.drawLine(xc,150,450,150);
      g.drawLine(xc,40,xc,260);
      g.setColor(Color.BLUE);
      
      for (double x = -5.0; x <= 5.0; x+=0.01)
      {
         y=Math.sin(x)*(-1);
         xx=(int)(x*esc/2)+200;
         yy=(int)(y*esc)+150;
         g.fillRect(xx+xc,yy,2,2);
         System.out.println("X---> "+x+"Y--->"+y);
         System.out.println("GX---> "+xx+"GY--->"+yy);
      }
   }
}