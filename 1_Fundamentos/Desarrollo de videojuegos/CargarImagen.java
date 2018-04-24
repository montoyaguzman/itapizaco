import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JApplet;

public class CargarImagen extends JApplet
{
   private ImageIcon imagen;//imagen tipo icono
   
   //permite que se cargue la imagen al cargarse el applet
   public void init()
   {
      resize(400,400);//Redimensionar tamano applet
      imagen = new ImageIcon("imagenes/spiderman.jpg");
   }
   
   //Metodo para mostrar la imagen
   public void paint(Graphics g)
   {
      super.paint(g);
      //dibuja un icono usando metodo paintIcon
      imagen.paintIcon(this, g, 0 , 0);//dibuja la imagen en el applet
   }
}