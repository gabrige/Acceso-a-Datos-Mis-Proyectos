import controller.GestorFicheros;

public class Entrada {
    public static void main(String[] args) {

        GestorFicheros gestorFicheros = new GestorFicheros();

    /*Parte 1: Listar el nombre de todos los ficheros ubicados en un directorio cualquiera*/

        System.out.println("Part 1");
        gestorFicheros.lecturaDirectorios("src/resources/directorio");

    /*Parte 2: Crear un subdirectorio dentro de la carpeta anterior y listar el nombre de todos los archivos*/

        System.out.println("\n" + "Part 2");
        gestorFicheros.listarNombres("src/resources/directorio");

    /*Parte 3: Listar el nombre de todos los ficheros y directorios de una ruta concreta, como por ejemplo C:/Users
    Para la parte 3 tenéis que utilizar el concepto de recursividad. Investigad a que se refiere ese término y en la clase del jueves lo trataremos,
    así como la resolución del ejercicio.*/

        System.out.println("\n" + "Part 3");
        gestorFicheros.lecturaRecursiva("C:\\Users\\gabri\\Documents\\FP_DAM_UNIR\\Segundo_Curso\\Acceso A Datos\\Proyectos IntelliJ IDEA\\Acceso-a-Datos---UNIR\\Unidad1\\Fichero");

    }
}
