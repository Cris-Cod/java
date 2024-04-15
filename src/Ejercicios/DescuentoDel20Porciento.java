package Ejercicios;

import java.util.Date;
import java.util.Scanner;

public class DescuentoDel20Porciento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio de la compra");
        double compra = Double.parseDouble(sc.nextLine());
        double descuento = 0.20;
        double compra_descuento;

        if(compra > 300){
            compra_descuento= (compra * descuento) ;
            double total_compra = compra - compra_descuento;
            System.out.println("Total de la compra es: " + total_compra);
        }else{
            System.out.println("Total de la compra es: " + compra);
        }
    }
}
