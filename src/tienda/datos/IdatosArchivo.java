package tienda.datos;

import tienda.Producto;

import java.util.List;

public interface IdatosArchivo {
    boolean exist(String nombreArchivo);

    public List<Producto>listar(String nombreProducto);
    public void escribir(Producto producto, String nombreArchivo, boolean anexar);

    public void crear(String nombreArchivo);
    public void borrar(String nombreArchivo);

}
