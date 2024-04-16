package Ejercicios;

import java.util.Scanner;

public class PedirUnaNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una nota");
        int nota = Integer.parseInt(sc.nextLine());

        if(nota >= 0 && nota < 4){
            System.out.println("La nota es Insuficiente");
        } else if (nota > 4 && nota <= 6) {
            System.out.println("La nota es Suficiente");
        } else if (nota > 6 && nota <= 7) {
            System.out.println("La nota es Bien");
        }else if(nota > 7 && nota <= 8){
            System.out.println("La nota es Notable");
        } else if (nota > 8 && nota <= 9) {
            System.out.println("La nota es Sobresaliente");
        } else if (nota > 9 && nota <= 10) {
            System.out.println("La nota es Excelente");
        }else {
            System.out.println("Ingresa una nota desde 0 a 10");
        }
    }



}
