
package com.mycompany.nomina;


public class EmpleadoAsalariado extends Empleado { //la clase empleado asalariado hereda de la clase empleado
    //constructor inicializa los atributos
    public EmpleadoAsalariado(String nombre, double salarioB, String departamentoAQP) {
        super(nombre, 20000, departamentoAQP); //Salaro base ya definido
        //Constructor de la superclase
    }
    //Se esta sobreescribiendo un metodo de la clase padre
    @Override
    //metodo para calcular el salario del empleado asalariado
    double calcularSalario(){
        double impuestos = salarioB*.32;
        return salarioB-impuestos; //Nos regresa el valor de la operacion realizada en donde se resta el salario base menos los impuestos
    }
}
