package uniquindio.edu.co.model;

/**
 * Boleta adquirida en una venta. Pertenece exclusivamente a una venta.
 */
public class Boleta {
    private int codigo;
    private int fila;
    private int numeroAsiento;
    private double valorIndividualPagado;

    /**
     * Constructor de Boleta
     * @param codigo código único de la boleta
     * @param fila fila del asiento
     * @param numeroAsiento número del asiento dentro de la fila
     * @param valorIndividualPagado valor pagado por esta boleta
     */
    public Boleta(int codigo, int fila, int numeroAsiento, double valorIndividualPagado) {
        this.codigo = codigo;
        this.fila = fila;
        this.numeroAsiento = numeroAsiento;
        this.valorIndividualPagado = valorIndividualPagado;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getFila() {
        return fila;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public double getValorIndividualPagado() {
        return valorIndividualPagado;
    }

    @Override
    public String toString() {
        return "Boleta{codigo=" + codigo +
                ", fila=" + fila +
                ", asiento=" + numeroAsiento +
                ", valorPagado=" + valorIndividualPagado + "}";
    }
}
