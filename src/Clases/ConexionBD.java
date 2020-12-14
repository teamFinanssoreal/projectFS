/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates.
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Víctor H. Jucub
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
            //con = DriverManager.getConnection("jdbc:mysql://localhost/bdcajero", "root", "");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdcontrolpagos", "root", "");

        }catch (ClassNotFoundException | SQLException ex){
            //4. si no funciona la conexion nos mostrar un mensaje diciendo que hubo un error
            JOptionPane.showMessageDialog(null, "Hubo un problema con la conexión a la Base de Datos: " + ex);
        }

    }

    public static void Finalizar(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    
    
    //FUNCIÓN PARA INICIAR LA CONEXIÓN A LA BASE DE DATOS CUANDO SEA REQUERIDA

    
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
            "ORDER BY tb_cliente.nombres;"; //codigo?

            //El Statemen es el interpretador de consultas e instrucciones SQL
            Statement consultaSQL = con.createStatement();

            /*El resulset obtiene la estructura de tabla que devuelve la consulta
              realizada, en este caso devuelve la consulta almacenada en la variable
              String sql */
            ResultSet estructuraTabla = consultaSQL.executeQuery(sql);

            //solamente devolvemos el objeto del ResultSet/

            return estructuraTabla;


        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }

    }
        
        

    /* ------------------------------------------------ CLIENTE ----------------------------------------------------------- */

    /* ------------------------------------------------ AGENCIA ----------------------------------------------------------- */
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
                            "ORDER BY tb_agencia_vehiculo.nombre_casa_comercial;";

            //El Statemen es el interpretador de consultas e instrucciones SQL
            Statement consultaSQL = con.createStatement();

            /*El resulset obtiene la estructura de tabla que devuelve la consulta
              realizada, en este caso devuelve la consulta almacenada en la variable
              String sql */
            ResultSet estructuraTabla = consultaSQL.executeQuery(sql);

            //solamente devolvemos el objeto del ResultSet/

            return estructuraTabla;


        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }}
}

    
    /* ------------------------------------------------ AGENCIA ----------------------------------------------------------- */

    /* ------------------------------------------------ PAGINACION ----------------------------------------------------------- */

    
    /* ------------------------------------------------ PAGINACION ----------------------------------------------------------- */
    
    
    /* ------------------------------------------------ BUSCAR DIRECCIONES ----------------------------------------------------------- */
    /* ------------------------------------------------ BUSCAR DIRECCIONES ----------------------------------------------------------- */

