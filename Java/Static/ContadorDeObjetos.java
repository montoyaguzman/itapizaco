class ContadorDeObjetos{
  static int contador = 0;
  //int contador = 0;
   
  public ContadorDeObjetos(){
    contador += 1;
  }
 
  public static void main (String[] args){
 
    new ContadorDeObjetos();
    new ContadorDeObjetos();
    new ContadorDeObjetos();
    System.out.println("No. de Objetos: "+contador);
 
  }
 
}