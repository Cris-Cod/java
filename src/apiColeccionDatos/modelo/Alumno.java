package apiColeccionDatos.modelo;

public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Alumno{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Alumno o) {
       /* if(this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(o.nombre);*/
        if(this.nota == o.nota){
            return 0;
        }
        if (this.nota > o.nota){
            return 1;
        }else{
            return -1;
        }
    }
}
