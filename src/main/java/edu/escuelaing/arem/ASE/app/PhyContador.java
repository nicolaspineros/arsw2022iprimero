package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Clase que cuenta el total de lineas del archivo CON espacios y comentarios
 */
public class PhyContador implements Contador{
    int contador;
    @Override
    public int countLines(BufferedReader lector) {
        try {
            while (lector.readLine() != null){
                contador++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }
}
