package biblioteca.models;

public class Libro {
    public String titulo;
    public String isbn;
    public boolean disponible;

    public void prestar() {
        disponible = false;
        System.out.println("Libro prestado con exito");
    }

    public void devolver() {
        disponible = true;
        System.out.println("Libro devuelto con exito");
    }

    public void cambiarTitulo(String nuevoTitulo) {
        titulo = nuevoTitulo;
        System.out.println("Titulo cambiado con exito");
    }

    public void estaDisponible(){
        if (disponible) {
            System.out.println("Libro disponible");
        }
        else
        {
            System.out.println("Libro no disponible");
        }
    }
}
