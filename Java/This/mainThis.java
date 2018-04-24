public class mainThis{
   public static void main (String args[]){
      Triangulo t = new Triangulo();
      t.datosTriangulo(15.0,12.0).visualizar();
      double a = t.area();
      System.out.println("Area = "+a);
   }
}