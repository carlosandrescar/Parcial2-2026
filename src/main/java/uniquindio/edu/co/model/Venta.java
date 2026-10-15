package uniquindio.edu.co.model;

import java.util.List;

public class Venta {
    private String fechaRealizacion;
    private int fila;
    private int columna;
    private int numeroAsiento;
    private double valorIndividual;
    private final static double descuentoCliente = 0.15;

    private Persona persona;
    private Funcion funcion;

    /**
     * Metodo constructor de Venta
     * @param fechaRealizacion de Venta
     * @param fila de Venta
     * @param numeroAsiento de Venta
     * @param valorIndividual de Venta
     * @param persona de Venta
     * @param funcion de Venta
     */
    public Venta( String fechaRealizacion, int fila, int columna, int numeroAsiento, double valorIndividual, Persona persona, Funcion funcion) {
        this.fechaRealizacion = fechaRealizacion;
        this.fila = fila;
        this.columna = columna;
        this.numeroAsiento = numeroAsiento;
        this.valorIndividual = valorIndividual;
        this.persona = persona;
        this.funcion = funcion;
    }


    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public  String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroasiento) {
        this.numeroAsiento = numeroasiento;
    }

    public double getValorIndividual() {
        return valorIndividual;
    }

    public void setValorIndividual(double valorIndividual) {
        this.valorIndividual = valorIndividual;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    //---------------------------------------------------------------------------------


    @Override
    public String toString() {
        return "Venta{" +
                "fechaRealizacion='" + fechaRealizacion + '\'' +
                ", fila=" + fila +
                ", columna=" + columna +
                ", numeroAsiento=" + numeroAsiento +
                ", valorIndividual=" + valorIndividual +
                ", persona=" + persona +
                ", funcion=" + funcion +
                '}';
    }
}
