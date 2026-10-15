package uniquindio.edu.co.model;

import uniquindio.edu.co.TipoSalas;

public class Venta {
    private String fechaRealizacion;
    private int fila;
    private int columna;
    private int numeroAsiento;
    public final static double PRECIOBASE = 15000;
    private int codigoSala;
    private final static double DESCUENTOCLIENTE = 0.15;
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
    public Venta(String fechaRealizacion, int fila, TipoSalas tipoSalas, int columna, int numeroAsiento,Persona persona, Funcion funcion) {
        this.fechaRealizacion = fechaRealizacion;
        this.fila = fila;
        this.columna = columna;
        this.numeroAsiento = numeroAsiento;
        this.persona = persona;
        this.funcion = funcion;
    }

    public double calcularTipoSala(int numeroAsiento, String total){
        double valor  = 0;
        if(tipoSalas == TipoSalas.SALA_3D){
            valor = ((PRECIOBASE * DESCUENTOCLIENTE ) *(1- (20/100))) * numeroAsiento;
        } else if(tipoSalas == TipoSalas.SALA_VIP){
            valor = ((PRECIOBASE * DESCUENTOCLIENTE) *(1- (30/100))) * numeroAsiento;
        }else
            valor = (PRECIOBASE * DESCUENTOCLIENTE) * numeroAsiento;
        return valor;
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
