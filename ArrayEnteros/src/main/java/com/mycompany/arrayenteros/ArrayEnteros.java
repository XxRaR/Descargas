package com.mycompany.arrayenteros;

import java.util.Scanner;
public class ArrayEnteros {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        int cantnum;
        System.out.print("¿Cuantos numeros vas a ingresar? ");
        cantnum = L.nextInt();
        int [] n = new int[cantnum];
        for(int i=0; i < cantnum; i++){
            System.out.print("Dame el numero entero " + (i+1) + ": " );
            n[i] = L.nextInt();
            
        }
        System.out.print("Que Número vas a buscar? ");
        int num = L.nextInt();
        for(int i = 0; i < cantnum; i++){
            System.out.print(n[i] + ",");
            
        } 
        System.out.println("");
        System.out.println("Numero a buscar: " + num );
        
        boolean encontrado = false;
        int pos = -1;
        for(int i=0; i < cantnum; i++){
            if (n[i]==num){
                encontrado = true;
                pos = i;
                break;
            }
        }
  
        if (encontrado) {
            
            for (int i = pos; i < cantnum - 1; i++) {
                n[i] = n[i + 1];
            }
            cantnum--; 
            System.out.println("Número encontrado. Se eliminara el numero del arreglo");
        } else {
            System.out.println("Número no encontrado.");
        }
        
        
        System.out.print("Arreglo actualizado: ");
        for (int i = 0; i < cantnum; i++) {
            System.out.print(n[i] + ", ");
        }
        System.out.println(); 
    }
}
