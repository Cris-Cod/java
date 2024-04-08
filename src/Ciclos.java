public class Ciclos {
    public static void main(String args[]){
        //While
        var contador = 0;
        while (contador < 3){
            System.out.println("contador = " + contador);
            contador++;
        }

        //Do while
        var contador2 = 0;
        do{
            System.out.println("contador do while = " + contador2);
            contador2++;

        }while (contador2 < 3);


        //Ciclo for
        for (var contador3 = 0; contador3 < 3; contador3++) {
            if(contador3 % 2 == 0){
                System.out.println("contador for = " + contador3);
                //break;
            }

        }

        for (var contador3 = 0; contador3 < 3; contador3++) {
            if(contador3 % 2 != 0){
                continue; //ir a la siguinete iteración
            }
            System.out.println("contador for continue = " + contador3);
        }




    }
}
