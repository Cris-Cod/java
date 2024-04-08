package Herencia;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaResgitro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(String nombre, Date fechaResgitro, boolean vip){
        super(nombre);
        this.fechaResgitro = fechaResgitro;
        this.vip = vip;
        this.idCliente = ++contadorCliente;

    }

    public int getIdCliente() {
        return idCliente;
    }


    public Date getFechaResgitro() {
        return fechaResgitro;
    }

    public void setFechaResgitro(Date fechaResgitro) {
        this.fechaResgitro = fechaResgitro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(", fechaResgitro=").append(fechaResgitro);
        sb.append(", vip=").append(vip);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
