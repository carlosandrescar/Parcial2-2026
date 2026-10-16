package uniquindio.edu.co.model;

import uniquindio.edu.co.TipoSalas;

public class Venta {
    private String fechaRealizacion;
    private int fila;
    private int numeroAsiento;
    public final static double PRECIOBASE = 15000;
    private int codigoSala;
    TipoSalas tipoSalas;

    private Persona persona;
    private Funcion funcion;

    /**
     * Metodo constructor de Venta
     * @param fechaRealizacion de Venta
     * @param fila de Venta
     * @param numeroAsiento de Venta
     * @param persona de Venta
     * @param funcion de Venta
     */
    public Venta(String fechaRealizacion, int fila, TipoSalas tipoSalas, int numeroAsiento,Persona persona, Funcion funcion) {
        this.fechaRealizacion = fechaRealizacion;
        this.fila = fila;
        this.numeroAsiento = numeroAsiento;
        this.persona = persona;
        this.funcion = funcion;
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

}
