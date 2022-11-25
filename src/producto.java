public class producto implements Venta{
    private Integer CodigoProducto;
    private String Nombre;
    private Integer Precio;
    private Integer Tipo;
    private String Marca;
    private String Modelo;
    private Integer Total;


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
    public Integer getTipo() {
        return null;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre=Nombre;
    }

    @Override
    public void setPrecio(Integer Precio) {
        this.Precio=Precio;
    }

    @Override
    public void setTipo(Integer Tipo) {
        this.Tipo=Tipo;
    }

    @Override
    public Integer getCodigo() {
        return CodigoProducto;
    }

    @Override
    public void setCodigo(Integer Codigo) {
        this.CodigoProducto=Codigo;
    }

    @Override
    public Integer getTotal() {
        return Total;
    }

    @Override
    public void setTotal() {
        this.Total=(Precio+Precio*(Tipo/100));
    }
}
