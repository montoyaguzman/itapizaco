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

   Alumnos(int id1, String nom, String ap, int ed, double es,int pe, String ge, String tel, String co){
      id=id1;
      nombre=nom;
      apellido=ap;
      edad=ed;
      estatura=es;
      peso=pe;
      genero=ge;
      telefono=tel;
      correo=co;
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