package uniquindio.edu.co.model;

import uniquindio.edu.co.TipoSalas;

public class SalaCine extends Funcion{
    private double  recargo;
    public final static int SILLADISPONIBLE = 20;
    /**
     * Metodo constructor de sala 3D
     * @param codigoUnico de sala 3D
     * @param fechaFuncion de sala 3D
     * @param horaIncio de sala 3D
     * @param duracion de sala 3D
     * @param capacidadMaxima de sala 3D
     * @param recargo de sala 3D
     */
    public SalaCine(int codigoUnico, String fechaFuncion, int horaIncio, int duracion, int capacidadMaxima, double  recargo) {
        super(codigoUnico, fechaFuncion, horaIncio, duracion, capacidadMaxima);
        this.recargo = recargo;
    }

    public double  getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    @Override
    public String toString() {
        return "sala3D{" +
                "recargo2=" + recargo +
                '}';
    }
}
