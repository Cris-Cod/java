package Ejercicios;

import java.util.Scanner;

public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dia");
        int dia = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el mes");
        int mes = Integer.parseInt(sc.nextLine());
        System.out.println("Ingresa el año");
        int anio = Integer.parseInt(sc.nextLine());

        if(dia >= 1 && dia <= 30){
            if(mes >= 1 && mes <= 12){
                if(anio != 0){
                    System.out.println("La fecha es correcta: " + dia + "-" + mes + "-" + anio);
                }
            }
        }else{
            System.out.println("La fecha no es correcta");
        }
    }

}
