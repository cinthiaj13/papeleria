public class Articulo {
    int idArticulo;
    String nombre;
    int precio;
    String proveedor;
    String exis;
    int cant;
    String descp;

    public Articulo() {
    }

    public Articulo(int idArticulo, String nombre, int precio, String proveedor, String exis, int cant, String descp) {
        this.idArticulo = idArticulo;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.exis = exis;
        this.cant = cant;
        this.descp = descp;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getExis() {
        return exis;
    }

    public void setExis(String exis) {
        this.exis = exis;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getDescp() {
        return descp;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }
    
}
