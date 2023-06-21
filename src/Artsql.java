import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Artsql {
  Connection con;
  PreparedStatement ps;
  ResultSet rs;
  Articulo a1 = new Articulo();
    
    public Articulo Listar(int id){
        String sql ="SELECT * FROM articulo WHERE idArticulo = ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
      try {
          Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost/papeleria", "root", "");
          ps=con2.prepareStatement(sql);
          ps.setInt(1, id);
          rs=ps.executeQuery();
//          Statement s = con2.createStatement();
//          rs = s.executeQuery("SELECT * FROM articulo");
          while(rs.next()){
              a1.setIdArticulo(rs.getInt(1));
              a1.setNombre(rs.getString(2));
              a1.setPrecio(rs.getInt(3));
              a1.setProveedor(rs.getString(4));
              a1.setExis(rs.getString(5));
              a1.setCant(rs.getInt(6));
              a1.setDescp(rs.getString(7));
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(Artsql.class.getName()).log(Level.SEVERE, null, ex);
      }
      return a1;
    } 
    
    public Articulo ListA(int id ){
        String sql ="SELECT * FROM articulo WHERE idArticulo LIKE ?";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistroArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }
      try {
          Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost/papeleria", "root", "");
          ps=con2.prepareStatement(sql);
          ps.setInt(1, id);
          rs=ps.executeQuery();
          while(rs.next()){
              a1.setIdArticulo(rs.getInt(1));
              a1.setNombre(rs.getString(2));
              a1.setPrecio(rs.getInt(3));
              a1.setProveedor(rs.getString(4));
              a1.setExis(rs.getString(5));
              a1.setCant(rs.getInt(6));
              a1.setDescp(rs.getString(7));
              
          }
      } catch (SQLException ex) {
          Logger.getLogger(Artsql.class.getName()).log(Level.SEVERE, null, ex);
      }
      return a1;
    }
}
