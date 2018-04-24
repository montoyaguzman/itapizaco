/*
PROGRAMA 4
MethodTest.java
*/
import java.io.*;

public class Hilos4{

   static PrintWriter out = new PrintWriter(System.out, true);
   
   public static void main (String args[]){
      FirstThread first = new FirstThread();
      SecondThread second = new SecondThread();
      first.start();
      second.start();
   
      try{
	      out.println("Esperando HILO1 para terminar...");
	      first.join();
	      out.println("¡Es una larga espera!");
	      out.println("Despertando el segundo hilo...");
	      
         synchronized(second){
	         second.notify();
	      }
         
	      out.println("Esperando HILO2 para terminar...");
	      second.join();
	   }catch(InterruptedException e){
         System.out.println(e);
      }
         out.println("Tambien estoy listo para terminar");
   }
}

class FirstThread extends Thread{
   
   public void run(){
      try{
	      Hilos4.out.println("  HILO1 comenzo a correr");
	      sleep(10000);
	      Hilos4.out.println("  HILO1 termino de correr");
      }catch(InterruptedException e){
         System.out.println(e);
      }
  }
}

class SecondThread extends Thread{
  
   public synchronized void run (){
   try{
      Hilos4.out.println("  HILO2 comenzo a correr");
      Hilos4.out.println("  HILO2 se detuvo a si mismo");
	   wait();
	   Hilos4.out.println("  HILO2 corre nuevamente y se detiene");
   }catch (InterruptedException e){
      System.out.println(e);
   }
}

}