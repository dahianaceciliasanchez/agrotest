package Modelo;

import agro.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


public class combotipousuario {

    private String id;
    private String descripcion;

   Conexion conn = new Conexion();

    public combotipousuario(String id, String descripcion) {
        this.id= id;
        this.descripcion = descripcion;
    }

    public combotipousuario() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

 
    public void llenar_combo(JComboBox<combotipousuario> cbousuario) {
        try {
            String sql = "SELECT id, Nombre from tipousuario";
            
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(sql);
            cbousuario.removeAllItems();
            while (conn.resultado.next()) {
                cbousuario.addItem(new combotipousuario(
                        conn.resultado.getString("id"),
                        conn.resultado.getString("Nombre")
                ));

            }
        } catch (SQLException e) {
            Logger.getLogger(combotipousuario.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @Override
     public String toString(){
        return descripcion;
     }
}
  