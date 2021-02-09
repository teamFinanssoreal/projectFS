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
 * @author alber
 */
public class ConexionBD_CalculoMora {
    
    public static ResultSet obtenerTodosLosFinanciamientos(){

        try {
            //Indicamos la consulta a utilizar 
            String sql= "SELECT\n" +
                        "*\n" +
                        "FROM\n" +
                        "tb_financiamiento_vehiculo";

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
    
    public static int ObtenerCodigoUltimoDetalleDeFinanciamiento(String numero_contrato){
        
        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.codigo) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CODIGO\n" +
                        "FROM\n" +
                        "tb_detalles_financiamiento_vehiculo\n" +
                        "INNER JOIN tb_financiamiento_vehiculo ON tb_financiamiento_vehiculo.codigo = tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos\n" +
                        "INNER JOIN tb_cliente ON tb_cliente.codigo = tb_financiamiento_vehiculo.cod_cliente\n" +
                        "INNER JOIN tb_barrio_caserio_finca_aldea ON tb_cliente.cod_direccion = tb_barrio_caserio_finca_aldea.codigo\n" +
                        "INNER JOIN tb_municipio ON tb_barrio_caserio_finca_aldea.cod_municipio = tb_municipio.codigo\n" +
                        "INNER JOIN tb_departamento ON tb_municipio.cod_departamento = tb_departamento.codigo\n" +
                        "INNER JOIN tb_vehiculo ON tb_vehiculo.codigo = tb_financiamiento_vehiculo.cod_vehiculo\n" +
                        "INNER JOIN tb_seleccion_de_agencia_para_vehiculo ON tb_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_vehiculo\n" +
                        "INNER JOIN tb_agencia_vehiculo ON tb_agencia_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_agencia_vehiculo\n" +
                        "WHERE tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO CARRO' AND tb_financiamiento_vehiculo.numero_contrato = ?\n" +
                        "GROUP BY tb_financiamiento_vehiculo.numero_contrato;";
            
            
           PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setString(1, numero_contrato);
            
            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();
            
            //si la funcion next() logra obtener un valor
            if(estructuraTabla.next()){
                int codigo_detalle = estructuraTabla.getInt("CODIGO");
                return codigo_detalle;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return 0;
        }
        return 0;
    }

    public static ResultSet obtenerTodosLosDetallesFinanciamientos(int codigo_detalle_financiamiento_vehiculo){

        try {
            //Indicamos la consulta a utilizar 
            String sql= "SELECT\n" +
                        "*\n" +
                        "FROM\n" +
                        "tb_detalles_financiamiento_vehiculo\n" +
                        "WHERE tb_detalles_financiamiento_vehiculo.codigo = ?;";

            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setInt(1, codigo_detalle_financiamiento_vehiculo);

            /*El resulset obtiene la estructura de tabla que devuelve la consulta
              realizada, en este caso devuelve la consulta almacenada en la variable
              String sql */
           ResultSet estructuraTabla = ConsultaSQL.executeQuery();

            //solamente devolvemos el objeto del ResultSet/

            return estructuraTabla;


        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }

    }
    
    public static int obtenerCantidadDePagos(int codigo_detalle_financiamiento_vehiculo){
        
        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT \n" +
                        "COUNT(*) AS RESULTADOS\n" +
                        "FROM\n" +
                        "tb_pagos_financiamiento_vehiculo\n" +
                        "INNER JOIN tb_detalles_financiamiento_vehiculo ON tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = tb_detalles_financiamiento_vehiculo.codigo\n" +
                        "INNER JOIN tb_financiamiento_vehiculo ON tb_financiamiento_vehiculo.codigo = tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos\n" +
                        "WHERE\n" +
                        "tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO CARRO' AND tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = ?";
            
           PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setInt(1, codigo_detalle_financiamiento_vehiculo);
            
            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();
            
            //si la funcion next() logra obtener un valor
            if(estructuraTabla.next()){
                int cantidadDatos = estructuraTabla.getInt("RESULTADOS");
                return cantidadDatos;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return 0;
        }
        return 0;
    }
    
    public static boolean ingresarDetalleFinanciamientoCarros(String condicion_credito, double capital, double porcentaje_interes, String tipo_interes, int tiempo_meses,
                                                String fecha_inicio, String fecha_final, double interes_mensual, double amortizacion, double cuota_mensual, double interes_total,
                                                double mora_por_interes, int cod_financiamiento_vehiculos){
        
        try{
            //Indicamos la consulta a usar
            String sql = "INSERT INTO\n" +
                        "tb_detalles_financiamiento_vehiculo(condicion_credito, capital, porcentaje_interes, tipo_interes, tiempo_meses, "
                      + "fecha_inicio, fecha_final, interes_mensual, amortizacion, cuota_mensual, interes_total, mora_por_interes, cod_financiamiento_vehiculos)\n" +
                        "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            //PreparedStatement ConsultaSQL = con.prepareStatement(sql);
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, condicion_credito);
            ConsultaSQL.setDouble(2, capital);
            ConsultaSQL.setDouble(3, porcentaje_interes);
            ConsultaSQL.setString(4, tipo_interes);
            ConsultaSQL.setInt(5, tiempo_meses);
            ConsultaSQL.setString(6, fecha_inicio);
            ConsultaSQL.setString(7, fecha_final);
            ConsultaSQL.setDouble(8, interes_mensual);
            ConsultaSQL.setDouble(9, amortizacion);
            ConsultaSQL.setDouble(10, cuota_mensual);
            ConsultaSQL.setDouble(11, interes_total);
            ConsultaSQL.setDouble(12, mora_por_interes);
            ConsultaSQL.setInt(13, cod_financiamiento_vehiculos);
            
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
}
