class Biorritmo
{
   static int diasAnio(int mes,int dia)
   { int s=0;
      switch (mes) {
         case 1: s=0; 
            break;
         case 2: s=31; 
            break;
         case 3: s=59; 
            break;
         case 4: s=90; 
            break;
         case 5: s=120; 
            break;
         case 6: s=151; 
            break;
         case 7: s=181; 
            break;
         case 8: s=212; 
            break;
         case 9: s=243; 
            break;
         case 10: s=273; 
            break;
         case 11: s=304; 
            break;
         case 12: s=334; 
            break;
      }
      return (s+dia);
   }
    
  static int diasVida(int anio,int mes, int dia,int a,int m,int d)
  {
   anio-=1900;
   a-=1900; 
   double diashoy=(double)(anio*365.25)+diasAnio(mes,dia);
   double diasper=(double)(a*365.25)+diasAnio(m,d);
   return (int)(diashoy-diasper+0.5);
  }    
  
  static double fisico(int diasVida)
  { //ciclos de 23 dias
    double ciclo=diasVida%23;
    double x=(ciclo*2*Math.PI)/23;
    return Math.sin(x);
  }
    
  static double emocional(int diasVida)
  { //ciclos de 28 dias
    double ciclo=diasVida%28;
    double x=(ciclo*2*Math.PI)/28;
    return Math.sin(x);
  }
    
  static double intelectual(int diasVida)
  { //ciclos de 33 dias
    double ciclo=diasVida%33;
    double x=(ciclo*2*Math.PI)/33;
    return Math.sin(x);
  }    
    
}