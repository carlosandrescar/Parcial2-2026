package uniquindio.edu.co.model;

public class Pelicula extends Funcion{
    private String titulo;
    private GeneroPelicula generoPelicula;
    private ClasificacionPelicula clasificacionPelicula;

    /**
     * Metodo constructor de la pelicula
     * @param codigoUnico de la pelicula
     * @param fechaFuncion de la pelicula
     * @param horaIncio de la pelicula
     * @param duracion de la pelicula
     * @param capacidadMaxima de la pelicula
     * @param titulo de la pelicula
     */
    public Pelicula(int codigoUnico, String fechaFuncion, int horaIncio, int duracion, int capacidadMaxima, String titulo, GeneroPelicula generoPelicula,ClasificacionPelicula clasificacionPelicula) {
        super(codigoUnico, fechaFuncion, horaIncio, duracion, capacidadMaxima);
        this.titulo = titulo;
        this.clasificacionPelicula = clasificacionPelicula;
        this.generoPelicula = generoPelicula;
    }

    public GeneroPelicula getGeneroPelicula() {
        return generoPelicula;
    }

    public void setGeneroPelicula(GeneroPelicula generoPelicula) {
        this.generoPelicula = generoPelicula;
    }

    public ClasificacionPelicula getClasificacionPelicula() {
        return clasificacionPelicula;
    }

    public void setClasificacionPelicula(ClasificacionPelicula clasificacionPelicula) {
        this.clasificacionPelicula = clasificacionPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", generoPelicula=" + generoPelicula +
                ", clasificacionPelicula=" + clasificacionPelicula +
                '}';
    }
}
