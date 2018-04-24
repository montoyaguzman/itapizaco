import java.awt.*;

public class GraficaV1 extends Frame
{
   int xx,yy;
   double y;
   int esc = 80;
   Button sal = new Button("Salir");


GraficaV1 (String tit)
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
   
   
   g.setColor(Color.RED);
   //_____________________________________________________
      
      double a1;
      double diasCicloFisico = 0;
      double dv = 8398;
      double pi = Math.PI;
      double y = 0;

     for (double z=dv-5.0; z<=dv+5.0; z+=0.1)
      {
         
         diasCicloFisico = (Math.sin((2*pi*z)/23)); 
         //System.out.println("dia "+z+" = "+diasCicloFisico);
         
         y = diasCicloFisico*-1;
         
         xx = (int)(((2*pi*z)/23)/100)+200;
         yy = (int)(y*140)+150;
         
         System.out.println("X: "+xx+"  y = "+yy);
         
         g.fillRect(xx+xc,yy,4,4);
      } 

    
   //____________________________________________________
}

public static void main (String ar[])
{
   GraficaV1 ap = new GraficaV1("Prueba Gráfica de la función seno");
   ap.resize(600,400);
   ap.show();
}

}