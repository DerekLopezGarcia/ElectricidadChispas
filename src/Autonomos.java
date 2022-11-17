public class Autonomos {
    private Integer CodigoCliente;
    private String DireccionPostal;
    private String Poblacion;
    private String Provincia;
    private String Email;
    private String Telefono;
    private String DNI;
    private String Nombre;
    private String Apellidos;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }
}
