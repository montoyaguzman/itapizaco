//USO DE THIS CON RETURN 
class Triangulo
{
   private double base;
   private double altura;
   
   public Triangulo datosTriangulo(double base, double altura){
      this.base = base;
      this.altura = altura;
      return this;
   }
   
   public Triangulo visualizar(){
      System.out.println("Base = "+base);
      System.out.println("Altura = "+altura);
      return this;
   }
   
   public double area(){
      return (base*altura)/2.0;
   }
}