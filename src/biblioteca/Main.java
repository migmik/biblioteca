package biblioteca;
import biblioteca.models.Libro;

public class Main {

    public static void main(String[] args) {
        Libro libro1 = new Libro();

        libro1.titulo = "El Principito";
        libro1.isbn = "12345";
        libro1.disponible = true;

        libro1.prestar();

        System.out.println(libro1.disponible);
    }

}
