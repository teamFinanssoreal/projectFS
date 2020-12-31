/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;

import static ConexionBaseDeDatos.ConexionBD.con;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class ConexionBD {
    public static Connection con;
    
    public static Connection getVarCon(){
        return con;
    }
    
    //FUNCIÓN PARA INICIAR LA CONEXIÓN A LA BASE DE DATOS CUANDO SEA REQUERIDA
    
    public static void Iniciar(){
        //1. probamos hacer la conexion
        try{
            //2.Cargamos el driver de conexion a BD
            Class.forName("com.mysql.jdbc.Driver");
            
            //3.Creamos la conexion a la BD(ruta/nombrebd, username, password)
            // con = DriverManager.getConnection("jdbc:mysql://192.168.1.4/bd_igna", "pruebaigna", "igna2019");
            con = DriverManager.getConnection("jdbc:mysql://sql135.main-hosting.eu/u860524316_bdcontrolpagos", "u860524316_bdusrcontrolpg", "@dM1n_C0nTroL_p4Gos_FnSsRl");
            //con = DriverManager.getConnection("jdbc:mysql://localhost/bdcontrolpagos", "root", "");
            
            System.out.println("Conexión a la base de datos: EXITOSA");
            
        }catch (ClassNotFoundException | SQLException ex){
            //4. si no funciona la conexion nos mostrar un mensaje diciendo que hubo un error
            JOptionPane.showMessageDialog(null, "Hubo un problema con la conexión a la Base de Datos: " + ex);
            System.out.println("Conexión a la base de datos: INCORRECTA");
        }
        
    }
    
    //FUNCIÓN PARA INICIAR LA CONEXIÓN A LA BASE DE DATOS CUANDO SEA REQUERIDA
    public static void Finalizar(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
        //MOSTRAR TODOS LOS DATOS
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
            Statement consultaSQL = con.createStatement();

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

           PreparedStatement ConsultaSQL = con.prepareStatement(sql);

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
}
