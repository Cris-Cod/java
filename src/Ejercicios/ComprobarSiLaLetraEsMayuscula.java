package Ejercicios;

import java.util.Scanner;

public class ComprobarSiLaLetraEsMayuscula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una letra");
        char caracter = sc.next().charAt(0);

        if(Character.isUpperCase(caracter)){
            System.out.println("la letra " +caracter+ " es mayuscula");
        }else {
            System.out.println("la letra " +caracter+ " es minuscula");
        }
    }
}
