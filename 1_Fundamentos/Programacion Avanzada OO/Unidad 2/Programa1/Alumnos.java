/*
1. Crear atributos privados
2. Crear los 2 constructores
3. Crear metodos get y set.

JDK DOCS

*/

public class Alumnos{
   
   private String Nombre;
   private int Edad;
   private double Estatura;

   Alumnos(){
      Nombre = "";
      Edad = 0;
      Estatura = 0.0;
   }
   
   Alumnos(String n, int e, double es){
      Nombre=n;
      Edad=e;
      Estatura=es;
   }
   
   void set_Nombre(String n){
      Nombre=n;
   }
   
   void set_Edad(int e){
      Edad=e;
   }
   
   void set_Estatura(double es)
   {
      Estatura=es;
   }
   
   String get_Nombre(){
      return Nombre;
   }
   
   int get_Edad(){
      return Edad;
   }

   double get_Estatura(){
      return Estatura;
   }
      
   String despliega(){
      return Nombre+" "+Edad+" "+Estatura;
   }
}


