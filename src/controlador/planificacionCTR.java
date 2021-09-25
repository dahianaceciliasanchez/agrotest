
package controlador;

import Modelo.planificacionDAO;
import agro.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class planificacionCTR {
    planificacionDAO planificar = new planificacionDAO();
    Conexion conn = new Conexion();
    String cn;
    Statement st;
    ResultSet rs; 
    
    
    
//    private void GuardaMovi() {
//        String sql = "INSERT INTO detalleplanificacionia( planificacionia, vacunasid, CantidadDosis) VALUES ("
//                  + " VALUES (?, ?, ?)";
//         try {
//            PreparedStatement ps = conn.conexion.prepareStatement(sql);
//            ps.setString(1, txtDescripcion.getText());
//            ps.setString(2, txtCodigoP.getText());
//            ps.setString(3, txtSiglas.getText());
//            ps.setString(4, txtCantidad.getText());
//            ps.setString(5, txtIVA.getText());
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            Logger.getLogger(productoCTR.class.getName()).log(Level.SEVERE, null, e);
//
//        }

//        System.out.println(sql);
//    
//        conn.actualizaTabla(sql); //detallevacunas
//        sql = "update vacunas Set Stock = Stock + " + txtCantidad.getText()
//                + " where id =" + txtCantidad.getText();
//        conn.actualizaTabla(sql);
//        System.out.print(sql);
//    }
}



