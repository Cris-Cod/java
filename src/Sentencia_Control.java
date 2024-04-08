import java.util.Scanner;

public class Sentencia_Control {

    public static void main(String args[]){
        var condicion = true;

        if(condicion){
            System.out.println("Condicon verdadera");
        }else{
            System.out.println("condicion falsa");
        }

        var numero = 6;
        var numeroTexto = "Numero desconocido";

        if(numero == 1){
            numeroTexto = "numnero uno";
        } else if(numero == 2){
            numeroTexto = "numero dos";
        }else if(numero == 3){
            numeroTexto = "numero tres";
        }else if (numero == 4){
            numeroTexto = "numero cuatro";
        }else {
            numeroTexto = "numero no encontrado";
        }

        System.out.println("Numero texto: " + numeroTexto);


        var mes = 5;
        var estacion = "Estación desconocida";

        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }else if(mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else if(mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "Otonio";
        }

        System.out.println("Estacion del mes: " + estacion);


        //Swiych

        var num = 2;
        var num_texto = "Valor desconocido";

        switch (num){
            case 1:
                num_texto = "Numero 1";
                break;
            case 2:
                num_texto = "Numero 2";
                break;
            case 3:
                num_texto = "Numero 3";
                break;
            case 4:
                num_texto = "Numero 4";
                break;
            default:
                num_texto = "Caso no encontrado";
        }

        System.out.println("num texto: " + num_texto);


        var month = 7;
        var season = "Estación desconocida";

        switch(month){
            case 1: case 2: case 12:
                season= "Invierno";
                break;
            case 3: case 4: case 5:
                season = "Primavera";
                break;
            case 6: case 7: case 8:
                season = "Verano";
                break;
            case 9: case 10: case 11:
                season = "Otonio";
        }

        System.out.println("estacion: " + season);


        var consola = new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10:");
        var number = Integer.parseInt(consola.nextLine());
        var nota = "Nota no encontrada";


        if(number >= 0 && number < 6){
            nota = "F";
        } else if (number >= 6 && number < 7) {
            nota = "D";
        }else if (number >= 7 && number < 8) {
            nota = "C";
        }else if (number >= 8 && number < 9) {
            nota = "B";
        }else if (number >= 9 && number < 10) {
            nota = "A";
        }


        System.out.println(nota);

    }
}
