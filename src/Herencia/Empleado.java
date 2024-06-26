package Herencia;

public class Empleado extends Persona{
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        this.idEmpleado = ++contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo) {
        //super(nombre);
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", Nombre=").append(this.nombre);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append('}');
        return sb.toString();
    }
}
