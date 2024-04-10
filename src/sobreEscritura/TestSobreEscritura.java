package sobreEscritura;

public class TestSobreEscritura {
    public static void main(String[] args) {
      //  Gerente gerente1 = new Gerente("Mia", 500.00, "Sistemas");
     //   System.out.println("gerente1.obtenerDetalles() = " + gerente1.obtenerDetalles());

       Empleado empleado = new Empleado("Maria", 500.0);
      //  System.out.println(empleado.obtenerDetalles());
        imprimir(empleado);
        
       Gerente gerente2 = new Gerente("Karla", 1000, "Contabilidad");
        //System.out.println("gerente2.obtenerDetalles() = " + gerente2.obtenerDetalles());
        imprimir(gerente2);

    }

    public static void imprimir(Empleado empleado){
        System.out.println("empleado.obtenerDetalles() = " + empleado.obtenerDetalles());
    }
}
