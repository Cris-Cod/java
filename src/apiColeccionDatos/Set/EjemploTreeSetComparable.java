package apiColeccionDatos.Set;

import apiColeccionDatos.modelo.Alumno;

import java.util.*;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        Set<Alumno> sa = new TreeSet<>();
        sa.add(new Alumno("Luisa", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));

        System.out.println("Iterando con for each");
        for(Alumno a: sa){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando while y el iterator");
        Iterator<Alumno> it = sa.iterator();
        while (it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando landas  y foreach");
        sa.forEach(a -> System.out.println(a.getNombre()));
        //System.out.println(sa);



        List<Alumno> saList = new ArrayList<>();
        saList.add(new Alumno("Luisa", 6));
        saList.add(new Alumno("Luci", 4));
        saList.add(new Alumno("Jano", 7));
        saList.add(new Alumno("Andres", 3));
        saList.add(new Alumno("Zeus", 2));


        System.out.println("Iterando la lista con el for i clasico");
        for (int i = 0; i < saList.size(); i++) {
            Alumno a = saList.get(i);
            System.out.println(a.getNombre());
        }


        System.out.println("Iterando con for each de la lista");
        for(Alumno a: saList){
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando while y el iterator de la lista");
        Iterator<Alumno> itt = saList.iterator();
        while (itt.hasNext()){
            Alumno a = itt.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando landas  y foreach de la lista");
        saList.forEach(a -> System.out.println(a.getNombre()));
        //System.out.println(sa);
    }
}
