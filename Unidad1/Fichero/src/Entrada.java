import java.io.File;
import java.io.IOException;

public class Entrada {
    public static void main(String[] args) {

        // FILE -> fichero logico -> fisico

        //fichero logico

        File ficheroSinPuntero = new File("C:\\Users\\gabri\\Documents\\FP DAM UNIR\\Segundo Curso\\Acceso A Datos\\Proyectos IntelliJ IDEA\\Acceso-a-Datos---UNIR\\Unidad1\\Fichero\\src\\resources\\direcotrio\\ejemplo.md");
        System.out.println(ficheroSinPuntero.getName());
        System.out.println(ficheroSinPuntero.getParent());
        System.out.println(ficheroSinPuntero.length());
        System.out.println(ficheroSinPuntero.exists());

        //Ruta relativa from content root que es la tipica que se usa

        File ficheroSinPuntero2 = new File("src/resources/direcotrio/ejemplo_fichero.md");
        System.out.println("\n" + ficheroSinPuntero2.getName());
        System.out.println(ficheroSinPuntero2.getParent());
        System.out.println(ficheroSinPuntero2.length());
        System.out.println(ficheroSinPuntero2.exists());
        System.out.println(ficheroSinPuntero2.isFile());

        //Ruta relativa from content root que es la tipica solo con el directorio

        File ficheroSinPuntero3 = new File("src/resources/direcotrio");
        System.out.println("\n" + ficheroSinPuntero3.getName());
        System.out.println(ficheroSinPuntero3.getParent());
        System.out.println(ficheroSinPuntero3.isDirectory());
        System.out.println(ficheroSinPuntero3.isFile());

        //listFiles() -> me devuelve un Array File[] -> todos los FICHEROS que estan dentro del directorio (devuelve los nombres de los files)

        ficheroSinPuntero3.listFiles();

        //list() -> me devuelve un String [] -> todas las rutas de los FICHEROS que estan dentro del directorio (solo devuelve las rutas)

        ficheroSinPuntero3.list();



        //Crear un fichero

        /*
        if(!ficheroSinPuntero.exists()){

            try {
                ficheroSinPuntero.createNewFile();
            } catch (IOException e) {
                System.out.println("Fallo en la cracion del fichero");
            }
        }

        */


    }
}
