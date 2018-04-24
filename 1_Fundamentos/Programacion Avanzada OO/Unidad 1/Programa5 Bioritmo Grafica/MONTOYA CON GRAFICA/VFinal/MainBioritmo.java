import java.awt.*;
import javax.swing.*;

public class MainBioritmo extends JFrame
{
   int xx,yy;
   double y;
   int xc = 50;
   int escala = 80;
   String mensaje;
   boolean bandera = false;
   double diaNacimiento,mesNacimiento,anioNacimiento, diasVividos = 0;
   String diasVividosC;
   int dv;
   double dv1,dv2,dv3;
   double pi = Math.PI;

   //labels
   Label titulo = new Label ("Calculadora de Bioritmo");
   Label cadenaDia = new Label ("Dia: ");
   Label cadenaMes = new Label ("Mes: ");
   Label cadenaAnio = new Label ("Año: ");   
   //campos
   TextField diaN = new TextField(20);
   TextField mesN= new TextField(20);
   TextField anioN= new TextField(20);
   //botonones
   Button calcular = new Button("Calcular");
   Button salir = new Button("Salir");
   //cadenas
   Font letrero = new Font("SansSerif", Font.BOLD,18);
      
   MainBioritmo (String tit)
   {
      super(tit);
      setLayout(new FlowLayout(3));
      add(titulo);
      //
      add(cadenaDia);
      add(diaN);
      //
      add(cadenaMes);
      add(mesN);
      //
      add(cadenaAnio);
      add(anioN);
      //
      add(calcular);
      add(salir);
   }

   public boolean action(Event ev, Object ar)
   {
      if (ev.target == calcular)
      {
         try
         {
            bandera=true;
            diaNacimiento = Double.parseDouble(diaN.getText());
            mesNacimiento = Double.parseDouble(mesN.getText());
            anioNacimiento = Double.parseDouble(anioN.getText());
            Operaciones o = new Operaciones();
            diasVividos = o.calculaDiasVividos(diaNacimiento,mesNacimiento,anioNacimiento);
            repaint();
         }
         catch(Exception e)
         {
            System.out.print(e);
         }
      }
      else if (ev.target == salir)
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

   public void update (Graphics g) 
   { 
      paint(g);
   }

   public void paint(Graphics g)
   {
      dv = (int)diasVividos;
           
      //PLANO    
      g.fillRect(0,350,1370,4);
      g.fillRect(650,80,4,800);
      
      g.setColor(Color.BLACK);
      g.drawString("Bioritmo Fisico",15,635);
      g.drawString("Bioritmo Emocional",15,675);
      g.drawString("Bioritmo Intelectual",15,655); 
      
      //CURVA CICLO FISICO
      g.setColor(Color.BLUE);
      g.fillRect(110,630,230,5);
      dv1 = diasVividos%23;
      for(double x=dv1-20; x<=dv1+40; x+=0.01)
      {               
         y=(x*2*Math.PI)/23;
         y=Math.sin(y); 
         y=y*-1;
         //System.out.println("X --> "+x+"    Y -->"+y);
         xx=(int)(x*40)+150;
         yy=(int)(y*100)+300;
         g.fillRect(xx+xc,yy,2,2);           
      }
      
      //CURVA CICLO EMOCIONAL
      g.setColor(Color.RED);
      g.fillRect(140,670,205,5);
      dv2 = diasVividos%28;
      for(double x=dv2-20; x<=dv2+40; x+=0.01)
      {               
         y=(x*2*Math.PI)/28;
         y=Math.sin(y); 
         y=y*-1;        
         //System.out.println("X --> "+x+"    Y -->"+y);
         xx=(int)(x*40)+150;
         yy=(int)(y*100)+300;
         g.fillRect(xx+xc,yy,2,2);           
      }
      
      //CURVA CICLO INTELECTUAL
      g.setColor(Color.GREEN);
      g.fillRect(140,650,200,5);
      dv3 = diasVividos%33;
      System.out.println("HEYYY --> "+dv3);
      for(double x=dv3-20; x<=dv3+40; x+=0.01)
      {               
         y=(x*2*Math.PI)/33;
         y=Math.sin(y); 
         y=y*-1;      
         //System.out.println("X --> "+x+"    Y -->"+y);
         xx=(int)(x*40)+150;
         yy=(int)(y*100)+300;
         System.out.println("X --> "+xx+"    Y -->"+yy);
         g.fillRect(xx+xc,yy,2,2);           
      }
      
      //ETIQUETA
      g.setColor(Color.BLACK);
      g.drawRect(900,500,500,150);
      g.drawRect(901,501,500,150);
      g.drawRect(902,502,500,150);
      g.drawString("Dias vividos:  "+dv,910,530);
      g.drawString("Dia actual ciclo fisico:  "+dv1+"  Valor:"+Math.sin((2*pi*diasVividos)/23),910,545);
      g.drawString("Dia actual ciclo emocional:  "+dv2+"  Valor:"+Math.sin((2*pi*diasVividos)/28),910,560);
      g.drawString("Dia actual ciclo intelectual:  "+dv3+"  Valor:"+Math.sin((2*pi*diasVividos)/33),910,575);
      g.drawString("Materia: Programación Avanzada O.O",910,600);
      g.drawString("M.C. José Juan Hernández Mora",910,615);
      g.drawString("Alumno : José Montoya Guzmán",910,630);
   }
   
   public static void main (String ar[])
   {
      MainBioritmo ap = new MainBioritmo("Bioritmo");
      ap.resize(1370,720);
      ap.show();
   }

}