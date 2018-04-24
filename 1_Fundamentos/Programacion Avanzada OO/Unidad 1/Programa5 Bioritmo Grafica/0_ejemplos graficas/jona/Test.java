package newpackage1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import newpackage.Graficacion2;

class Test extends JFrame{

    public static int TamX, TamY;
    public static Dimension Tamano;
    public static Graphics g;

    public Test(){
        setSize(600, 600);
        setResizable(false);
        setVisible(true);
        Grafica();
    }
    
    public void paint(Graphics gr) {
        g = gr.create();
        Tamano = getSize();
        TamX = Tamano.width;
        TamY = Tamano.height;
        g.drawLine(0, (int) TamY / 2, TamX, (int) TamY / 2);
        g.drawLine((int) TamX / 2, 0, (int) TamX / 2, TamY);
        g.setFont (new Font("TimesRoman", Font.BOLD, 16));
        g.setColor(Color.red);
        g.drawString("Emocional",10,540);
        g.setColor(Color.blue);
        g.drawString("Fisico",10,560);
        g.setColor(Color.MAGENTA);
        g.drawString("Intelectual",10,580);
    }
    
    public void Grafica() {
        double x1, y1, x2, y2, j, j2;
        int e, ini, fin;
        Graficacion2 graf = new Graficacion2();
        newpackage1.Transformacion Tr = new newpackage1.Transformacion();

        TamX = Tamano.width;
        TamY = Tamano.height;

        Tr.Xmin = -11;
        Tr.Xmax = 11;
        Tr.Ymin = -3;
        Tr.Ymax = 3;
        
        //Grafica
        g.drawLine((int) Tr.TransformarX((float) Tr.Xmin), (int) Tr.TransformarY((float) 0), (int) Tr.TransformarX((float) Tr.Xmax), (int) Tr.TransformarY((float) 0));
        g.drawLine((int) Tr.TransformarX((float) 0), (int) Tr.TransformarY((float) Tr.Ymin), (int) Tr.TransformarX((float) 0), (int) Tr.TransformarY((float) Tr.Ymax));
        Tr.Xtmin = -((int) TamX / 2);
        Tr.Xtmax = (int) TamX / 2;
        Tr.Ytmin = -(int) TamY / 2;
        Tr.Ytmax = (int) TamY / 2;
        
        Calendar fecha = new GregorianCalendar(); //228 137       // 6 dias
        int anio = fecha.get(Calendar.YEAR);
        System.out.println("El año s: "+anio);
        int mes = fecha.get(Calendar.MONTH)+1;
        System.out.println("El año s: "+mes);
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        System.out.println("El año s: "+dia);
        
        javax.swing.JOptionPane.showMessageDialog(null,"Calculo del Biorritmo");
        String anio = javax.swing.JOptionPane.showInputDialog(null,"Inserta el año de nacimiento (Ejemplo: 1994)");
        String me = javax.swing.JOptionPane.showInputDialog(null,"Inserta el mes de nacimiento (Ejemplo: 8)");
        String di = javax.swing.JOptionPane.showInputDialog(null,"Inserta el dia de nacimiento (Ejemplo: 1)");

        int a = Integer.parseInt(anio);
        int m = Integer.parseInt(me);
        int d = Integer.parseInt(di);
        
        int dias=Biorritmo.diasVida(anio,mes,dia,a,m,d);
        System.out.println(dias+"\n\n\n\n");
        dias= dias-11;
        for (int i = Tr.Xmin; i < Tr.Xmax; i++) {
            System.out.println(dias);
            j = Biorritmo.emocional(dias);
            j2= Biorritmo.emocional(dias+1);
            //j = Funcion(i);		// Aqui va la Funcion
            //j2 = Funcion(i + 1);		// a graficar
            x1 = Tr.TransformarX(i);
            y1 = Tr.TransformarY(j);
            x2 = Tr.TransformarX(i + 1);
            y2 = Tr.TransformarY(j2);
            g.setColor(Color.red);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            dias++;
        }
        
        System.out.println("-asd-as-dasd\n\n");
        
        for (int i = Tr.Xmin; i < Tr.Xmax; i++) {
            System.out.println(dias);
            j = Biorritmo.intelectual(dias);
            j2= Biorritmo.intelectual(dias+1);
            //j = Funcion(i);		// Aqui va la Funcion
            //j2 = Funcion(i + 1);		// a graficar
            x1 = Tr.TransformarX(i);
            y1 = Tr.TransformarY(j);
            x2 = Tr.TransformarX(i + 1);
            y2 = Tr.TransformarY(j2);
            g.setColor(Color.magenta);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            dias++;
        }
        
        for (int i = Tr.Xmin; i < Tr.Xmax; i++) {
            j = Biorritmo.fisico(dias);
            j2= Biorritmo.fisico(dias+1);
            //j = Funcion(i);		// Aqui va la Funcion
            //j2 = Funcion(i + 1);		// a graficar
            x1 = Tr.TransformarX(i);
            y1 = Tr.TransformarY(j);
            x2 = Tr.TransformarX(i + 1);
            y2 = Tr.TransformarY(j2);
            g.setColor(Color.blue);
            g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            dias++;
        }
    }

    public double Funcion(double x) {
        double X;
        X = Math.sin(x);
        return X;
    }
    
    public static void main (String []args){
        Test test = new Test();
    }
}
