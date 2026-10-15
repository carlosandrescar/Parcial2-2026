package uniquindio.edu.co.model;

public class Cliente extends Persona {

    /**
     * Metodo constructor de cliente
     * @param nombre de cliente
     * @param numeroTelefono de cliente
     * @param correo de cliente
     * @param documento de cliente
     */
    public Cliente(String nombre, int numeroTelefono, String correo, int documento) {
        super(nombre, numeroTelefono, correo, documento);
    }

    @Override
    public String toString() {
        return "El cliente es  " + getNombre() + "  con numero de telefono:  " + getNumeroTelefono() + "  con el correo:  " + getCorreo() + "  el documento es:  " + getDocumento();
    }
}

