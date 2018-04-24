import java.awt.*;
import java.applet.*;

public class Figuras extends Applet
{
	public void init()
   {
     setBackground(Color.GRAY);
   }
   
   public void paint (Graphics g)
	{
		//setBackground(Color.BLACK);
      
      int xs[] = {70,240,30};
		int ys[] = {500,320,320};		
		//int ys[] = {400,520,520};
      
      //Dibuja linea
      g.setColor(Color.YELLOW);
      g.drawLine(100,20,200,200);
      //PARAMETOS (posx,posy,tamx, tamañoy)      
      
      //Dibuja cadena
      g.setColor(Color.PINK);
		g.drawString("Hola mundo",300,25);
      //Dibuja cuadrado
      g.setColor(Color.BLUE);
      g.fillRect(10,50,80,80);
      //Dibuja rectangulo sin esquinas
      
      
      //RECTANGULO
      g.setColor(new Color(100,90,60));
      g.fillRoundRect(10,150,80,80,15,15);
      
      
      //Dibuja ovalo
      g.setColor(Color.RED);
      g.fillOval(110,50,60,90);
      
		
		for (int j=0; j<=200; j+=7)
		g.drawLine(200+j,50,400-j,150);
		g.setColor(Color.RED);
		
      
      g.drawArc(110,50,80,80,180,180);
		g.setColor(Color.RED);
		g.fillArc(210,160,80,80,45,270);
		
      //TRIANGULO
      g.setColor(Color.GREEN);	
//		g.fillPolygon(xs,ys,xs.length);
      g.fillPolygon(xs,ys,xs.length);
	}
}	


//Dibujar nuestro super heroe favorito
