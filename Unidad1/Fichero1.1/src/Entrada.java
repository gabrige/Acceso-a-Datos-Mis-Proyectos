import Controller.GestorFicheros;

import java.io.FileNotFoundException;


public class Entrada {

    public static void main(String[] args)  {

        GestorFicheros gestorFicheros = new GestorFicheros();


        gestorFicheros.lecturaTextoPlano("src/Resources/Lectura.txt");
      
    }
}
