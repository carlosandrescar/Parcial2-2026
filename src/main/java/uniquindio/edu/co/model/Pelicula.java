package uniquindio.edu.co.model;

/**
 * Película del catálogo de CinePlus.
 */
public class Pelicula {
    private int codigo;
    private String titulo;
    private int duracionMinutos;
    private GeneroPelicula genero;
    private String clasificacionEdad;

    /**
     * Constructor de Pelicula
     * @param codigo código único de la película
     * @param titulo título
     * @param duracionMinutos duración en minutos
     * @param genero género cinematográfico
     * @param clasificacionEdad clasificación por edad (ej: "Todo público", "+12", "+18")
     */
    public Pelicula(int codigo, String titulo, int duracionMinutos, GeneroPelicula genero, String clasificacionEdad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.genero = genero;
        this.clasificacionEdad = clasificacionEdad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public GeneroPelicula getGenero() {
        return genero;
    }

    public void setGenero(GeneroPelicula genero) {
        this.genero = genero;
    }

    public String getClasificacionEdad() {
        return clasificacionEdad;
    }

    public void setClasificacionEdad(String clasificacionEdad) {
        this.clasificacionEdad = clasificacionEdad;
    }

    @Override
    public String toString() {
        return "Pelicula{codigo=" + codigo +
                ", titulo=" + titulo +
                ", duracion=" + duracionMinutos + " min" +
                ", genero=" + genero +
                ", clasificacion=" + clasificacionEdad + "}";
    }
}
