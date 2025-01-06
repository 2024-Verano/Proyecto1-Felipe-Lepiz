
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;

/**
 * Clase que representa un artículo en el sistema, incluyendo sus características y métodos para manipularlo.
 */
public class Articulo {
    private static int contadorCodigo = 1; 
    private int codigo;
    int codigoTipoProducto = TipoProducto.codigoTipoProducto;
    private String nombre;
    private String tipo;
    private int tamanno = 0;
    private String marca;
    private int precio;
    private int cantidad;
    public static List<Articulo> listaArticulos = new ArrayList<>();
        
    /**
     * Constructor de la clase Articulo.
     * @param nombre El nombre del artículo.
     * @param tipo El tipo de artículo.
     * @param marca La marca del artículo.
     * @param precio El precio del artículo.
     * @param cantidad La cantidad del artículo.
     */
    public Articulo(String nombre, String tipo, String marca, int precio, int cantidad) {
        this.codigo = contadorCodigo++;
        this.nombre = nombre.trim();
        this.tipo = tipo.trim();
        this.marca = marca.trim();
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    // Getters y Setters

    /**
     * Obtiene la lista de todos los artículos.
     * @return Una lista con todos los artículos registrados.
     */
    public static List<Articulo> getArticulos(){
        return listaArticulos;
    }

    /**
     * Obtiene el código del artículo.
     * @return El código del artículo.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el código del tipo de producto.
     * @return El código del tipo de producto asociado.
     */
    public int getCodigoTipoProducto() {
        return codigoTipoProducto;
    }

    /**
     * Obtiene el nombre del artículo.
     * @return El nombre del artículo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del artículo.
     * @param nombre El nombre a establecer.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre.trim();
    }

    /**
     * Obtiene el tipo de artículo.
     * @return El tipo del artículo.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece el tipo del artículo.
     * @param tipo El tipo a establecer.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo.trim();
    }

    /**
     * Obtiene el tamaño del artículo.
     * @return El tamaño del artículo.
     */
    public int getTamanno() {
        return tamanno;
    }

    /**
     * Establece el tamaño del artículo.
     * @param tamaño El tamaño a establecer.
     */
    public void setTamanno(int tamaño) {
        this.tamanno = tamaño;
    }

    /**
     * Obtiene la marca del artículo.
     * @return La marca del artículo.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del artículo.
     * @param marca La marca a establecer.
     */
    public void setMarca(String marca) {
        this.marca = marca.trim();
    }

    /**
     * Obtiene el precio del artículo.
     * @return El precio del artículo.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del artículo.
     * @param precio El precio a establecer.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad del artículo.
     * @return La cantidad del artículo.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad del artículo.
     * @param cantidad La cantidad a establecer.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    // Métodos para Artículo:

    /**
     * Agrega un nuevo artículo a la lista de artículos.
     * @param articulo El artículo que se va a agregar.
     */
    public static void agregarArticulo(Articulo articulo) {
        listaArticulos.add(articulo);
    }

    /**
     * Busca un artículo por su código.
     * @param codigo El código del artículo a buscar.
     * @return El artículo encontrado, o null si no se encuentra.
     */
    public static Articulo buscarArticuloCodigo(int codigo){
        return Articulo.getArticulos().stream()
                  .filter(art -> art.getCodigo() == codigo)
                  .findFirst()
                  .orElse(null);
    }

    /**
     * Busca un artículo por su nombre.
     * @param nombre El nombre del artículo a buscar.
     * @return El artículo encontrado, o null si no se encuentra.
     */
    public static Articulo buscarArticuloNombre(String nombre){
        return Articulo.getArticulos().stream()
                  .filter(art -> art.getNombre().equals(nombre))
                  .findFirst()
                  .orElse(null);
    }

    /**
     * Elimina un artículo de la lista por su código.
     * @param codigo El código del artículo a eliminar.
     */
    public static void eliminarArticulo(int codigo){
        boolean articuloEliminado = Articulo.getArticulos().removeIf(a -> a.getCodigo() == codigo);

        // Si no se encontró ningún artículo
        if (!articuloEliminado) {
            JOptionPane.showMessageDialog(null, "Articulo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Modifica los detalles de un artículo existente.
     * @param codigo El código del artículo a modificar.
     * @param nombre El nuevo nombre del artículo.
     * @param tipo El nuevo tipo del artículo.
     * @param marca La nueva marca del artículo.
     * @param precio El nuevo precio del artículo.
     * @param cantidad La nueva cantidad del artículo.
     * @param tamanno El nuevo tamaño del artículo.
     */
    public static void modificarArticulo(int codigo, String nombre, String tipo, String marca, int precio, int cantidad, int tamanno) {
        Optional<Articulo> articuloModificar = Articulo.getArticulos().stream()
                .filter(art -> art.getCodigo() == codigo)
                .findFirst();

        if (articuloModificar.isPresent()) {
            Articulo articulo = articuloModificar.get();
            // modificar
            articulo.setNombre(nombre);
            articulo.setTipo(tipo);
            articulo.setMarca(marca);
            articulo.setPrecio(precio);
            articulo.setCantidad(cantidad);
            articulo.setTamanno(tamanno);

            JOptionPane.showMessageDialog(null, "Artículo modificado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el artículo con el código " + codigo, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
