
package com.mycompany.legisladores;

import java.util.ArrayList; //Libreria para el array


public class ListaLegisladores {
    ArrayList<Legislador> listalegisladores; //Creacion del array
    //Csontructor
    public ListaLegisladores(){
        this.listalegisladores = new ArrayList();
    }
    //Metodo para añadir un legislador
    void agregarLegislador(Legislador leg){
        listalegisladores.add(leg); //Se añade a la lista
        
    }
    //Metodo para mostrar la informacion
    void mostrarLegisladores(){
        for (int i= 0; i < listalegisladores.size(); i++){ //para iterar sobre los elementos que estan dentro
            //Se realiza es casting conversion de un tipo de dato a otro
            Legislador legis = listalegisladores.get(i);
            
            
            
            if(legis instanceof Senador){ //Verifica si el objeto actual es una instancia de la clase Senador
                Senador senador = (Senador)legis;
                System.out.println(senador.toString());
                System.out.println("Trabaja en la " + senador.getCamaraEQT());
                            
            } else { //Verifica si el objeto actual es una instancia de la clase Diputado
                Diputado dip = (Diputado)legis; 
                System.out.println(dip.toString());
                System.out.println("Trabaja en la " + dip.getCamaraEQT());
            }
            
            
        }
    }
    
    
}
