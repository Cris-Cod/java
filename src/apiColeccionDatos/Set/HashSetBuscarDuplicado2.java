package apiColeccionDatos.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetBuscarDuplicado2 {
    public static void main(String[] args) {
        String[] peces = {"corvina", "robalo", "atun", "pejerrey", "lenguado", "lenguado", "Atún"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for(String pez: peces){
            if(!unicos.add(pez)){
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);

        System.out.println("unicos " + unicos);
        System.out.println("duplicados = " + duplicados);

    }
}
