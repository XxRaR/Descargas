
package com.mycompany.legisladores;


public abstract class Persona { //La clase es abstracta, no se pueden crear objetos directamente de esta
    String nombre; //Se crean los atributos
    int edad;
    String domicilio;
    //Constructor, inicializa los atributos
    public Persona(String nombre, int edad, String domicilio) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = domicilio;
    }
    //Sobreescribe el codigo
    @Override
    public String toString() {
        //Impresion de los datos
        return "Persona{ " + "Nombre = " + nombre + ", Edad =  años " + edad + ", Domicilio = " + domicilio + '}';
    }
    
}
