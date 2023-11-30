import java.io.File;  // Importa la clase File
import java.io.IOException;  // Importa el manejador de errores

public class try_4 {
  public static void main(String[] args) {
    try {
      File miObj = new File("nameFile.txt");
      if (miObj.createNewFile()) {
        System.out.println("Archivo Creado: " + miObj.getName());
      } else {
        System.out.println("El Archivo ya existe.");
      }
    } catch (IOException e) {
      System.out.println("A ocurrido un error.");
      e.printStackTrace();
    }
  }
}