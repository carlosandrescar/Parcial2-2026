package uniquindio.edu.co.model;

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
    public boolean registrarCliente(String nombre, int numeroTelefono, String correo, int documento){
        boolean registrado = false;
        Persona cliente = buscarCliente(documento);
        if(cliente==null){
            Persona registro = new Cliente(nombre,numeroTelefono,correo,documento);
            listCinePersonas.add(registro);
            registrado = true;
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
    public boolean registrarFuncion(int codigoUnico, String fechaFuncion, String horaIncio, String duracion, String capacidadMaxima, String titulo, GeneroPelicula generoPelicula,ClasificacionPelicula clasificacionPelicula){
        boolean registroFuncion = false;
        Funcion pelicula = buscarFuncion(codigoUnico);
        if(pelicula==null){
            Funcion registroPelicula = new Pelicula(codigoUnico, fechaFuncion, horaIncio, duracion,capacidadMaxima,titulo,generoPelicula,clasificacionPelicula);
            listCineFuncion.add(registroPelicula);
            registroFuncion = true;
        }
        return registroFuncion;
    }


    /**
     * Metodo que permite buscar una funcion
     * @param codigo2 de la funcion
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
