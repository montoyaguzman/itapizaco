public class MainSingleton{

   public static void main(String[] args){
      
      Singleton unico = Singleton.crearNuevoObjeto("unico");
      Singleton objeto2 = Singleton.crearNuevoObjeto("objeto2");
        
      System.out.println("Primer objeto: "+unico.getNombre());
      System.out.println("Segundo objeto: "+objeto2.getNombre()+" --> Toma el nombre del objeto unico, el segundo nunca se crea");
        
      try{
         Singleton clon = unico.clone();
         System.out.println("El objeto "+unico.getNombre() +" es UNICO... ENTIENDE!! xD");
      }catch (NullPointerException ex){
         System.out.println(ex);
      }
    }

}
