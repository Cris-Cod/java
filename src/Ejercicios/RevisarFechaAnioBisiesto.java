package Ejercicios;

import java.util.Scanner;

public class RevisarFechaAnioBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dia");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el mes");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el año");
        int anio = Integer.parseInt(sc.nextLine());

        if (anio == 0){
            System.out.println("Fecha incorrecta");
        } else if (mes == 2  && (dia >= 1 && dia <= 28)) {
            System.out.println("Fecha correcta");
        }else if(mes == 4 || mes == 6 || mes == 9 || mes == 11 && (dia >= 1 && dia <= 30)){
            System.out.println("Fecha correcta");
        }else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 && (dia >= 1 && dia <= 31)){
            System.out.println("Fecha correcta");
        }
    }
}
