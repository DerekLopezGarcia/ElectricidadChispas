public class Sociedad  implements Cliente{
    private Integer CodigoCliente;
    private String DireccionPostal;
    private String Poblacion;
    private String Provincia;
    private String Email;
    private String Telefono;
    private String Cif;
    private String RazonSocial;

    public String getCif() {
        return Cif;
    }

    public void setCif(String cif) {
        Cif = cif;
    }

    public String getRazonSocial() {
        return RazonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        RazonSocial = razonSocial;
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
