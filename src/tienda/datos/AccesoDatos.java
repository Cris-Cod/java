package tienda.datos;

import tienda.Producto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AccesoDatos implements IdatosArchivo{
    @Override
    public boolean exist(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Producto> listar(String nombreProducto) {
        File archivo = new File(nombreProducto);
        List<Producto> productos = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            var linea = entrada.readLine();
            while(linea != null){
                Producto producto = new Producto(linea);
                productos.add(producto);
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return productos;
    }

    @Override
    public void escribir(Producto producto, String nombreArchivo, boolean anexar) {
        var archivo = new File(nombreArchivo);
        try {
            var salida  = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(producto.toString());
            salida.close();
            System.out.println("Se ha escrito el producto" + producto);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void crear(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void borrar(String nombreArchivo) {

    }
}
