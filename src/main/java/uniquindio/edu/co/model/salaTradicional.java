package uniquindio.edu.co.model;

public class salaTradicional extends Funcion {
    private double recargo;
    public final static int SILLADISPONIBLE = 20;
    public final static int FILAS = 10;
    public final static int COLUMNAS= 10;
    /**
     * Metodo constructor de sala tradicional
     * @param codigoUnico de sala tradicional
     * @param fechaFuncion de sala tradicional
     * @param horaIncio de sala tradicional
     * @param duracion de sala tradicional
     * @param capacidadMaxima de sala tradicional
     * @param recargo de sala tradicional
     */
    public salaTradicional(int codigoUnico, String fechaFuncion, int horaIncio, int duracion, int capacidadMaxima, double  recargo) {
        super(codigoUnico, fechaFuncion, horaIncio, duracion, capacidadMaxima);
        this.recargo = recargo;
    }

    public double  getRecargo() {
        return recargo;
    }

    public void setRecargo(double  recargo) {
        this.recargo = recargo;
    }

    @Override
    public String toString() {
        return "salaTradicional{" +
                "recargo=" + recargo +
                '}';
    }
}
