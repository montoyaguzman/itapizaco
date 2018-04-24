import java.applet.*;
import java.awt.*;

public class CargarImagen2 extends Applet{
   Image img;
   int iw,ih;
   
   public void init(){
      img = getImage(getCodeBase(),"imagenes/pokemon.gif");
   }
   
   public void init(Graphics g){
      iw = img.getWidth(this);
   }
   
   public void paint(Graphics g){
      iw = img.getWidth(this);
      ih = img.getHeight(this);
      g.drawString("Squirtle!!!",150,30);
      g.drawImage(img,10,40,this);
      g.drawImage(img,600,40,iw/2,ih/2,this);
   }
}