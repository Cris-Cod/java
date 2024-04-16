package Ejercicios;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer numero");
        int numero1 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el segundo numero");
        int numero2 = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa la letra s para suma - Ingresa la letra r para resta - Ingresa la letra m para multiplicar - Ingresa la letra d para la division ");
        String signo = sc.nextLine();

        double resultado = 0;

        if(signo.equalsIgnoreCase("s") ){
            resultado = numero1 + numero2;
            System.out.println("La suma de los dos numeros es " + resultado);
        }else if(signo.equalsIgnoreCase("r")){
            resultado = numero1 - numero2;
            System.out.println("La resta de los dos numeros es " + resultado);
        } else if (signo.equalsIgnoreCase("m")) {
            resultado = numero1 * numero2;
            System.out.println("La multiplicacion de los dos numeros es " + resultado);
        } else if (signo.equalsIgnoreCase("d")) {
            resultado = numero1 * numero2;
            System.out.println("La divison de los dos numeros es " + resultado);
        }else {
            System.out.println("Ingresa una de las letra descriptas en el inicio");
        }
    }
}
