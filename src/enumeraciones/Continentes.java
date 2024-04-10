package enumeraciones;

public enum Continentes {
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCENIA(14);

    private final int paises;

    Continentes(int paises){
        this.paises = paises;
    }

    public int getPaies(){
        return this.paises;
    }

}
