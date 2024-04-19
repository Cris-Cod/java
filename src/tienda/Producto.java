package tienda;

public class Producto {
    private String nombre;
    private String tipoProducto;
    private int cantidadProducto;
    private int CANTIDAD_MINIMA_PRODUCTO = 2;
    private int precio_base;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public Producto(String nombre, String tipoProducto, int cantidadProducto, int precio_base) {
        this.nombre = nombre;
        this.tipoProducto = tipoProducto;
        this.cantidadProducto = cantidadProducto;
        this.precio_base = precio_base;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(int precio_base) {
        this.precio_base = precio_base;
    }

    public double impuesto(double iva){
        double resultado = precio_base * iva;
        return resultado;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipoProducto='").append(tipoProducto).append('\'');
        sb.append(", cantidadProducto=").append(cantidadProducto);
        sb.append(", precio_base=").append(precio_base);
        sb.append('}');
        return sb.toString();
    }
}
