package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;

/**
 * interfaz con el metodo de conteo
 */
public interface Contador {

    /**
     *
     * @param archivo recibe el archivo ya leido
     * @return valor del conteo de lineas del archivo
     */
    int countLines(BufferedReader archivo);

}
