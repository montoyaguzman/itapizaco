/*
PROGRAMA 6
bloques de colores 
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CBox extends JPanel implements Runnable{
   
   private Thread t;
   private int pause;
   private static final Color[] colors={    
      Color.black, Color.blue, Color.cyan, 
      Color.darkGray, Color.gray, Color.green,
      Color.lightGray, Color.magenta, 
      Color.orange, Color.pink, Color.red, 
      Color.white, Color.yellow 
      };
  
  private Color cColor = newColor();
  
  private static final Color newColor(){
      return colors[(int)(Math.random()*colors.length)];
  }
  
  public void paintComponent(Graphics  g){
    super.paintComponent(g);
    g.setColor(cColor);
    Dimension s = getSize();
    g.fillRect(0, 0, s.width, s.height);
  }
  
  public CBox(int pause){
    this.pause = pause;
    t = new Thread(this);
    t.start(); 
  }
  
  public void run() {
      while(true){
         
         cColor = newColor();
         repaint();
         
         try{
            t.sleep((int) (10*pause));
         }catch(InterruptedException e){
            System.out.print(e);
         }
      } 
   }
} 

public class Hilos6 extends JFrame
{
   public Hilos6(int pause, int grid){
      
      setTitle("Cajas de colores");
      Container cp = getContentPane();
      cp.setLayout(new GridLayout(grid, grid));
      
      for (int i = 0; i < grid * grid; i++)
         cp.add(new CBox(pause));
         addWindowListener(new WindowAdapter(){
      
      public void windowClosing(WindowEvent e){
         System.exit(0);
      }
    });
}   
  
  public static void main(String[] args){
     int pause=50;
     int grid=8;
   
     if(args.length>0) 
         pause = Integer.parseInt(args[0]);
     if(args.length > 1)
         grid = Integer.parseInt(args[1]);
    
     JFrame frame = new Hilos6(pause, grid);
     frame.setSize(500, 400);
     frame.setVisible(true);  
  }

}
