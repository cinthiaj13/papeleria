import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class vsql {
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  int r=0;
  public String IdVentas(){
    String idv="";
    try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
      try {
          con= DriverManager.getConnection("jdbc:mysql://localhost/papeleria", "root", "");
          Statement s = con.createStatement();
          rs = s.executeQuery("SELECT max(idventa) FROM venta");
          while(rs.next()){
          idv=rs.getString(1);
          }
      } catch (SQLException ex) {
          Logger.getLogger(vsql.class.getName()).log(Level.SEVERE, null, ex);
      }
      return idv;
    }
  
  public int GuardarVenta(venta v){
      venta v1 = new venta();
      String sql = "INSERT INTO venta(idventa,monto,fechav) VALUES (?,?,?)";
      try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
      try {
          con= DriverManager.getConnection("jdbc:mysql://localhost/papeleria", "root", "");
          ps = con.prepareStatement(sql);
          ps.setInt(1, v.getIdVenta());
          ps.setInt(2, v.getMonto());
          ps.setString(3, v.getFecha());
          r=ps.executeUpdate();
         
          
      } catch (SQLException ex) {
          Logger.getLogger(vsql.class.getName()).log(Level.SEVERE, null, ex);
      }
      return r;
  }
  
  public int GuardarDetalles(vdetalles dv){
      venta v1 = new venta();
      String sql = 
      "INSERT INTO detalleventa(idDetalle, idventa, idArticulo,cantidad,precio) VALUES (?, ?, ?, ?, ?)";
      try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
      
      try {
          con= DriverManager.getConnection("jdbc:mysql://localhost/papeleria", "root", "");
          ps = con.prepareStatement(sql);
          ps.setInt(1, dv.getIdDetalle());
          ps.setInt(2, dv.getIdVent());
          ps.setInt(3, dv.getIdArt());
          ps.setInt(4, dv.getCantidad());
          ps.setInt(5, dv.getPrice());
          r=ps.executeUpdate();  
      } catch (SQLException ex) {
          Logger.getLogger(vsql.class.getName()).log(Level.SEVERE, null, ex);
      }
      return r;
  }
}
