package edu.escuelaing.arem.ASE.app;

import java.io.*;

/**
 * Clase Main que recibe los argumentos
 * arg[0] = tipo de conteo
 * arg[1] = archivo para hacer el conteo
 **/
public class App 
{
    public static void main( String[] args ) {
        String tipoContador = args[0];
        FileReader archivo = null;
        try {
            archivo = new FileReader(args[1]);
        } catch (FileNotFoundException e) {throw new RuntimeException(e);}
        BufferedReader lector = new BufferedReader(archivo);
        switch (tipoContador){
            case "phy":
                PhyContador phyContador = new PhyContador();
                System.out.println(phyContador.countLines(lector));
                break;
            case "loc":
                LocContador locContador = new LocContador();
                System.out.println(locContador.countLines(lector));
                break;
            default:
                System.out.println("Seleccione un metodo entre phy o loc");
        }
    }
}
