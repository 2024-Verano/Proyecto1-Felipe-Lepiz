
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.Optional;

/**
 * Representa un cliente con atributos personales y de contacto.
 * Incluye funcionalidades para la gestión de una lista de clientes.
 */
public class Cliente {
    
    //Atributos de la clase:
    private static int contador = 1;
    private int codigo;
    private int telefono;
    private String nombre, apellidos, correo, provincia, canton, distrito;
    private LocalDate fechaNacimiento;
    private static List<Cliente> listaClientes = new ArrayList<>();
    public boolean factura = false;

    /**
     * Constructor de la clase Cliente.
     * 
     * @param telefono El número de teléfono del cliente.
     * @param nombre El nombre del cliente.
     * @param apellidos Los apellidos del cliente.
     * @param correo El correo electrónico del cliente.
     * @param provincia La provincia del cliente.
     * @param canton El cantón del cliente.
     * @param distrito El distrito del cliente.
     * @param fechaNacimiento La fecha de nacimiento del cliente.
     */
    public Cliente(int telefono, String nombre, String apellidos, String correo, String provincia, String canton, String distrito, LocalDate fechaNacimiento) {
        this.codigo = contador++;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.canton = canton;
        this.distrito = distrito;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }

    // Getters y Setters
    public boolean isFactura(){
        return factura;
    }

    /**
     * Obtiene la provincia del cliente.
     * 
     * @return La provincia del cliente.
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Obtiene la lista de clientes registrados.
     * 
     * @return La lista de clientes.
     */
    public static List<Cliente> getClientes() {
        return listaClientes;
    }

    /**
     * Obtiene el código del cliente.
     * 
     * @return El código del cliente.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     * 
     * @return El teléfono del cliente.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     * 
     * @param telefono El número de teléfono a establecer.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene los apellidos del cliente.
     * 
     * @return Los apellidos del cliente.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Establece los apellidos del cliente.
     * 
     * @param apellidos Los apellidos a establecer.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     * 
     * @return El correo electrónico del cliente.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del cliente.
     * 
     * @param correo El correo electrónico a establecer.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene el cantón del cliente.
     * 
     * @return El cantón del cliente.
     */
    public String getCanton() {
        return canton;
    }

    /**
     * Establece el cantón del cliente.
     * 
     * @param canton El cantón a establecer.
     */
    public void setCanton(String canton) {
        this.canton = canton;
    }

    /**
     * Obtiene el distrito del cliente.
     * 
     * @return El distrito del cliente.
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Establece el distrito del cliente.
     * 
     * @param distrito El distrito a establecer.
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * Obtiene la fecha de nacimiento del cliente.
     * 
     * @return La fecha de nacimiento del cliente.
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del cliente.
     * 
     * @param fechaNacimiento La fecha de nacimiento a establecer.
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Establece la provincia del cliente.
     * 
     * @param provincia La provincia a establecer.
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Métodos adicionales

    /**
     * Establece que el cliente ha realizado una factura.
     */
    public void facturar() {
        this.factura = true;
    }
    
    public void desFacturar(){
        this.factura = false;
    }

    /**
     * Obtiene los datos del cliente en formato de texto.
     * 
     * @return Los datos del cliente como una cadena de texto.
     */
    public String getDatosCliente() {
        return String.format("Código: %d\nNombre: %s\nApellidos: %s\nTeléfono: %s\nEmail: %s",
                this.codigo, this.nombre, this.apellidos, this.telefono, this.correo);
    }

    /**
     * Agrega un cliente a la lista de clientes.
     * 
     * @param nombre El cliente a agregar.
     */
    public void agregarCliente(Cliente nombre) {
        listaClientes.add(nombre);
    }

    /**
     * Busca un cliente por su código.
     * 
     * @param codigo El código del cliente a buscar.
     * @return El cliente con el código especificado, o null si no se encuentra.
     */
    public static Cliente buscarClienteCodigo(int codigo) {
        return Cliente.getClientes().stream()
                .filter(client -> client.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    /**
     * Busca un cliente por su nombre.
     * 
     * @param nombre El nombre del cliente a buscar.
     * @return El cliente con el nombre especificado, o null si no se encuentra.
     */
    public static Cliente buscarClienteNombre(String nombre) {
        return Cliente.getClientes().stream()
                .filter(client -> client.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    /**
     * Busca un cliente por sus apellidos.
     * 
     * @param apellido El apellido del cliente a buscar.
     * @return El cliente con el apellido especificado, o null si no se encuentra.
     */
    public static Cliente buscarClienteApellidos(String apellido) {
        return Cliente.getClientes().stream()
                .filter(client -> client.getApellidos().equalsIgnoreCase(apellido))
                .findFirst()
                .orElse(null);
    }

    /**
     * Modifica los datos de un cliente existente.
     * 
     * @param codigo El código del cliente a modificar.
     * @param nombreNuevo El nuevo nombre del cliente.
     * @param apellidoNuevo Los nuevos apellidos del cliente.
     * @param correoNuevo El nuevo correo del cliente.
     * @param telefonoNuevo El nuevo teléfono del cliente.
     * @param provinciaNueva La nueva provincia del cliente.
     * @param cantonNuevo El nuevo cantón del cliente.
     * @param distritoNuevo El nuevo distrito del cliente.
     * @param fechaNueva La nueva fecha de nacimiento del cliente.
     */
    public static void modificarCliente(int codigo, String nombreNuevo, String apellidoNuevo, String correoNuevo, int telefonoNuevo, String provinciaNueva
            , String cantonNuevo, String distritoNuevo, LocalDate fechaNueva) {
        Optional<Cliente> clienteModificar = Cliente.getClientes().stream().filter(client -> client.getCodigo() == codigo).findFirst();

        if (clienteModificar.isPresent()) {
            Cliente cliente = clienteModificar.get();
            // modificar
            cliente.setNombre(nombreNuevo);
            cliente.setApellidos(apellidoNuevo);
            cliente.setCorreo(correoNuevo);
            cliente.setTelefono(telefonoNuevo);
            cliente.setCanton(cantonNuevo);
            cliente.setDistrito(distritoNuevo);
            cliente.setFechaNacimiento(fechaNueva);
            cliente.setProvincia(provinciaNueva);

        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el cliente con ese código.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Elimina un cliente de la lista de clientes.
     * 
     * @param codigo El código del cliente a eliminar.
     * @return true si el cliente fue eliminado correctamente, false si no se encontró o no se puede eliminar.
     */
    public boolean eliminarCliente(int codigo) {
        // Verificamos si la factura está activa
        if (factura) {
            // Si hay factura
            JOptionPane.showMessageDialog(null, "No se puede borrar un cliente con factura.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // Salimos del método si no se puede proceder
        }

        // Si no hay factura
        boolean clienteEliminado = Cliente.getClientes().removeIf(client -> client.getCodigo() == codigo);

        // Si no se encontró ningún cliente
        if (!clienteEliminado) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

}