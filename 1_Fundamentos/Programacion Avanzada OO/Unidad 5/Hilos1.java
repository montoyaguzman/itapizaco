/*
PROGRAMA 1
WithoutThread.java
*/
import java.io.*;

public class Hilos1 {
    
    static PrintWriter out = new PrintWriter(System.out, true);
    
    public static void main (String args[]){
   	// first task: some pseudo-I/O operation
   	NoThreadPseudoIO pseudo = new NoThreadPseudoIO();
   	pseudo.start();
   	//second task: some random task
   	showElapsedTime("Otra tarea comenzo");
   }
    
   static long baseTime = System.currentTimeMillis();
   
   //show the time elapsed since the program starte  
   static void showElapsedTime(String message){
      long elapsedTime = System.currentTimeMillis() - baseTime;
      out.println(message + " en " + (elapsedTime/1000.0) + " segundos");
   }
}


//pseudo I/O operation run in caller's thread
class NoThreadPseudoIO{
   int data = -1;
   NoThreadPseudoIO() {// constructor
   Hilos1.showElapsedTime("La IO fue creada");
}
  
   public void run() {
   Hilos1.showElapsedTime("El IO fue iniciada");
   
      try{
   	   Thread.sleep(10000);// 10 second
   	   data = 999;// data ready
   	   Hilos1.showElapsedTime("La IO ha finalizado");
      }catch(InterruptedException e){
         System.out.println(e);
      }
   }
  
   public void start() 
   {
      run();
   }
}