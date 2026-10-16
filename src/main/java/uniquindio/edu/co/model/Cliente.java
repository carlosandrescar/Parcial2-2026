package uniquindio.edu.co.model;

/**
 * Cliente de CinePlus. Tiene un código de afiliación y un porcentaje de descuento.
 */
public class Cliente extends Persona {
    private int codigoAfiliacion;
    private double porcentajeDescuento; // Ej: 10 significa 10 %

    /**
     * Constructor de Cliente
     * @param documento documento de identidad
     * @param nombreCompleto nombre completo
     * @param correoElectronico correo electrónico
     * @param telefono teléfono
     * @param codigoAfiliacion código de afiliación
     * @param porcentajeDescuento porcentaje de descuento (0 a 100)
     */
    public Cliente(String documento, String nombreCompleto, String correoElectronico, String telefono,
                   int codigoAfiliacion, double porcentajeDescuento) {
        super(documento, nombreCompleto, correoElectronico, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    /**
     * Aplica el descuento del cliente a un valor.
     * @param valor valor sobre el que se aplica el descuento
     * @return valor ya con el descuento aplicado
     */
    public double aplicarDescuento(double valor) {
        return valor - (valor * porcentajeDescuento / 100);
    }

    public int getCodigoAfiliacion() {
        return codigoAfiliacion;
    }

    public void setCodigoAfiliacion(int codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return "Cliente{" + super.toString() +
                ", codigoAfiliacion=" + codigoAfiliacion +
                ", descuento=" + porcentajeDescuento + "%}";
    }
}
