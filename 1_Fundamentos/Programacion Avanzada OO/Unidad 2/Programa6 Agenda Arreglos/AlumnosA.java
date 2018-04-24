public class AlumnosA{

   private String nombre;
   private String apellido;
   private int edad;
   private String genero;
   private double estatura;
   private int peso;
   private String telefono;
   private String correo;

 
   AlumnosA(){
      nombre = "";
      apellido = "";
      edad = 0;
      genero = "";
      estatura = 0.0;
      peso = 0;    
      telefono = "";
      correo = "";
   }
   
   AlumnosA(String nombre, String apellido, int edad, String genero, double estatura, int peso, String telefono, String correo){
      this.nombre = nombre;
      this.apellido = apellido;
      this.edad=edad;
      this.genero=genero;
      this.estatura=estatura;
      this.peso=peso;
      this.telefono= telefono;
      this.correo = correo;
   }
   
   void setNombre(String n){
      nombre = n;
   }
  
   void setApellido(String app){
      apellido = app;
   }
   
   void setEdad(int ed){
      edad = ed;
   }
   
   void setGenero(String gene){
      genero = gene;
   }
 
   void setEstatura(double estatu){
      estatura = estatu;
   }
   
   void setPeso(int pes){
      peso = pes;
   }
     
   void setTelefono(String telef){
      telefono = telef;
   }
   
   void setCorreo(String corr){
      correo = corr;
   }
   
   String getNombre(){
      return nombre;
   }
   
   String getApellido(){
      return apellido;
   }
   
   int getEdad(){
      return edad;
   }
   
   String getGenero(){
      return genero;
   }
   
   double getEstatura(){
      return estatura;
   }
   
   int getPeso(){
      return peso;
   }
   
   String getTelefono(){
      return telefono;
   }
   
   String getCorreo(){
      return correo;
   }
   
   String despliega(){
      return ("Nombre: "+nombre+"  "+
             "Apellido: "+apellido+"  "+
             "Edad: "+edad+"  "+
             "Genero: "+genero+"  "+
             "Estatura: "+estatura+"  "+
             "Peso: "+peso+"  "+
             "Telefono: "+telefono+"  "+
             "Correo: "+correo);
   }
   
} 