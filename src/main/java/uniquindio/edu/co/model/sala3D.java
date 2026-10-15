package uniquindio.edu.co.model;

public class sala3D extends Funcion{
    private double  recargo2;

    /**
     * Metodo constructor de sala 3D
     * @param codigoUnico de sala 3D
     * @param fechaFuncion de sala 3D
     * @param horaIncio de sala 3D
     * @param duracion de sala 3D
     * @param capacidadMaxima de sala 3D
     * @param recargo2 de sala 3D
     */
    public sala3D(int codigoUnico, String fechaFuncion, int horaIncio, int duracion, int capacidadMaxima, double  recargo2) {
        super(codigoUnico, fechaFuncion, horaIncio, duracion, capacidadMaxima);
        this.recargo2 = recargo2;
    }

    public double  getRecargo2() {
        return recargo2;
    }

    public void setRecargo2(double recargo2) {
        this.recargo2 = recargo2;
    }

    @Override
    public String toString() {
        return "sala3D{" +
                "recargo2=" + recargo2 +
                '}';
    }
}
