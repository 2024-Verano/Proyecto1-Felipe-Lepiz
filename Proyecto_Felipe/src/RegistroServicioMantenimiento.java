
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;

/**
 * Esta clase representa un servicio de mantenimiento de bicicletas, incluyendo
 * la capacidad de registrar, modificar y buscar servicios asociados a clientes.
 * También gestiona la escritura de registros en un archivo CSV.
 */
public class RegistroServicioMantenimiento {
    private static int contador = 1; // Variable para autoincrementar el código del servicio
    // Lista estática para almacenar todos los objetos creados
    public static List<RegistroServicioMantenimiento> servicios = new ArrayList<>();
    
    // Atributos de la clase:
    private int codigoServicio;
    private int codigoCliente;
    private String marcaBicicleta;
    private String descripcionBicicleta;
    private int precio;
    private LocalDate fechaRecibido;
    private LocalDate fechaEntrega;
    private String observaciones;
    private String estado; // "Abierto" o "Cerrado"    

    /**
     * Constructor que inicializa los atributos del servicio de mantenimiento.
     * 
     * @param codigoCliente Código del cliente asociado al servicio
     * @param marcaBicicleta Marca de la bicicleta
     * @param descripcionBicicleta Descripción de la bicicleta
     * @param precio Precio del servicio
     * @param fechaRecibido Fecha en que se recibió la bicicleta
     * @param fechaEntrega Fecha en que se entregará la bicicleta
     * @param observaciones Observaciones adicionales sobre el servicio
     * @param estado Estado del servicio ("Abierto" o "Cerrado")
     */
    public RegistroServicioMantenimiento(int codigoCliente, String marcaBicicleta, String descripcionBicicleta, int precio, LocalDate fechaRecibido, LocalDate fechaEntrega, String observaciones, String estado) {
        this.codigoServicio = contador++;
        this.codigoCliente = codigoCliente;
        this.marcaBicicleta = marcaBicicleta;
        this.descripcionBicicleta = descripcionBicicleta;
        this.precio = precio;
        this.fechaRecibido = fechaRecibido;
        this.fechaEntrega = fechaEntrega;
        this.observaciones = observaciones;
        this.estado = estado;
    }
    
    // Métodos getter y setter:

    /**
     * Obtiene el código del servicio.
     * 
     * @return Código del servicio
     */
    public int getCodigoServicio() {
        return codigoServicio;
    }

    /**
     * Obtiene el código del cliente asociado al servicio.
     * 
     * @return Código del cliente
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Establece el código del cliente asociado al servicio.
     * 
     * @param codigoCliente Código del cliente
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * Obtiene la marca de la bicicleta.
     * 
     * @return Marca de la bicicleta
     */
    public String getMarcaBicicleta() {
        return marcaBicicleta;
    }

