

package com.mycompany.pruebarandomaccessfile;

import java.io.IOException;
import java.io.RandomAccessFile;


public class PruebaRandomAccessFile {

    public static void main(String[] args) {
        try {
        RandomAccessFile raf = new RandomAccessFile("ficheroAleatorio.dat", "rw");
        for (int i = 0; i < 7; i++) {
            raf.writeDouble(i * 1.5);
        }
        raf.close();
        presenta();
        raf = new RandomAccessFile("ficheroAleatorio.dat", "rw");
        raf.seek(5 * 8); //nos situamos en la posición 5.
        raf.writeDouble(3.14);
        raf.close();
        presenta();
        } catch (IOException ioe) {
        System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        }
        private static void presenta() throws IOException {
            RandomAccessFile raf = new RandomAccessFile("ficheroAleatorio.dat", "r");
            System.out.println("Lectura del raf:");
            for (int i = 0; i < raf.length()/8; i++) {
                System.out.println("Valor: " + raf.readDouble());
            }
        raf.close();
        }
}

  