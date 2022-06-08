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
        String tipoContador = args[0];
        String archivo = args[1];
        switch (tipoContador){
            case "phy":
                PhyContador phyContador = new PhyContador();
                System.out.println(phyContador.countLines(archivo));
                break;
            case "loc":
                System.out.println("Metodo LOC");
                LocContador locContador = new LocContador();
                locContador.countLines(archivo);
                break;
        }
    }
}
