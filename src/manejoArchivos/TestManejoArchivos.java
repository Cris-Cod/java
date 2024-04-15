package manejoArchivos;

import static manejoArchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "src/manejoArchivos/Prueba.txt";
        //crearArchivo(nombreArchivo);

        //escribirArchivo(nombreArchivo, "Hola desde Java");
        //anexarInformacionArchivo(nombreArchivo, "Adios");
        leerArchivo(nombreArchivo);
    }
}
