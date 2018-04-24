import java.util.*;

class Racional implements Comparable{
   private int numerador;
   private int denominador;
   
   public Racional() throws Exception{
      this(0,1);
   }
   
   public Racional (int n, int d) throws Exception{
      this.numerador = n;
      this.denominador = d;
      if (denominador == 0) throw new Exception("Denominador igual a 0");
   }
   
   public String toString(){
      return numerador + "/" + denominador;
   }
   
   public int compareTo(Object x){
      Racional r;
      r = (Racional) x;
      
      if (valorReal() < r.valorReal()){
         return -1;
      }else if(valorReal() > r.valorReal()){
         return 1;
      }
         return 0;
   }
   
   private double valorReal(){
      return (double)numerador/(double)denominador;
   }
   
}