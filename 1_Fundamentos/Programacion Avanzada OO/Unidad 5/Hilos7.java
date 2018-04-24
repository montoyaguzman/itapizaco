/*
PROGRAMA 7
Deposit1.java
*/
import java.io.*;

public class Hilos7{
   
   static int balance =1000;//simulate balance kept remotely

   public static void main (String argc[]) {
      
      PrintWriter out = new PrintWriter(System.out, true);
      Account account = new Account (out);
      DepositThread first, second;
      first = new DepositThread (account, 1000, "#1");
      second = new DepositThread(account, 1000, "\t\t\t\t#2");
      
      // start the transactions
      first.start();
      second.start();
      
      // wait for both transactions to finish
      try{
	      first.join();
	      second.join();
      }catch(InterruptedException e){
         System.out.println(e);  
      }
        // print the final balance
        out. println("***** Balance final: " + balance);
  }
}

class Account{

  PrintWriter out;
  
  Account (PrintWriter out){
    this.out = out;
  }

  synchronized void deposit (int amount, String name){  // enable to make it work
     //void deposit (int amount, String name) {  //enable to see inconsistent result 
     int balance;
     out. println(name + " tratando de depositar " + amount);
     out. println(name + " obteniendo balance...");
     balance = getBalance();
     out. println(name + " balance obtenido: " + balance);
     balance+= amount;
     out. println(name + " estableciendo balance...");
     setBalance(balance);
     out. println(name + " balance establecido a: " + Hilos7.balance);
  }

  int getBalance(){
      
      try{//simulated delay in getting balance remotely
	      Thread.sleep(5000);
      }catch(InterruptedException e){
         System.out.print(e);
      }
         return Hilos7.balance;
  }
    
   void setBalance (int balance){
      try{//simulate the delay in setting new balance remotely
	      Thread.sleep(5000);
      }catch(InterruptedException e){
         System.out.print(e);
      }
    Hilos7.balance = balance;
  }
}


class DepositThread extends Thread 
{
   Account account;
   int depositAmount;
   String message;
   
   DepositThread (Account account, int amount, String message){
      this.message = message;
      this.account = account;
      this.depositAmount = amount;
   }
  
   public void run(){
       account.deposit (depositAmount, message);
   }

}
