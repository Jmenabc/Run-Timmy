/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corre.timmy;

import java.util.Scanner;

/**
 *
 * @author jmena
 */
public class CORRETIMMY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escaner= new Scanner(System.in);
        
        //Variables de movimiento de Timmy
        boolean fin=false;
        int iPos= 1;
        int jPos=1;
        String pasos;
        
        //Reglas
        
        System.out.println("Pulsa la n para que se mueva hacia arriba, la s para que se mueva para abajo, la e para que se mueva para la derecha y la o para que se mueva a la izquierda");
          
        //Tablero
        
        while (fin==false) {
            for (int i=0;i<20;i++) {
                for (int j=0;j<20;j++) {
                    if (i==0 || j==0 || i==19 || j==19) {
                    System.out.print("*");
                    }else if (i==iPos && j==jPos) {
                    System.out.print("T");
                    }else if (i==18 && j==18) {
                    System.out.print("H");
                    }else {
                    System.out.print(" ");

                    }
                }
                System.out.println();       
        }
     
        
                
                
        
        //Movimiento del subnormal de Timmy
        System.out.println("Siguiente paso?");
        pasos=escaner.nextLine();
        
       switch (pasos) {
           case "n" : iPos--; //NORTE
           break;
           case "s" : iPos++; //SUR
           break;
           case "e" : jPos++; //ESTE
           break;
           case "o" : jPos--; //OESTE
           break;
           case "" : jPos--; //SI NO PONES NADA SE MUEVE PARA LA IZQUIERD
           break;
           case "STOP":System.out.println("El juego ha terminado Timmy esta jodido"); //SI PONES STOP SE PARA
           break; 
        }
       
       if (iPos==18 && jPos==18) {
           System.out.println("Has salvado a Timmy");
           fin=true;
       }else if (iPos==0 || jPos==0 || iPos==19 || jPos==19) {
           System.out.println("has periddo a Timmy en una sentencia JOIN");
           fin=true;
       }

       
       
       
       }         
    } 
    
}
