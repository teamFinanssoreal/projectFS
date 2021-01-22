/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;

import static ConexionBaseDeDatos.ConexionBD.con;
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
public class ConexionBD_Agencias {
   //MOSTRAR TODOS LOS DATOS
    public static ResultSet mostrarTodoAgencias(){

        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
                            "UPPER(tb_agencia_vehiculo.codigo) AS CODIGO,\n" +
                            "UPPER(tb_agencia_vehiculo.nombre_casa_comercial) As NOMBRE_CASA_COMERCIAL,\n" +
                            "UPPER(tb_agencia_vehiculo.telefono) AS TELEFONO,\n" +
                            "tb_agencia_vehiculo.correo_electronico AS CORREO_ELECTRONICO\n" +
                            "FROM\n" +
                            "tb_agencia_vehiculo\n" +
                            "WHERE tb_agencia_vehiculo.state = 'VIGENTE'\n" +
                            "ORDER BY tb_agencia_vehiculo.codigo;";

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
    //MUESTRA TODOS LOS DATOS DE PAPELERA 
    public static ResultSet mostrarTodoPapeleraAgencias(){
        try{
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
                        "UPPER(tb_agencia_vehiculo.codigo) AS CODIGO,\n" +
                        "UPPER(tb_agencia_vehiculo.state) AS STATE,\n" +
                        "UPPER(tb_agencia_vehiculo.nombre_casa_comercial) As NOMBRE_CASA_COMERCIAL,\n" +
                        "UPPER(tb_agencia_vehiculo.telefono) AS TELEFONO,\n" +
                        "tb_agencia_vehiculo.correo_electronico AS CORREO_ELECTRONICO\n" +
                        "FROM\n" +
                        "tb_agencia_vehiculo\n" +
                        "WHERE tb_agencia_vehiculo.state = 'ELIMINADO'\n" +
                        "ORDER BY tb_agencia_vehiculo.nombre_casa_comercial;";

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
    //INGRESA DATOS A LA BD
    public static boolean ingresarAgencias(String state, String nombre_casa_comercial, String telefono, String correo_electronico,
                                           String calle_avenida, String numero_casa, String zona, InputStream patentes, int cod_direccion){
        try{
            //Indicamos la consulta a usar
            String sql = "INSERT INTO\n" +
                    "tb_agencia_vehiculo("
                    + "state, "
                    + "nombre_casa_comercial, "
                    + "telefono, "
                    + "correo_electronico, "
                    + "calle_avenida, "
                    + "numero_casa, "
                    + "zona, "
                    + "pdf_patentes_rtu, "
                    + "cod_direccion)\n" +
                    "VALUES(?,?,?,?,?,?,?,?,?);";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, state);
            ConsultaSQL.setString(2, nombre_casa_comercial);
            ConsultaSQL.setString(3, telefono);
            ConsultaSQL.setString(4, correo_electronico);
            ConsultaSQL.setString(5, calle_avenida);
            ConsultaSQL.setString(6, numero_casa);
            ConsultaSQL.setString(7, zona);
            ConsultaSQL.setBlob(8, patentes);
            ConsultaSQL.setInt(9, cod_direccion);
            
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    //ACTUALIZA DATOS DE LA BD
    public static boolean actualizarAgencias(String state, String nombre_casa_comercial, String telefono, String correo_electronico,
                                           String calle_avenida, String numero_casa, String zona, int cod_direccion, InputStream patentes, int codigo){
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE tb_agencia_vehiculo SET "                   
                    + "state = ?, "
                    + "nombre_casa_comercial = ?, "
                    + "telefono = ?, "
                    + "correo_electronico = ?, "
                    + "calle_avenida = ?, "
                    + "numero_casa = ?, "
                    + "zona = ?,"
                    + "cod_direccion = ?,\n"
                    + "pdf_patentes_rtu = ?\n" +
                    "WHERE tb_agencia_vehiculo.codigo = ?;";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar           
            ConsultaSQL.setString(1, state);
            ConsultaSQL.setString(2, nombre_casa_comercial);
            ConsultaSQL.setString(3, telefono);
            ConsultaSQL.setString(4, correo_electronico);
            ConsultaSQL.setString(5, calle_avenida);
            ConsultaSQL.setString(6, numero_casa);
            ConsultaSQL.setString(7, zona);
            ConsultaSQL.setInt(8, cod_direccion);
            ConsultaSQL.setBlob(9, patentes);
            ConsultaSQL.setInt(10, codigo);
            
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    public static ResultSet obtenerTodosLosDatosAgencias(int codigo){
    try{

            //indicamos la consulta a utilizar
            String sql="SELECT * FROM tb_agencia_vehiculo WHERE codigo = ?";

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
    
    //DA DE BAJA UN REGISTRO O LO RESTAURA  
    public static boolean actualizarAgenciasPapelera(String state, int codigo){
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE tb_agencia_vehiculo SET state = ?\n" +
                         "WHERE tb_agencia_vehiculo.codigo = ?;";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, state);
            ConsultaSQL.setInt(2, codigo);
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    } 
}
