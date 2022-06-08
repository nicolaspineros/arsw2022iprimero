package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.IOException;

public class LocContador implements Contador{
    int contador;
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
