package modificadoresAcceso;

public class ClaseProctected {

    protected String atributoProctected = "valor Atributo protected";

    protected ClaseProctected(){
        System.out.println("Constructor protected");
    }

    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}
