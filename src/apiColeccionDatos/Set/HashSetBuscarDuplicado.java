package apiColeccionDatos.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"corvina", "robalo", "atun", "pejerrey", "lenguado", "lenguado"};

        Set<String> unicos = new HashSet<>();
        for(String pez: peces){
            if(!unicos.add(pez)){
                System.out.println("Elemento duplicado: " + pez);
            }
        }
        System.out.println(unicos.size() + " elementos no duplicados " + unicos);

    }
}
