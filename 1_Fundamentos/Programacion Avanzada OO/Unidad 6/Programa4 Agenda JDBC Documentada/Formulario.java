import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.sql.*;

public class Formulario extends JFrame{
 
   Connection conexion=null;
   Statement sql=null;
   ResultSet registro;
   
   //LABELS INICIALIZACION
   private JLabel etiquetaMatricula;
   private JLabel etiquetaNombre;
   private JLabel etiquetaApp;
   private JLabel etiquetaApm;
   private JLabel etiquetaCorreo;
   private JLabel etiquetaTelefono;   
   private JLabel etiquetaCarrera;
   private JLabel etiquetaSemestre;  
   private JLabel etiquetaPromedio;
   
   //TEXTFIELDS INICIALIZACION
   private JTextField matricula;
   private JTextField nombre;
   private JTextField app;
   private JTextField apm;
   private JTextField correo;
   private JTextField telefono;
   private JTextField carrera;
   private JTextField semestre;
   private JTextField promedio;

   //BOTONES INICIALIZACION
   private JButton agregaAlumno;
   private JButton borraAlumno;
   private JButton editaAlumno;
   private JButton actualizaAlumno;
   private JButton buscaNombre;
   private JButton buscaMatricula;
   private JButton listaNombre;
   private JButton listaMatricula;
   private JButton salir;
    
   
   Formulario()
   {
      super("Agenda de contactos");
      Container co=getContentPane();
      co.setLayout(null);
      
      setSize(600,720);
      setVisible(true);
         
      //INSTANCIANDO LABELS
      etiquetaMatricula=new JLabel("Matricula: ");
      etiquetaNombre=new JLabel("Nombre: ");
      etiquetaApp=new JLabel("App: ");
      etiquetaApm=new JLabel("Apm: ");
      etiquetaCorreo=new JLabel("Correo: ");
      etiquetaTelefono=new JLabel("Telefono: ");
      etiquetaCarrera=new JLabel("Carrera: ");
      etiquetaSemestre=new JLabel("Semestre: ");  
      etiquetaPromedio=new JLabel("Promedio: ");
      
      //INSTANCIANDO JTEXT
      matricula=new JTextField(20);
      nombre=new JTextField(20);
      app=new JTextField(20);
      apm=new JTextField(20);
      correo=new JTextField(20);
      telefono=new JTextField(20);
      carrera=new JTextField(20);
      semestre=new JTextField(10);
      promedio=new JTextField(10);
  
      //_____________________________________ETIQUETAS Y CAMPOS____________________________________________________
      co.add(etiquetaMatricula);
      etiquetaMatricula.setBounds(10,50,100,45);
      co.add(matricula);
      matricula.setBounds(120,50,200,45);
      
      co.add(etiquetaNombre);
      etiquetaNombre.setBounds(10,110,100,45);
      co.add(nombre);
      nombre.setBounds(120,110,200,45);
      
      co.add(etiquetaApp);
      etiquetaApp.setBounds(10,170,100,45);
      co.add(app);
      app.setBounds(120,170,200,45);
   
      co.add(etiquetaApm);
      etiquetaApm.setBounds(10,230,100,45);
      co.add(apm);
      apm.setBounds(120,230,200,45);
      
      co.add(etiquetaCorreo);
      etiquetaCorreo.setBounds(10,290,100,45);
      co.add(correo);
      correo.setBounds(120,290,200,45);
      
      co.add(etiquetaTelefono);
      etiquetaTelefono.setBounds(10,350,100,45);      
      co.add(telefono);
      telefono.setBounds(120,350,200,45);
   
      co.add(etiquetaCarrera);
      etiquetaCarrera.setBounds(10,410,100,45);
      co.add(carrera);
      carrera.setBounds(120,410,100,45);
      
      co.add(etiquetaSemestre);
      etiquetaSemestre.setBounds(10,470,100,45);
      co.add(semestre);
      semestre.setBounds(120,470,100,45);
      
      co.add(etiquetaPromedio);
      etiquetaPromedio.setBounds(10,530,100,45);
      co.add(promedio);
      promedio.setBounds(120,530,100,45);
      
      // INSTANCIANDO BOTONES
      agregaAlumno=new JButton("Agregar");
      co.add(agregaAlumno);
      agregaAlumno.setBounds(340,50,200,50);
      
      borraAlumno=new JButton("Borrar");
      co.add(borraAlumno);
      borraAlumno.setBounds(340,110,200,50);
      
      editaAlumno=new JButton("Editar");
      co.add(editaAlumno);
      editaAlumno.setBounds(340,170,90,50);
      
      actualizaAlumno=new JButton("Actualiza");
      co.add(actualizaAlumno);
      actualizaAlumno.setBounds(440,170,100,50);
      
      buscaNombre=new JButton("Buscar x Nombre");
      co.add(buscaNombre);
      buscaNombre.setBounds(340,230,200,50);
      
      buscaMatricula=new JButton("Buscar x matricula");
      co.add(buscaMatricula);
      buscaMatricula.setBounds(340,290,200,50);
            
      listaNombre=new JButton("Listar A-Z");
      co.add(listaNombre);
      listaNombre.setBounds(340,350,200,50);
      
      listaMatricula=new JButton("Listar por matricula");
      co.add(listaMatricula);
      listaMatricula.setBounds(340,410,200,50);
                
      salir=new JButton("Salir");
      co.add(salir);
      salir.setBounds(340,470,200,50);


   /*___________________________________ LISTENERS ___________________________________*/     
         
      //AGREGAR
      agregaAlumno.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               alta();
            }
         }
      );
      
      //BORRAR
      borraAlumno.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               borra();
            }
         }
      );
      
      //EDITAR
      editaAlumno.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               edita();
            }
         }
      );
      
      //ACTUALIZAR
      actualizaAlumno.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               actualiza();
            }
         }
      );
      
      //BUSCAR X NOMBRE
      buscaNombre.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               buscaNombre();
            }
         }
      );
      
      //BUSCAR X MATRICULA
      buscaMatricula.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               buscaMatricula();
            }
         }
      );
      
      //LISTAR POR NOMBRE
      listaNombre.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               listaNombres();   
            }
         }
      );
      
      //LISTAR POR MATRICULA
      listaMatricula.addActionListener(
         new ActionListener() {
            public void actionPerformed(ActionEvent ev)
            {
               listaMatriculas();
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
   
   }
//_________________________________________MAIN_________________________________________
   public static void main (String Ar[]){
      Formulario ap=new Formulario();
      ap.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
//______________________________________METODOS______________________________________
   
   void conectar(){  
      try{
         Class.forName("com.mysql.jdbc.Driver");
         String url="jdbc:mysql://localhost:3306/escuela";
         conexion = DriverManager.getConnection(url,"root",""); 
         sql=conexion.createStatement();
      }catch(Exception e){
         System.out.println(e);
      } 
   }
   
   void desconectar(){
      try{
         conexion.close();
         sql.close();
      }catch(Exception e){
         System.out.print(e);
      }
   }
   
   void alta(){
      
      conectar();
     
      int matricula1=(int)Integer.parseInt(matricula.getText());
      String nombre1=nombre.getText();
      String app1=app.getText();
      String apm1=apm.getText();
      String telefono1=telefono.getText();
      String correo1=correo.getText();
      String carrera1=carrera.getText();
      int semestre1=(int)Integer.parseInt(semestre.getText());
      double promedio1=(double)Double.parseDouble(promedio.getText());
      
      String query="INSERT INTO alumnos(matricula,nombre,app,apm,telefono,correo,carrera,semestre,promedio) VALUES("+matricula1+",'"+nombre1+"',"+"'"+app1+"','"+apm1+"',"+telefono1+","+"'"+correo1+"',"+"'"+carrera1+"',"+"'"+semestre1+"',"+promedio1+");";
      //System.out.println(query);
      
      try{
         sql.executeUpdate(query);
         ES.escribe(nombre1+" fue registado exitosamente!!");
      }catch(Exception e){
         System.out.println(e);
      }
      
      desconectar();   
      
      matricula.setText("");
      nombre.setText(""); 
      app.setText("");
      apm.setText("");
      correo.setText("");
      telefono.setText("");
      carrera.setText("");
      semestre.setText("");
      promedio.setText("");
       
      //PRUEBA
      /*System.out.println("mat: "+matricula1);
      System.out.println("nom: "+nombre1);
      System.out.println("app: "+app1);
      System.out.println("apm: "+apm1);
      System.out.println("tel: "+telefono1);
      System.out.println("correo: "+correo1);
      System.out.println("carrera: "+carrera1);
      System.out.println("semes: "+semestre1);
      System.out.println("prom: "+promedio1);*/
   }
   
   void borra(){
      conectar();
      int matri=ES.leeI("Indica matricula a eliminar: ");
      
      String query="DELETE FROM alumnos WHERE matricula="+matri+";";
      System.out.println(query);
            
      try{
         sql.executeUpdate(query);
         ES.escribe(matri+" fue eliminado de tus contactos");
      }catch(Exception e){
         System.out.print(e);
      }
      desconectar();
   }
   
   void edita(){
      conectar();
      
      int matri=ES.leeI("Indica matricula del contacto a editar: ");
      
      try{
         
         String query="SELECT * FROM alumnos WHERE matricula="+matri+";";
         //System.out.println(query);
         registro=sql.executeQuery(query);
         
         int mat=0;
         String nom="";
         String ap="";
         String am="";
         String tel="";
         String corr="";
         String carr="";
         int semes=0;
         double prom=0.0;
         
         if(registro.next()){
            //int id = registro.getInt(1);
            mat = registro.getInt(2);
            nom = registro.getString(3);
            ap = registro.getString(4);
            am = registro.getString(5);
            corr = registro.getString(6);
            tel = registro.getString(7);
            carr = registro.getString(8);
            semes = registro.getInt(9);
            prom = registro.getDouble(10);
        }
        
         matricula.setText(String.valueOf(mat));
         nombre.setText(nom);
         app.setText(ap);
         apm.setText(am);
         telefono.setText(tel);
         correo.setText(corr);
         carrera.setText(carr);
         semestre.setText(String.valueOf(semes));
         promedio.setText(String.valueOf(prom));
         
         //actualiza(id);
         desconectar();   
         
      }catch(SQLException e){
         System.out.print(e);
      }
  }
  
  void actualiza(){
      conectar();
      try{
         int mat1 = (int)Integer.parseInt(matricula.getText());
         String nom1 = nombre.getText();
         String ap1 = app.getText();
         String am1 = apm.getText();
         String corr1 = correo.getText();
         String tel1 = telefono.getText();
         String carr1 = carrera.getText();
         int semes1 = (int)Integer.parseInt(semestre.getText());
         double prom1 = (int)Double.parseDouble(promedio.getText());
         
         String q="SELECT * FROM alumnos WHERE matricula="+mat1+";";
         ResultSet reg;
         int idd=0;
         reg=sql.executeQuery(q);
         //System.out.println(q);
         if(reg.next()){
            idd = reg.getInt(1);
            //System.out.println(idd);
            matricula.setText("");
            nombre.setText(""); 
            app.setText("");
            apm.setText("");
            correo.setText("");
            telefono.setText("");
            carrera.setText("");
            semestre.setText("");
            promedio.setText("");
         }
         
         String actualiza="UPDATE alumnos SET nombre='"+nom1+"',app='"+ap1+"',apm='"+am1+"',correo='"+corr1+"',telefono="+tel1+",carrera='"+carr1+"',semestre="+semes1+" WHERE id="+idd+";";
         System.out.println(actualiza);
         
         sql.executeUpdate(actualiza);   
         ES.escribe("Registro correctamente actualizado, busca a "+nom1+ " nuevamente en tu lista");  
      }catch(SQLException e){
         System.out.println("Conexion"+e);
         
         desconectar();
      }
  }    
  
  void buscaNombre(){
      String nombre=ES.leeC("¿A quien buscas? Ingresa nombre: ");
      conectar();
      try{      
            String query="SELECT * FROM alumnos WHERE nombre='"+nombre+"';";
            //System.out.println(query);
            registro=sql.executeQuery(query);
            
            int mat=0;
            String nom="";
            String ap="";
            String am="";
            String tel="";
            String corr="";
            String carr="";
            int semes=0;
            double prom=0.0;
            
            if(registro.next()){
               mat = registro.getInt(2);
               nom = registro.getString(3);
               ap = registro.getString(4);
               am = registro.getString(5);
               corr = registro.getString(6);
               tel = registro.getString(7);
               carr = registro.getString(8);
               semes = registro.getInt(9);
               prom = registro.getDouble(10);
           }
           
           String cad="Contenido \n\n"+"Matricula: "+mat
                        +"\nNombre: "+nom
                        +"\nApellido paterno: "+ap
                        +"\nApellido materno: "+am
                        +"\nCorreo: "+corr
                        +"\nTelefono: "+tel
                        +"\nCarrera: "+carr
                        +"\nSemestre: "+semes
                        +"\nPromedio: "+prom
           ;
           ES.escribe(cad);
           
           desconectar();   
         
      }catch(SQLException e){
         ES.escribe("Registro no encontrado");
         System.out.print(e);
      }
   }
      
      void buscaMatricula(){
         double matricula=ES.leeD("¿A quien buscas? Ingresa matricula: ");
         conectar();
         try{
            
            String query="SELECT * FROM alumnos WHERE matricula="+matricula+";";
            //System.out.println(query);
            registro=sql.executeQuery(query);
            
            int mat=0;
            String nom="";
            String ap="";
            String am="";
            String tel="";
            String corr="";
            String carr="";
            int semes=0;
            double prom=0.0;
            
            if(registro.next()){
               mat = registro.getInt(2);
               nom = registro.getString(3);
               ap = registro.getString(4);
               am = registro.getString(5);
               corr = registro.getString(6);
               tel = registro.getString(7);
               carr = registro.getString(8);
               semes = registro.getInt(9);
               prom = registro.getDouble(10);
           }
           
           String cad="Contenido \n\n"+"Matricula: "+mat
                        +"\nNombre: "+nom
                        +"\nApellido paterno: "+ap
                        +"\nApellido materno: "+am
                        +"\nCorreo: "+corr
                        +"\nTelefono: "+tel
                        +"\nCarrera: "+carr
                        +"\nSemestre: "+semes
                        +"\nPromedio: "+prom
           ;
           ES.escribe(cad);
           
           desconectar();   
         
      }catch(SQLException e){
         ES.escribe("Registro no encontrado");
         System.out.print(e);
      }      
   }
   
   void listaNombres(){
      conectar();
      try{
            
            String query="SELECT * FROM alumnos ORDER BY nombre ASC;";
            //System.out.println(query);
            registro=sql.executeQuery(query);
            
            int mat=0;
            String nom="";
            String ap="";
            String am="";
            String tel="";
            String corr="";
            String carr="";
            int semes=0;
            double prom=0.0;
            
            while(registro.next()){
               mat = registro.getInt(2);
               nom = registro.getString(3);
               ap = registro.getString(4);
               am = registro.getString(5);
               corr = registro.getString(6);
               tel = registro.getString(7);
               carr = registro.getString(8);
               semes = registro.getInt(9);
               prom = registro.getDouble(10);
           
           String cad="Contenido \n\n"+"Matricula: "+mat
                        +"\nNombre: "+nom
                        +"\nApellido paterno: "+ap
                        +"\nApellido materno: "+am
                        +"\nCorreo: "+corr
                        +"\nTelefono: "+tel
                        +"\nCarrera: "+carr
                        +"\nSemestre: "+semes
                        +"\nPromedio: "+prom
           ;
           ES.escribe(cad);
           }
           desconectar();   
         
      }catch(SQLException e){
         System.out.print(e);
      }   
   }
   
   void listaMatriculas(){
      conectar();
      try{
            
            String query="SELECT * FROM alumnos ORDER BY matricula ASC;";
            //System.out.println(query);
            registro=sql.executeQuery(query);
            
            int mat=0;
            String nom="";
            String ap="";
            String am="";
            String tel="";
            String corr="";
            String carr="";
            int semes=0;
            double prom=0.0;
            
            while(registro.next()){
               mat = registro.getInt(2);
               nom = registro.getString(3);
               ap = registro.getString(4);
               am = registro.getString(5);
               corr = registro.getString(6);
               tel = registro.getString(7);
               carr = registro.getString(8);
               semes = registro.getInt(9);
               prom = registro.getDouble(10);
           
           String cad="Contenido \n\n"+"Matricula: "+mat
                        +"\nNombre: "+nom
                        +"\nApellido paterno: "+ap
                        +"\nApellido materno: "+am
                        +"\nCorreo: "+corr
                        +"\nTelefono: "+tel
                        +"\nCarrera: "+carr
                        +"\nSemestre: "+semes
                        +"\nPromedio: "+prom
           ;
           ES.escribe(cad);
           }     
           desconectar();   
         
      }catch(SQLException e){
         System.out.print(e);
      }
   
   }
                
//FINAL   
}