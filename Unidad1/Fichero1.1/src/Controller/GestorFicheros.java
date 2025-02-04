package Controller;

import java.io.*;

public class GestorFicheros {

    public void lecturaTextoPlano(String path){
        // FILE -> FILEREADER -> BUFFEREDREADER  -> cuando se terminan SE CIERRAN
        File file = new File(path);
        //FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        if (file.exists() && file.isFile()) {
            // existe y ademas es un fichero
            // trato la excepcion aqui
            try {
                //fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(new FileReader(file));
                /* LECTURA CON FILEREADER
                int lectura=0;
                // mientras exista el numero haz la lectura e imprime
                while ((lectura = fileReader.read())!=-1){
                    // imprime
                    System.out.print((char) lectura);
                }*/
                String lectura = null;
                // String lecturaCompleta = null;
                // StringBuffer lecturaCompleta = new StringBuffer(); -> sincronizado (si tengo varios hilos, se
                // cominucan entre ellos para decir quien tiene el objeto ocupado
                StringBuilder lecturaCompleta = new StringBuilder(); // solo lo va a utilizar un hilo
                while ((lectura = bufferedReader.readLine())!=null){
                    //System.out.println(lectura);
                    //lecturaCompleta+=lectura;
                    lecturaCompleta.append(lectura);
                    lecturaCompleta.append("\n");
                }
                System.out.println(lecturaCompleta.toString());
                // JSON
                // toda la lectura
                /* int lectura = fileReader.read(); // int -> UNICODE ASCI
                System.out.print((char) lectura);
                lectura = fileReader.read(); // int -> UNICODE ASCI
                System.out.print((char) lectura);
                lectura = fileReader.read(); // int -> UNICODE ASCI
                System.out.print((char) lectura);*/

            } catch (FileNotFoundException e) {
                System.out.println("Fallo en la lectura");
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println("Error en la escritura, fallo de permisos");
            } finally {
                // se ejecuta SI o SI
                try {
                    bufferedReader.close(); // NULLPOINTEREXCEPTION
                } catch (IOException e) {
                    System.out.println("Error en el cerrado del flujo");
                    System.out.println(e.getMessage());
                    // por favor introduce una ruta valida
                } catch (Exception e) {
                    System.out.println("Error en el cerrado por ser nulo");
                }
            }
        }

    }

}
