import java.awt.*;

public class GraficaFuns extends Frame
{
   int xx,yy;
   double y;
   int esc = 80;
   Button sal = new Button("Salir");


GraficaFuns (String tit)
{
   super(tit);
   setLayout(new FlowLayout(3));
   add(sal);
}

public boolean action(Event ev, Object ar)
{
   int a,b, c;
   if (ev.target instanceof Button)
   {
      System.exit(0);
      return true;
   }
      return false;
}

public boolean handleEvent(Event ob)
{
   if(ob.id==Event.WINDOW_DESTROY)
   {
      System.exit(0);
   }
      return super.handleEvent(ob);
}

public void paint(Graphics g)
{
   int xc = 100;
   g.drawLine(xc,150,450,150);
   g.drawLine(xc,40,xc,260);
   
   
   g.setColor(Color.BLUE);
   for (double x=-5.0; x<=5.0; x+=0.01)
   {
      y = Math.sin(x)*(-1);
      xx = (int)(x*esc/2)+200;
      yy = (int)(y*esc)+150;
      g.fillRect(xx+xc,yy,2,2);
   }
}

public static void main (String ar[])
{
   GraficaFuns ap = new GraficaFuns("Prueba Gráfica de la función seno");
   ap.resize(600,400);
   ap.show();
}

}