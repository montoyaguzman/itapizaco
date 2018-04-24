   import java.util.Arrays;
   import java.io.*;
   class OrdBurb {
    
      public static void main(String[] args) throws IOException {
      
      //____________________ORDENAMIENTO BURBUJA___________________________________________
      
         int []matrix = {6,2,1,3,3};  
         int temp;  
         System.out.print("Ordenamiento burbuja \n  Original: ");
       
         for(int i=0;i < matrix.length;i++){  
            System.out.print(matrix[i] + ", ");
         }  
      //_________________________PARA BUSCAR(asignar)___________________________
         InputStreamReader com = new InputStreamReader(System.in);
         BufferedReader leido = new BufferedReader(com);
         System.out.print("\nIntroduce el numero a Buscar: ");
         String numeroABuscarSt = leido.readLine();
         int numeroABuscar = Integer.parseInt(numeroABuscarSt);
         String encontrados = "";                          
         for(int i=1;i < matrix.length;i++){  
          
         //____________________PARA BUSCAR(ENCUENTRA)_______________________(ENCUENTRA)
         
            if(numeroABuscar == matrix[i]) {
               encontrados = encontrados + matrix[i] + ", ";
            }
         
         //____________________FIN PARA BUSCAR(ENCUENTRA)_________________*/
            
         //____________________PARA ORDENAR(ORDENA)_________________
            for (int j=0 ; j < matrix.length-1; j++){  
            
               if (matrix[j] > matrix[j+1]){		//<-------COMPARA CON EL PRIMERO CON EL QUE ESTA ADELANTE  
                  temp = matrix[j];  				//<-------AL MAYOR LO GUARDA EN TEMP
                  matrix[j] = matrix[j+1];  		//<-------RECORRE UNA POSICION AL ARREGLO
                  matrix[j+1] = temp;   			//<-------COMO DE UNA POSICION ANTES ERA MAYOR LO RECORRIO HACIA DELANTE YA QUE SE ORDENA DE MENOR A MAYYOR
               }  
            }  
         //____________________FIN PARA ORDENAR(ORDENA)_________________
         }
         
         System.out.print("  Ordenado: ");
         for(int i=0;i < matrix.length;i++){  
            System.out.print(matrix[i] + ", ");
         }
         System.out.print("\n  encontrados = " + encontrados);   //<---------PARA BUSCAR(MUESTRA)
      //____________________FIN ORDENAMIENTO BURBUJA_________________________________________*/
      
      
      
      //____________________ORDENAMIENTO METODO SORT___________________________________________      
      
         int []matrix2 = {6, 10, 9, 7, 8};
         String []names = {"Mario", "Areli", "Beto", "Dayra", "Casimiro", };  
         char chares[] = {'s', 'o', 'a', 'i', 'd'};
         double decimales[] = {0.91, 0.01, 0.1, 0.001, 0.11};
      //	boolean boleanos[] = {true, false, true, false, true,};
      
         System.out.println("\n\nMetodo sort: \n arreglos Originales");
         System.out.print("   Strings = ");
         for(int i=0;i < 5;i++){  
            System.out.print(names[i] + ", ");
         }
         
         System.out.println();
         System.out.print("   int = ");
         for(int j=0; j < 5; j++){
            System.out.print(matrix2[j] + ", ");
         }
         
         System.out.println();  
         System.out.print("   char = ");
         for(int i=0;i < 5;i++){  
            System.out.print(chares[i] + ", ");
         }
      	
         System.out.println();
         System.out.print("   double = ");
         for(int i=0;i < 5;i++){  
            System.out.print(decimales[i] + ", ");
         }	
         System.out.println();
         
         Arrays.sort(names);
         Arrays.sort(matrix2);
         Arrays.sort(chares);
      //	Arrays.sort(boleanos);   // NO FUNCA CON BOOLEANOS
         Arrays.sort(decimales);
         
         System.out.println("\n arreglos ordenados");
         System.out.print("   Strings = ");
         for(int i=0;i < 5;i++){  
            System.out.print(names[i] + ", ");
         }
         
         System.out.println();
         System.out.print("   int = ");
         for(int j=0; j < 5; j++){
            System.out.print(matrix2[j] + ", ");
         }
         
         System.out.println();  
         System.out.print("   char = ");
         for(int i=0;i < 5;i++){  
            System.out.print(chares[i]);
         }
      	
         System.out.println();
         System.out.print("   double = ");
         for(int i=0;i < 5;i++){  
            System.out.print(decimales[i] + ", ");
         }	
         System.out.println();
      	
      	//____________________FIN ORDENAMIENTO METODO SORT___________________________________________*/
      	
      
      //_______________________BUSQUEDA BINERIA________________________________________________________
         int [] arreglo = {1, 2, 3, 3 ,5 ,7 ,8 ,9 , 10, 11, 12, 13, 14, 15, 16 ,20};
         System.out.print("\n\nMetodo busqueda binaria \n arreglo a buscar: ");
         for(int i=0;i < arreglo.length; i++){  
            System.out.print(arreglo[i] + ", ");
         }  
         int inicio = 0;
         int fin = arreglo.length - 1;
         int pos;
         int resultado = -1;
         while (inicio <= fin) {
            pos = (inicio+fin) / 2;
            if ( arreglo[pos] == numeroABuscar ) { 
               resultado = pos;
               break;
            }
            else if ( arreglo[pos] < numeroABuscar ) {
               inicio = pos+1;
            } 
            else {
               fin = pos-1;
            }
         }
      
         if (resultado >= 0) {
            System.out.print( "\nEncontrado en posicion: "+  resultado);
         } 
         else if (resultado == -1){
            System.out.print( "\nEl dato no se encuentra en el arreglo, o el arreglo no está ordenado."  );
         }
         //_______________________FIN BUSQUEDA BINERIA________________________________________________________
      
      }
   }