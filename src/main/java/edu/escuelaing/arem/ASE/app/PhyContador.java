package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhyContador implements Contador{
    int contador;
    @Override
    public int countLines(String archivo) {
        FileReader lectorArchivo = null;
        try {
            lectorArchivo = new FileReader(archivo);
            BufferedReader lectorLineas = new BufferedReader(lectorArchivo);
            while (lectorLineas.readLine() != null){
                contador++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return contador;
    }
}
