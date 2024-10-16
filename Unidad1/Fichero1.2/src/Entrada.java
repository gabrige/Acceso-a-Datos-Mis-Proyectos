import Controller.GestionFicherosEscritura;
import Controller.GestorFicherosLectura;

public class Entrada {

    public static void main(String[] args) {

        GestionFicherosEscritura gestionFicherosEsctirura = new GestionFicherosEscritura();
        gestionFicherosEsctirura.escribirFichero("src/Resources/ficheros/escritura.txt");

    }
}
