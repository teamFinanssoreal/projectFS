/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;
import static ConexionBaseDeDatos.ConexionBD.con;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
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
public class ConexionBD_CatalogoDeMotos {
       //MOSTRAR TODOS LOS DATOS
    public static ResultSet mostrarTodoCatalogoDeMotos(){

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
                    + "WHERE tb_vehiculo.tipo_vehiculo = 'MOTO' AND tb_vehiculo.state = 'VIGENTE' "
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
    public static ResultSet mostrarTodoPapeleraCatalogoDeMotos(){
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
                    + "WHERE tb_vehiculo.tipo_vehiculo = 'MOTO' AND tb_vehiculo.state = 'ELIMINADO' "
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
     public static ResultSet mostrarTodoAgenciasCatalogoMotos(){
        try{
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
                        "UPPER(tb_agencia_vehiculo.codigo) AS CODIGO,\n" +
                        "UPPER(tb_agencia_vehiculo.nombre_casa_comercial)AS NOMBRE_DE_LA_CASA_COMERCIAL,\n" +
                        "UPPER(CONCAT(tb_agencia_vehiculo.calle_avenida, ' ', tb_agencia_vehiculo.numero_casa, ' ZONA ', tb_agencia_vehiculo.zona, ', ',tb_barrio_caserio_finca_aldea.nombres, ', ', tb_municipio.nombres, ', ', tb_departamento.nombres)) AS DIRECCION\n" +
                        "FROM\n" +
                        "tb_agencia_vehiculo\n" +
                        "INNER JOIN tb_barrio_caserio_finca_aldea ON tb_agencia_vehiculo.cod_direccion = tb_barrio_caserio_finca_aldea.codigo\n" +
                        "INNER JOIN tb_municipio ON tb_barrio_caserio_finca_aldea.cod_municipio = tb_municipio.codigo\n" +
                        "INNER JOIN tb_departamento ON tb_municipio.cod_departamento = tb_departamento.codigo\n" +
                        "WHERE tb_agencia_vehiculo.state = 'VIGENTE'\n" +
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
    public static boolean ingresarMotos(String state, String tipo_vehiculo, String descripcion, String numero_placa,
                                           String marca, String modelo, String color, String motor, String id_gps, String chip_gps, InputStream foto){
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
            ConsultaSQL.setBlob(11, foto);
            
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    //ACTUALIZA DATOS DE LA BD
    public static boolean actualizarMotos(String state, String tipo_vehiculo, String descripcion, String numero_placa,
                                    String marca, String modelo, String color, String motor, String id_gps, String chip_gps, InputStream foto, int codigo){
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE tb_vehiculo "
                    + "SET state = ?, "
                    + "tipo_vehiculo = ?, "
                    + "descripcion = ?, "
                    + "numero_placa = ?, "
                    + "marca = ?, "
                    + "modelo = ?, "
                    + "color = ?, "
                    + "motor = ?, "
                    + "id_gps = ?, "
                    + "chip_gps = ?, "
                    + "foto = ?\n" +
                        "WHERE tb_vehiculo.codigo = ?;";
            
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
            ConsultaSQL.setBlob(11, foto);
            ConsultaSQL.setInt(12, codigo);
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    //ACTUALIZA DATOS DE LA BD
    public static ResultSet MostrarTodoMotos(int codigo){
        try{
            //Indicamos la consulta a usar
            String sql = "SELECT\n" +
                        "UPPER(tb_vehiculo.codigo) AS CODIGO,\n" +
                        "UPPER(tb_vehiculo.descripcion) As DESCRIPCION,\n" +
                        "UPPER(tb_vehiculo.numero_placa) AS NUMERO_PLACA,\n" +
                        "UPPER(tb_vehiculo.marca) AS MARCA,\n" +
                        "UPPER(tb_vehiculo.modelo) AS MODELO,\n" +
                        "UPPER(tb_vehiculo.color) AS COLOR,\n" +
                        "UPPER(tb_vehiculo.motor) AS MOTOR,\n" +
                        "UPPER(tb_vehiculo.id_gps) AS ID_GPS,\n" +
                        "UPPER(tb_vehiculo.chip_gps) AS CHIP_GPS,\n" +
                        "tb_vehiculo.foto AS FOTO,\n" +
                        "UPPER(tb_agencia_vehiculo.nombre_casa_comercial) AS AGENCIA_PROVEEDORA,\n" +
                        "upper(tb_seleccion_de_agencia_para_vehiculo.codigo) AS CODIGO_SELECCION_AGENCIA_PARA_VEHICULO,\n" +
                        "upper(tb_agencia_vehiculo.codigo) AS CODIGO_AGENCIA_VEHICULO\n" +
                        "FROM\n" +
                        "tb_vehiculo\n" +
                        "INNER JOIN tb_seleccion_de_agencia_para_vehiculo ON tb_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_vehiculo\n" +
                        "INNER JOIN tb_agencia_vehiculo ON tb_agencia_vehiculo.codigo = tb_seleccion_de_agencia_para_vehiculo.cod_agencia_vehiculo\n" +
                        "WHERE tb_vehiculo.tipo_vehiculo = 'MOTO' AND tb_vehiculo.state = 'VIGENTE' AND tb_vehiculo.codigo = ?";            
                        
            //El Statemen es el interpretador de consultas e instrucciones SQL
           PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
                     
            //indicamos cual es el parametro a usar
            ConsultaSQL.setInt(1, codigo);
            /*El resulset obtiene la estructura de tabla que devuelve la consulta
              realizada, en este caso devuelve la consulta almacenada en la variable
              String sql */
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();

            /*solamente devolvemos el objeto del ResultSet*/

            return estructuraTabla;
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);  
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }
    }
    public static int obtenerUltimaMotoIngresada(){
        try {
            //indicamos la consulta a utilizar
            String sql="SELECT MAX(codigo) FROM tb_vehiculo WHERE tb_vehiculo.tipo_vehiculo = 'MOTO'";

            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);


            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();


            if(estructuraTabla.next())
            {
                int cod_bitacora = estructuraTabla.getInt("MAX(codigo)");
                return cod_bitacora;
            }
            //si la funcion next() logra obtener un valor
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha surgido un error: " + ex);
            return 0;
        }
    }
    //DA DE BAJA UN REGISTRO O LO RESTAURA  
    public static boolean actualizarMotosPapelera(String state, int codigo){
        try{
            //Indicamos la consulta a usar
            String sql =    "UPDATE tb_vehiculo SET state = ?\n" +
                            "WHERE tb_vehiculo.codigo = ?;";
            
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
    //INGRESA DATOS A LA BD
    public static boolean ingresarVehiculoAgencia(int cod_vehiculo, int cod_agencia_vehiculo){
        try{
            //Indicamos la consulta a usar
            String sql ="INSERT INTO `tb_seleccion_de_agencia_para_vehiculo`(`cod_vehiculo`, `cod_agencia_vehiculo`) VALUES (?,?)";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setInt(1, cod_vehiculo);
            ConsultaSQL.setInt(2, cod_agencia_vehiculo);
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    //INGRESA DATOS A LA BD
    public static boolean EditarVehiculoAgencia(int cod_agencia_vehiculo, int cod_vehiculo){
        try{
            //Indicamos la consulta a usar
            String sql =    "UPDATE tb_seleccion_de_agencia_para_vehiculo SET cod_agencia_vehiculo = ? "
                    + "WHERE tb_seleccion_de_agencia_para_vehiculo.cod_vehiculo = ?";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setInt(1, cod_agencia_vehiculo);
            ConsultaSQL.setInt(2, cod_vehiculo);
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
}