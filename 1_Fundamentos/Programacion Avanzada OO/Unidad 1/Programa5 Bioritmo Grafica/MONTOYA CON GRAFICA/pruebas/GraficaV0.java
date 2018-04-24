import java.awt.*;

public class GraficaV0 extends Frame
{
   int coordenadaX,coordenadaY;
   double y;
   int escala = 80;
   
   GraficaV0 (String tit)
   {
      super(tit);
      setLayout(new FlowLayout(3));
   }

   public void paint(Graphics g)
   {
      int puntoInicial = 100;
      //ejex
      g.drawLine(puntoInicial,150,450,150);
      //eje y
      g.drawLine(puntoInicial,40,puntoInicial,260);
      
      
      g.setColor(Color.BLUE);
      for (double x=-1.0; x<=1.0; x+=0.01)
      {
         y = Math.sin(x)*-1;
         

                  
         coordenadaX = (int)(x*escala/2)+200;
         coordenadaY = (int)(y*escala)+150;
         
         System.out.println("\n\nx = "+coordenadaX);
         System.out.println("y = "+coordenadaY);
         
         g.fillRect(coordenadaX+puntoInicial,coordenadaY,4,4);
      }
}

public static void main (String ar[])
{
   GraficaV0 ap = new GraficaV0("Prueba Gráfica de la función seno");
   ap.resize(600,400);
   ap.show();
}

}