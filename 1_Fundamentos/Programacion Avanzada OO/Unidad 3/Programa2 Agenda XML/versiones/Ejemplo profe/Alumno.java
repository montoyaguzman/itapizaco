import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alumno{
   int id;
   String nombre;
   int edad;
   double estatura;
   
   public int getId(){
      return id;
   }
   
   public void setId(int id){
      this.id=id;
   }
   public String getNombre(){
      return nombre;
   }
   
   @XmlElement
   public void setNombre(String nombre){
      this.nombre=nombre;
   }
   
   public int getEdad(){
      return edad;
   }
   
   
   @XmlElement
   public void setEdad(int edad){
      this.edad=edad;
   }
   
   public double getEstatura(){
      return estatura;
   }
   
   @XmlElement
   public void setEstatura(double estatura){
      this.estatura=estatura;
   }
   
}