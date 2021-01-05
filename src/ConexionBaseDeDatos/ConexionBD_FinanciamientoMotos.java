/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Betza
 */
public class ConexionBD_FinanciamientoMotos {

/* -----------------------------INGRESO DE INFORMACION A LA TABLA DE FINANCIAMIENTO DE CARROS ----------------------------------------------------------- */

    public static ResultSet mostrarTodoFinanciamientoMotos(){

        try {
            //Indicamos la consulta a utilizar 
            String sql= "SELECT\n" +
                        "tb_financiamiento_vehiculo.codigo,\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.condicion_credito) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CONDICION_CREDITO,\n" +
                        "UPPER(tb_financiamiento_vehiculo.numero_contrato) AS NUMERO_CONTRATO,\n" +
                        "(SELECT (tb_detalles_financiamiento_vehiculo.capital) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CAPITAL,\n" +
                        "UPPER(tb_cliente.dpi) AS DPI,\n" +
                        "UPPER(CONCAT(tb_cliente.nombres, ' ', tb_cliente.apellidos)) As NOMBRE,\n" +
                        "UPPER(tb_vehiculo.descripcion) AS DESCRIPCION\n" +
                        "FROM\n" +
                        "tb_detalles_financiamiento_vehiculo\n" +
                        "INNER JOIN tb_financiamiento_vehiculo ON tb_financiamiento_vehiculo.codigo = tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos\n" +
                        "INNER JOIN tb_cliente ON tb_cliente.codigo = tb_financiamiento_vehiculo.cod_cliente\n" +
                        "INNER JOIN tb_vehiculo ON tb_vehiculo.codigo = tb_financiamiento_vehiculo.cod_vehiculo\n" +
                        "WHERE tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTOS'\n" +
                        "GROUP BY tb_financiamiento_vehiculo.numero_contrato";
   
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
    /* ----------------------------- DATOS DE CLIENTES EN FINANCIAMIENTO DE CARROSNUEVO ----------------------------------------------------------- */

    public static ResultSet mostrarTodoFinanciamientoCarrosMotos(){
        try{
            //Indicamos la consulta a utilizar
            String sql =    "SELECT\n"+
                            "UPPER(tb_cliente.codigo) AS CODIGO,\n"+
                            "UPPER(tb_cliente.dpi) AS DPI,\n"+
                            "UPPER(CONCAT(tb_cliente.nombres, ' ', tb_cliente.apellidos)) As NOMBRE\n"+
                            "FROM\n"+
                            "tb_cliente\n"+
                            "WHERE tb_cliente.state = 'VIGENTE'"+ //cambios de estructura. AND tb_vehiculo.tipo_vehiculo = 'CARRO'\n
                            "ORDER BY tb_cliente.nombres\n";
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
    
}