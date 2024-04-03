import java.util.Scanner;

public class DatosPrimitivos {
    public static void main(String args[]){
        int miVariableEntera = 3;
        System.out.println(miVariableEntera);

        //Variable mofidico
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        //var - Infrencia de tipos en JAVA
        var miVariableEntera2 = 2;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2" + miVariableCadena2);

        var _MiVariable = 1;
        var $MiVariable = 2;
        var miVariable = 3;

        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union =  titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); // Suma de numeros

        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);  //Contenxto cadena si primero encuentra una cadenatodo lo toma como cadena
        System.out.println(usuario + " " + (i + j));  // Uso de parentesis modifica la prioridad en la evalución


        var nombre = "Karla";
        System.out.println("Nueva linea: \n" + nombre);  //Carecter de salto de linea
        System.out.println("tabuladore:  \t" + nombre); // caracter de tabular
        System.out.println("Retroceso: \b" + nombre);  // regreasa una posicion
        System.out.println("Comilla Simple: '" + nombre + "'" );  //Uilizar comilla simple
        System.out.println("Comilla doble: \"" + nombre + "\"");  // Utilizar doble comilla

         //Calse Scanner
        System.out.println("Escribe tu nombre: ");
        Scanner cosola = new Scanner(System.in);
        var usuario2 = cosola.nextLine();
        System.out.println("usuario = " + usuario2);
        System.out.println("Escribe el titulo: ");
        var ti = cosola.nextLine();
        System.out.println("Resultado: " + ti + " " + usuario2);


        System.out.println("Escribe el autor del libro: ");
        var autor = cosola.nextLine();
        System.out.println("Escribe el titulo del libro: ");
        var titulo_libro = cosola.nextLine();
        System.out.println(titulo_libro + " fue escrito por " + autor);

    }
}
