import java.util.Scanner;

public class Operadores {
    public static void main(String args[]){
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("Resultado suma: " + resultado);

        resultado = a - b;
        System.out.println("Resultado resta: " + resultado);

        resultado = a * b;
        System.out.println("Resultado multipliacion: " + resultado);

        var resultado_division = 3.0 / b;
        System.out.println("Resultado division: " + resultado_division);

        resultado = a % b;
        System.out.println("Resultado modulo: " + resultado);

        if(b % 2 == 0){
            System.out.println("Es numero par");
        }else {
            System.out.println("Es numero impar");
        }


        //Operadores de asignacion

        int a1 = 3, b1 = 2;
        int c = a1 + 5 - b1;
        System.out.println("c = " + c);

        a1 += 1; //a = a +1
        System.out.println("a = " + a1);

        a1 -=2;
        System.out.println("a = " + a1);

        a1 *=2;
        a1 /=3;
        a1 %=1;
        System.out.println("a = " + a1);


        //Operador unario
        var a2 = 3;
        var b2 = -a2;
        System.out.println("a = "  + a2);
        System.out.println("b = " + b2);

        var d = true;
        var e = !d;
        System.out.println("d d= "  + d);
        System.out.println("e = " + e);


        //Incremetento
        // Pre incremento
        var f = 3;
        var g = ++f;
        System.out.println("f = "  + f);
        System.out.println("g = " + g);

        //PosIncremento
        var h = 3;
        var i = h++;
        System.out.println("h = "  + h);
        System.out.println("i = " + i);

        //decremento
        //predecremento
        var j = 2;
        var k = --j;
        System.out.println("j = "  + j);
        System.out.println("k = " + k);

        //Posdecremento
        var l = 4;
        var n = l--;
        System.out.println("l = "  + l);
        System.out.println("n = " + n);


        //Operadores de asignacion y relacionales
        var a3 = 3;
        var b3 = 2;

        var c3 = (a3 == b3);
        System.out.println("c = " + c3);

        var d3 = a3 != b3;
        System.out.println("d = " + d3);

        var cadena = "hola";
        var cadena2 = "hola";
        var ca = cadena == cadena2; //compara la referencia de la memoria
        System.out.println("cadena = " + ca);
        var ca2 = cadena.equals(cadena2);
        System.out.println("cadena 2 = " + ca2);  //Comparamos contenido de cadenas

        //Relacionales
        var rel = a3 > b3;
        System.out.println("mayor = " + rel);


        //Operadores condicionales
        //and &  or ||

        var an = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado1 = an >= 0 && an <= 10;
        System.out.println("resultado1 = " + resultado1);

        var vacaciones = true;
        var diaDescanso = false;

        if(vacaciones || diaDescanso){
            System.out.println("Padre puede asistir al juego del hijo");
        }else{
            System.out.println("El padre esta ocupado");
        }

        //operador ternario
        var resultadoTernario = (3 > 2) ? "verdadero"  : "falso" ;
        System.out.println("resultado ternario = " + resultadoTernario);

        var numero = 8;
        var resultado_numero = (numero % 2 == 0) ? "es par" : "es impar";
        System.out.println("resultado numero  par o impar = " + resultado_numero);

        //precedencia de operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var resultado_a = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado_a);

        //Area de un rectangulo
        var consola = new Scanner(System.in);
        System.out.println("Ingresa el alto del rectangulo: ");
        var alto = Integer.parseInt(consola.nextLine());
        System.out.println("Ingresa el ancho del rectangulo: ");
        var ancho = Integer.parseInt(consola.nextLine());
        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        //Numero mayor
        var consola_numero = new Scanner(System.in);
        System.out.println("Ingresa el numero1: ");
        var numero_1 = Integer.parseInt(consola_numero.nextLine());
        System.out.println("Ingresa el numero2: ");
        var numero_2 = Integer.parseInt(consola_numero.nextLine());
        if(numero_1 > numero_2){
            System.out.println("El numero mayor es: " + numero_1);
        }else{
            System.out.println("El numero mayor es: " + numero_2);
        }
    }
}
