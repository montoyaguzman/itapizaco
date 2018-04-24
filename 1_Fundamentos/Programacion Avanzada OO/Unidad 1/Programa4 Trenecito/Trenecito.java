import java.awt.*;
import java.applet.*;

public class Trenecito extends Applet
{  
   public void init()
   {
     //setBackground(Color.YELLOW);
     setSize(900,600);
   }  
   public void paint (Graphics g)
	{
      //CARROSERIA
      g.setColor(Color.WHITE);
      /*frente*/g.fillArc(300,220,155,170,90,-180);
      g.setColor(Color.BLACK);
      g.drawArc(300,220,155,170,90,-180);
      g.setColor(Color.RED);
      g.fillRoundRect(55,220,370,170,40,40);
      g.setColor(Color.BLACK);
      g.drawRoundRect(55,220,370,170,40,40);
      
      //LLANTA1
      g.setColor(Color.GRAY);
      g.fillOval(50,350,120,128);
      g.setColor(Color.BLACK);
      g.drawOval(50,350,120,128);
      
      //LLANTA2
      g.setColor(Color.BLUE);
      g.fillOval(150,360,110,118);
      g.setColor(Color.BLACK);
      g.drawOval(150,360,110,118);
      
      //LLANTA3
      g.setColor(Color.YELLOW);
      g.fillOval(240,380,90,98);
      g.setColor(Color.BLACK);
      g.drawOval(240,380,90,98);      
      
      //TUERCAS
      g.setColor(Color.BLACK);
      g.fillOval(105,409,10,10);
      g.fillOval(195,414,10,10);
      g.fillOval(280,419,10,10);
      
      //CHIKICHI
      g.setColor(Color.GREEN);
      g.fillRoundRect(120,290,200,100,40,40);
      g.setColor(Color.BLACK);
      g.drawRoundRect(120,290,200,100,40,40);
           
      //NARIZ
      g.setColor(Color.YELLOW);
      g.fillOval(375,250,40,30);
      g.setColor(Color.BLACK);
      g.drawOval(375,250,40,30);
      
      //BOCA
      g.setColor(Color.YELLOW);
      g.fillArc(345,280,70,70,180,180);
      g.setColor(Color.BLACK);
      g.drawArc(345,280,70,70,180,180);
      g.drawLine(345,315,415,315);
      
      //RESPALDO
      g.setColor(Color.RED);
      g.fillRect(60,120,250,120);
      
      //CABINA
      g.setColor(Color.YELLOW);
      g.fillRoundRect(110,135,80,85,25,25);
      g.setColor(Color.BLACK);
      g.drawRoundRect(110,135,80,85,25,25);
      
      g.setColor(Color.YELLOW);
      g.fillRoundRect(190,135,105,85,25,25);
      g.setColor(Color.BLACK);
      g.drawRoundRect(190,135,105,85,25,25);
      
      //CEJAS
      g.drawArc(220,174,15,15,15,155);
      g.drawArc(220,175,15,15,15,155);
      g.drawArc(220,176,15,15,15,155);
      g.drawArc(245,174,15,15,15,155);
      g.drawArc(245,175,15,15,15,155);
      g.drawArc(245,176,15,15,15,155);
      
      //OJOS
      g.fillOval(220,185,15,15);
      g.fillOval(245,185,15,15);
      
      //PARTE SUPERIOR
      g.setColor(Color.BLUE);
      g.fillRoundRect(185,90,160,30,20,40);
      g.setColor(Color.BLACK);
      g.fillRoundRect(30,90,180,30,20,40);
      
      //NARIZ 2
      g.setColor(Color.YELLOW);
      g.fillArc(280,200,50,50,180,-180);
      g.setColor(Color.BLACK);
      g.drawArc(280,200,50,50,180,-180);
      g.drawLine(280,225,330,225);
   
      //g.drawLine(500,350,600,200);
      
      //CHIMENEA
      g.setColor(Color.GRAY);
      g.fillRoundRect(362,70,40,150,10,10);
      
      //HUMO
      g.fillOval(362,25,40,25);
      g.fillOval(410,10,40,25);
      g.fillOval(465,5,40,25);
      g.setColor(Color.BLACK);
      g.drawOval(362,25,40,25); 
      g.drawOval(410,10,40,25);
      g.drawOval(465,5,40,25);     
   
      //VIAS
      g.fillRect(20,480,750,5);
      g.fillRect(20,490,750,5);
      
      //NOMBRE
      Font letrero = new Font("SansSerif", Font.BOLD,18);
		g.setFont(letrero);
      
      g.drawString("Materia: Programación Avanzada xD", 500, 100);
      g.drawString("Catedrático: M.C. José Juan Hernández Mora", 500, 130);
      g.drawString("Alumno: José Montoya Guzmán", 500, 160);
      
      g.setColor(Color.RED);
      g.drawString("Este es mi trenecito..!!", 500, 220);
      
   }
}	
