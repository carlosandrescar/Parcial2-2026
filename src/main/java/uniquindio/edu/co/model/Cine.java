package uniquindio.edu.co.model;

import uniquindio.edu.co.TipoSalas;

import java.util.ArrayList;
import java.util.List;

public class Cine{
    private String nombre;
    private int nit;
    private String direccion;

    private List<Persona> listCinePersonas;
    private List<Venta> listCineVentas;
    private List<Funcion> listCineFuncion;

    /**
     * Metodo constructor del Cine
     * @param nombre del cine
     * @param nit del cine
     * @param direccion del cine
     */
    public Cine(String nombre, int nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.listCinePersonas = new ArrayList<>();
        this.listCineVentas = new ArrayList<>();
        this.listCineFuncion = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Funcion> getListCineFuncion() {
        return listCineFuncion;
    }

    public void setListCineFunsion(List<Funcion> listCineFuncion) {
        this.listCineFuncion = listCineFuncion;
    }

    public List<Venta> getListCineVentas() {
        return listCineVentas;
    }

    public void setListCineVentas(List<Venta> listCineVentas) {
        this.listCineVentas = listCineVentas;
    }

    public List<Persona> getListCinePersonas() {
        return listCinePersonas;
    }

    public void setListCinePersonas(List<Persona> listCinePersonas) {
        this.listCinePersonas = listCinePersonas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    /**
     * Metodo que permite registrar a un cliente
     * @param nombre del cliente
     * @param numeroTelefono del cliente
     * @param correo del cliente
     * @param documento del cliente
     * @return .
     */
    public String registrarCliente(String nombre, int numeroTelefono, String correo, int documento){
        String registrado = "";
        Persona cliente = buscarCliente(documento);
        if(cliente==null){
            Persona registro = new Cliente(nombre,numeroTelefono,correo,documento);
            listCinePersonas.add(registro);
            registrado = "El cliente con documento " + documento + " fue añadido con exito";
        }else{
            registrado = "El cliente con el documento " + documento + " ya esta registrado";
        }
        return registrado;
    }

    /**
     * Metodo que permite buscar a un cliente
     * @param codigo del cliente
     * @return .
     */
    public Persona buscarCliente(int codigo){
        Persona encontrada = null;
        for (Persona cliente : listCinePersonas) {
            if (cliente.getDocumento() == codigo) {
                encontrada = cliente;
                break;
            }
        }
    return encontrada;
    }

    /**
     * Metodo que permite registrar una funcion
     * @param codigoUnico de la funcion
     * @param fechaFuncion de la funcion
     * @param horaIncio de la funcion
     * @param duracion de la funcion
     * @param capacidadMaxima de la funcion
     * @param titulo de la funcion
     * @param generoPelicula de la funcion
     * @param clasificacionPelicula de la funcion
     * @return
     */
    public String registrarFuncion(int codigoUnico, String fechaFuncion, int horaIncio, int duracion, int capacidadMaxima, String titulo, GeneroPelicula generoPelicula,ClasificacionPelicula clasificacionPelicula){
        String registroFuncion = "";
        Funcion pelicula = buscarFuncion(codigoUnico);
        if(pelicula==null && duracion > horaIncio){
            Funcion registroPelicula = new Pelicula(codigoUnico,fechaFuncion, horaIncio, duracion,capacidadMaxima,titulo,generoPelicula,clasificacionPelicula);
            listCineFuncion.add(registroPelicula);
            registroFuncion = "La Funcion con codigo " + codigoUnico + " Fue registrada con exito, para la facha " + fechaFuncion + " Con hora de inico a las " + horaIncio;
        }else if(pelicula != null){
            registroFuncion = "La Funcion con codigo " + codigoUnico + " no pudo realizarce por que ya exite ese codigo";
        }else{
            registroFuncion = "La Funcion con codigo " + codigoUnico + " no pudo realizarce por que existe otra funcion a esa hora";
        }
        return registroFuncion;
    }


    /**
     * Metodo que permite buscar una funcion
     * @param codigo2 que permite buscar una funcion
     * @return
     */
    public Funcion buscarFuncion(int codigo2){
        Funcion encontrada2 = null;
        for(int i = 0; i<listCineFuncion.size(); i ++){
            Funcion pelicula = listCineFuncion.get(i);
            if(pelicula.getCodigoUnico() == codigo2){
                encontrada2 = pelicula;
                break;
            }
        }
        return encontrada2;

    }
    //_--------------------------------

    public String reservarBoletas(String fechaRealizacion, int fila, int columna, int numeroAsiento, double valorIndividual, Persona persona, Funcion funcion, int documento, TipoSalas tipoSalas){
        String reservar = "";
        Persona cliente = buscarCliente(documento);
        if(cliente != null){
            Venta reserva = new Venta(fechaRealizacion,fila,tipoSalas, columna,numeroAsiento,valorIndividual,persona ,funcion);
            listCineVentas.add(reserva);
            reservar = "Las bolestas fueron reservadas con exito";
        }else{
            reservar = "no se pudo realizar la reservacion, el cliente no existe";
        }
        return reservar;
    }








    //------------------------------------------------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Cine{" +
                "nombre=" + nombre +
                ", nit=" + nit +
                ", direccion=" + direccion +
                ", listCinePersonas=" + listCinePersonas +
                ", listCineVentas=" + listCineVentas +
                ", listCineFuncion=" + listCineFuncion +
                '}';
    }
}
