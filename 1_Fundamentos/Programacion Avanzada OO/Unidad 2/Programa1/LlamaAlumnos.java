import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LlamaAlumnos extends JFrame{
   private JLabel nombreT;
   private JLabel edadT;
   private JLabel estatT;
   
   private JTextField nom;
   private JTextField edad;
   private JTextField est;
   
   private JButton mas;
   private JButton fin;
   private JButton listar;
   private JButton ordenar;
   
   ArrayList listaA;
   
   LlamaAlumnos()
   {
      super("Formulario 1");
      Container co=getContentPane();
      co.setLayout(null);
      
      listaA=new ArrayList();//lista vacia
      
      nombreT=new JLabel("Nombre ");
      edadT=new JLabel("Edad ");
      estatT=new JLabel("Estatura ");
      
      nom=new JTextField(20);
      edad=new JTextField(3);
      est=new JTextField(5);
      
      co.add(nombreT);
      nombreT.setBounds(10,50,100,45);
      co.add(nom);
      nom.setBounds(120,50,300,45);
      
      co.add(edadT);
      edadT.setBounds(10,50,100,45);
      co.add(edad);
      edad.setBounds(120,120,100,45);
      
      co.add(estatT);
      estatT.setBounds(10,200,100,45);
      est.setBounds(120,200,100,45);
      
      mas=new JButton("Mas alumnos");
      co.add(mas);
      mas.setBounds(10,270,150,50);
      
      fin=new JButton("Salir");
      co.add(fin);
      fin.setBounds(170,270,150,50);
      
      ordenar=new JButton("Ordenar");
      co.add(ordenar);
      ordenar.setBounds(330,210,150,50);
      
      mas.addActionListener(
               new ActionListener(){
                  public void actionPerformed(ActionEvent ev)
                  {
                     adiciona();
                  }
               }
           );    
      

      ordenar.addActionListener(
               new ActionListener(){
                  public void actionPerformed(ActionEvent ev)
                  {
                     //listaA.sort(0);
                  }
               }
           );
      
      fin.addActionListener(
               new ActionListener(){
                  public void actionPerformed(ActionEvent ev)
                  {
                     System.exit(0);
                  }
              }
           );      
      listar.addActionListener(
               new ActionListener(){
                  public void actionPerformed(ActionEvent ev)
                  {
                     Alumnos ov;
                     String cad="Contenido de la lista \n";
                     for (int j=0; j<listaA.size(); j++){
                        ov=(Alumnos)listaA.get(j);
                        cad+="\n"+ov.despliega();
                     }
                     ES.escribe(cad);
                  }
               }
          );  
      setSize(500,380);
      setVisible(true);
   }
   
   public static void main (String Ar[])
   {
      LlamaAlumnos ap = new LlamaAlumnos();
      ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   //metodos de la lista
   void adiciona(){
      String nombre=nom.getText();
      int Edad=0;
      double estatura=0;
      try{
         Edad=(int)Integer.parseInt(edad.getText());
         estatura=(double)Double.parseDouble(est.getText());
      }catch (Exception e){
         ES.escribe("Error de numero");
      }
      Alumnos ob=new Alumnos(nombre,Edad,estatura);
      listaA.add(ob);
   }

}



