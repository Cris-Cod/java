import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String args[]){
        /*
            tipos primitivos enteros: byte, short, int, long
        */
        byte numeroByte = (byte)129;
        System.out.println("Valor byte: " + numeroByte);
        System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

        short numeroShort = 10;
        System.out.println("numero short " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);

        int numeroInt = 10;
        System.out.println("numero int " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        long numerolong = 10;
        System.out.println("numero long " + numerolong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);


           /*
            tipos primitivos flotantes: float, double

        */

        float numeroFloat = (float)10.0;
        System.out.println("numero float = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble = 10;
        System.out.println("numero double = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo double: " + Double.MAX_VALUE);


        // palabra var

        var numeroEntero = 10;
        System.out.println("NumeroEntero = " + numeroEntero);

        var numeroDouble_ = 10.0;
        System.out.println("NumeroDouble = " + numeroDouble_);

        var numeroFloat_ = 10.0F;
        System.out.println("NumeroFloat = " + numeroFloat_);


        // char

        char miCaracterer = 'a';
        System.out.println("miCaracter = " + miCaracterer);

        char varChar = '\u0021';
        System.out.println("Varchar = " + varChar);

        char varCharDecimal =  33;
        System.out.println("VarDecimal = " + varCharDecimal);

        char varCharsimbolo = '!';
        System.out.println("VarCharSimbolo = " + varCharsimbolo);

        int variableEnteraSimbolo = '!';
        System.out.println("variable simbolo = " + variableEnteraSimbolo);

        int letra = 'a';
        System.out.println("letra = " + letra);


        //Booleano

        boolean varBoolenan = true;
        System.out.println("VarBoolena = " + varBoolenan);

        if(varBoolenan){
            System.out.println("la bandera es verdadera");
        }else {
            System.out.println("la bandera es falsa");
        }


        var edad = 10;
        var esAdulto = edad >= 18;
        if(esAdulto){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }


        // Conversiones de tipos

        //Convetir tipo string a tipo int
        var edad1 = Integer.parseInt("20");
        System.out.println("edad1 = " + (edad1 + 1));

        var edadString = "20";
        System.out.println("edad1 = " + (edadString + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        //Pedir un valor
        /*var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad1 = Integer.parseInt(consola.nextLine());
        System.out.println("Edad = " + edad1);*/


        var edadText = String.valueOf(10);  // El numero se convierte en un tipo string
        System.out.println("Edad Texto = " + edadText + 1 );

        var caracter = "hola".charAt(1);
        System.out.println("caracter = " + caracter);

        /*System.out.println("Propociona un caracter: ");
        var consola = new Scanner(System.in);
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);*/

        var ingreso = new Scanner(System.in);
        System.out.println("Proporciana el nombre: ");
        var nombre_libro = ingreso.nextLine();
        System.out.println("Proporciana el id: ");
        var id = Integer.parseInt(ingreso.nextLine());
        System.out.println("Proporciana el precio: ");
        var precio = Double.parseDouble(ingreso.nextLine());
        System.out.println("Proporciana el envio: ");
        var envio = Boolean.parseBoolean(ingreso.nextLine());

        System.out.println("Nombre: " + nombre_libro + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envio);
    }
}
