package uniquindio.edu.co.model;

import uniquindio.edu.co.TipoSalas;

public class Boleta  extends Venta{
    private double valorFinal;


    /**
     * Metodo constructor de Venta
     *
     * @param fechaRealizacion de Venta
     * @param fila             de Venta
     * @param tipoSalas        de Venta
     * @param numeroAsiento    de Venta
     * @param persona          de Venta
     * @param funcion          de Venta
     */
    public Boleta(String fechaRealizacion, int fila, TipoSalas tipoSalas, int numeroAsiento, Persona persona, Funcion funcion,double valorFinal) {
        super(fechaRealizacion, fila, tipoSalas,numeroAsiento, persona, funcion);
        this.valorFinal = valorFinal;
    }
}
