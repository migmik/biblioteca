package biblioteca.models;

public class Prestamo {
    Libro libro;
    Socio socio;
    int idPrestamo;
    static int generadorId = 1;

    public void iniciarPrestamo(Libro libro, Socio socio) {
        idPrestamo = generadorId++;
        this.libro = libro;
        this.socio = socio;
        socio.pedirPrestamo(libro);
        System.out.println("ID de prestamo: " + this.idPrestamo);
        System.out.println("Socio: " + this.socio.nombre);
        System.out.println("Libro: " + this.libro.titulo);
    }
}
