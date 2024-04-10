package enumeraciones;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiasSemana(Dias.JUEVES);

        System.out.println("Continente # 4 " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4 continente: " + Continentes.AMERICA.getPaies()  + " paises");
    }

    private static void indicarDiasSemana(Dias dias){
        switch (dias){
            case LUNES -> System.out.println("Primer dia de la semana");
            case MARTES -> System.out.println("Segundo dia de la semana");
            case MIERCOLES -> System.out.println("Tercer dia de la semana");
            case JUEVES -> System.out.println("Cuarto dia de la semana");
            case VIERNES -> System.out.println("Quinto dia de la semana");
        }
    }
}
