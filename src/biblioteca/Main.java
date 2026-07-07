package biblioteca;

import java.net.Socket;

import biblioteca.models.Libro;
import biblioteca.models.Prestamo;
import biblioteca.models.Socio;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Libro libro2 = new Libro();

        Socio socio1 = new Socio("39193904", "Miguel Perez", "3789456235");
        Prestamo prestamo1 = new Prestamo();
        Prestamo prestamo2 = new Prestamo();

        libro1.titulo = "El Principito";
        libro1.isbn = "12345";
        libro1.disponible = true;
        libro2.titulo = "El Quijote de la Mancha";
        libro2.isbn = "67890";
        libro2.disponible = true;
        libro1.prestar();
        libro1.prestar();
        libro1.estaDisponible();
        libro1.devolver();
        libro1.cambiarTitulo("El principito 2");
        prestamo1.iniciarPrestamo(libro1, socio1);
        prestamo2.iniciarPrestamo(libro2, socio1);
    }

}
