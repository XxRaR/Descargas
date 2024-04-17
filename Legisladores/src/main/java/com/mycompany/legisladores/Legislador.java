
package com.mycompany.legisladores;


public abstract class Legislador extends Persona { //Es una clase abstracta que hereda de la clase persona
    String provinciaqR; //Atributos
    //Constructor 
    public Legislador(String provinciaqR, String nombre, int edad, String domicilio) {
        super(nombre, edad, domicilio);
        this.provinciaqR = provinciaqR;
    }
    //Metodo para sobreescribir
    @Override
    public String toString() {
        return super.toString() + " Legislador { " + " Provincia que Representa = " + provinciaqR + '}';
    }
    
    abstract String getCamaraEQT();//Llama al metodo CamaraEQT
}
