
package com.mycompany.leefichero;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author SALA PAFP 08
 */
public class LeeFichero {

    public static void main(String[] args) {
        String cad;
        try {
            BufferedReader br =
            new BufferedReader(new FileReader("salida.txt"));
            while ((cad = br.readLine()) != null) {
                System.out.println(cad);
            }
            
            //Cerramos el stream
            br.close();
        }
            catch (IOException ioe) {
            System.out.println(ioe);
        }
    }
}
