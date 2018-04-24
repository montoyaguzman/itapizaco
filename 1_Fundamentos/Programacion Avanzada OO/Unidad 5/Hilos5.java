/*
PROGRAMA 5
contador down.
*/

public class Hilos5 extends Thread{
   
   private int countDown=5;
   private int threadNumber;
   private static int threadCount=0;
   
   public Hilos5(){
      threadNumber = ++threadCount;
      System.out.println("Haciendo " + threadNumber);
  }
  
  public void run(){
     while(true){
       System.out.println("Hilo " + 
       threadNumber + "(" + countDown + ")");
       if(--countDown==0) 
         return;
    }
  }
  
  public static void main(String[] args){
    for(int i = 0; i < 5; i++)
      new Hilos5().start();
      System.out.println("Todos los hilos comenzaron");
    }
}


