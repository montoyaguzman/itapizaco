public class Singleton{

    private String nombre;

    private static Singleton objetoUnico;

    private Singleton(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Singleton crearNuevoObjeto(String nombre) {
        if (objetoUnico == null){
            objetoUnico = new Singleton(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + ", solo puede haber un objeto unico y ya existe");
        }        
            return objetoUnico;
    }
    
    //Sobreescribimos el método clone, para que no se pueda clonar un objeto de esta clase
    @Override
    public Singleton clone(){
        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException ex) {
            System.out.println("No se puede clonar un objeto de clase Singleton");
        }
        return null; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