    /**
     * Establece la marca de la bicicleta, validando que no esté vacía.
     * 
     * @param marcaBicicleta Marca de la bicicleta
     */
    public void setMarcaBicicleta(String marcaBicicleta) {
        if (marcaBicicleta.isEmpty()){
            JOptionPane.showMessageDialog(null, "La marca de la bicicleta no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.marcaBicicleta = marcaBicicleta.trim(); // Elimina espacios en blanco
    }

    /**
     * Obtiene la descripción de la bicicleta.
     * 
     * @return Descripción de la bicicleta
     */
    public String getDescripcionBicicleta() {
        return descripcionBicicleta;
    }

    /**
     * Establece la descripción de la bicicleta, validando que no esté vacía.
     * 
     * @param descripcionBicicleta Descripción de la bicicleta
     */
    public void setDescripcionBicicleta(String descripcionBicicleta) {
        if (descripcionBicicleta.isEmpty()){
            JOptionPane.showMessageDialog(null, "La descripcion de la bicicleta no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.descripcionBicicleta = descripcionBicicleta.trim();
    }

    /**
     * Obtiene el precio del servicio.
     * 
     * @return Precio del servicio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del servicio.
     * 
     * @param precio Precio del servicio
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la fecha en que se recibió la bicicleta.
     * 
     * @return Fecha de recepción
     */
    public LocalDate getFechaRecibido() {
        return fechaRecibido;
    }

    /**
     * Establece la fecha en que se recibió la bicicleta.
     * 
     * @param fechaRecibido Fecha de recepción
     */
    public void setFechaRecibido(LocalDate fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    /**
     * Obtiene la fecha en que se entregará la bicicleta.
     * 
     * @return Fecha de entrega
     */
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * Establece la fecha en que se entregará la bicicleta.
     * 
     * @param fechaEntrega Fecha de entrega
     */
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * Obtiene las observaciones adicionales sobre el servicio.
     * 
     * @return Observaciones del servicio
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Establece las observaciones adicionales sobre el servicio, validando que no estén vacías.
     * 
     * @param observaciones Observaciones del servicio
     */
    public void setObservaciones(String observaciones) {
        if (observaciones.isEmpty()){
            JOptionPane.showMessageDialog(null, "Las observaciones de la bicicleta no pueden estar vacías.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.observaciones = observaciones.trim();
    }

    /**
     * Obtiene el estado del servicio.
     * 
     * @return Estado del servicio ("Abierto" o "Cerrado")
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del servicio ("Abierto" o "Cerrado").
     * 
     * @param estado Estado del servicio
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Retorna una representación en cadena del servicio de mantenimiento.
     * 
     * @return Representación en cadena del servicio de mantenimiento
     */
    @Override
    public String toString() {
        return "ServicioMantenimiento{" +
                "codigoServicio=" + codigoServicio +
                ", codigoCliente=" + codigoCliente +
                ", marcaBicicleta='" + marcaBicicleta + '\'' +
                ", descripcionBicicleta='" + descripcionBicicleta + '\'' +
                ", precio=" + precio +
                ", fechaRecibido=" + fechaRecibido +
                ", fechaEntrega=" + fechaEntrega +
                ", observaciones='" + observaciones + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }

    /**
     * Busca un servicio asociado a un cliente dado un código de cliente.
     * 
     * @param codigoCliente Código del cliente
     */
    public void buscarServicio(int codigoCliente){
        boolean encontrado = false; 

        for (RegistroServicioMantenimiento servicio : servicios) { 
            if (servicio.getCodigoCliente() == codigoCliente) {
                // Mostrar toda la información del servicio encontrado
                System.out.println("Se encontró el siguiente servicio asociado al cliente con código: " + codigoCliente);
                System.out.println(servicio); 
                encontrado = true;
                break; 
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ningún servicio asociado al cliente con código: " + codigoCliente);
        }
    }

    /**
     * Agrega un nuevo servicio desde el formulario con los datos proporcionados.
     * 
     * @param codigoClienteStr Código del cliente (como cadena)
     * @param marcaBicicleta Marca de la bicicleta
     * @param descripcionBicicleta Descripción de la bicicleta
     * @param precioStr Precio del servicio (como cadena)
     * @param fechaRecibidoStr Fecha de recepción (como cadena)
     * @param fechaEntregaStr Fecha de entrega (como cadena)
     * @param observaciones Observaciones adicionales
     * @param estado Estado del servicio ("Abierto" o "Cerrado")
     */
    public static void agregarServicioDesdeFormulario(String codigoClienteStr, String marcaBicicleta, String descripcionBicicleta, String precioStr, String fechaRecibidoStr, String fechaEntregaStr, String observaciones, String estado) {
        try {
            // Validar entradas
            int codigoCliente = Integer.parseInt(codigoClienteStr);
            Cliente cliente = Cliente.buscarClienteCodigo(codigoCliente);
            if(cliente == null){
                JOptionPane.showMessageDialog(null, "Parece que no existe un cliente con esas credenciales.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int precio = Integer.parseInt(precioStr);
            LocalDate fechaRecibido = LocalDate.parse(fechaRecibidoStr);
            LocalDate fechaEntrega = LocalDate.parse(fechaEntregaStr);

            if (marcaBicicleta.trim().isEmpty() || descripcionBicicleta.trim().isEmpty() || observaciones.trim().isEmpty() || (!estado.equalsIgnoreCase("Abierto") && !estado.equalsIgnoreCase("Cerrado"))) {
                throw new IllegalArgumentException("todos los campos son obligatorios y deben ser válidos.");
            }

            // Crear el objeto
            RegistroServicioMantenimiento nuevoServicio = new RegistroServicioMantenimiento(
                    codigoCliente, marcaBicicleta.trim(), descripcionBicicleta.trim(),
                    precio, fechaRecibido, fechaEntrega, observaciones.trim(), estado.trim()
            );

            // Agregar a la lista
            servicios.add(nuevoServicio);
            escribirEnArchivoCSV(nuevoServicio);
            // Confirmación
            JOptionPane.showMessageDialog(null, "Servicio agregado exitosamente" , "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            // Mostrar errores al empleado
            JOptionPane.showMessageDialog(null, "Error al agregar el servicio: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Escribe los detalles de un servicio de mantenimiento en un archivo CSV.
     * 
     * @param servicio Servicio a escribir en el archivo
     */
    private static void escribirEnArchivoCSV(RegistroServicioMantenimiento servicio) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("ServicioMantenimiento.csv", true))) {
            // Formatear los datos del servicio como una línea CSV
            String linea = servicio.getCodigoServicio() + "," +
                    servicio.getCodigoCliente() + "," +
                    servicio.getMarcaBicicleta() + "," +
                    servicio.getDescripcionBicicleta() + "," +
                    servicio.getPrecio() + "," +
                    servicio.getFechaRecibido() + "," +
                    servicio.getFechaEntrega() + "," +
                    servicio.getObservaciones() + "," +
                    servicio.getEstado();

            // Escribir la línea en el archivo
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo CSV: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Modifica los detalles de un servicio existente.
     * 
     * @param codigoServicio Código del servicio a modificar
     * @param codigoCliente Nuevo código del cliente
     * @param marcaBicicleta Nueva marca de la bicicleta
     * @param descripcionBicicleta Nueva descripción de la bicicleta
     * @param precio Nuevo precio del servicio
     * @param fechaRecibido Nueva fecha de recepción
     * @param fechaEntrega Nueva fecha de entrega
     * @param observaciones Nuevas observaciones
     * @param estado Nuevo estado del servicio
     */
    public static void modificarServicio(int codigoServicio, int codigoCliente, String marcaBicicleta, String descripcionBicicleta, int precio, 
        LocalDate fechaRecibido, LocalDate fechaEntrega, String observaciones, String estado) {
            
        Optional<RegistroServicioMantenimiento> servicioModificar = 
                RegistroServicioMantenimiento.servicios.stream()
                .filter(serv -> serv.getCodigoServicio() == codigoServicio)
                .findFirst();

        if (servicioModificar.isPresent()) {
            RegistroServicioMantenimiento servicio = servicioModificar.get();
            // Modificar los detalles del servicio
            servicio.setCodigoCliente(codigoCliente);
            servicio.setMarcaBicicleta(marcaBicicleta);
            servicio.setDescripcionBicicleta(descripcionBicicleta);
            servicio.setPrecio(precio);
            servicio.setFechaRecibido(fechaRecibido);
            servicio.setFechaEntrega(fechaEntrega);
            servicio.setObservaciones(observaciones);
            servicio.setEstado(estado);

            JOptionPane.showMessageDialog(null, "Servicio modificado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el servicio con el código " + codigoServicio, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }        
}