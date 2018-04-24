import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

public class LLamaAlumnos extends JFrame{
 
   Alumnos alumno1 = new Alumnos();
   int idv=1;
   String nombrev="";
   String apellidov="";
   int edadv=0;
   double estaturav=0.0;
   int pesov=0;
   String generov="";
   String telefonov="";
   String correov="";

   int max;
   ArrayList listaA;
   
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
   private JComboBox comboGenero;
   private JTextField telefono;
   private JTextField correo;

   private JButton agregar;
   private JButton borrar;
   private JButton editar;
   private JButton actualizar;
   private JButton listar;
   private JButton ordenarNombres;
   private JButton ordenarEdades;
   private JButton buscarNombre;
   private JButton buscarTelefono;
   private JButton salir;   
   private JButton leerArchivo;
   private JButton guardarArchivo;
   
   LLamaAlumnos()
   {
      super("Agenda de contactos");
      Container co=getContentPane();
      co.setLayout(null);
      
      setSize(750,720);
      setVisible(true);
      
      listaA=new ArrayList();
      max=0;
      
      etiquetaNombre=new JLabel("Nombre: ");
      etiquetaApellido=new JLabel("Apellido: ");
      etiquetaEdad=new JLabel("Edad: ");
      etiquetaEstatura=new JLabel("Estatura: ");
      etiquetaPeso=new JLabel("Peso: ");
      etiquetaGenero=new JLabel("Genero: ");
      etiquetaTelefono=new JLabel("Telefono: ");
      etiquetaCorreo=new JLabel("Correo: ");
      
      
      nombre=new JTextField(20);
      apellido=new JTextField(40);
      edad=new JTextField(3);
      estatura=new JTextField(5);
      peso=new JTextField(2);
      comboGenero=new JComboBox();
      telefono=new JTextField(10);
      correo=new JTextField(30);
      
   
      //_____________________________________ETIQUETAS Y CAMPOS____________________________________________________

      co.add(etiquetaNombre);
      etiquetaNombre.setBounds(10,50,100,45);
      co.add(nombre);
      nombre.setBounds(120,50,300,45);
      
      co.add(etiquetaApellido);
      etiquetaApellido.setBounds(10,120,100,45);
      co.add(apellido);
      apellido.setBounds(120,120,300,45);
      
      co.add(etiquetaEdad);
      etiquetaEdad.setBounds(10,200,100,45);
      co.add(edad);
      edad.setBounds(120,200,100,45);
   
      co.add(etiquetaEstatura);
      etiquetaEstatura.setBounds(10,280,100,45);
      co.add(estatura);
      estatura.setBounds(120,280,100,45);
      
      co.add(etiquetaPeso);
      etiquetaPeso.setBounds(10,360,100,45);
      co.add(peso);
      peso.setBounds(120,360,100,45);
      
      co.add(etiquetaGenero);
      etiquetaGenero.setBounds(10,440,100,45);
      co.add(comboGenero);
      comboGenero.setBounds(120,440,100,45);
      comboGenero.addItem("Femenino");
      comboGenero.addItem("Masculino");
      comboGenero.addItem("Otro");
     
      co.add(etiquetaTelefono);
      etiquetaTelefono.setBounds(10,520,100,45);      
      co.add(telefono);
      telefono.setBounds(120,520,100,45);
      
      co.add(etiquetaCorreo);
      etiquetaCorreo.setBounds(10,600,100,45);
      co.add(correo);
      correo.setBounds(120,600,300,45);
         
      // INSTANCIANDO BOTONES
      agregar=new JButton("Agregar");
      co.add(agregar);
      agregar.setBounds(440,50,200,50);
      
      borrar=new JButton("Borrar");
      co.add(borrar);
      borrar.setBounds(440,110,200,50);
      
      editar=new JButton("Editar");
      co.add(editar);
      editar.setBounds(440,170,85,50);
      
      actualizar=new JButton("Actualizar");
      co.add(actualizar);
      actualizar.setBounds(530,170,110,50);
      
      listar=new JButton("Listar");
      co.add(listar);
      listar.setBounds(440,230,200,50);
      
      ordenarNombres=new JButton("Ordena de la A-Z");
      co.add(ordenarNombres);
      ordenarNombres.setBounds(440,290,200,50);
      
      ordenarEdades=new JButton("Ordena por Edad");
      co.add(ordenarEdades);
      ordenarEdades.setBounds(440,350,200,50);
      
      buscarNombre=new JButton("Buscar x nombre");
      co.add(buscarNombre);
      buscarNombre.setBounds(440,410,200,50);
      
      buscarTelefono=new JButton("Buscar x Telefono");
      co.add(buscarTelefono);
      buscarTelefono.setBounds(440,470,200,50);  
                
      salir=new JButton("Salir");
      co.add(salir);
      salir.setBounds(440,530,200,50);
     
      leerArchivo=new JButton("Leer Archivo");
      co.add(leerArchivo);
      leerArchivo.setBounds(440,590,200,30);      

      guardarArchivo=new JButton("Guardar Archivo");
      co.add(guardarArchivo);
      guardarArchivo.setBounds(440,630,200,30);
      
     
   /*___________________________________ LISTENERS ___________________________________*/     
      
      agregar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               agrega();
            }
         }
      );
      
      borrar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               borra();
            }
         }
      );
      
      editar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               edita();
            }
         }
      );   
      
      actualizar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               actualiza();
            }
         }
      );

      listar.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev){ 
               lista();     
            }
         }
      );
         
      ordenarNombres.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               ordenaNombres();
            }
         }
      );
         
      ordenarEdades.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               ordenaEdades();
            }
         }
      );
      
      buscarNombre.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               buscaNombre();
            }
         }
      );

      buscarTelefono.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               buscaTelefono();
            }
         }
      );      
      
      salir.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               System.exit(0);
            }
         }
      );
     
      leerArchivo.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               try{
                  leeDatos();
               }
               catch(ClassNotFoundException ec){
               
               }
               catch(IOException ie){
               
               }   
            }
         }
      );

      guardarArchivo.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               guardaDatos();
            }
         }
      );
   }   
      
   //MAIN
   public static void main (String Ar[]){
      LLamaAlumnos ap=new LLamaAlumnos();
      ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   
   

   void agrega(){   

      for (int j=1; j<listaA.size(); j++){
         alumno1=(Alumnos)listaA.get(j);
         if (alumno1.get_Id()==(idv)){
            idv++;
         }
      }      
      
      nombrev=nombre.getText();
      apellidov=apellido.getText();
      edadv=(int)Integer.parseInt(edad.getText());
      estaturav=(double)Double.parseDouble(estatura.getText());
      pesov=(int)Integer.parseInt(peso.getText());
      generov=(String)comboGenero.getSelectedItem();
      telefonov=telefono.getText();        
      correov=correo.getText();
      
      //System.out.println(idv);      
      alumno1=new Alumnos(idv,nombrev,apellidov,edadv,estaturav,pesov,generov,telefonov,correov);
      listaA.add(alumno1);
      max++;
      idv++;
      
      Collections.sort(listaA,
         new Comparator<Alumnos>() {
            @Override
             public int compare(Alumnos p1, Alumnos p2) {
               return new Integer(p1.get_Id()).compareTo(new Integer(p2.get_Id()));
            }
         });
      ES.escribe("Objeto agregado exitosamente!!");      
      nombre.setText("");
      apellido.setText("");
      edad.setText("");
      estatura.setText("");
      peso.setText("");
      comboGenero.setSelectedIndex(0);
      telefono.setText("");
      correo.setText("");
            
   }
   
   void borra(){
      idv = (int)Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Id a eliminar"));
      for (int j=0; j<listaA.size(); j++){
         alumno1=(Alumnos)listaA.get(j);
         if ((alumno1.get_Id())==idv){
            listaA.remove(alumno1);
            max--;
            ES.escribe("Objeto eliminado exitosamente!!");
         }
      }
   }   
   
   void edita(){
      idv = (int)Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa ID de contacto que deseas editar"));
      for (int j=0; j<listaA.size(); j++){
         alumno1=(Alumnos)listaA.get(j);
         if ((alumno1.get_Id())==idv){
            nombre.setText(alumno1.get_Nombre());
            apellido.setText(alumno1.get_Apellido());
            edad.setText(String.valueOf(alumno1.get_Edad()));
            estatura.setText(String.valueOf((alumno1.get_Estatura())));
            peso.setText(String.valueOf(alumno1.get_Peso()));
            comboGenero.setSelectedItem(String.valueOf(alumno1.get_Genero()));
            telefono.setText(String.valueOf(alumno1.get_Telefono()));
            correo.setText(alumno1.get_Correo());     
         }
      }
   }   
   
   void actualiza(){
         
      //Alumnos obt;
      nombrev=nombre.getText();
      apellidov=apellido.getText();
      edadv=(int)Integer.parseInt(edad.getText());
      estaturav=(double)Double.parseDouble(estatura.getText());
      pesov=(int)Integer.parseInt(peso.getText());
      generov=(String)comboGenero.getSelectedItem();
      telefonov=telefono.getText();  
      String correov=correo.getText();
      
      try{
         nombrev=nombre.getText();
         apellidov=apellido.getText();
         edadv=(int)Integer.parseInt(edad.getText());
         estaturav=(double)Double.parseDouble(estatura.getText());
         pesov=(int)Integer.parseInt(peso.getText());
         generov=(String)comboGenero.getSelectedItem();
         telefonov=telefono.getText();        
         correov=correo.getText();
         
         System.out.println(generov);
         
      }catch(Exception e){         
         System.out.print(e);
      }
      
      Alumnos ob=new Alumnos(idv,nombrev,apellidov,edadv,estaturav,pesov,generov,telefonov,correov);
      listaA.set(idv-1,ob);
      ES.escribe("Datos del objeto actualizados exitosamente!!");
      nombre.setText("");
      apellido.setText("");
      edad.setText("");
      estatura.setText("");
      peso.setText("");
      comboGenero.setSelectedIndex(0);
      telefono.setText("");
      correo.setText("");      
   }
   
   void ordenaNombres(){
      Collections.sort(listaA,
         new Comparator<Alumnos>() {
            @Override
            public int compare(Alumnos p1, Alumnos p2) {
               return new String(p1.get_Nombre()).compareTo(new String(p2.get_Nombre()));
            }
      });
   }
   
   void ordenaEdades(){
     Collections.sort(listaA,
         new Comparator<Alumnos>() {
            @Override
             public int compare(Alumnos p1, Alumnos p2) {
               return new Integer(p1.get_Edad()).compareTo(new Integer(p2.get_Edad()));
            }
     });    
   }
   
   
   
   void buscaNombre()
   {
      nombrev = JOptionPane.showInputDialog(null, "¿A quien buscas? (Ingresa nombre)");
      for (int j=0; j<listaA.size(); j++){
         alumno1=(Alumnos)listaA.get(j);
         if ((alumno1.get_Nombre()).equals(nombrev)){
            idv=alumno1.get_Id();
            nombrev=alumno1.get_Nombre();  
            apellidov=alumno1.get_Apellido();
            edadv=alumno1.get_Edad();
            estaturav=alumno1.get_Estatura();
            pesov=alumno1.get_Peso();
            generov=alumno1.get_Genero();
            telefonov=alumno1.get_Telefono();
            correov=alumno1.get_Correo();
            
            String cad="Catalogo \n\n"+"ID: "+idv
                        +"\nNombre: "+nombrev
                        +"\nApellido: "+apellidov
                        +"\nEdad: "+edadv
                        +"\nEstatura: "+estaturav
                        +"\nPeso: "+pesov
                        +"\nGenero: "+generov
                        +"\nTelefono: "+telefonov
                        +"\nCorreo: "+correov
           ;
           ES.escribe(cad);
         }
      }
   }
   
   void buscaTelefono(){
      telefonov = JOptionPane.showInputDialog(null, "¿A quien buscas? (Ingresa telefono)");
      for (int j=0; j<listaA.size(); j++){
         alumno1=(Alumnos)listaA.get(j);
         if ((alumno1.get_Telefono()).equals(telefonov)){
            idv=alumno1.get_Id();
            nombrev=alumno1.get_Nombre();  
            apellidov=alumno1.get_Apellido();
            edadv=alumno1.get_Edad();
            estaturav=alumno1.get_Estatura();
            pesov=alumno1.get_Peso();
            generov=alumno1.get_Genero();
            telefonov=alumno1.get_Telefono();
            correov=alumno1.get_Correo();
            
            String cad="Catalogo \n\n"+"ID: "+idv
                        +"\nNombre: "+nombrev
                        +"\nApellido: "+apellidov
                        +"\nEdad: "+edadv
                        +"\nEstatura: "+estaturav
                        +"\nPeso: "+pesov
                        +"\nGenero: "+generov
                        +"\nTelefono: "+telefonov
                        +"\nCorreo: "+correov
           ;
           ES.escribe(cad);
         }        
      }
   }
   
    void leeDatos() throws ClassNotFoundException,IOException{
      ObjectInputStream ois=null;  

      try
      {  
         File f=new File("datos.obj");
         FileInputStream fis=new FileInputStream(f);
         ois=new ObjectInputStream(fis);
         
         while(true){
            Alumnos a1=(Alumnos)ois.readObject();
            
            idv=alumno1.get_Id();
            nombrev=a1.get_Nombre();
            apellidov=a1.get_Apellido();
            edadv=a1.get_Edad();
            estaturav=a1.get_Estatura();
            pesov=a1.get_Peso();
            generov=a1.get_Genero();
            telefonov=a1.get_Telefono();
            correov=a1.get_Correo();
                              
            Alumnos ob=new Alumnos(idv,nombrev,apellidov,edadv,estaturav,pesov,generov,telefonov,correov);
            listaA.add(a1);
            idv++;
         }      
      }
      catch(IOException io){
         System.out.println(io);
      }
      catch(ClassNotFoundException e){
         System.out.println(e);
      }
      finally{
         ois.close();
      }
   }
   
   void guardaDatos(){
      try
      {  
         File f=new File("datos.obj");
         FileOutputStream fos=new FileOutputStream(f);
         ObjectOutputStream oss=new ObjectOutputStream(fos);
         Alumnos o;
         for (int r=0; r<listaA.size(); r++){
            o=(Alumnos)listaA.get(r);
            
            idv=o.get_Id();
            nombrev=o.get_Nombre();
            apellidov=o.get_Apellido();
            edadv=o.get_Edad();
            estaturav=o.get_Estatura();
            pesov=o.get_Peso();
            generov=o.get_Genero();
            telefonov=o.get_Telefono();
            correov=o.get_Correo();
            oss.writeObject(new Alumnos(idv,nombrev,apellidov,edadv,estaturav,pesov,generov,telefonov,correov));
         }
         oss.close(); 
      }
      catch(IOException e){
         System.out.print("Error "+e);
      }
   }
    
   void lista(){
      Alumnos ov;
      String cad="Agenda \n";
      
      for (int j=0; j<listaA.size(); j++){
         ov=(Alumnos)listaA.get(j);
         cad+="\n"+ov.despliega();
      }
         ES.escribe(cad);
   }
}