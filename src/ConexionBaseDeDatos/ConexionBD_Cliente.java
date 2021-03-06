/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author svhju
 */
public class ConexionBD_Cliente {
    /* ------------------------------------------------ CLIENTE ----------------------------------------------------------- */
    
    public static ResultSet mostrarTodoClientes(){

        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
            "UPPER(tb_cliente.codigo) AS CODIGO,\n" +
            "tb_cliente.dpi AS DPI,\n"+
            "UPPER(CONCAT(tb_cliente.nombres, ' ', tb_cliente.apellidos)) As NOMBRE,\n" +
            "UPPER(tb_cliente.telefono) AS TELEFONO,\n" +
            "tb_cliente.correo_electronico AS CORREO_ELECTRONICO\n" +
            "FROM\n" +
            "tb_cliente\n" +
            "WHERE tb_cliente.state = 'VIGENTE'\n" +
            "ORDER BY tb_cliente.nombres;"; 
            
            //El Statemen es el interpretador de consultas e instrucciones SQL
            Statement consultaSQL = ConexionBD.getVarCon().createStatement();

            /*El resulset obtiene la estructura de tabla que devuelve la consulta
              realizada, en este caso devuelve la consulta almacenada en la variable
              String sql */
            ResultSet estructuraTabla = consultaSQL.executeQuery(sql);

            //solamente devolvemos el objeto del ResultSet/

            return estructuraTabla;


        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }

    }
        
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
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    public static ResultSet obtenerTodosLosDatosDelCliente(int codigo){
    try{
            
            //indicamos la consulta a utilizar
            String sql="SELECT * FROM tb_cliente WHERE codigo = ?";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setInt(1, codigo);
            
            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();
            
            return estructuraTabla;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha surgido un error: " + ex);
            return null;
        }
    }
    
    public static boolean actualizarCliente(String state, String dpi, String nombres, String apellidos, String genero, String fecha_nacimiento, String telefono,
                                             String correo_electronico, String calle_avenida, String numero_casa, String zona, int cod_direccion, String cuenta_bancaria,
                                             String enlace_facebook, String enlace_instagram, InputStream pdfDpi, int codigo){
    
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE tb_cliente SET state = ?, dpi= ?, nombres= ?, apellidos= ?, genero= ?, fecha_nacimiento= ?, telefono= ?, correo_electronico= ?, "
                        + "calle_avenida= ?, numero_casa= ?, zona= ?, cod_direccion= ?, cuenta_bancaria= ?, enlace_facebook= ?, enlace_instagram= ?, pdf_dpi= ?\n" 
                        + "WHERE tb_cliente.codigo = ?";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, state);
            ConsultaSQL.setString(2, dpi);
            ConsultaSQL.setString(3, nombres);
            ConsultaSQL.setString(4, apellidos);
            ConsultaSQL.setString(5, genero);
            ConsultaSQL.setString(6, fecha_nacimiento);
            ConsultaSQL.setString(7, telefono);  
            ConsultaSQL.setString(8, correo_electronico);
            ConsultaSQL.setString(9, calle_avenida);
            ConsultaSQL.setString(10, numero_casa);
            ConsultaSQL.setString(11, zona);
            ConsultaSQL.setInt(12, cod_direccion);
            ConsultaSQL.setString(13, cuenta_bancaria);
            ConsultaSQL.setString(14, enlace_facebook);
            ConsultaSQL.setString(15, enlace_instagram);
            ConsultaSQL.setBlob(16, pdfDpi);
            ConsultaSQL.setInt(17, codigo);
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    public static boolean darDeBajaACliente(String state, int codigo){
    
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE tb_cliente SET state = ?"
                    + "WHERE tb_cliente.codigo = ?";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, state);
            ConsultaSQL.setInt(2, codigo);
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }   
    
    public static boolean restaurarCliente(String state, int codigo){
    
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE tb_cliente SET state = ?"
                    + "WHERE tb_cliente.codigo = ?";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, state);
            ConsultaSQL.setInt(2, codigo);
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    //MOSTRAR TODAS LAS DIRECCIONES PARA CLIENTES
    public static ResultSet mostrarTodoDireccion(){
        
        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
                        "UPPER(tb_barrio_caserio_finca_aldea.codigo) AS CODIGO,\n" +
                        "UPPER(CONCAT(tb_barrio_caserio_finca_aldea.nombres, ', ', tb_municipio.nombres, ', ',tb_departamento.nombres)) AS DIRECCION\n" +
                        "FROM\n" +
                        "tb_barrio_caserio_finca_aldea\n" +
                        "INNER JOIN tb_municipio ON tb_barrio_caserio_finca_aldea.cod_municipio = tb_municipio.codigo\n" +
                        "INNER JOIN tb_departamento ON tb_municipio.cod_departamento = tb_departamento.codigo;";
            
            //El Statemen es el interpretador de consultas e instrucciones SQL
            Statement consultaSQL = ConexionBD.getVarCon().createStatement();
            
            /*El resulset obtiene la estructura de tabla que devuelve la consulta
              realizada, en este caso devuelve la consulta almacenada en la variable
              String sql */
            ResultSet estructuraTabla = consultaSQL.executeQuery(sql);
            
            /*solamente devolvemos el objeto del ResultSet*/
            
            return estructuraTabla;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }
        
    }
    
    //MOSTRAR DIRECCION DE UN CLIENTE EN ESPECIFICO POR MEDIO DEL CODIGO_DIRECCION
    public static String obtenerDireccionParaCliente(int codigo_direccion){
        
        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT UPPER( CONCAT( tb_barrio_caserio_finca_aldea.nombres, ', ', tb_municipio.nombres, ', ', tb_departamento.nombres ) ) AS DIRECCION\n" +
                        "FROM tb_barrio_caserio_finca_aldea\n" +
                        "INNER JOIN tb_municipio ON tb_barrio_caserio_finca_aldea.cod_municipio = tb_municipio.codigo\n" +
                        "INNER JOIN tb_departamento ON tb_municipio.cod_departamento = tb_departamento.codigo\n" +
                        "WHERE tb_barrio_caserio_finca_aldea.codigo =?";
            
           PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setInt(1, codigo_direccion);
            
            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();
            
            //si la funcion next() logra obtener un valor
            if(estructuraTabla.next()){
                String nombre_direccion = estructuraTabla.getString("DIRECCION");
                return nombre_direccion;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }
        return null;
    }
    
        //MUESTRA TODOS LOS DATOS DE PAPELERA 
    public static ResultSet mostrarTodoPapeleraClientes(){
        try{
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
            "UPPER(tb_cliente.codigo) AS CODIGO,\n" +
            "tb_cliente.dpi AS DPI,\n"+
            "UPPER(CONCAT(tb_cliente.nombres, ' ', tb_cliente.apellidos)) As NOMBRE,\n" +
            "UPPER(tb_cliente.telefono) AS TELEFONO,\n" +
            "tb_cliente.correo_electronico AS CORREO_ELECTRONICO\n" +
            "FROM\n" +
            "tb_cliente\n" +
            "WHERE tb_cliente.state = 'ELIMINADO'\n" +
            "ORDER BY tb_cliente.nombres;";

            //El Statemen es el interpretador de consultas e instrucciones SQL
            Statement consultaSQL = ConexionBD.getVarCon().createStatement();

            /*El resulset obtiene la estructura de tabla que devuelve la consulta
              realizada, en este caso devuelve la consulta almacenada en la variable
              String sql */
            ResultSet estructuraTabla = consultaSQL.executeQuery(sql);

            /*solamente devolvemos el objeto del ResultSet*/

            return estructuraTabla;
        }
        catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }
        
    }
    /* ------------------------------------------------ BUSCAR DIRECCIONES ----------------------------------------------------------- */
}
