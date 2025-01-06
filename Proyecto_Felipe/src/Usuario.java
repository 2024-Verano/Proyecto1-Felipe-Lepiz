
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase que representa a un usuario en el sistema.
 * Contiene métodos para manejar usuarios, bloquear, desbloquear, agregar y validar credenciales.
 */
public class Usuario {
    
    private String nombreUsuario, contrasenna;
    private boolean bloqueado = false;
    public static List<Usuario> listaUsuarios = new ArrayList<>();
    
    /**
     * Constructor que crea un nuevo objeto Usuario con el nombre de usuario y la contraseña especificados.
     * 
     * @param nombreUsuario El nombre del usuario.
     * @param contrasenna La contraseña del usuario.
     */
    public Usuario(String nombreUsuario, String contrasenna) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenna = contrasenna;
    }
    
    // Setters y Getters para Usuario:    

    /**
     * Obtiene la lista de usuarios registrados en el sistema.
     * 
     * @return La lista de usuarios.
     */
    public static List<Usuario> getUsuarios(){
        return listaUsuarios;
    }
    
    /**
     * Obtiene el nombre de usuario.
     * 
     * @return El nombre de usuario.
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Establece un nuevo nombre de usuario.
     * 
     * @param nombreUsuario El nuevo nombre de usuario.
     */
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    /**
     * Obtiene la contraseña del usuario.
     * 
     * @return La contraseña del usuario.
     */
    public String getContrasenna() {
        return contrasenna;
    }

    /**
     * Establece una nueva contraseña para el usuario.
     * 
     * @param contrasenna La nueva contraseña.
     */
    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    /**
     * Verifica si el usuario está bloqueado.
     * 
     * @return true si el usuario está bloqueado, false si no lo está.
     */
    public boolean isBloqueado(){
        return bloqueado;
    }
    
    /**
     * Bloquea al usuario, impidiendo su acceso.
     */
    public void bloquearUsuario(){
        this.bloqueado = true;
    }
    
    /**
     * Desbloquea al usuario, permitiendo su acceso nuevamente.
     */
    public void desBloquearUsuario(){
        this.bloqueado = false;
    }
    
    // Métodos para Usuario:

    /**
     * Agrega un nuevo usuario a la lista de usuarios.
     * 
     * @param usuario El usuario que se desea agregar.
     */
    public void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }
    
    /**
     * Valida las credenciales de un usuario verificando su nombre de usuario y contraseña.
     * Si el usuario está bloqueado, se muestra un mensaje de error.
     * 
     * @param usuario El nombre de usuario.
     * @param contrasenna La contraseña del usuario.
     * @return true si las credenciales son correctas, false en caso contrario.
     */
    public static boolean validarCredenciales(String usuario, String contrasenna) {       
        // Obtiene la lista de usuarios del gestor de datos
        for (Usuario user : listaUsuarios) {
            if (user.getNombreUsuario().equals(usuario)) {
                if(user.isBloqueado()){
                    JOptionPane.showMessageDialog(null, "Usuario bloqueado. Contacte al administrador.", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }

                if (user.getContrasenna().equals(contrasenna)) {
                    JOptionPane.showMessageDialog(null, "Acceso correcto", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    return true; // Devuelve inmediatamente si las credenciales son correctas
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }

    /**
     * Bloquea un usuario por su nombre de usuario.
     * 
     * @param nombreUsuario El nombre del usuario que se desea bloquear.
     * @return true si el usuario fue bloqueado exitosamente, false si no existe el usuario.
     */
    public static boolean bloquearUsuarioPorNombre(String nombreUsuario) {
        for (Usuario user : listaUsuarios) {
            if (user.getNombreUsuario().equals(nombreUsuario)) {
                user.bloquearUsuario();
                return true;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Parece que el usuario no existe, crea uno nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    
    /**
     * Desbloquea un usuario por su nombre de usuario.
     * 
     * @param nombreUsuario El nombre del usuario que se desea desbloquear.
     */
    public static void desBloquearUsuarioPorNombre(String nombreUsuario) {
        for (Usuario user : listaUsuarios) {
            if (user.getNombreUsuario().equals(nombreUsuario)) {
                user.desBloquearUsuario();
                return;
            }
        }
        
        JOptionPane.showMessageDialog(null, "OOPS! Parece que el usuario no existe, crea uno nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}