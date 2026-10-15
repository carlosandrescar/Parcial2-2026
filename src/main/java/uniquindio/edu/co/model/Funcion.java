package uniquindio.edu.co.model;

public class Funcion {
    private int codigoUnico;
    private String fechaFuncion;
    private String horaIncio;
    public final static double PRECIOBASE = 15000;
    private String duracion;
    private String capacidadMaxima;

    /**
     * Metodo Constructor de las funciones
     * @param codigoUnico de la funcion
     * @param fechaFuncion
     * @param horaIncio
     * @param duracion
     */
    public Funcion(int codigoUnico, String fechaFuncion, String horaIncio, String duracion, String capacidadMaxima) {
        this.codigoUnico = codigoUnico;
        this.fechaFuncion = fechaFuncion;
        this.horaIncio = horaIncio;
        this.duracion = duracion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(String capacidadMaxima) {
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

    public String getHoraIncio() {
        return horaIncio;
    }

    public void setHoraIncio(String horaIncio) {
        this.horaIncio = horaIncio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
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
