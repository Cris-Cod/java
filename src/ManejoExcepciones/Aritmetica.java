package ManejoExcepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador) {
        if(denominador == 0){
            throw  new OperacionExecpcion("Division entre cero");
        }

        return numerador / denominador;
    }
}
