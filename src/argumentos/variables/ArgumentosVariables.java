package argumentos.variables;

public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(5,6,8,9,4,2,6);
        imprimirNumeros(5,8);

        variosParametros("Else",8,47,58,69,63);
    }

    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento:" + numeros[i]);
        }
    }
}
