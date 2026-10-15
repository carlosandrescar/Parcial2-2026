package uniquindio.edu.co.model;

import uniquindio.edu.co.TipoSalas;

public class Funcion {
    private int codigoUnico;
    private String fechaFuncion;
    private int horaIncio;
    private int duracion;

    /**
     * Metodo Constructor de las funciones
     * @param codigoUnico de la funcion
     * @param fechaFuncion de la funcion
     * @param horaIncio de la funcion
     * @param duracion de la funcion
     */
    public Funcion(int codigoUnico, String fechaFuncion, int horaIncio, int duracion) {
        this.codigoUnico = codigoUnico;
        this.fechaFuncion = fechaFuncion;
        this.horaIncio = horaIncio;
        this.duracion = duracion;
    }

    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(String fechaFunsion) {
        this.fechaFuncion = fechaFunsion;
    }

    public int getHoraIncio() {
        return horaIncio;
    }

    public void setHoraIncio(int horaIncio) {
        this.horaIncio = horaIncio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Funcion{" +
                "codigoUnico=" + codigoUnico +
                ", fechaFuncion=" + fechaFuncion +
                ", horaIncio=" + horaIncio +
                ", duracion=" + duracion +
                '}';
    }
}
