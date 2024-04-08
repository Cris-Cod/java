package Herencia;

import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Mia", 200000);
        System.out.println("empleado1 = " + empleado1);

        var fecha = new Date();
        Cliente cliente1 = new Cliente("Mia", new Date(), false);
        System.out.println("cliente1 = " + cliente1);


    }
}
