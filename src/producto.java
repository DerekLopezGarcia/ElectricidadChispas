public class producto implements Venta{
    private Integer CodigoProducto;
    private String Nombre;
    private String Precio;
    private String Tipo;
    private String Marca;
    private String Modelo;

    public Integer getCodigoProducto() {
        return CodigoProducto;
    }

    public void setCodigoProducto(Integer codigoProducto) {
        CodigoProducto = codigoProducto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
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
