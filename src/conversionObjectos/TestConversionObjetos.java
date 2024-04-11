package conversionObjectos;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;

        empleado = new Escritor("Mia", 200, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);

        System.out.println("empleado.obtenerDetalles() = " + empleado.obtenerDetalles());
        //downCasting
       // ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        System.out.println("escritor = " + escritor.getTipoEscritura());
        
        Empleado empleado2 = escritor;
        System.out.println("empleado2.obtenerDetalles() = " + empleado2.obtenerDetalles());

    }
}
