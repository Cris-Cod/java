package sistemaVentas;

public class VentaTest {
    public static void main(String[] args) {
        Productos producto1 = new Productos("Camisa", 50.00);
        Productos producto2 = new Productos("Pantalon", 100.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);

        orden1.calcularTotal();
        orden1.mostrarOrden();
    }
}
