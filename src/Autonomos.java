public class Autonomos implements Cliente{
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


    @Override
    public Integer getCodigoCliente() {
        return null;
    }

    @Override
    public void setCodigoCliente(Integer CodigoCliente) {

    }

    @Override
    public String getDireccionPostal() {
        return null;
    }

    @Override
    public void setDireccionPostal(String DireccionPostal) {

    }

    @Override
    public String getPoblacion() {
        return null;
    }

    @Override
    public void setPoblacion(String Poblacion) {

    }

    @Override
    public String getPorvincia() {
        return null;
    }

    @Override
    public void setProvincia(String Provincia) {

    }

    @Override
    public String getEmail() {
        return null;
    }

    @Override
    public void setEmail(String Email) {

    }

    @Override
    public String getTelefono() {
        return null;
    }

    @Override
    public void setTelefono(String Telefono) {

    }
}
