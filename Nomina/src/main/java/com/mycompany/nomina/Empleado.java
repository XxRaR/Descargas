
package com.mycompany.nomina;


public abstract class Empleado { //clase abstracta
    String nombre; //Se declaran los atributos
    double salarioB;
    String departamentoAQP;
    //Constructo inicializa los atributos
    public Empleado(String nombre, double salarioB, String departamentoAQP) {
        this.nombre = nombre;
        this.salarioB = salarioB;
        this.departamentoAQP = departamentoAQP;
    }
    //Llama al metodo calcular salario de las clases EmpleadoPorHoras y EmpleadoAsalariado es abstracto
    abstract double calcularSalario();   
    
 
    
}







import java.util.Scanner;
public class ArregloEdades(){
    Public static void main(String[] args){
        Scanner L = new Scanner(System.in);
        int te = 0;
        System.out.print("¿Cuantas personas participan? ");
        int cantPer = L.nextInt();
        int [] edades = new int [cantPer];
        for(int i = 0; i < cantPer; i++){
            System.out.print("Ingresa las edades: ");
            int edades = L.nextInt();
            te = te + edades;
            float promedio = te/cantPer;
            
            
            

    
