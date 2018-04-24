/*
PROGRAMA 3
RunnableThread.java
*/

import java.io.*;

public class Hilos3{

    static PrintWriter out = new PrintWriter(System.out, true);

    public static void main (String args[]){
  
       //first task: some pseudo-I/O operation
   	 RunnablePseudoIO pseudo = new RunnablePseudoIO();
   	 Thread thread = new Thread (pseudo);
   	 thread.start();
	   //second task: some random task
	   showElapsedTime("Otra tarea comenzo");
    }

    static long baseTime = System.currentTimeMillis();

    //show the time elapsed since the program started
    static void showElapsedTime(String message){
	   long elapsedTime = System.currentTimeMillis() -baseTime;
	   out.println(message + " en " + (elapsedTime/1000.0) + " segundos");
    }
}

//pseudo I/O operation run in a separate thread
class RunnablePseudoIO implements Runnable{
    int data = -1;

   RunnablePseudoIO(){//constructor
	   Hilos3.showElapsedTime("RunnablePseudoIO creado");
   }

   public void run(){
	   Hilos3.showElapsedTime("RunnablePseudoIO iniciado");
   	try{
   	   Thread.sleep(10000);//10 seconds
   	   data = 999;		//data ready
   	   Hilos3.showElapsedTime("RunnablePseudoIO finalizado");
   	}catch(InterruptedException e){
         System.out.println(e);
      }
    }

}