package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhyContador implements Contador{
    int contador;
    @Override
    public int countLines(FileReader archivo) {
        BufferedReader lectorLineas = new BufferedReader(archivo);
        try {
            while (lectorLineas.readLine() != null){
                contador++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }
}
