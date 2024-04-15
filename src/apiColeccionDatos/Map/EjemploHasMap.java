package apiColeccionDatos.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHasMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPateno", "Roe");
        persona.put("email", "jhondoe@123.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);

        String nombre = persona.get("Nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        String valorApellido = persona.remove("apellidoPateno");
        System.out.println("Eliminado = " + valorApellido);
        System.out.println(persona);

        Collection<String> valores = persona.values();
        for (String v: valores){
            System.out.println(v);
        }
        
        Set<String> llaves = persona.keySet();
        for (String k: llaves){
            System.out.println("k = " + k);
        }
        
        for(Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par);
        }

        for (String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        persona.forEach((llave, valor) ->{
            System.out.println(llave + " => " + valor);
        });

        persona.replace("Nombre", "Andres");
        System.out.println("persona = " + persona);
    }
}
