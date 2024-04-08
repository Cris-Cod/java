package palabraFinal;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;

        final Persona persona1 = new Persona();
        persona1.setNombre("Maria");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
        persona1.setNombre("Luisa");
        System.out.println("persona1.getNombre() = " + persona1.getNombre());
    }
}
