package controller;

import java.io.File;

public class GestorFicheros {

    public void lecturaDirectorios(String path){

        File file = new File(path); //De esta manera convertimos el path en un archivo fisico para poder leerlo
        File[] ficheros = file.listFiles(); //Creamos un array para almacenar la info y crear un conjunto de ficheros
        for(File item : ficheros){ //Para recorrer el array debemos crear un bucle for
            if(!item.isHidden()){ // este metodo es para quitar los archivos ocultos, no es necesario
                System.out.println(item.getName());
            }
        }

    }

    public void listarNombres(String path){
        File file = new File(path);
        File[] ficheros = file.listFiles();
        for(File item : ficheros){
            System.out.println(item.getName()); //Hasta aquí todo es igual a lo anterior
            if(item.isDirectory()){ //Con este bucle vamos acceder al subdirectorio y añadirlos a la lectura junto con sus archivos
                File[] subdirectorio = item.listFiles();
                for(File file1 : subdirectorio){
                    System.out.println("\t"+file1.getName());
                }
            }
        }
    }

    public void lecturaRecursiva(String path) {
        File file = new File(path);
        //File[] ficheros = file.listFiles(); -> esto es lo mismo que file.listFiles() dentro del for
        for (File item : file.listFiles()) {
            System.out.println(item.getName());
            if (item.isDirectory()) {
                lecturaSubdirectorios(item);
            }
            // pregunto si es directorio
            // saco todos los ficheros del directorio y los muestro -> NO SE CUANTAS VECES PREGUNTO
        }
    }

    // RECURSIVIDAD -> EJECUCION QUE SE LLAMA A ELLA MISMA, CON CUIDADO TENGA UNA SALIDA
    private void lecturaSubdirectorios(File fichero) {
        for (File file : fichero.listFiles()) {
            System.out.println("\t" + file.getName());
            if (file.isDirectory()) {
                lecturaSubdirectorios(file);
            }
        }
    }

}
