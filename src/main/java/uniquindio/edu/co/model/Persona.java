package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private int numeroTelefono;
    private String correo;
    private int documento;

    /**
     * Metodo constructor de persona
     * @param nombre de persona
     * @param numeroTelefono de persona
     * @param correo de persona
     * @param documento de persona
     */
    public Persona(String nombre, int numeroTelefono, String correo, int documento) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correo = correo;
        this.documento = documento;

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                ", correo='" + correo + '\'' +
                ", documento=" + documento +
                '}';
    }
}
