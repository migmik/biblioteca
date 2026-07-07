package biblioteca.models;

public class Socio {

    String dni;
    String nombre;
    String telefono;
    int cantPrestamos;
    boolean aptoPrestamo;

    public void pedirPrestamo(Libro libro) {
        if (aptoPrestamo) {
            this.cantPrestamos++;
            libro.disponible = false;
            if (cantPrestamos == 3) {
                aptoPrestamo = false;
            }
        }
    }
}
