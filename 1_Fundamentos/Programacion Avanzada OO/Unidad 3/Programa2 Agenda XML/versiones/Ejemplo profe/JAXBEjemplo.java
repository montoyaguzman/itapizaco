import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBEjemplo{

   public static void main(String []args){
      Alumno alumno =new Alumno();
      String cad="Alumno es:\n\n";
      
      alumno.setId(007);
      alumno.setNombre(ES.leeC("Dame un nombre: "));
      alumno.setEdad(ES.leeI("Dame edad: "));
      alumno.setEstatura(ES.leeD("Dame estatura: "));
      
      cad+="Nombre: "+alumno.getNombre()+"\n";
      cad+="Edad: "+alumno.getEdad()+"\n";
      cad+="Estatura: "+alumno.getEstatura();
      
      ES.escribe(cad);
      
      try{
         File file=new File("Directorio.xml");
         JAXBContext jaxbContext=JAXBContext.newInstance(Alumno.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
         
         //salida archivo
         jaxbMarshaller.marshal(alumno,file);      
         jaxbMarshaller.marshal(alumno,System.out);
      }catch(JAXBException e){
         e.printStackTrace();
      }
   }
}