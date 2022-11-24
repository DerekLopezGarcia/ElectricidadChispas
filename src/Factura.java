import java.util.Date;

public class Factura {
    private Integer CodigoFactura;
    private Date Fecha;
    private Integer BaseImponible;
    private Integer Total;

    public Integer getCodigoFactura() {
        return CodigoFactura;
    }

    public void setCodigoFactura(Integer codigoFactura) {
        CodigoFactura = codigoFactura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Integer getBaseImponible() {
        return BaseImponible;
    }

    public void setBaseImponible(Integer baseImponible) {
        BaseImponible = baseImponible;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        Total = total;
    }
}
