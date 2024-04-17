package com.mycompany.legisladores;

import java.util.Scanner;


public class Legisladores {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in); 
        ListaLegisladores listaleg = new ListaLegisladores(); //Se crea un nuevo objeto de la clase lista legisladores
        int opcion;
        do{ //Ciclo do while
            //opciones
            System.out.println("Cámara de Diputados y Senadores");
            System.out.println("Seleccione una opcion..");
            System.out.println("1. Crear Legislador");
            System.out.println("2. Mostrar Legisladores");
            System.out.println("3. Salir");
            opcion = L.nextInt();
            switch(opcion){ //Menu
                //Caso 1 para la creacion de un legislador llama al metodo crear legislador
                case 1: crearLegislador(listaleg); //llama a crear legislador para la creacion de un nuevo legislador
                break;
                //Muestra los legisladores que hay en la lista
                case 2: listaleg.mostrarLegisladores(); //llama al metodo mostrar legisladores
                break;
                case 3://Salida del programa
                    System.out.println("Adios... ;)");
                    break;
                default: System.out.println("Opcion no valida"); //Si la opcion elegida no se encuentra dentro de las opciones
            }//fin del switch
        }while(opcion != 3);
    }//fin del main
    
    
    static void crearLegislador(ListaLegisladores listaleg){ //Metodo crear legislador
        Scanner L = new Scanner(System.in);
        int op;
        System.out.println("Nombre");
        String nombre = L.nextLine();
        System.out.println("Edad");
        int edad = L.nextInt();
        L.nextLine(); //Se limpia el buffer
        System.out.println("Domicilio");
        String domicilio = L.nextLine();
        System.out.println("Provincia que representa");
        String provinciaqR = L.nextLine();
        System.out.println("1. Es Diputado, 2. Es Senador");
        op = L.nextInt();
        if(op == 1){
            Diputado dip = new Diputado(provinciaqR, nombre, edad, domicilio); /*Se crea un objeto o instancia dentro de la clase Diputado donde se
            almacenaran los datos ingresados por usuario*/
            listaleg.agregarLegislador(dip); //Se usa para añadir el legislador a la lista
        } else 
            if(op == 2){
                Senador senad = new Senador(provinciaqR, nombre, edad, domicilio); /*Se crea un objeto o instancia dentro de la clase Senador donde se
                almacenaran los datos ingresados por usuario*/
                listaleg.agregarLegislador(senad); //Se usa para añadir el legislador a la lista
            }
            else 
               System.out.println("Opcion no valida, por favor ingresa una opcion correcta..."); //Si la opcion elegida no es valida
        
        
        
    }
   
        
    
}
