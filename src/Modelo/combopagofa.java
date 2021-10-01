package Modelo;

import agro.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


public class combopagofa {

    private String id;
    private String descripcion;

   Conexion conn = new Conexion();

    public combopagofa(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public combopagofa() {

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

 
    public void llenar_combo(JComboBox<combopagofa> cbopagos) {
        try {
            String sql = "SELECT id, Descripcion from condpago";
            
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(sql);
            cbopagos.removeAllItems();
            while (conn.resultado.next()) {
                cbopagos.addItem(new combopagofa(
                        conn.resultado.getString("id"),
                        conn.resultado.getString("Descripcion")
                ));

            }
        } catch (SQLException e) {
            Logger.getLogger(combopagofa.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @Override
     public String toString(){
        return descripcion;
     }
}
  