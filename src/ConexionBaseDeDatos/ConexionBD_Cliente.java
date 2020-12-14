/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;

import static Clases.ConexionBD.con;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author svhju
 */
public class ConexionBD_Cliente {
    /* ------------------------------------------------ CLIENTE ----------------------------------------------------------- */
    public static boolean ingresarCliente(String state, String dpi, String nombres, String apellidos, String genero, String fechaNacimiento,
                                          String telefono, String correoElectronico, String calleAvenida, String numeroCasa,
                                          String zona, int codigoDireccion, String cuentaBancaria, String enlaceFacebook,
                                          String enlaceInstagram, InputStream pdfDpi){
        
        try{
            //Indicamos la consulta a usar
            String sql = "INSERT INTO\n"
                        + "tb_cliente(state, dpi, nombres, apellidos, genero, fecha_nacimiento, telefono, correo_electronico, "
                        + "calle_avenida, numero_casa, zona, cod_direccion, cuenta_bancaria, enlace_facebook, enlace_instagram, pdf_dpi)\n"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            //PreparedStatement ConsultaSQL = con.prepareStatement(sql);
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, state);
            ConsultaSQL.setString(2, dpi);
            ConsultaSQL.setString(3, nombres);
            ConsultaSQL.setString(4, apellidos);
            ConsultaSQL.setString(5, genero);
            ConsultaSQL.setString(6, fechaNacimiento);
            ConsultaSQL.setString(7, telefono);
            ConsultaSQL.setString(8, correoElectronico);  
            ConsultaSQL.setString(9, calleAvenida);
            ConsultaSQL.setString(10, numeroCasa);
            ConsultaSQL.setString(11, zona);
            ConsultaSQL.setInt(12, codigoDireccion);
            ConsultaSQL.setString(13, cuentaBancaria);
            ConsultaSQL.setString(14, enlaceFacebook);
            ConsultaSQL.setString(15, enlaceInstagram);
            ConsultaSQL.setBlob(16, pdfDpi);
            
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(Clases.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
}
