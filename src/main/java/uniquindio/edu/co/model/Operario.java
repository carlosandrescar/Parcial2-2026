package uniquindio.edu.co.model;

/**
 * Operario de CinePlus. Es quien registra las ventas en la taquilla.
 */
public class Operario extends Persona {
    private int codigoEmpleado;
    private String fechaContratacion;
    private double salarioBasico;

    /**
     * Constructor de Operario
     * @param documento documento de identidad
     * @param nombreCompleto nombre completo
     * @param correoElectronico correo electrónico
     * @param telefono teléfono
     * @param codigoEmpleado código de empleado
     * @param fechaContratacion fecha de contratación
     * @param salarioBasico salario básico
     */
    public Operario(String documento, String nombreCompleto, String correoElectronico, String telefono,
                    int codigoEmpleado, String fechaContratacion, double salarioBasico) {
        super(documento, nombreCompleto, correoElectronico, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salarioBasico = salarioBasico;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    @Override
    public String toString() {
        return "Operario{" + super.toString() +
                ", codigoEmpleado=" + codigoEmpleado +
                ", fechaContratacion=" + fechaContratacion +
                ", salarioBasico=" + salarioBasico + "}";
    }
}
