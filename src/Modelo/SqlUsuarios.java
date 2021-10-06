/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import agro.Conexion;
import agro.registros;
import static agro.registros.cbousuario;

/**
 *
 * @author Envy
 */
public class SqlUsuarios extends Conexion{

    
    public boolean registrar( usuarios usr)
    {
    //   Statement ps = null;
        combotipousuario ti = new combotipousuario();
        registros com = new registros();
        Conexion conn = new Conexion();
        String tipou;
        tipou = cbousuario.getItemAt(cbousuario.getSelectedIndex()).getId();
        String sql = "INSERT INTO usuarios (usuario, apellido, clave, nombre, gmail, estado, idTipoU) VALUES "
                + "(?, ?, ?,?,?,?,?)";
        
        try {
            PreparedStatement ps = conn.conexion.prepareStatement(sql);
            ps.setString(1, usr.getUsuario());
            ps.setString(2, usr.getApellido());
            ps.setString(3, usr.getClave());
            ps.setString(4, usr.getNombre());
            ps.setString(5, usr.getCorreo());
            ps.setString(6, "A");
            ps.setString(7, tipou);
            ps.execute();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

  
    
     public int existeusuario( String usuario)
    {
        ResultSet rs = null;
         Conexion conn = new Conexion();
      
        
        String sql = "SELECT COUNT(id) FROM USUARIOS WHERE usuario = ? ";
        
        try {
          PreparedStatement ps = conn.conexion.prepareStatement(sql);
            ps.setString(1, usuario);
            rs =  ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
             return 1;
        }

    }
     
    public boolean esEmail(String correo) {

        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+´)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(correo);
        return mather.find();

    }

}
