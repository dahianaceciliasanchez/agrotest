package Modelo;

import agro.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


public class combometodo {

    private String id;
    private String descripcion;

   Conexion conn = new Conexion();

    public combometodo(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public combometodo() {

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

 
    public void llenar_combo(JComboBox<combometodo> cbometodo) {
        try {
            String sql = "SELECT id, Descripcion from metodoia";
            
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(sql);
            cbometodo.removeAllItems();
            while (conn.resultado.next()) {
                cbometodo.addItem(new combometodo(
                        conn.resultado.getString("id"),
                        conn.resultado.getString("Descripcion")
                ));

            }
        } catch (SQLException e) {
            Logger.getLogger(combometodo.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @Override
     public String toString(){
        return descripcion;
     }
}
  