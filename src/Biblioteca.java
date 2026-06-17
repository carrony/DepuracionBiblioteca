public class Biblioteca {
    private Libro[] libros;
    private int contador;

    public Biblioteca(int capacidad) {
        libros = new Libro[capacidad];
        contador = 0;
    }

    public void insertarLibro(Libro libro) {
        if (contador < libros.length) {
            libros[contador] = libro;
            contador++;
        } else {
            System.out.println("No hay espacio para más libros.");
        }
    }

    public void prestarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i] != null && libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                libros[i].setEjemplares(libros[i].getEjemplares() - 1);
                System.out.println("Préstamo realizado de: " + titulo);
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
    }

    public void devolverLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i] != null && libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                if (libros[i].getEjemplares() > 0) {
                    libros[i].setEjemplares(libros[i].getEjemplares() + 1);
                }
                System.out.println("Devolución realizada de: " + titulo);
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
    }

    public void eliminarLibro(String titulo) {
        for (int i = 0; i < contador; i++) {
            if (libros[i] != null && libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                libros[i].setEjemplares(0);
                System.out.println("Libro eliminado: " + titulo);
                return;
            }
        }
        System.out.println("No se pudo eliminar el libro: " + titulo);
    }

    public int calcularPaginasTotalesDisponibles() {
        int total = 0;
        for (int i = 0; i < contador; i++) {
            if (libros[i] != null) {
                total += libros[i].getPaginas() * libros[i].getEjemplares();
            }
        }
        return total;
    }

    public void mostrarLibros() {
        System.out.println("Listado de libros:");
        for (int i = 0; i < contador; i++) {
            if (libros[i] != null) {
                System.out.println(libros[i]);
            }
        }
    }
}