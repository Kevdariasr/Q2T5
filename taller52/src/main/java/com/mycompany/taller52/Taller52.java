package com.mycompany.taller52;
import java.util.Scanner;
public class Taller52 {
private Scanner teclado;
private int[][] matriz;

    public void cargar(){
    teclado = new Scanner(System.in);
    matriz = new int [3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.println("Ingrese el elemento en posicion de matriz["+i+"]["+j+"] : ");
            matriz[i][j]= teclado.nextInt();
            
        }
    }
    
}
    public void imprimir(){
        for (int k=0;k<3;k++){
            System.out.println(matriz[k][k]+" ");
        }
    }
    
     public static void main(String[] args) {
        
        Taller52 llamar = new Taller52();
        llamar.cargar();
        llamar.imprimir();
    }
}
