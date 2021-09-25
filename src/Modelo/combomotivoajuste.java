package Modelo;

import agro.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;


public class combomotivoajuste {

    private String id;
    private String descripcion;

   Conexion conn = new Conexion();

    public combomotivoajuste(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public combomotivoajuste() {

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

 
    public void llenar_combo(JComboBox<combomotivoajuste> cbomotivo) {
        try {
            String sql = "SELECT id, Descripcion from motivoajuste";
            
            conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(sql);
            cbomotivo.removeAllItems();
            while (conn.resultado.next()) {
                cbomotivo.addItem(new combomotivoajuste(
                        conn.resultado.getString("id"),
                        conn.resultado.getString("Descripcion")
                ));

            }
        } catch (SQLException e) {
            Logger.getLogger(combomotivoajuste.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    @Override
     public String toString(){
        return descripcion;
     }
}
  