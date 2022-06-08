package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Clase typo de conteo loc que implementa interfaz Contador
 * Cuenta las lineas del archivo sin comentarios ni lineas vacias
 */
public class LocContador implements Contador{
    int contador;

    /**
     * @param lector es el indice que lleva el conteo de el archivo
     * @return valor de las lineas contadas sin espacios vacios ni comentarios
     */
    @Override
    public int countLines(BufferedReader lector) {
        try {
            String linea = null;
            while ((linea = lector.readLine()) != null){
                if (!(comentario(linea))){
                    contador++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }

    /**
     *
     * @param linea es la linea en que va el indice del archivo
     * @return si es un comentario o un espacio vacio
     */
    public boolean comentario(String linea){
        if (linea.contains("/*")
                || linea.contains("*")
                || linea.contains("/**")
                || linea.contains("*/")
                || linea.contains("//")
                || linea.isEmpty()){
            return true;
        }
        return false;
    }
}
