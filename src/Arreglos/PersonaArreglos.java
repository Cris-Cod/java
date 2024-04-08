package Arreglos;

public class PersonaArreglos {
    private String nombre;

    public PersonaArreglos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PersonaArreglos{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
