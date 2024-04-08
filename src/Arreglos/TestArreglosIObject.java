package Arreglos;

import Arreglos.PersonaArreglos;

public class TestArreglosIObject {
    public static void main(String[] args) {
        PersonaArreglos personas[] = new PersonaArreglos[2];

        personas[0] = new PersonaArreglos("Luisa");
        personas[1] = new PersonaArreglos("Mia");

        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);

        for (int i = 0; i < personas.length; i++){
            System.out.println("persona " + i + " = " + personas[i]);
        }

        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " +i+ " = " + frutas[i]);
        }
    }
}
