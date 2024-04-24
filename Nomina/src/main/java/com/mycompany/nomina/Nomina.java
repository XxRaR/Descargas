

package com.mycompany.nomina;

import java.util.Scanner; //librería Scanner para ingreso de datos por usuario

public class Nomina {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        String nombre; //Se declaran los atributos necesarios para el funcionamiento 
        String departamentoAQP;
        double salarioB = 20000; //se declara el atributo Salario Base al cual lo iniciamos con un valor 20000
        int opcion;
        
        //Menú 
        System.out.println("1. Crear Empleado asalariado 2. Crear Empleado por horas 3. Salir");
        System.out.println("Seleccione una opcion...");
        opcion = L.nextInt();
        
        //si opcion es igual a 1 entonces registraremos a un empleado asalariado   
        if (opcion == 1){
            System.out.println("Ingresa el nombre del empleado: "); //Pediremos al usuario el nombre 
            nombre = L.nextLine(); //Lectura de datos ingresados por usuario
            L.nextLine(); //se limpia el buffer
            System.out.println("Ingresa el departamento del empleado: "); 
            departamentoAQP = L.nextLine();
            EmpleadoAsalariado EmpAsa = new EmpleadoAsalariado(nombre, salarioB, departamentoAQP); 
            /*Se crea un objeto dentro de La clase EmpleadoAsalariado*/
            double salarioAsalariado = EmpAsa.calcularSalario();
            System.out.println("El salario es de: " + salarioAsalariado);
            
        } else 
            if(opcion == 2){
                System.out.println("Ingresa el nombre del empleado: ");
                nombre = L.nextLine();
                L.nextLine();
                System.out.println("Ingresa el departamento del empleado: ");
                departamentoAQP = L.nextLine();
                
                EmpleadoPorHoras EmpPorHor = new EmpleadoPorHoras(nombre, salarioB, departamentoAQP); 
                
                System.out.println("Ingresa las horas trabajadas: ");
                int horasTrabajadas = L.nextInt();
                EmpPorHor.setHorasTrabajadas(horasTrabajadas);
                double salarioPorHoras = EmpPorHor.calcularSalario();
                System.out.println("El salario es de: " + salarioPorHoras);
        } else 
                if (opcion == 3) {
                    
                    System.out.println("Saliendo..... Adios ;)");   
        }
                else 
                    System.out.println("Opcion no valida");
      
                
    }
}
