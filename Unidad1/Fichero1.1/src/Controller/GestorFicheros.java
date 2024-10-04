package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GestorFicheros {

    public void lecturaTextoPlano(String path){
        File file = new File(path);
        FileReader fileReader = null;

              if(file.exists() && file.isFile()){

                  try{
                      fileReader = new FileReader(file);
                  } catch (FileNotFoundException e) {
                      System.out.println("Fallo en la lectura del Fichero");
                      System.out.println(e.getMessage());
                  } finally {
                      try {
                          fileReader.close();
                      } catch (IOException | NullPointerException e) { // as í tratamos las excepciones especificas que queramos
                          System.out.println("Error del cerrado del flujo");
                      }
                      /*
                      si añadimos seguido otro catch(Exception){

                            esto hará que si no encontrado ninguna de aquellas excepciones pero encuentra cualquier otra excepcion no especifica se cierre

                        }
                      */

                  }

                }
    }
}
