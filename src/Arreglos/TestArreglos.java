package Arreglos;

public class TestArreglos {
    public static void main(String[] args) {
        int edades [] = new int[3];
        System.out.println("edades = " + edades);

        //Modificar los elementos del arreglo
        edades[0] = 10;
        System.out.println("edades[0] = " + edades[0]);
        edades[1] = 3;
        edades[2] = 12;

        for(int i = 0; i < edades.length; i++){
            System.out.println("elemento = " + i + ": " + edades[i]);
        }
    }
}
