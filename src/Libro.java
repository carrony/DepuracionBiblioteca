public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int paginas;

    public Libro(String titulo, String autor, int ejemplares, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPaginas() {
        return paginas;
    }

    public int calcularPaginasDisponibles() {
        return paginas + ejemplares;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ejemplares=" + ejemplares +
                ", paginas=" + paginas +
                '}';
    }
}