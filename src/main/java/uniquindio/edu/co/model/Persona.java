package uniquindio.edu.co.model;

/**
 * Clase abstracta que representa a una persona vinculada con CinePlus.
 * Puede ser un Cliente o un Operario.
 */
public abstract class Persona {
    private String documento;
    private String nombreCompleto;
    private String correoElectronico;
    private String telefono;

    /**
     * Constructor de Persona
     * @param documento documento de identidad
     * @param nombreCompleto nombre completo
     * @param correoElectronico correo electrónico
     * @param telefono número de teléfono (String porque un celular de 10 dígitos no cabe en un int)
     */
    public Persona(String documento, String nombreCompleto, String correoElectronico, String telefono) {
        this.documento = documento;
        this.nombreCompleto = nombreCompleto;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "documento=" + documento +
                ", nombre=" + nombreCompleto +
                ", correo=" + correoElectronico +
                ", teléfono=" + telefono;
    }
}
