import javax.xml.bind.annotation.*;

@XmlRootElement(name = "alumno")
//@XmlType(propOrder = {"id","nombre","apellido", "edad","estatura","peso","genero","telefono","correo" } )
public class Alumnos{
   
   private int id;
   private String nombre;
   private String apellido;
   private int edad;
   private double estatura;
   private int peso;
   private String genero;
   private String telefono;
   private String correo;

   Alumnos(){
      id=1;
      nombre="";
      apellido="";
      edad=0;
      estatura=0.0;
      peso=0;
      genero="";      
      telefono="";
      correo="";
   }

   Alumnos(int id, String nombre, String apellido, int edad, double estatura,int peso, String genero, String telefono, String correo){
      this.id=id;
      this.nombre=nombre;
      this.apellido=apellido;
      this.edad=edad;
      this.estatura=estatura;
      this.peso=peso;
      this.genero=genero;
      this.telefono=telefono;
      this.correo=correo;
   }
   
   @XmlElement
   void set_Id(int id){ 
      id=id;
   }
   
   @XmlElement
   void set_Nombre(String n){ 
      nombre=n;
   }
   
   @XmlElement
   void set_Apellido(String a){ 
      apellido=a;
   }
   
   @XmlElement
   void set_Edad(int e){ 
      edad=e;
   }
   
   @XmlElement
   void set_Estatura(double e){ 
      estatura=e;
   }
   
   @XmlElement
   void set_Peso(int p){ 
      peso=p;
   }
   
   @XmlElement
   void set_Genero(String g){ 
      genero=g;
   }
   
   @XmlElement
   void set_Telefono(String t){ 
      telefono=t;
   }
   
   @XmlElement
   void set_Correo(String c){ 
      correo=c;
   }
   
   
   int get_Id(){
      return id;
   }
   
   String get_Nombre(){
      return nombre;
   }
   
   String get_Apellido(){
      return apellido;
   }
   
   int get_Edad(){
      return edad;
   }

   double get_Estatura(){
      return estatura;
   }
   
   int get_Peso(){
      return peso;
   }
   
   String get_Genero(){
      return genero;
   }
   
   String get_Telefono(){
      return telefono;
   }
   
   String get_Correo(){
      return correo;
   }
   
   
   String despliega(){
      return id+". "+"Nombre: "+nombre+
            "  Apellido: "+apellido+
            "  Edad: "+edad+
            "  Estatura: "+estatura+
            "  Peso: "+peso+
            "  Genero: "+genero+
            "  Telefono: "+telefono+
            "  Correo: "+correo+"\n";
   }
}