
/**
 * Clase que representa un tipo de producto con un código único y un nombre.
 * El código es generado automáticamente en función de un contador global.
 */
public class TipoProducto {
    private static int contadorCodigo = 1; // Contador para generar códigos únicos para cada tipo de producto
    public static int codigoTipoProducto; // Código único del tipo de producto
    private String nombre; // Nombre del tipo de producto

    /**
     * Constructor de la clase TipoProducto.
     * Este constructor asigna un código único al tipo de producto y establece su nombre.
     * 
     * @param nombre Nombre del tipo de producto.
     */
    public void TipoProducto(String nombre){
        this.codigoTipoProducto = contadorCodigo++; // Asigna un código único incrementando el contador
        this.nombre = nombre; // Establece el nombre del tipo de producto
    }

    /**
     * Obtiene el código único del tipo de producto.
     * 
     * @return El código único del tipo de producto.
     */
    public int getCodigo() {
        return codigoTipoProducto;
    }

    /**
     * Obtiene el nombre del tipo de producto.
     * 
     * @return El nombre del tipo de producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del tipo de producto.
     * El nombre se ajusta para eliminar los espacios en blanco al principio y al final.
     * 
     * @param nombre El nuevo nombre del tipo de producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre.trim(); // Elimina espacios innecesarios
    }
}