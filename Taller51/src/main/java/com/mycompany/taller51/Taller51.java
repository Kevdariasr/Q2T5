package com.mycompany.taller51;
import java.util.Scanner;

public class Taller51 {
private Scanner leer;
private String dias;

    public void iniciar(){
        leer = new Scanner (System.in);
        System.out.println("Digite una letra entre las siguientes(D,L,K,M,J,V,S): ");
        dias = leer.next();
    }
    
    public void seleccion(){
        
    switch(dias){
        
        case "D": System.out.println("El dia seleccionado es Domingo"); 
                break;
        case "L": System.out.println("El dia seleccionado es Lunes");
                break;
        case "K": System.out.println("El dia seleccionado es Martes"); 
                break;
        case "M": System.out.println("El dia seleccionado es Miércoles"); 
                break;
        case "J": System.out.println("El dia seleccionado es Jueves");
                break;
        case "V": System.out.println("El dia seleccionado es Viernes") ;
                break;
        case "S": System.out.println("El dia seleccionado es Sábado");
                break;
        default: System.out.println("Letra no es permitida");
                break;
       
    }
      
}

    public static void main(String[] args) {
        Taller51 llamar = new Taller51();
       
        llamar.iniciar();
        llamar.seleccion();
    }

    
}
