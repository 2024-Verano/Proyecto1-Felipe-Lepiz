
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Esta clase se encarga de manejar las operaciones relacionadas con la creación y limpieza de archivos
 * necesarios en el sistema. Los archivos son creados si no existen y se limpian si ya existen.
 */
public class ManejoArchivos {
    // Objeto para la ventana de login
    VentanaLoginn objLogin = new VentanaLoginn();

    // Lista con los nombres de los archivos a crear
    List<String> nombresArchivos = Arrays.asList(
                "Usuario.csv",
                "Cliente.csv",
                "Factura.txt",
                "Producto.csv",
                "ServicioMantenimiento.csv"
        );

    /**
     * Este método crea los archivos especificados en la lista `nombresArchivos` si no existen.
     * Si el archivo ya existe, su contenido se limpia.
     * Una vez que se han creado y limpiado los archivos, se muestra un mensaje de éxito
     * y se muestra la ventana de login.
     */
    public void CrearArchivo() {
        // Itera sobre la lista de nombres de archivo y realiza la creación o limpieza
        for(String nombreArchivo : nombresArchivos){
            // Crea un objeto File para cada archivo
            File objFile = new File(nombreArchivo);

            // Verifica si el archivo no existe y lo crea
            if(!objFile.exists()){
                try{
                    objFile.createNewFile();
                }
                catch(IOException e){
                    // Muestra un mensaje de error si no se puede crear el archivo
                    JOptionPane.showMessageDialog(null, "Error al crear el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                // Si el archivo ya existe, se limpia su contenido
                try{
                    FileWriter objFileW = new FileWriter(objFile, false);
                    // El constructor de FileWriter con `false` limpia el archivo
                    objFileW.close();
                }
                catch(IOException e){
                    // Muestra un mensaje de advertencia si no se puede limpiar el archivo
                    JOptionPane.showMessageDialog(null, "No se limpio el archivo.", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

        // Muestra un mensaje de éxito al finalizar la creación y limpieza de los archivos
        JOptionPane.showMessageDialog(null, "Se han creado los archivos necesarios.", "Exito", JOptionPane.INFORMATION_MESSAGE);

        // Muestra la ventana de login
        objLogin.setVisible(true);
    }
}