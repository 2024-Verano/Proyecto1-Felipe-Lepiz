
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Representa una factura generada para un cliente en un sistema de ventas.
 * Contiene información relacionada con la factura, como número de factura, cliente, artículo,
 * fecha de recepción, impuestos, subtotal y total.
 */
public class Factura {
    private static List<Factura> facturas = new ArrayList<>();
    private int cantidad;
    private static int contador = 1;
    private int numeroFactura;
    private int codigoCliente;
    private int codigoArticulo;
    private LocalDate fechaRecibido;
    private boolean estado = true;
    private int subtotal;
    private static int impuesto;
    private int total;
    private int precio;

    /**
     * Constructor para crear una nueva factura.
     * 
     * @param codigoArticulo Código del artículo relacionado con la factura.
     * @param codigoCliente Código del cliente al que se le emite la factura.
     * @param cantidad Cantidad de artículos facturados.
     * @param fechaRecibido Fecha en que se recibió el pago o se generó la factura.
     * @param subtotal Subtotal de la factura antes de impuestos.
     * @param precio Precio unitario del artículo.
     * @param impuesto Monto del impuesto aplicado a la factura.
     * @param total Total de la factura incluyendo impuestos.
     */
    public Factura(int codigoArticulo, int codigoCliente, int cantidad, LocalDate fechaRecibido, int subtotal, int precio, int impuesto, int total) {
        this.codigoArticulo = codigoArticulo;
        this.codigoCliente = codigoCliente;
        this.numeroFactura = contador++;
        this.cantidad = cantidad;
        this.fechaRecibido = fechaRecibido;
        this.subtotal = subtotal;
        this.precio = precio;
        this.impuesto = impuesto;
        this.total = total;
    }

    // Setters y getters para Factura:
    public void setEstadoCerrado(){
        this.estado = false;
    }
    
    public void setEstadoAbierto(){
        this.estado = true;
    }

    /**
     * Obtiene el número de la factura.
     * 
     * @return Número de la factura.
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    /**
     * Obtiene la fecha de recepción de la factura.
     * 
     * @return Fecha de recepción de la factura.
     */
    public LocalDate getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(LocalDate fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    /**
     * Verifica si la factura está activa (no anulada).
     * 
     * @return Verdadero si la factura está activa, falso si está anulada.
     */
    public boolean isEstado() {
        return estado;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Obtiene la lista de todas las facturas.
     * 
     * @return Lista de facturas.
     */
    public static List<Factura> getFacturas() {
        return facturas;
    }

    /**
     * Muestra los detalles básicos de la factura en formato legible.
     * 
     * @return Información detallada de la factura.
     */
    public String datosFactura(){
        return String.format("""
                             N\u00famero Factura: %d
                             C\u00f3digo Cliente: %d
                             Fecha Recibido: %s
                             Estado: %s
                             Subtotal: %d
                             Impuesto: %d
                             Total: %d""",
                           numeroFactura, codigoCliente, fechaRecibido,
                           estado ? "Válido" : "Anulado", subtotal, impuesto, total);
    }

    /**
     * Muestra los detalles completos de la factura, incluyendo artículo, cantidad, y precio unitario.
     * 
     * @return Detalles completos de la factura.
     */
    public String detallesFactura(){
        return String.format("""
                             Numero Factura: %d
                             Codigo Articulo: %d
                             Cantidad: %d
                             Precio Unitario: %d
                             Total: %d""", numeroFactura, codigoArticulo, cantidad, precio,
                            total);
    }

    // Métodos para Factura:

    /**
     * Agrega una nueva factura a la lista de facturas.
     * 
     * @param nuevaFactura La factura que se va a agregar.
     */
    public void agregarFactura(Factura nuevaFactura) {
        facturas.add(nuevaFactura);
    }

    /**
     * Anula una factura existente mediante su número.
     * 
     * @param numeroFactura Número de la factura a anular.
     */
    public void anularFactura(int numeroFactura) {
        Factura factura = facturas.stream().filter(f -> f.getNumeroFactura() == numeroFactura).findFirst()
                .orElse(null);
        if(factura != null){
            factura.setEstadoCerrado();
            return;
        }
        JOptionPane.showMessageDialog(null,"No se encontro ninguna factura","Error", JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Busca una factura por su número.
     * 
     * @param numeroFactura Número de la factura que se desea buscar.
     * @return La factura correspondiente, o null si no se encuentra.
     */
    public static Factura buscarFacturaNumero(int numeroFactura) {
        return facturas.stream()
                .filter(f -> f.getNumeroFactura() == numeroFactura)
                .findFirst()
                .orElse(null);
    }

    /**
     * Busca una factura por su fecha de recepción.
     * 
     * @param fecha Fecha de recepción de la factura.
     * @return La factura correspondiente, o null si no se encuentra.
     */
    public static Factura buscarFacturaFecha(LocalDate fecha) {
        return facturas.stream()
                .filter(f -> f.getFechaRecibido().equals(fecha))
                .findFirst()
                .orElse(null);
    }

    /**
     * Busca una factura asociada a un cliente por su nombre.
     * 
     * @param nombreCliente Nombre del cliente para el que se busca la factura.
     * @return La factura correspondiente, o null si no se encuentra.
     */
    public static Factura buscarFacturaCliente(String nombreCliente) {
        Cliente clienteNombre = Cliente.buscarClienteNombre(nombreCliente);
        
        if (clienteNombre == null) {
            return null; // No se encontró el cliente
        }
        
        for(Factura factura : facturas){
            if(clienteNombre.getNombre().equalsIgnoreCase(nombreCliente)){
                return factura;
            }
        }
        return null;
    }
}