import java.util.Scanner;
public class SumaMat {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    public void imprimirUltimaFila() {
    	System.out.println("Ultima fila");
        for(int c=0;c<mat[mat.length-1].length;c++) {
             System.out.print(mat[mat.length-1][c]+" ");
        }
    }
    
    public static void main(String[] ar) {
        SumaMat ma=new SumaMat();
        ma.cargar();
        ma.imprimir();
        ma.imprimirUltimaFila();
    }   
}