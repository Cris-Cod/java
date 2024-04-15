package Ejercicios;

import java.util.Scanner;

public class CualNumeroEsMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el primer numero");
        var numero1 = Integer.parseInt(sc.nextLine());
        System.out.println("ingresa el segundo numero");
        var numero2 = Integer.parseInt(sc.nextLine());

        if(numero1 > numero2){
            System.out.println("El numnero mayor es " + numero1);
        }else if (numero2 > numero1){
            System.out.println("El numnero mayor es " + numero2);
        }else{
            System.out.println("Son iguales");
        }

    }
}
