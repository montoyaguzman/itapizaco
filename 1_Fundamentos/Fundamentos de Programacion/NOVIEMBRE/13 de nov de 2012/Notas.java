
import javax.swing.JOptionPane;
import javax.swing.JTextArea;//Importando la clase JTexArea que sirve para area de texto 
import java.io.*;
class Notas{//creando la clase Notas
private double calif[][];//delcaracion de la matriz//
Notas(){//contructor
   calif = new double[5][3];//se le dio valor a la matriz
   }//inicializacion de la matriz
   public void asignar (double valores, int f, int c){
      calif [f][c] = valores;
      }  //asignando a la valores a la matriz
   public    double [] promedio(){
      double pf[]= new double [5];//creando un areglo para todos los promedios (filas)
      for (int filas=0;filas<5;filas ++){//un for para las filas del promedio
         for (int columnas=0;columnas<3;columnas++)//un for para las columnas
            pf[filas]=pf[filas]+calif[filas][columnas];//sumandole a pfilas el valor de calif
         pf[filas]=pf[filas]/3;//dividiendolo la pfilas para sacar el promedio
         }
      return pf;
}
   public double [] camoña(){//metodo para promedio de los 3 examenes por estudiante
      double pc[]= new double  [3];//creando un arrrglo para todas los promedios (columna)
      for (int columnas=0;columnas<3;columnas++){// este for es para la matriz
         for (int filas=0;filas<5;filas++)// este for es para las filas
            pc[columnas]=pc[columnas]+calif[filas][columnas];// operacion para sumar notas por columna
         pc[columnas]=pc[columnas]/5;// operacion para sacar promedio por columna
   }
      return pc;
}
}

class tardanza{public static void main (String args []){//programa principal
   Notas obj=new Notas();// creando espacio en memoria para el objeto obj
   JTextArea salida=new JTextArea();//creando espacio en memoria para el objeto salida de la clase jtextarea
   salida.setText("");// inicializando el area de texto 
   String input, nom[]=new String[5];//declaracion de variables
   int filas, columnas, columnaspro;//declaracion de variables
   double valor, cuchitibin []=new double[5] , cuchimitin []=new double[3], moronjonjai=0;//declaracion e inicializacion de arreglos y variables
   for (filas=0;filas<5;filas++){//for para la 5 filas de los nombres y para asignar las calificaciones
      nom[filas]=JOptionPane.showInputDialog(null,"Introduzca el nombre del estudiante");//impresioon para el arreglo nom
      for(columnas=0;columnas<3;columnas++){//for de fila para introducir las 45 calificaciones junto con el for de la fila
         input=JOptionPane.showInputDialog(null," Introduzca la calificacion "+(columnas+1)+" del estudiante "+(filas+1));//este es para la impresion de las 3 columnas de las calificaciones
         valor=Double.parseDouble(input);//se hace la converción de  un string en double
         obj.asignar(valor, filas, columnas);// se asigna los valores 
         }
   }
   cuchitibin=obj.promedio();//asignacion a cuchitibin el promedio de la nota de los estudiantes
   cuchimitin=obj.camoña();//asignacion  a cuchimitin el promedio de camoña(nombre del metodo en la clase principal)
   for (columnaspro=0;columnaspro<3;columnaspro++)//for que se usa para el calculo del promedio por gruupo
   moronjonjai=moronjonjai+cuchimitin[columnaspro];//el acumulador que retiene la suma de cuchitimin + moronjonjai
   for (filas=0;filas<5;filas++)//hacer 5 veces las filas del arreglo cuchitibin  y nom
      salida.append("El promedio del estudiante "+ nom[filas]+" es: "+cuchitibin[filas] +"\n");// es para agregar algo al area de texto algo como un texto
   salida.append("El promedio del grupo  es: "+ moronjonjai );// se le agrega el priomedio del grupo
   JOptionPane.showMessageDialog(null,salida);//imprime el area de texto
   
   System.exit(0);   // esta instruccion es para salir del programa al finalizar
}
}



