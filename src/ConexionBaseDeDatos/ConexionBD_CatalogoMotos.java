/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Martin Rosales
 */
public class ConexionBD_CatalogoMotos {
    //MOSTRAR TODOS LOS DATOS
    public static ResultSet mostrarTodoCatalogoMotos(){

        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
                        "UPPER(tb_vehiculo.codigo) AS CODIGO,\n" +
                        "UPPER(tb_vehiculo.descripcion) As DESCRIPCIÓN,\n" +
                        "UPPER(tb_vehiculo.marca) AS MARCA,\n" +
                        "UPPER(tb_vehiculo.modelo) AS MODELO,\n" +
                        "UPPER(tb_agencia_vehiculo.nombre_casa_comercial) AS AGENCIA_PROVEEDORA\n" +
                        "FROM\n" +
                        "tb_vehiculo\n" +
                        "INNER JOIN tb_seleccion_de_agencia_para_vehiculo ON tb_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_vehiculo\n" +
                        "INNER JOIN tb_agencia_vehiculo ON tb_agencia_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_agencia_vehiculo\n" +
                        "WHERE tb_vehiculo.tipo_vehiculo = 'MOTO' AND tb_vehiculo.state = 'VIGENTE'\n" +
                        "ORDER BY tb_agencia_vehiculo.nombre_casa_comercial;";

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
     //INGRESA DATOS A LA BD
    public static boolean ingresarCatalogoMotos(String state, String tipo_vehiculo, String descripcion, String numero_placa, String marca, String modelo, String color, String motor, String id_gps, 
                                                String chip_gps, byte[] foto, String agencia_proveedora, int codigo_seleccion_agencia_para_vehiculo, 
                                                int codigo_agencia_vehiculo){
        try{
            //Indicamos la consulta a usar
            String sql = "INSERT INTO\n" +
                        "tb_vehiculo("
                        + "state, "
                        + "tipo_vehiculo, "
                        + "descripcion, "
                        + "numero_placa, "
                        + "marca, "
                        + "modelo, "
                        + "color, "
                        + "motor, "
                        + "id_gps, "
                        + "chip_gps, "
                        + "foto)\n" +
                        "VALUES(?,?,?,?,?,?,?,?,?,?,?);";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, state);
            ConsultaSQL.setString(2, tipo_vehiculo);
            ConsultaSQL.setString(3, descripcion);
            ConsultaSQL.setString(4, numero_placa);
            ConsultaSQL.setString(5, marca);
            ConsultaSQL.setString(6, modelo);
            ConsultaSQL.setString(7, color);
            ConsultaSQL.setString(8, motor);
            ConsultaSQL.setString(9, id_gps);
            ConsultaSQL.setString(10, chip_gps);
            //ConsultaSQL.setByte(11, foto);
            
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
}
