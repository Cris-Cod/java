package apiColeccionDatos.vuelos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class TestVuelo {
    public static void main(String[] args) throws ParseException {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");

        List<Vuelos> vuelo = new ArrayList<>();
        vuelo.add(new Vuelos("AAL 933", "New York", "Santiago", df.parse("2021-08-29 05:39"), 62));
        vuelo.add(new Vuelos("LAT 755", "Sao Paulo", "Santiago", df.parse("2021-08-31 04:45"), 47));
        vuelo.add(new Vuelos("SKU 621", "Rio De Janeiro", "Santiago", df.parse("2021-08-30 16:00"), 52));
        vuelo.add(new Vuelos("DAL 147", "Atlanta", "Santiago", df.parse("2021-08-29 13:22"), 59));
        vuelo.add(new Vuelos("AVA 241", "Bogota", "Santiago", df.parse("2021-08-31 14:02"), 25));
        vuelo.add(new Vuelos("AMX 10", "Mexico City", "Santiago", df.parse("2021-08-31 05:20"), 29));
        vuelo.add(new Vuelos("IBE 6833", "Londres", "Santiago", df.parse("2021-08-30 08:45"), 55));
        vuelo.add(new Vuelos("LAT 2479", "Frankfurt", "Santiago", df.parse("2021-08-29 07:41"), 51));
        vuelo.add(new Vuelos("SKU 803", "Lima", "Santiago", df.parse("2021-08-30 10:35"), 48));
        vuelo.add(new Vuelos("LAT 533", "Los Angeles", "Santiago", df.parse("2021-08-29 09:14"), 59));
        vuelo.add(new Vuelos("LAT 1447", "Guayaquil", "Santiago", df.parse("2021-08-31 08:33"), 31));
        vuelo.add(new Vuelos("CMP 111", "Panama City", "Santiago", df.parse("2021-08-31 15:15"), 29));
        vuelo.add(new Vuelos("LAT 705", "Madrid", "Santiago", df.parse("2021-08-30 08:14"), 47));
        vuelo.add(new Vuelos("AAL 957", "Miami", "Santiago", df.parse("2021-08-29 22:53"), 60));
        vuelo.add(new Vuelos("ARG 5091", "Buenos Aires", "Santiago", df.parse("2021-08-31 09:57"), 32));
        vuelo.add(new Vuelos("LAT 1283", "Cancun", "Santiago", df.parse("2021-08-31 04:00"), 35));
        vuelo.add(new Vuelos("LAT 579", "Barcelona", "Santiago", df.parse("2021-08-29 07:45"), 61));
        vuelo.add(new Vuelos("AAL 945", "Dallas-Fort Worth", "Santiago", df.parse("2021-08-30 07:12"), 58));
        vuelo.add(new Vuelos("LAT 501", "Paris", "Santiago", df.parse("2021-08-29 18:29"), 49));
        vuelo.add(new Vuelos("LAT 405", "Montevideo", "Santiago", df.parse("2021-08-30 15:45"), 39));

        vuelo.sort((a,b) -> a.getFechaLlegada().compareTo(b.getFechaLlegada()));
        if(!vuelo.isEmpty()){
           Vuelos ultimo_vuelo = vuelo.get(vuelo.size() - 1);
            System.out.println("El ultimo vuelo en llegar es: " + ultimo_vuelo);
        }

        vuelo.sort(Comparator.comparing(Vuelos::getCantidad_pasajeros));
        if(!vuelo.isEmpty()){
            Vuelos menor_num = vuelo.get(0);
            System.out.println("El vuelo con menor número de pasajeros es: " + menor_num);
        }



    }
}
