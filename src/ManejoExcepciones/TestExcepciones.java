package ManejoExcepciones;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        try{
            resultado = Aritmetica.division(8,0);
        }catch (Exception e){
           System.out.println("Ocurrio un error");
          //  e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);


    }
}
