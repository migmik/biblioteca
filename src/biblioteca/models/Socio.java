package biblioteca.models;

public class Socio {

    String dni;
    String nombre;
    String telefono;
    int cantPrestamos;
    boolean aptoPrestamo;

    public Socio(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.cantPrestamos = 0;
        this.aptoPrestamo = true;
    }

    @Override
    public String toString() {
        return "Socio [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", cantPrestamos="
                + cantPrestamos + ", aptoPrestamo=" + aptoPrestamo + "]";
    }

    public void pedirPrestamo(Libro libro) {
        if (aptoPrestamo) {
            if (libro.disponible) {
                this.cantPrestamos++;
                libro.prestar();
                if (cantPrestamos == 3) {
                    aptoPrestamo = false;
                }
            }
            else
            {
                System.out.println("Libro no disponible para prestamo");
            }
        } else {
            System.out.println("Prestamo denegado, tiene 3 prestamos activos");
        }
    }

    public void devolverPrestamo(Libro libro) {
        if (!libro.disponible) {
            libro.devolver();
            this.cantPrestamos--;
            if (cantPrestamos < 3) {
                aptoPrestamo = true;
            }
        }
    }
}
