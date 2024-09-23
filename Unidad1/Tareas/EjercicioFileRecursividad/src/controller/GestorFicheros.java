package controller;

import java.io.File;

public class GestorFicheros {

    public void lecturaDirectorios(String path){
        File file = new File(path);
        File[] ficheros = file.listFiles();
        for(File item : ficheros){
            if(!item.isHidden()){
                System.out.println(item.getName());
            }
        }

    }

    public void listarNombres(String path){
        File file = new File(path);
        File[] ficheros = file.listFiles();
        for(File item : ficheros){
            System.out.println(item.getName());
            if(item.isDirectory()){
                File[] subdirectorio = item.listFiles();
                for(File file1 : subdirectorio){
                    System.out.println("\t"+file1.getName());
                }
            }
        }
    }

    public void lecturaRecursiva(String path) {
        File file = new File(path); // paso a un fichero logico y fisico
        //File[] ficheros = file.listFiles();
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
