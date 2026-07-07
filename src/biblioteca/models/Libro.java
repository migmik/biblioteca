package biblioteca.models;

public class Libro {
    public String titulo;
    public String isbn;
    public boolean disponible;

    public void prestar() {
        System.out.println("Libro a prestar: "+ this.titulo);
        if (disponible) {
            System.out.println("Libro prestado con exito");
            disponible = false;
        }else
        {
            System.out.println("Libro no disponible");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("Libro devuelto con exito");
        }
        else
        {
            System.out.println("Libro ya en biblioteca");
        }
    }

    public void cambiarTitulo(String nuevoTitulo) {
        System.out.println("Titulo: " + this.titulo);
        this.titulo = nuevoTitulo;
        System.out.println("Nuevo titulo: " + this.titulo);
        System.out.println("Titulo cambiado con exito");
    }

    public void estaDisponible() {
        if (disponible) {
            System.out.println("Libro disponible");
        } else {
            System.out.println("Libro no disponible");
        }
    }
}
