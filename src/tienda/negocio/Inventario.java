package tienda.negocio;

public interface Inventario {
    String NOMBRE_ARCHIVO = "inventario.txt";
    public void visualizar_prodcutos(String nombreProducto);
    public void ingresar_producto(String nombreProucto, String tipoProducto, int cantidadProducto, double precioBaseProducto);
    public void vender_producto(String nombreProducto, int catidadProducto);
    public void modificar_producto(String nombreProducto);



    public String mostrar_producto_mas_vendido();
    public String mostrar_producto_menos_vendido();
    public double total_dinero_obtenido_por_ventas();
    public double cantidad_obtenido_por_unidad_promedio_vendida();
}
