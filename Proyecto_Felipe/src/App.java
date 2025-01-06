//Elaborado por: Felipe Lepiz
//Ultima modificacion: 01/05/2025 19:00

/**
 * Clase principal de la aplicación.
 * Contiene el punto de entrada del programa.
 */
public class App {

    /**
     * Método principal (punto de entrada de la aplicación).
     * Crea una instancia de la clase ManejoArchivos y llama al método CrearArchivo.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        ManejoArchivos objArchivos = new ManejoArchivos();
        
        // Llama al método para crear un archivo
        objArchivos.CrearArchivo();
    }  
}
