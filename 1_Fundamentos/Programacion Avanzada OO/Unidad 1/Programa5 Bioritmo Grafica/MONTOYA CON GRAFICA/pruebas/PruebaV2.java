import java.awt.*;

public class PruebaV2 extends Frame
{
   int xx,yy;
   double y;
   int esc = 80;
   Button sal = new Button("Salir");
   Button cambiar = new Button("CAMBIAR");
   
   /**/
   TextField campo = new TextField(40);
   Label mes = new Label("Saludame programador");   
   
   /**/
   
   Font letrero = new Font("SansSerif", Font.BOLD,18);
   int dias = 0;
   String saludo;
   String text;
   boolean bandera = false;
   
   

PruebaV2 (String tit)
{
   super(tit);
   setLayout(new FlowLayout(3));
   add(sal);
   add(cambiar);
   add(campo);
   add(mes);
}

public boolean action(Event ev, Object ar)
{
   int a,b,c;
   //if (ev.target instanceof Button)
   if (ev.target == cambiar)
   {
      bandera = true;
      text = mes.getText();
      saludo = text;
      repaint();
   }
   else if (ev.target == sal){
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

   public void update (Graphics g) 
   { 
      paint(g);
   }

public void paint(Graphics g)
{
   /*int xc = 100;
   g.drawLine(xc,150,450,150);
   g.drawLine(xc,40,xc,260);
   
   
   g.setColor(Color.BLUE);
   for (double x=-5.0; x<=5.0; x+=0.01)
   {
      y = Math.sin(x)*(-1);
      xx = (int)(x*esc/2)+200;
      yy = (int)(y*esc)+150;
      g.fillRect(xx+xc,yy,2,2);
   }*/
   
      g.setFont(letrero);
 		if(bandera==false)
         g.drawString("No se saludar", 500, 100);
      if(bandera==true)
         g.drawString(text, 500, 100);
}



public static void main (String ar[])
{
   PruebaV2 ap = new PruebaV2("Prueba Gráfica de la función seno");
   ap.resize(600,400);
   ap.show();
}

}