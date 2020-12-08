/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates.
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            con = DriverManager.getConnection("jdbc:mysql://localhost/bdcontrolpagos", "root", "");
            //con = DriverManager.getConnection("jdbc:mysql://sql135.main-hosting.eu/u860524316_bdcontrolpagos", "u860524316_bdusrcontrolpg", "@dM1n_C0nTroL_p4Gos_FnSsRl");
            
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
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    /* ------------------------------------------------ CLIENTE ----------------------------------------------------------- */
    
    /* ------------------------------------------------ CLIENTE ----------------------------------------------------------- */
    
    /* ------------------------------------------------ AGENCIA ----------------------------------------------------------- */
    
    /* ------------------------------------------------ AGENCIA ----------------------------------------------------------- */
    
    /* ------------------------------------------------ BUSCAR DIRECCIONES ----------------------------------------------------------- */
    
    /* ------------------------------------------------ BUSCAR DIRECCIONES ----------------------------------------------------------- */
}
