package bloqueInicializacion;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static{
        System.out.println("Ejecución bloque estatico");
        ++Persona.contadorPersonas;
    }

    //bloque de inizaciolacion no estatico
    {
        System.out.println("Ejecución bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona(){
        System.out.println("Ejemplo constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
}
