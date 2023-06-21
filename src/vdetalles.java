
public class vdetalles {
    int idDetalle;
    int idVent;
    int idArt;
    int cantidad;
    int price;

    public vdetalles() {
    }

    public vdetalles(int idDetalle, int idVent, int idArt, int cantidad, int price) {
        this.idDetalle = idDetalle;
        this.idVent = idVent;
        this.idArt = idArt;
        this.cantidad = cantidad;
        this.price = price;
    }

    public int getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(int idDetalle) {
        this.idDetalle = idDetalle;
    }

    public int getIdVent() {
        return idVent;
    }

    public void setIdVent(int idVent) {
        this.idVent = idVent;
    }

    public int getIdArt() {
        return idArt;
    }

    public void setIdArt(int idArt) {
        this.idArt = idArt;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
    
    
}