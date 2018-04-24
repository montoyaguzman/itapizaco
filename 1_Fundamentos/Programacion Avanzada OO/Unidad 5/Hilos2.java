/*
PROGRAMA 2
WithThread.java
*/
import java.io.*;

public class  Hilos2{

   static PrintWriter out = new PrintWriter(System.out, true);

    public static void main (String args[]){
      //first task: some pseudo-I/O operation
	   ThreadedPseudoIO pseudo = new ThreadedPseudoIO();
	   pseudo.start();
	   //second task: some random task
	   showElapsedTime("Otra tarea comenzo");
        
      try{
         Thread.sleep(10000);
      }catch(InterruptedException e){
         System.out.println(e);
      }
    }

    static long baseTime = System.currentTimeMillis();
    
    //show the time elapsed since the program started
    static void showElapsedTime(String message){
      long elapsedTime = System.currentTimeMillis() -baseTime;
   	out.println(message + " en " + (elapsedTime/1000.0) + " segundos");
   }
}

//pseudo I/O operation run in a separate thread
class ThreadedPseudoIO extends Thread {
    int data = -1;
    ThreadedPseudoIO(){//constructor
	 Hilos2.showElapsedTime("Hilo creado");
}
    
   public void run () {
   	Hilos2.showElapsedTime("Hilo iniciado");
   	try{
   	   sleep(10000);//10 seconds
   	   data = 999;//data ready
   	   Hilos2.showElapsedTime("Hilo finalizado");
   	}catch(InterruptedException e){
         System.out.print(e);
      }
   }
   
}