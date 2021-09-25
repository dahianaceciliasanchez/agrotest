package Modelo;

import agro.Conexion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

public class combociudad {

    String descripcionciudad;
    String idciudad;
    Conexion conn = new Conexion();

    public combociudad(String descripcionciudad, String idciudad) {
        this.descripcionciudad = descripcionciudad;
        this.idciudad = idciudad;
    }


    public String getDescripcionciudad() {
        return descripcionciudad;
    }

    public void setDescripcionciudad(String descripcionciudad) {
        this.descripcionciudad = descripcionciudad;
    }

    public String getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(String idciudad) {
        this.idciudad = idciudad;
    }

    public Conexion getConn() {
        return conn;
    }

    public void setConn(Conexion conn) {
        this.conn = conn;
    }
    
    /**
     *
     * @param cbociudades
     */
    public void llenarcombo(JComboBox<combociudad> cbociudades){
       try {
             String sql= "SELECT id, Descripcion from ciudad";
           conn.sentencia = conn.conexion.createStatement();
            conn.resultado = conn.sentencia.executeQuery(sql);
            cbociudades.removeAllItems();
            while (conn.resultado.next()) {
               cbociudades.addItem(new combociudad(
                       conn.resultado.getString("idciudad"),
                       conn.resultado.getString("descripcionciudad")
               ));
               
           }
                
            
       } catch (SQLException e) {
            Logger.getLogger(combociudad.class.getName()).log(Level.SEVERE, null, e);
       
   }
   }  
   @Override
     public String toString(){
        return descripcionciudad;
     }
}
