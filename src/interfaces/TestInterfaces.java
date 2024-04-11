package interfaces;

public class TestInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMysql();
        //datos.actualizar();
        //datos.listar();
        //datos.insertar();
        //datos.eliminar();
        imprimir(datos);

        datos = new ImplementacionOracle();
        //datos.actualizar();
        //datos.insertar();
        //datos.listar();
        //datos.eliminar();
        imprimir(datos);

    }

    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
