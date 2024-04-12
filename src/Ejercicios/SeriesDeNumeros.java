package Ejercicios;

import java.util.Scanner;

public class SeriesDeNumeros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();

        for (int j = 0; j <= n; j++) {
             a+=(((int)(Math.pow(2,j))) * b);
            System.out.println(a+"");
        }


        in.close();
    }
}
