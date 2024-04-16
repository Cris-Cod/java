package Ejercicios;

import java.util.Scanner;

public class CalcularCifrasDeUnNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int numero = Integer.parseInt(sc.nextLine());

        if(numero >= 0 && numero < 10){
            System.out.println("El numero " + numero + " tiene una cifra");
        } else if (numero >= 10 && numero < 100) {
            System.out.println("El numero " + numero + " tiene dos cifras");
        } else if (numero >= 100 && numero < 1000) {
            System.out.println("El numero " + numero + " tiene tres cifras");
        } else if (numero >= 1000 && numero < 10000) {
            System.out.println("El numero " + numero + " tiene cuatro cifras");
        } else if (numero >= 10000 && numero < 100000) {
            System.out.println("El numero " + numero + " tiene cinco cifras");
        }else{
            System.out.println("El numero " + numero + " de estar en el rango de 0 y 99999" );
        }
    }
}
