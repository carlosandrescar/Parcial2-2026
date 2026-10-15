package uniquindio.edu.co.model;

public class salaVip extends Funcion{
    private double  recargo2;

    /**
     * Metodo constructor de sala VIP
     * @param codigoUnico de sala VIP
     * @param fechaFuncion de sala VIP
     * @param horaIncio de sala VIP
     * @param duracion de sala VIP
     * @param capacidadMaxima de sala VIP
     * @param recargo2 de sala VIP
     */
    public salaVip(int codigoUnico, String fechaFuncion, String horaIncio, String duracion, String capacidadMaxima,double recargo2) {
        super(codigoUnico, fechaFuncion, horaIncio, duracion, capacidadMaxima);
        this.recargo2 = recargo2;
    }

    public double  getRecargo2() {
        return recargo2;
    }

    public void setRecargo2(double  recargo2) {
        this.recargo2 = recargo2;
    }

    @Override
    public String toString() {
        return "salaVip{" +
                "recargo2=" + recargo2 +
                '}';
    }
}
