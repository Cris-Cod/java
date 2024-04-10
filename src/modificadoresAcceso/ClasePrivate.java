package modificadoresAcceso;

public class ClasePrivate {
    private String atributoPrivado = "Valor atributo privado";

    private ClasePrivate(){
        System.out.println("Atributo privado");
    }

    public ClasePrivate(String argumento){
        this();
        System.out.println("Constructro publico");
    }

    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
