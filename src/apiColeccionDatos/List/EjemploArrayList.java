package apiColeccionDatos.List;

import apiColeccionDatos.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> saList = new ArrayList<>();
        System.out.println(saList + ", size = " + saList.size());
        saList.add(new Alumno("Luisa", 6));
        saList.add(new Alumno("Luci", 4));
        saList.add(new Alumno("Jano", 7));
        saList.add(2, new Alumno("Andres", 3));
        saList.set(3, new Alumno("Zeus", 2));

        System.out.println(saList + ", size = " + saList.size());
        saList.remove(new Alumno("Jano", 7));
        saList.remove(1);
        System.out.println("saList + saList.size() = " + saList + saList.size());

        boolean b = saList.contains(new Alumno("Jano", 7));
        System.out.println("La lista contiene este alumno = " + b);

        Object a[] = saList.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("Desde el arreglo = " + a[i]);
        }

        ListIterator<Alumno> li = saList.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("=====================================================");

        while (li.hasPrevious()){
            Alumno alumno = li.previous();
            System.out.println(alumno);
        }
    }
}
