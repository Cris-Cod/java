public class Operadores {
    public static void main(String args[]){
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("Resultado suma: " + resultado);

        resultado = a - b;
        System.out.println("Resultado resta: " + resultado);

        resultado = a * b;
        System.out.println("Resultado multipliacion: " + resultado);

        var resultado_division = 3.0 / b;
        System.out.println("Resultado division: " + resultado_division);

        resultado = a % b;
        System.out.println("Resultado modulo: " + resultado);

        if(b % 2 == 0){
            System.out.println("Es numero par");
        }else {
            System.out.println("Es numero impar");
        }
    }
}
