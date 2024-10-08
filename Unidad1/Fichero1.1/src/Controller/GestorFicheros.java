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
                      //fileReader.read(); //Para quitar este error poner una "clause(catch)" con alt + enter
                      // el .read() lee una letra por letra
                      int lectura = 0;

                      while((lectura = fileReader.read()) > -1){

                          System.out.print((char) lectura);

                      }

                  } catch (FileNotFoundException e) {

                      System.out.println("Fallo en la lectura del Fichero");
                      System.out.println(e.getMessage());

                  } catch (IOException e) {
                      throw new RuntimeException(e);
                  } finally {

                      try {
                          fileReader.close();

                      } catch (IOException | NullPointerException e) {

                          System.out.println("Error del cerrado del flujo");

                      } catch(Exception e){

                          System.out.println("Error en el cerrado por ser nulo");

                      }

                  }


















              /* 1ºForma De Hacer La Excepcion

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

                      si añadimos seguido otro catch(Exception){

                            esto hará que si no encontrado ninguna de aquellas excepciones pero encuentra cualquier otra excepcion no especifica se cierre

                        }


                   }*/


                  /* 2ºForma De Hacer La Excepcion

                  fileReader = new FileReader(file); // Alt + Enter y añadimos excepcion "throws FileNotFoundException" en lel void

                   Luego en el metodo main

                   try{
                        gestorFicheros.lecturaTextoPlano(src / Resources / Lectura.txt);

                    } catch (FileNotFoundException) {

                    }

                   Esto se hace para tratar una excepcion de manera general y no tan especifica como la primera
                   */

              }

    }
}
