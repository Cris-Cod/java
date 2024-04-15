package apiColeccionDatos.vuelos;

import java.util.Date;

public class Vuelos {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private int cantidad_pasajeros;

    public Vuelos(String nombre, String origen, String destino, Date fechaLlegada, int cantidad_pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.cantidad_pasajeros = cantidad_pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public int getCantidad_pasajeros() {
        return cantidad_pasajeros;
    }

    public void setCantidad_pasajeros(int cantidad_pasajeros) {
        this.cantidad_pasajeros = cantidad_pasajeros;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vuelos{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", origen='").append(origen).append('\'');
        sb.append(", destino='").append(destino).append('\'');
        sb.append(", fechaLlegada=").append(fechaLlegada);
        sb.append(", cantidad_pasajeros=").append(cantidad_pasajeros);
        sb.append('}');
        return sb.toString();
    }
}
