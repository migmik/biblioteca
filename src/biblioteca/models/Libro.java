package biblioteca.models;

public class Libro {
    public String titulo;
    public String isbn;
    public boolean disponible;

    public void prestar() {
        disponible = false;
    }

    public void devolver() {
        disponible = true;
    }

    public void cambiarTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
    }
}
