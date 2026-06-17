public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(6);

        Libro l1 = new Libro("El Quijote", "Cervantes", 3, 850);
        Libro l2 = new Libro("1984", "George Orwell", 2, 320);
        Libro l3 = new Libro("Clean Code", "Robert C. Martin", 1, 464);
        Libro l4 = new Libro("El Hobbit", "J.R.R. Tolkien", 4, 310);
        Libro l5 = new Libro("Fundacion", "Isaac Asimov", -2, 255);

        biblioteca.insertarLibro(l1);
        biblioteca.insertarLibro(l2);
        biblioteca.insertarLibro(l3);
        biblioteca.insertarLibro(l4);
        biblioteca.insertarLibro(l5);

        System.out.println("Paginas disponibles de El Quijote (esperado 2550): " + l1.calcularPaginasDisponibles());
        System.out.println("Paginas disponibles de 1984 (esperado 640): " + l2.calcularPaginasDisponibles());

        biblioteca.prestarLibro("El Hobbit");
        biblioteca.prestarLibro("Libro inexistente");

        biblioteca.devolverLibro("1984");
        biblioteca.devolverLibro("Fundacion");

        biblioteca.eliminarLibro("1984");

        System.out.println("Intentando prestar un libro eliminado...");
        biblioteca.prestarLibro("1984");

        System.out.println("Total de paginas disponibles: " + biblioteca.calcularPaginasTotalesDisponibles());

        biblioteca.mostrarLibros();
    }
}