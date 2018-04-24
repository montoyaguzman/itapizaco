import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LLamaAlumnos extends JFrame {

   private JLabel etiquetaNombre;
   private JLabel etiquetaApellido;
   private JLabel etiquetaEdad;
   private JLabel etiquetaEstatura;
   private JLabel etiquetaPeso;
   private JLabel etiquetaGenero;
   private JLabel etiquetaTelefono;
   private JLabel etiquetaCorreo;
   
   private JTextField nombre;
   private JTextField apellido;
   private JTextField edad;
   private JTextField estatura;
   private JTextField peso;
   private JTextField genero;
   private JTextField telefono;
   private JTextField correo;

   private JButton agregar;
   private JButton borrar;
   private JButton editar;
   private JButton listar;
   private JButton ordenar;
   private JButton salir;
   
   AlumnosA[] listaA;
   int max;
   
   LLamaAlumnos()
   {
      super("Agenda con arreglos");
      Container co = getContentPane();
      co.setLayout(null);
   
      listaA = new AlumnosA[3];
      max = 0;
   
      etiquetaNombre = new JLabel("Nombre: ");
      etiquetaApellido = new JLabel("Apellido: ");
      etiquetaEdad = new JLabel("Edad: ");
      etiquetaEstatura = new JLabel("Estatura: ");
      etiquetaPeso = new JLabel("Peso: ");
      etiquetaGenero = new JLabel("Genero: ");
      etiquetaTelefono = new JLabel("Telefono: ");
      etiquetaCorreo = new JLabel("Correo: ");
      
      nombre = new JTextField(20);
      apellido = new JTextField(20);
      edad = new JTextField(5);
      genero = new JTextField(5);
      estatura = new JTextField(5);
      peso = new JTextField(5);
      telefono = new JTextField(10);
      correo = new JTextField(30);
      
      
      //AGREGAR ELEMENTOS AL JFRAME
      co.add(etiquetaNombre);
      etiquetaNombre.setBounds(10,10,100,25);
      co.add(nombre);
      nombre.setBounds(80,10,150,25);
      
      co.add(etiquetaApellido);
      etiquetaApellido.setBounds(10,50,100,25);
      co.add(apellido);
      apellido.setBounds(80,50,150,25);
      
      co.add(etiquetaEdad);
      etiquetaEdad.setBounds(10,90,100,25);
      co.add(edad);
      edad.setBounds(80,90,50,25);
      
      co.add(etiquetaGenero);
      etiquetaGenero.setBounds(10,130,100,25);
      co.add(genero);
      genero.setBounds(80,130,150,25);
   
      co.add(etiquetaEstatura);
      etiquetaEstatura.setBounds(10,170,100,25);
      co.add(estatura);
      estatura.setBounds(80,170,100,25);
      
      co.add(etiquetaPeso);
      etiquetaPeso.setBounds(10,210,100,25);
      co.add(peso);
      peso.setBounds(80,210,100,25);
           
      co.add(etiquetaTelefono);
      etiquetaTelefono.setBounds(10,250,100,25);      
      co.add(telefono);
      telefono.setBounds(80,250,150,25);
      
      co.add(etiquetaCorreo);
      etiquetaCorreo.setBounds(10,290,100,25);
      co.add(correo);
      correo.setBounds(80,290,150,25);
      
      //BOTONES   
      agregar = new JButton("Agregar");
      co.add(agregar);
      agregar.setBounds(300,10,130,30);
      
      borrar = new JButton("Borrar");
      co.add(borrar);
      borrar.setBounds(300,50,130,30);
      
      /*editar = new JButton("Editar");
      co.add(editar);
      editar.setBounds(300,90,130,30);
      */
      ordenar = new JButton("Ord x edad");
      co.add(ordenar);
      ordenar.setBounds(300,130,130,30);
      
      listar = new JButton("Listar");
      co.add(listar);
      listar.setBounds(300,170,130,30);
      
      salir = new JButton("Salir");
      co.add(salir);
      salir.setBounds(300,210,130,30);
     

//____________________________________________________LISTENERS_____________________________________________________
      
      //AGREGAR
      agregar.addActionListener(
         new ActionListener(){
            public void actionPerformed (ActionEvent ev)
            {
               adiciona();
            }
         }
      );
      
      //ELIMINAR
      borrar.addActionListener(
         new ActionListener(){
            public void actionPerformed (ActionEvent ev)
            {
               borra();
            }
         }
      );
      
      //EDITAR
      /*editar.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent ev)
            {
               edita();
            }
         }
      );*/
      
      //LISTAR
      listar.addActionListener(
         new ActionListener(){
            public void actionPerformed (ActionEvent ev)
            {
               String cad="contenido de la lista \n";
               for (int j = 0; j < max; j++){
                  cad+="\n"+listaA[j].despliega();
               }
               ES.escribe(cad);
            }
         }
      );
      
      //ORDENAR
      ordenar.addActionListener(
         new ActionListener(){
            public void actionPerformed(ActionEvent ev)
            {
               ordena();
            }
         }
      );
         
      //SALIR   
      salir.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               System.exit(0);
            }
         }
      );      
      setSize(500,400);
      setVisible(true);
   }
   
   //___________________MAIN___________________________
   public static void main (String Ar[])
   {
      LLamaAlumnos ap = new LLamaAlumnos();
      ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   
   void adiciona(){
 
      String nombrev = nombre.getText();
      String apellidov = apellido.getText();
      int edadv = 0;
      String generov = genero.getText();
      double estaturav = 0;
      int pesov = 0;
      String telefonov = telefono.getText();
      String correov = correo.getText();
     
      
         if (max<10){         
            try{
               edadv = (int)Integer.parseInt(edad.getText());
               estaturav = (double)Double.parseDouble(estatura.getText());
               pesov = (int)Integer.parseInt(peso.getText());
            }
            catch (Exception e){ 
               ES.escribe("error de numero");
            }
            
               listaA[max] = new AlumnosA(nombrev, apellidov, edadv, generov, estaturav, pesov, telefonov, correov);
               max++;
               
               nombre.setText("");
               apellido.setText("");
               edad.setText("");
               genero.setText("");
               estatura.setText("");
               peso.setText("");
               telefono.setText("");
               correo.setText("");
         }
         else ES.escribe("Lista llena");
   }
   
   /*void borra(){
      String nombre1 = JOptionPane.showInputDialog(null, "Ingresa nombre a eliminar");
      for (int j = 0; j < max; j++){
         for(int i = 0; i < 7; i++)
            if(listaA[j].getNombre().equals(nombre1))
            {
               System.out.println("HOLA");
               listaA[j]=null;
               max--;
               break;     
            }
      }   
   }*/

//____________________   
   void borra(){
      int pos = -1;
      
      String nombre1 = JOptionPane.showInputDialog(null, "Ingresa nombre a eliminar");
      for (int j = 0; j < max; j++){
         for(int i = 0; i < 7; i++)
            if(listaA[j].getNombre().equals(nombre1))
            {
               System.out.println("HOLA");
               listaA[j]=null;
               pos = j;
               break;     
            }
      }
      
      //reordena
      for (int i = pos; i < max - 1; i++)
      {
         listaA[i] = listaA[i+1];
      }
         max--;   
   }
//____________________
   
   void ordena(){ 
      AlumnosA aux;
      
      for (int j = 0; j < max; j++){
         for(int i = 0; i < j; i++)
            if(listaA[j].getEdad() < listaA[i].getEdad())
            {
               aux = listaA[j];
               listaA[j] = listaA[i];
               listaA[i] = aux;     
            }
      }     
   }
   
   /*void edita(){
      String nombre1 = JOptionPane.showInputDialog(null, "Ingresa nombre a buscar");
      for (int j = 0; j < max; j++){
         for(int i = 0; i < 7; i++)
            if(listaA[j].getNombre().equals(nombre1))
            {
               nombre.setText(listaA[j].getNombre());        
               apellido.setText(listaA[j].getApellido());
               edad.setText(Integer.parseInt(listaA[j].getEdad()));
               genero.setText(listaA[j].getGenero());
               estatura.setText(Double.parseDouble(listaA[j].getEstatura()));
               peso.setText(Integer.parseInt(listaA[j].getPeso()));
               telefono.setText(listaA[j].getTelefono());
               correo.setText(listaA[j].getCorreo());
               break;
            }
      }
   }*/
   
   /*void actulizar(){
      //1. Hacer un getText de cada campo
      //2. buscar el elemento en el arrayr
      //4. Setear los nuevos valores
   }
   */
   
}