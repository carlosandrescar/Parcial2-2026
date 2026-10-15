package uniquindio.edu.co.model;

public class Funcion {
    private int codigoUnico;
    private String fechaFuncion;
    private int horaIncio;
    public final static double PRECIOBASE = 15000;
    private int duracion;
    private int capacidadMaxima;

    /**
     * Metodo Constructor de las funciones
     * @param codigoUnico de la funcion
     * @param fechaFuncion de la funcion
     * @param horaIncio de la funcion
     * @param duracion de la funcion
     */
    public Funcion(int codigoUnico, String fechaFuncion, int horaIncio, int duracion, int capacidadMaxima) {
        this.codigoUnico = codigoUnico;
        this.fechaFuncion = fechaFuncion;
        this.horaIncio = horaIncio;
        this.duracion = duracion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
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
                ", capacidadMaxima=" + capacidadMaxima +
                '}';
    }
}
