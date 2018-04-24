import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LlamaAlumnoz extends JFrame{
  
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
   
   Alumnos[] listaA;
   int max;
   
   LLamaAlumnoz(){
      super("Formulario 2");
      Container co = getContentPane();
      co.setLayout(null);
      
      listaA = new Alumnos[10];//lista vacia
      max=0;
      nombreT = new JLabel("Nombre ");
      edadT = new JLabel("Edad ");
      estatT = new JLabel("Estatura ");
      
      nom = new JTextField(20);
      edad = new JTextField(3);
      est = new JTextField(5);
      
      co.add(nombreT);
      nombreT.setBounds(10,50,100,45);
      co.add(nom);
      nom.setBounds(120,50,300,45);
      
      co.add(edadT);
      edadT.setBounds(10,120,100,45);
      co.add(edad);
      edad.setBounds(120,120,100,45);
      
      co.add(estatT);
      estatT.setBounds(10,200,100.45);
      co.add(est);
      est.setBounds(120,200,100,45);
      
      mas=new JButton("Mas alumnos");
      co.add(mas);
      mas.setBounds(10,270,150,50);

      fin=new JButton("Salir");
      co.add(fin);
      fin.setBounds(170,270,150,50);
      
      listar=new JButton("Listar");
      co.add(Listar);
      listar.setBounds(330,210,150,50);
      
      ordenar=new JButton("Ordenar");
      co.add(ordenar);
      ordenar.setBounds(330,210,150,50);

      //LISTENERS
      mas.addActionListener{
               new ActionListener(){
                  public void actionPerformed(ActionEvent ev)
                  {
                     adiciona();
                  }
               }   
            );
            
      ordenar.addActionListener{
               new ActionListener(){
                  public void actionPerformed(ActionEvent ev)
                  {
                     ordena();
                  }
               }   
            );
            
      fin.addActionListener{
               new ActionListener(){
                  public void actionPerformed(ActionEvent ev)
                  {
                     System.exit(0);
                  }
               }   
            );            

      listar.addActionListener{
               new ActionListener(){
                  public void actionPerformed(ActionEvent ev)
                  {
                     String cad="Contenido de la lista\n";
                     for (int j=0; j<max; j++){
                        cad+="\n"+listaA[j].despliega();
                     }
                     ES.escribe(cad);
                  }
               }   
            );

     
      setSize(500,380);
      setVisible(true);
}


public void static void main (String Ar[])
{
   LLamaAlumnoz ap = new LlamaAlumnoz();
   ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

//metodos de la lista
void adiciona(){
   String nombre=nom.getText();
   int Edad=0;
   double estatura=0;
   
   if (max<10){
      try{
         Edad=(int)Integer.parseInt(edad.getText());
         estatura=(double)Double.parseDouble(est.getText());
      }
      catch (Exception e)
      {
         ES.escribe("error de numero");
      }
         listaA[max]=new Alumnos(nombre,Edad,estatura);
         max++;
         nom.setText("");
         est.setText("");
         edad.setText("");
      }
      else ES.escribe("Lista Llena");
}

void ordena()
{
   Alumnos aux;
   
   for(int j=1; j<max; j++)
   {
      for (int i=0; i<j; i++)
      {
         if(listaA[j].getEdad()<listaA[i].getEdad())
         {
            aux=listaA[j];
            listaA[j]=lista[i];
            listaA[i]=aux;
         }
      }
  }       
      





   