import javax.swing.*;
import java.io.*;

public class Receptor
{ 
   Operaciones operador = new Operaciones();
   
   public void recibeDatos()throws IOException
   {	 
      int diaNacimiento = 0, mesNacimiento = 0, anioNacimiento = 0, continuar = 0;
      do
   	{ 
     //EL DO WHILE ES UN CICLO QUE TE PERMITE EJECUTAR CIERTAS SENTENCIAS "MIENTRAS" NO SE CUMPLA CIERTA CARACTERISTICA
//EN ESTE CASO LA PERSONA SEGUIRA PELEANDO CON EL AGUILA O HACIENDO LO QUE SEA MIENTRAS NO DECIDA TERMINAR, POR EJEMPLO
    
     	diaNacimiento = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"___INDIQUE SU FECHA DE NACIMIENTO___\n DIA (00)"));        
         mesNacimiento = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"MES (00)"));
         anioNacimiento = (int)Integer.parseInt(JOptionPane.showInputDialog(null,"AÑO (0000)"));    
         operador.calculaDiasVividos(diaNacimiento,mesNacimiento,anioNacimiento);
         try
         {                      
            continuar = (int)Integer.parseInt(JOptionPane.showInputDialog("Presione 1 para reiniciar la app o 2 para finalizar"));
      	}
         catch(NumberFormatException nfe)
         {
            JOptionPane.showMessageDialog(null,"\nOpción invalida solo debes teclear 1 o 2");
         }
      }while(continuar == 1);
//ESTE WHILE ME IMAGINO QUE DEBERIA SER ALGO COMO
	//}while (agilaViva==true) o algo asi, en pseudocodigo. Podrias poner las vidas de un aguila como una variable entero 
//y restarle 1 vida cada ves que la persona le pegue y ya en el while le pones algo asi while(vidasDelAguila!=0)

         JOptionPane.showMessageDialog(null,"\nPrograma finalizado");
   }
}	
