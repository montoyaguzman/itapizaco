import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Dimension;

public class CanvasExt extends Canvas
{
   public Image imagen = null;
   public int imgLx = -1;
   public int imgLy = -1;

   public CanvasExt( ) { super(); }

   public void paint( Graphics g )
   {
      if( imagen == null ) {
        super.paint(g);
      } else {
        g.drawImage(imagen,0,0,this);
      }
   }

   public void update( Graphics g ) { paint(g); }

   public void dibujar( )
   {
      Graphics g = getGraphics();
      paint(g);
   }

   public void compruebaImagen( )
   {
      Dimension d = getSize();
      if( (imagen == null) || (d.width != imgLx) || (d.height != imgLy) ) {
        imgLx = d.width;
        imgLy = d.height;
        imagen = createImage(imgLx,imgLy);
      }
   }
}