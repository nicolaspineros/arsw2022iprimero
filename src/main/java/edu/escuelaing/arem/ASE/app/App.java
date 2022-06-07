package edu.escuelaing.arem.ASE.app;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World! " + args[0] + "file: " + args[1]);
        int contador = 0;
        String archivoEntrada = args[1];
        try {
            FileReader lectorArchivo = new FileReader(archivoEntrada);
            BufferedReader lectorLineas = new BufferedReader(lectorArchivo);
            while (lectorLineas.readLine() != null){
                contador++;
            }
            System.out.println(contador);
            } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
            } catch (IOException e) {
            System.out.println(e);
        }
    }
}
