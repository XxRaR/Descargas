
package com.mycompany.nomina;



public class EmpleadoPorHoras extends Empleado { //Hereda de la clase Empleado
    int horasTrabajadas; //Se declara el atributo
    //Constructor que inicializa los atributos
    public EmpleadoPorHoras(String nombre, double salarioB, String departamentoAQP) {
        super(nombre, 120, departamentoAQP); //Llama al constructor de la clase padre
        //Salario base ya definido
        
    }
    //Método para devolver las horas ingresadas por el usuario
    void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    //Metodo para sobreescribir un metodo de la clase padre
    @Override
    //Metodo para calcular el salario del EmpleadoPorHoras
    double calcularSalario(){
        return salarioB * horasTrabajadas; //Se devuelve el Salario Base en donde se puede observar que este se multiplica por las horas trabajadas
    }
    
}
