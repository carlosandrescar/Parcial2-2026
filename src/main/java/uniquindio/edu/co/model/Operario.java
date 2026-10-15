package uniquindio.edu.co.model;

public class Operario extends Persona {
    private double salario;
    private int fechaContrato;

    public Operario(String nombre, int numeroTelefono, String correo, int documento, double salario, int fechaContrato) {
        super(nombre, numeroTelefono, correo, documento);
        this.salario = salario;
        this.fechaContrato = fechaContrato;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(int fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        return "Operario{" +
                ", salario=" + salario +
                ", fechaContrato=" + fechaContrato +
                '}';
    }
}
