
public class venta {
    int IdVenta;
    int monto;
    String fecha;

    public venta() {
    }

    public venta(int IdVenta, int monto, String fecha) {
        this.IdVenta = IdVenta;
        this.monto = monto;
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
