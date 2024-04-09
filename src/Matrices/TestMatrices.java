package Matrices;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int [3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 10;
        edades[1][1] = 3;
        edades[2][0] = 7;
        edades[2][1] = 4;

        System.out.println("edades[0][0] = " + edades[0][0]);

        for (int reglon = 0; reglon < edades.length; reglon++) {
            for (int col = 0; col < edades[reglon].length; col++) {
                System.out.println("edades " + reglon + "-" + col + ": "  + edades[reglon][col]);
            }
        }

        String frutas[][] = {{"Naranja" , "limon"},{"Fresa", "Zarzamora"}};
        imprimir(frutas);


        PersonaMatrices personas [][] = new PersonaMatrices[2][3];
        personas[0][0] = new PersonaMatrices("Mai");
        personas[0][1] = new PersonaMatrices("Luisa");
        personas[0][1] = new PersonaMatrices("Luisa");
        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]){
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int col = 0; col < matriz[filas].length; col++) {
                System.out.println("frutas " + filas + "-" + col + ": " + matriz[filas][col]);
            }
        }
    }
}
