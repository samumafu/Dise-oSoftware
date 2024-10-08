import java.util.Scanner;

class Publicacion {
    protected String titulo;
    protected float precio;

    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el título de la publicación: ");
        titulo = scanner.nextLine();
        System.out.println("Ingrese el precio: ");
        precio = scanner.nextFloat();
    }

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Precio: $" + precio);
    }
}


class Libro extends Publicacion {
    private int numPaginas;
    private int anioPublicacion;

    public void solicitarDatos() {
        super.solicitarDatos(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de páginas: ");
        numPaginas = scanner.nextInt();
        System.out.println("Ingrese el año de publicación: ");
        anioPublicacion = scanner.nextInt();
    }

    public void mostrarDatos() {
        super.mostrarDatos(); 
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}


class Disco extends Publicacion {
    private float duracion;

    public void solicitarDatos() {
        super.solicitarDatos(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la duración en minutos: ");
        duracion = scanner.nextFloat();
    }

    public void mostrarDatos() {
        super.mostrarDatos(); 
        System.out.println("Duración: " + duracion + " minutos");
    }
}


public class Editorial {
    public static void main(String[] args) {
        
        Libro libro = new Libro();
        Disco disco = new Disco();

     
        System.out.println("Datos del Libro:");
        libro.solicitarDatos();
        libro.mostrarDatos();

       
        System.out.println("\nDatos del Disco:");
        disco.solicitarDatos();
        disco.mostrarDatos();
    }
}
