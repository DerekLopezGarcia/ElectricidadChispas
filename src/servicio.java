public class servicio implements Venta{
    private Integer CodigoServicio;
    private String Precio;
    private String Tipo;
    private String Nombre;

    public Integer getCodigoServicio() {
        return CodigoServicio;
    }

    public void setCodigoServicio(Integer codigoServicio) {
        CodigoServicio = codigoServicio;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public Integer getPrecio() {
        return null;
    }

    @Override
    public String getTipo() {
        return null;
    }

    @Override
    public void setNombre(String Nombre) {

    }

    @Override
    public void setPrecio(Integer Precio) {

    }

    @Override
    public void setTipo(String Tipo) {

    }

}
