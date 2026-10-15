package uniquindio.edu.co.model;

import java.util.List;

public class Venta {
    private String fechaRealizacion;
    private int fila;
    private int numeroasiento;
    private double valorIndividual;
    private final static double descuentoCliente = 0.15;

    private Persona persona;
    private Funcion funcion;

    /**
     * Metodo constructor de Venta
     * @param fechaRealizacion de Venta
     * @param fila de Venta
     * @param numeroasiento de Venta
     * @param valorIndividual de Venta
     * @param persona de Venta
     * @param funcion de Venta
     */
    public Venta( String fechaRealizacion, int fila, int numeroasiento, double valorIndividual, Persona persona, Funcion funcion) {
        this.fechaRealizacion = fechaRealizacion;
        this.fila = fila;
        this.numeroasiento = numeroasiento;
        this.valorIndividual = valorIndividual;
        this.persona = persona;
        this.funcion = funcion;
    }
    //_---------------------------------------------------




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

    public int getNumeroasiento() {
        return numeroasiento;
    }

    public void setNumeroasiento(int numeroasiento) {
        this.numeroasiento = numeroasiento;
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

    @Override
    public String toString() {
        return "Venta{" +
                "fechaRealizacion=" + fechaRealizacion +
                ", fila=" + fila +
                ", numeroasiento=" + numeroasiento +
                ", valorIndividual=" + valorIndividual +
                ", persona=" + persona +
                ", funcion=" + funcion +
                '}';
    }
}
