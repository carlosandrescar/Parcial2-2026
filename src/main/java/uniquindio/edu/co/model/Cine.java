package uniquindio.edu.co.model;

import uniquindio.edu.co.TipoSalas;

import java.util.ArrayList;
import java.util.List;

public class Cine {
    private String nombre;
    private int nit;
    private String direccion;

    private List<Persona> listCinePersonas;
    private List<Venta> listCineVentas;
    private List<Funcion> listCineFuncion;

    /**
     * Metodo constructor del Cine
     *
     * @param nombre    del cine
     * @param nit       del cine
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
     *
     * @param nombre         del cliente
     * @param numeroTelefono del cliente
     * @param correo         del cliente
     * @param documento      del cliente
     * @return .
     */
    public String registrarCliente(String nombre, int numeroTelefono, String correo, int documento) {
        String registrado = "";
        Persona cliente = buscarCliente(documento);
        if (cliente == null) {
            Persona registro = new Cliente(nombre, numeroTelefono, correo, documento);
            listCinePersonas.add(registro);
            registrado = "El cliente con documento " + documento + " fue añadido con exito";
        } else {
            registrado = "El cliente con el documento " + documento + " ya esta registrado";
        }
        return registrado;
    }

    /**
     * Metodo que permite buscar a un cliente
     *
     * @param codigo del cliente
     * @return .
     */
    public Persona buscarCliente(int codigo) {
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
     *
     * @param codigoUnico           de la funcion
     * @param fechaFuncion          de la funcion
     * @param horaIncio             de la funcion
     * @param duracion              de la funcion
     * @param titulo                de la funcion
     * @param generoPelicula        de la funcion
     * @param clasificacionPelicula de la funcion
     * @return
     */
    public String registrarFuncion(int codigoUnico, String fechaFuncion, int horaIncio, int duracion, String titulo, GeneroPelicula generoPelicula, ClasificacionPelicula clasificacionPelicula) {
        String registroFuncion = "";
        Funcion pelicula = buscarFuncion(codigoUnico);
        if (pelicula == null && duracion > horaIncio) {
            Funcion registroPelicula = new Pelicula(codigoUnico, fechaFuncion, horaIncio, duracion, titulo, generoPelicula, clasificacionPelicula);
            listCineFuncion.add(registroPelicula);
            registroFuncion = "La Funcion con codigo " + codigoUnico + " Fue registrada con exito, para la facha " + fechaFuncion + " Con hora de inico a las " + horaIncio;
        } else if (pelicula != null) {
            registroFuncion = "La Funcion con codigo " + codigoUnico + " no pudo realizarce por que ya exite ese codigo";
        } else {
            registroFuncion = "La Funcion con codigo " + codigoUnico + " no pudo realizarce por que existe otra funcion a esa hora";
        }
        return registroFuncion;
    }


    /**
     * Metodo que permite buscar una funcion
     *
     * @param codigo2 que permite buscar una funcion
     * @return
     */
    public Funcion buscarFuncion(int codigo2) {
        Funcion encontrada2 = null;
        for (int i = 0; i < listCineFuncion.size(); i++) {
            Funcion pelicula = listCineFuncion.get(i);
            if (pelicula.getCodigoUnico() == codigo2) {
                encontrada2 = pelicula;
                break;
            }
        }
        return encontrada2;

    }
    //_--------------------------------

    /**
     * Metodo que permite reservar una boleta
     *
     * @param fechaRealizacion de reservar una boleta
     * @param fila             de reservar una boleta
     * @param numeroAsiento    de reservar una boleta
     * @param persona          de reservar una boleta
     * @param funcion          de reservar una boleta
     * @param documento        de reservar una boleta
     * @param tipoSalas        de reservar una boleta
     * @param codigoUnico      de reservar una boleta
     * @return
     */
    public String reservarBoletas(String fechaRealizacion, int fila, int numeroAsiento, Persona persona, Funcion funcion, int documento, TipoSalas tipoSalas, int codigoUnico) {
        String reservar = "";
        Persona cliente = buscarCliente(documento);
        Funcion pelicula = buscarFuncion(codigoUnico);
        if (cliente != null && pelicula != null) {
            Venta reserva = new Venta(fechaRealizacion, fila, tipoSalas, numeroAsiento, persona, funcion);
            listCineVentas.add(reserva);
            reservar = "Las bolestas fueron reservadas con exito";
        } else {
            reservar = "no se pudo realizar la reservacion, el cliente o la funcion no existen, vuelva a intentarlo";
        }
        return reservar;
    }

    /**
     * metodo que permite determinar el total a pagar
     * @param venta determinar el total a pagar
     * @param documento  para determinar el total a pagar
     * @param numero para determinar el total a pagar
     * @param numeroAsiento determinar el total a pagar
     * @return
     */
    public String calcularValorTotal(Venta venta, int documento, int numero, int numeroAsiento) {
        double valor = 0;
        String mensaje = "";
        Persona cliente = buscarCliente(documento);
        if (cliente != null) {
            double descuento = 15;
            valor = 15000 *  (1 - (descuento/100));
            if (numero == 1) {
                valor = valor  * numeroAsiento;
                mensaje = "El valor total a pagar es " + valor;
            } else if (numero == 2) {
                descuento = 30;
                valor = (valor * (1 + (descuento/100))) * numeroAsiento;
                mensaje = "El valor total a pagar es " + valor;
            } else if (numero == 3) {
                descuento = 32;
                valor = (valor * (1 + (descuento/100))) * numeroAsiento;
                mensaje = "El valor total a pagar es " + valor;
            }
        } else {
            mensaje = "No se encontro registro al cliente";
        }
            return mensaje;
    }

    public double calcularPorcentajeFuncio(double vendidos) {
        double total = 0;
        String mensaje;
        int capacidadMaxSala = 10;
        for(int i = 0; i < listCineVentas.size(); i++) {
            Venta venta = listCineVentas.get(i);
            if (venta.getNumeroAsiento() == vendidos){
                total =+ (venta.getNumeroAsiento()/capacidadMaxSala) * 100;
            }
        }
        return total;
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
