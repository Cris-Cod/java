package apiCollections;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");

        //imprimir(miLista);

        /*for (Object elemento: miLista){
            System.out.println(elemento);
        }
        System.out.println("                                   ");
        System.out.println("Funciones landa");
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });*/

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");

        //imprimir(miSet);


        Map miMapa = new HashMap();
        miMapa.put("valor1", "Maria");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Luisa");

        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection coleccion){
        for(Object elemnto: coleccion){
            System.out.println("elemnto = " + elemnto);
        }
    }

}
