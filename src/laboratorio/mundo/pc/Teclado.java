package laboratorio.mundo.pc;

public class Teclado extends DispositivosEntrada{
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Teclado{");
        sb.append("idTeclado= ").append(idTeclado);
        sb.append(" ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
