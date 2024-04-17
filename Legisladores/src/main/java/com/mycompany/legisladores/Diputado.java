
package com.mycompany.legisladores;

/**
 *
 * @author SALA PAFP 08
 */
public class Diputado extends Legislador { //hereda de la clase Legislador
    //Constructor 
    public Diputado(String provinciaqR, String nombre, int edad, String domicilio) {
        super(provinciaqR, nombre, edad, domicilio);
    }
    //Sobreescribe los datos
    @Override
    String getCamaraEQT(){
        return "Trabaja en la Cámara de Diputados";
    }
    
    
}
