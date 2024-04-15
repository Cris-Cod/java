package Ejercicios;

import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa las horas trabajas en la semana");
        double  horasTrabajadas = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa las horas extras trabajas en la semana");
        double horasExtras = Double.parseDouble(sc.nextLine());

        if (horasTrabajadas <= 40 && horasExtras == 0){
            double sueldo = horasTrabajadas * 16;
            System.out.println("El sueldo semanal es: " + sueldo);
        }else if(horasTrabajadas <= 40 && horasExtras >= 1){
            double horasNormal = horasTrabajadas * 16;
            double horas = horasExtras * 20;
            double sueldo = horasNormal + horas;
            System.out.println("El sueldo semanal es: " + sueldo);
        }else {
            System.out.println("No se ingresaron horas su sueldo es: 0");
        }

    }
}
