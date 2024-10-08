
class Nombre {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

   
    public Nombre(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    
    public void leerNombre(String nombre, String primerApellido, String segundoApellido) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    
    public void mostrar() {
        System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
    }
}


class Direccion extends Nombre {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    
    public Direccion(String nombre, String primerApellido, String segundoApellido, String calle, String ciudad, String provincia, String codigoPostal) {
        super(nombre, primerApellido, segundoApellido);
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    
    public void nuevaDireccion(String calle, String ciudad, String provincia, String codigoPostal) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
    }

    
    public void nuevoNombre(String nombre, String primerApellido, String segundoApellido) {
        leerNombre(nombre, primerApellido, segundoApellido);
    }

    
    @Override
    public void mostrar() {
        super.mostrar(); 
        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", Código Postal: " + codigoPostal);
    }
}


public class Informacion {
    public static void main(String[] args) {
        
        Direccion direccion = new Direccion(
             "Juan", "Pérez", "Gómez", "Calle 123", "Madrid", "Madrid", "28001");

        
        direccion.mostrar();

        
        direccion.nuevoNombre("Carlos", "Sánchez", "López");
        direccion.nuevaDireccion("Avenida Siempre Viva", "Barcelona", "Cataluña", "08001");

    
        System.out.println("\nDatos actualizados:");
        direccion.mostrar();
    }
}
