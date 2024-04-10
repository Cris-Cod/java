package modificadoresAcceso;

public class TestModificadores {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();

        ClaseProctected claseProctected = new ClaseProctected();
        System.out.println(claseProctected.atributoProctected);
        claseProctected.metodoProtected();

        ClaseHija claseHija = new ClaseHija();
        System.out.println(claseHija.atributoProctected);


        ClasePrivate clasePrivate = new ClasePrivate("constructo publico de clasePrivate");
        System.out.println(clasePrivate.getAtributoPrivado());

    }
}
