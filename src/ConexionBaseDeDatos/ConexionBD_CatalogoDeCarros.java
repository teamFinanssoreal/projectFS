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
public class ConexionBD_CatalogoDeCarros {
           //MOSTRAR TODOS LOS DATOS
    public static ResultSet mostrarTodoCatalogoDeCarros(){

        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT UPPER(tb_vehiculo.codigo) AS CODIGO, "
                    + "UPPER(tb_vehiculo.descripcion) As DESCRIPCIÓN, "
                    + "UPPER(tb_vehiculo.marca) AS MARCA, "
                    + "UPPER(tb_vehiculo.modelo) AS MODELO, "
                    + "UPPER(tb_agencia_vehiculo.nombre_casa_comercial) AS AGENCIA_PROVEEDORA "
                    + "FROM tb_vehiculo "
                    + "INNER JOIN tb_seleccion_de_agencia_para_vehiculo "
                    + "ON tb_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_vehiculo "
                    + "INNER JOIN tb_agencia_vehiculo ON tb_agencia_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_agencia_vehiculo "
                    + "WHERE tb_vehiculo.tipo_vehiculo = 'CARRO' AND tb_vehiculo.state = 'VIGENTE' "
                    + "ORDER BY tb_agencia_vehiculo.nombre_casa_comercial";

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
    public static ResultSet mostrarTodoPapeleraCatalogoDeCarros(){
        try{
            //Indicamos la consulta a utilizar
            String sql= "SELECT UPPER(tb_vehiculo.codigo) AS CODIGO, "
                    + "UPPER(tb_vehiculo.descripcion) As DESCRIPCIÓN, "
                    + "UPPER(tb_vehiculo.marca) AS MARCA, "
                    + "UPPER(tb_vehiculo.modelo) AS MODELO, "
                    + "UPPER(tb_agencia_vehiculo.nombre_casa_comercial) AS AGENCIA_PROVEEDORA "
                    + "FROM tb_vehiculo "
                    + "INNER JOIN tb_seleccion_de_agencia_para_vehiculo "
                    + "ON tb_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_vehiculo "
                    + "INNER JOIN tb_agencia_vehiculo ON tb_agencia_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_agencia_vehiculo "
                    + "WHERE tb_vehiculo.tipo_vehiculo = 'CARRO' AND tb_vehiculo.state = 'ELIMINADO' "
                    + "ORDER BY tb_agencia_vehiculo.nombre_casa_comercial";

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
