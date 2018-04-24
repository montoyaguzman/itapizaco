import java.util.ArrayList; 
import javax.xml.bind.annotation.*;
 
@XmlRootElement(name = "escuela")
public class Escuela {
 private String clave;
 private String nombre;
 private ArrayList<Alumnos> alumnos;
 
 public String getClave() {
  return clave;
 }
 
 public void setClave(String clave) {
  this.clave = clave;
 }
 
 public String getNombre() {
  return nombre;
 }
 
 public void setNombre(String nombre) {
  this.nombre = nombre;
 }
 
 @XmlElementWrapper(name = "alumnos")
 @XmlElement(name = "alumno")
 public ArrayList<Alumnos> getAlumnos() {
  return alumnos;
 }
 
 public void setAlumnos(ArrayList<Alumnos> alumnos) {
  this.alumnos = alumnos;
 }
 
}