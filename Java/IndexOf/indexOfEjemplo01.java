public class indexOfEjemplo01 {
  public static void main(String[] args) throws Exception{
    String cadena = "Codigo Fuente en Java y aca aparece otra vez Java";
    int index = cadena.indexOf("Java"); 
    System.out.println(index);
    index = cadena.indexOf("Java",18); 
    System.out.println(index); // imprime segunda aparicion de Java
  }
}