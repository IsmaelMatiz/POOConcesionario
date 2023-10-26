package DTOClientes;

public class Clientes {


    private String cedula;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;


    public String Getcedula() {
        return this.cedula;
    }

    public void Setcedula(String cedula) {
        this.cedula = cedula;
    }

    public String Getnombre() {
        return this.nombre;
    }

    public void Setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String Getapellidos() {
        return this.apellidos;
    }

    public void Setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String Getdireccion() {
        return this.direccion;
    }

    public void Setdireccion(String direccion) {
        this.direccion = direccion;
    }

    public String Gettelefono() {
        return this.telefono;
    }

    public void Settelefono(String telefono) {
        this.telefono = telefono;
    }
}
