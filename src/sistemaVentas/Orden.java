package sistemaVentas;


public class Orden {
    private int idOrden;
    private Productos productos[];
    private int contadorOrdenes;
    final static int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++contadorOrdenes;
        this.productos = new Productos[MAX_PRODUCTOS];
    }

    public static void agregarProducto(){

    }

    public static double calcularTotal(){
        return 12.4;
    }

    public static void mostrarOrden(){

    }
}
