package Ejercicios;

import java.util.Scanner;

public class NumeroEnteroMultiploDe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa un numero");
        numero = Integer.parseInt(sc.nextLine());

        if(numero % 10 == 0){
            System.out.println("El numero " + numero + " es multiplo de 10");
        }else {
            System.out.println("El numero " + numero + " no es multiplo de 10");
        }



    }
}
