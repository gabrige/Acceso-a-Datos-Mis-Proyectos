import Controller.GestorFicheros;

import java.io.FileNotFoundException;


public class Entrada {

    public static void main(String[] args)  {

        GestorFicheros gestorFicheros = new GestorFicheros();


        gestorFicheros.lecturaTextoPlano("src/Resources/Lectura.txt");
        /*
        Ultimo recurso para tratar la excepcion "Alt + Enter y añadir en el main throws FileNotFoundException"
        Deberíamos solo usar la primera forma
        */



    }
}
