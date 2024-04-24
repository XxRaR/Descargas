
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
