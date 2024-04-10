package modificadoresAcceso;

public class ClaseHija extends ClaseProctected{
    public ClaseHija(){
        super();
        this.atributoProctected = "Modificación atributo protected";
        this.metodoProtected();
    }
}
