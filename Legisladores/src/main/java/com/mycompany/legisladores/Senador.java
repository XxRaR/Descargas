
package com.mycompany.legisladores;

public class Senador extends Legislador{ //hereda de la clase Legislador
    //Constructor
    public Senador(String provinciaqR, String nombre, int edad, String domicilio) {
        super(provinciaqR, nombre, edad, domicilio);
    }
    //Metodo para sobreescribir,
    @Override
    String getCamaraEQT(){
        return "Trabaja en la Cámara de Senadores";
    }
}
