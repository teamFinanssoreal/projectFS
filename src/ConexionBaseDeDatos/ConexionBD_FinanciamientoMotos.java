/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBaseDeDatos;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Betza
 */
public class ConexionBD_FinanciamientoMotos {

/* -----------------------------INGRESO DE INFORMACION A LA TABLA DE FINANCIAMIENTO DE MOTOS  ----------------------------------------------------------- */

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
                        "WHERE tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO'\n" +
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
    /* ----------------------------- DATOS DE CLIENTES EN FINANCIAMIENTO DE CARROS NUEVO ----------------------------------------------------------- */

    public static ResultSet mostrarTodoFinanciamientoMotosBuscarCliente(){
        try{
            //Indicamos la consulta a utilizar
            String sql =    "SELECT\n"+
                            "UPPER(tb_cliente.codigo) AS CODIGO,\n"+
                            "UPPER(tb_cliente.dpi) AS DPI,\n"+
                            "UPPER(CONCAT(tb_cliente.nombres, ' ', tb_cliente.apellidos)) As NOMBRE\n"+
                            "FROM\n"+
                            "tb_cliente\n"+
                            "WHERE tb_cliente.state = 'VIGENTE'"+
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
    /* ----------------------------- DATOS DE VEHICULOS EN FINANCIAMIENTO DE CARROS NUEVO ----------------------------------------------------------- */

    public static ResultSet mostrarTodoFinanciamientoMotosBuscarVehiculo(){
        try{
            //Indicamos la consulta a utilizar
            String sql =    "SELECT\n" +
                            "UPPER(tb_vehiculo.codigo) AS CODIGO,\n" +
                            "UPPER(tb_vehiculo.descripcion) As DESCRIPCION,\n" +
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
        }
        catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }
    }  
    public static Blob obtenerFotoDelVehiculo(int codigo){
        try {
            //indicamos la consulta a utilizar
            String sql="SELECT\n" +
                        "tb_vehiculo.foto AS FOTO\n" +
                        "FROM\n" +
                        "tb_vehiculo\n" +
                        "WHERE tb_vehiculo.codigo = ?;";

            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);

            //indicamos los parametros a usar
            ConsultaSQL.setInt(1, codigo);

            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();


            if(estructuraTabla.next())
            {
                Blob foto = estructuraTabla.getBlob("FOTO");
                return foto;
            }
            //si la funcion next() logra obtener un valor
            return null;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha surgido un error: " + ex);
            return null;
        }
    }
    //MUESTRA DATOS DE LA BD
    public static ResultSet MostrarTodoMotos(int codigo){
        try{
            //Indicamos la consulta a usar
            String sql =    "SELECT\n" +
                            "UPPER(tb_vehiculo.codigo) AS CODIGO,\n" +
                            "UPPER(tb_vehiculo.descripcion) As DESCRIPCIÓN,\n" +
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
                            "WHERE tb_vehiculo.tipo_vehiculo = 'MOTO' AND tb_vehiculo.state = 'VIGENTE' AND tb_vehiculo.codigo = ?" +
                            "ORDER BY tb_agencia_vehiculo.nombre_casa_comercial;";            
                        
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
    //INGRESA DATOS A LA BD
    public static boolean ingresarFinanciamiento(String tipo_financiamiento, String numero_contrato,
                                           InputStream pdf_contrato, InputStream pdf_recibo_agua_luz_telefono, InputStream pdf_constancia_ingresos_estados_cuenta, 
                                           InputStream pdf_patentes_rtu_o_constancia_laboral, int cod_cliente, int cod_vehiculo){
        try{
            //Indicamos la consulta a usar
            String sql = "INSERT INTO\n" +
                    "tb_financiamiento_vehiculo("
                    + "tipo_financiamiento, "
                    + "numero_contrato, "
                    + "pdf_contrato, "
                    + "pdf_recibo_agua_luz_telefono, "
                    + "pdf_constancia_ingresos_estados_cuenta, "
                    + "pdf_patentes_rtu_o_constancia_laboral, "
                    + "cod_cliente, "
                    + "cod_vehiculo)\n" +
                        "VALUES(?,?,?,?,?,?,?,?);";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar           
            ConsultaSQL.setString(1, tipo_financiamiento);
            ConsultaSQL.setString(2, numero_contrato);
            ConsultaSQL.setBlob(3, pdf_contrato);
            ConsultaSQL.setBlob(4, pdf_recibo_agua_luz_telefono);
            ConsultaSQL.setBlob(5, pdf_constancia_ingresos_estados_cuenta);
            ConsultaSQL.setBlob(6, pdf_patentes_rtu_o_constancia_laboral);
            ConsultaSQL.setInt(7, cod_cliente);
            ConsultaSQL.setInt(8, cod_vehiculo);
            
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }     
    public static boolean ingresarDetallesFinanciamiento(String condicion_credito, double capital, double porcentaje_interes, String tipo_interes,
                                           int tiempo_meses, String fecha_inicio, String fecha_final, double interes_mensual, double amortizacion, double cuota_mensual, double interes_total, double mora_por_interes, int cod_financiamiento_vehiculos){
        try{
            //Indicamos la consulta a usar
            String sql = "INSERT INTO\n" +
                            "tb_detalles_financiamiento_vehiculo("
                    + "condicion_credito, "
                    + "capital, "
                    + "porcentaje_interes, "
                    + "tipo_interes, "
                    + "tiempo_meses, "
                    + "fecha_inicio, "
                    + "fecha_final, "
                    + "interes_mensual, "
                    + "amortizacion, "
                    + "cuota_mensual, "
                    + "interes_total, "
                    + "mora_por_interes, "
                    + "cod_financiamiento_vehiculos)\n" +
                        "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
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
            
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    public static int obtenerUltimoFinanciamientoIngresado(){
        try {
            //indicamos la consulta a utilizar
            String sql="SELECT MAX(codigo) FROM tb_financiamiento_vehiculo WHERE tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO'";

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
    public static ResultSet obtenerTodosLosDatosDelFinanciamiento(String codigo){
    try{
            
            //indicamos la consulta a utilizar
            String sql="SELECT\n" +
                            "UPPER(tb_cliente.dpi) AS DPI_CLIENTE,\n" +
                            "UPPER(CONCAT(tb_cliente.nombres, ' ', tb_cliente.apellidos)) As NOMBRE_CLIENTE,\n" +
                            "UPPER(tb_cliente.telefono) AS TELEFONO_CLIENTE,\n" +
                            "UPPER(CONCAT(tb_cliente.calle_avenida, ' ', tb_cliente.numero_casa, ' ZONA ', tb_cliente.zona, ', ',tb_barrio_caserio_finca_aldea.nombres, ', ', tb_municipio.nombres, ', ', tb_departamento.nombres)) AS DIRECCION_CLIENTE,\n" +
                            "tb_vehiculo.foto AS FOTO_VEHICULO,\n" +
                            "UPPER(tb_vehiculo.descripcion) As DESCRIPCION_VEHICULO,\n" +
                            "UPPER(tb_vehiculo.marca) AS MARCA_VEHICULO,\n" +
                            "UPPER(tb_vehiculo.modelo) AS MODELO_VEHICULO,\n" +
                            "UPPER(tb_agencia_vehiculo.nombre_casa_comercial) AS AGENCIA_PROVEEDORA_VEHICULO,\n" +
                            "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.condicion_credito) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CONDICION_CREDITO,\n" +
                            "UPPER(tb_financiamiento_vehiculo.numero_contrato) AS NUMERO_CONTRATO,\n" +
                            "(SELECT (tb_detalles_financiamiento_vehiculo.capital) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CAPITAL,\n" +
                            "UPPER(tb_detalles_financiamiento_vehiculo.porcentaje_interes) AS PORCENTAJE_INTERES,\n" +
                            "UPPER(tb_detalles_financiamiento_vehiculo.tipo_interes) AS TIPO_INTERES,\n" +
                                "UPPER(tb_detalles_financiamiento_vehiculo.tiempo_meses) AS TIEMPO_MESES,\n" +
                            "UPPER(tb_detalles_financiamiento_vehiculo.fecha_inicio) AS FECHA_INICIAL,\n" +
                            "UPPER(tb_detalles_financiamiento_vehiculo.fecha_final) AS FECHA_FINALIZACION,\n" +
                            "UPPER(tb_detalles_financiamiento_vehiculo.amortizacion) AS AMORTIZACION,\n" +
                            "UPPER(tb_detalles_financiamiento_vehiculo.interes_mensual) AS INTERES_MENSUAL,\n" +
                            "UPPER(tb_detalles_financiamiento_vehiculo.interes_total) AS INTERES_TOTAL,\n" +
                            "UPPER(tb_detalles_financiamiento_vehiculo.cuota_mensual) AS CUOTA_MENSUAL,\n" +
                            "tb_financiamiento_vehiculo.pdf_contrato AS PDF_CONTRATO,\n" +
                            "tb_financiamiento_vehiculo.pdf_recibo_agua_luz_telefono AS PDF_RECIBO_AGUA_LUZ_TELEFONO,\n" +
                            "tb_financiamiento_vehiculo.pdf_constancia_ingresos_estados_cuenta AS PDF_CONSTANCIA_INGRESOS_ESTADOS_CUENTA,\n" +
                            "tb_financiamiento_vehiculo.pdf_patentes_rtu_o_constancia_laboral AS PDF_PATENTES_RTU_O_CONSTANCIA_LABORAL\n" +
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
                            "WHERE tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO' AND tb_financiamiento_vehiculo.numero_contrato = ?\n" +
                            "GROUP BY tb_financiamiento_vehiculo.numero_contrato";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setString(1, codigo);
            
            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();
            
            return estructuraTabla;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha surgido un error: " + ex);
            return null;
        }
    }
    
    public static ResultSet obtenerUltimoPagoRealizado(int codigo){
        try {
            //indicamos la consulta a utilizar
            String sql="SELECT \n" +
                            "*\n" +
                            "FROM\n" +
                            "tb_pagos_financiamiento_vehiculo\n" +
                            "WHERE\n" +
                            "tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos  = ?\n" +
                            "ORDER BY codigo DESC LIMIT 1";

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
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha surgido un error: " + ex);
            return null;
        }
    }
     public static boolean ingresarRegistroPago(String concepto, String fecha_pago, String numero_comprobante_pago, String ultimo_mes_pagado,
                                           String mes_pagar, double amortizacion_pagar, double gastos_administrativos, double interes_pagar, 
                                           double total_pagar, double capital_actual, double capital_nuevo, double interes_actual, double interes_nuevo, 
                                           InputStream pdf_comprobante_pago, int cod_financiamiento_vehiculos){
        try{
            //Indicamos la consulta a usar
            String sql = "INSERT INTO\n" +
                            "tb_pagos_financiamiento_vehiculo("
                    + "concepto, "
                    + "fecha_pago, "
                    + "numero_comprobante_pago, "
                    + "ultimo_mes_pagado, "
                    + "mes_pagar, "
                    + "amortizacion_pagar, "
                    + "gastos_administrativos, "
                    + "interes_pagar, "
                    + "total_pagar, "
                    + "capital_actual, "
                    + "capital_nuevo, "
                    + "interes_actual, "
                    + "interes_nuevo, "
                    + "pdf_comprobante_pago, "
                    + "cod_detalle_financiamiento_vehiculos)\n" +
                    "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, concepto);
            ConsultaSQL.setString(2, fecha_pago);
            ConsultaSQL.setString(3, numero_comprobante_pago);
            ConsultaSQL.setString(4, ultimo_mes_pagado);
            ConsultaSQL.setString(5, mes_pagar);
            ConsultaSQL.setDouble(6, amortizacion_pagar);
            ConsultaSQL.setDouble(7, gastos_administrativos);
            ConsultaSQL.setDouble(8, interes_pagar);
            ConsultaSQL.setDouble(9, total_pagar);
            ConsultaSQL.setDouble(10, capital_actual);
            ConsultaSQL.setDouble(11, capital_nuevo);
            ConsultaSQL.setDouble(12, interes_actual);
            ConsultaSQL.setDouble(13, interes_nuevo);
            ConsultaSQL.setBlob(14, pdf_comprobante_pago);
            ConsultaSQL.setInt(15, cod_financiamiento_vehiculos);
            
            //ejecuta la instrucciÃ³n
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
     
     public static int verificarPagoAnterior(int codigo){
      try {
            //indicamos la consulta a utilizar
            String sql="SELECT \n" +
                            "COUNT(*) AS RESULTADOS\n" +
                            "FROM\n" +
                            "tb_pagos_financiamiento_vehiculo\n" +
                            "INNER JOIN tb_detalles_financiamiento_vehiculo ON tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = tb_detalles_financiamiento_vehiculo.codigo\n" +
                            "INNER JOIN tb_financiamiento_vehiculo ON tb_financiamiento_vehiculo.codigo = tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos\n" +
                            "WHERE\n" +
                            "tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO' AND tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = ?";

            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
                ConsultaSQL.setInt(1, codigo);

            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();


            if(estructuraTabla.next())
            {
                int pagoAnterior = estructuraTabla.getInt("RESULTADOS");
                return pagoAnterior;
            }
            //si la funcion next() logra obtener un valor
            return 0;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha surgido un error: " + ex); 
            return 0;
        }
     }
     public static boolean actualizarContrato(InputStream pdf_contrato, int codigoFinanciamiento){
        
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE \n" +
                        "tb_financiamiento_vehiculo SET pdf_contrato = ?  \n"
                        + "WHERE tb_financiamiento_vehiculo.codigo = ?;";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            //PreparedStatement ConsultaSQL = con.prepareStatement(sql);
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setBlob(1, pdf_contrato);
            ConsultaSQL.setInt(2, codigoFinanciamiento);
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    public static boolean actualizarRecibo(InputStream pdf_recibo_agua_luz_telefono, int codigoFinanciamiento){
        
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE \n" +
                        "tb_financiamiento_vehiculo SET pdf_recibo_agua_luz_telefono = ?  \n"
                        + "WHERE tb_financiamiento_vehiculo.codigo = ?;";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            //PreparedStatement ConsultaSQL = con.prepareStatement(sql);
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setBlob(1, pdf_recibo_agua_luz_telefono);
            ConsultaSQL.setInt(2, codigoFinanciamiento);
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    public static boolean actualizarConstancia(InputStream pdf_constancia_ingresos_estados_cuenta, int codigoFinanciamiento){
        
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE \n" +
                        "tb_financiamiento_vehiculo SET pdf_constancia_ingresos_estados_cuenta = ?  \n"
                        + "WHERE tb_financiamiento_vehiculo.codigo = ?;";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            //PreparedStatement ConsultaSQL = con.prepareStatement(sql);
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setBlob(1, pdf_constancia_ingresos_estados_cuenta);
            ConsultaSQL.setInt(2, codigoFinanciamiento);
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    public static boolean actualizarPatente(InputStream pdf_patentes_rtu_o_constancia_laboral, int codigoFinanciamiento){
        
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE \n" +
                        "tb_financiamiento_vehiculo SET pdf_patentes_rtu_o_constancia_laboral = ?  \n"
                        + "WHERE tb_financiamiento_vehiculo.codigo = ?;";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            //PreparedStatement ConsultaSQL = con.prepareStatement(sql);
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setBlob(1, pdf_patentes_rtu_o_constancia_laboral);
            ConsultaSQL.setInt(2, codigoFinanciamiento);
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    public static boolean actualizarFinanciamientoMotos(String tipo_financimaiento, String numero_contrato, int codigoFinanciamiento){
        
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE tb_financiamiento_vehiculo SET tipo_financiamiento = ?, numero_contrato = ?\n"
                        + "WHERE tb_financiamiento_vehiculo.codigo = ?;";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            //PreparedStatement ConsultaSQL = con.prepareStatement(sql);
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, tipo_financimaiento);
            ConsultaSQL.setString(2, numero_contrato);
            ConsultaSQL.setInt(3, codigoFinanciamiento);
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    
    public static boolean actualizarDetalleFinanciamientoMotos(String condicion_credito, double capital, double porcentaje_interes, String tipo_interes, int tiempo_meses,
                                                String fecha_inicio, String fecha_final, double interes_mensual, double amortizacion, double cuota_mensual, double interes_total,
                                                double mora_por_interes,  int codFinanciamiento){
        
        try{
            //Indicamos la consulta a usar
            String sql = "UPDATE\n" +
                        "tb_detalles_financiamiento_vehiculo SET condicion_credito = ?, capital = ?, porcentaje_interes = ?, tipo_interes = ?, tiempo_meses = ?, "
                      + "fecha_inicio = ?, fecha_final = ?, interes_mensual = ?, amortizacion = ?, cuota_mensual = ?, interes_total = ?, mora_por_interes = ?\n" +
                        "WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = ?;";
            
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
            ConsultaSQL.setInt(13, codFinanciamiento);
            
            
            //ejecuta la instrucción
            ConsultaSQL.executeUpdate();
            
            return true; //devuelve el estado verdadero para confirmar que se ejecuto correctamente
                        
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Es esto: " +ex);
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return false;//devuelve un valor falso para indicar que hubo un problema
        }
    }
    public static ResultSet obtenerDatosUltimoPagoRealizado(int codigo){
        try {
            //indicamos la consulta a utilizar
            String sql="SELECT \n" +
                        "tb_pagos_financiamiento_vehiculo.mes_pagar,\n" +
                        "tb_pagos_financiamiento_vehiculo.capital_nuevo,\n" +
                        "tb_pagos_financiamiento_vehiculo.interes_nuevo\n" +
                        "FROM\n" +
                        "tb_pagos_financiamiento_vehiculo\n" +
                        "INNER JOIN tb_detalles_financiamiento_vehiculo ON tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = tb_detalles_financiamiento_vehiculo.codigo\n" +
                        "INNER JOIN tb_financiamiento_vehiculo ON tb_financiamiento_vehiculo.codigo = tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos\n" +
                        "WHERE\n" +
                        "tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO' AND tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = ?\n" +
                        "ORDER BY tb_pagos_financiamiento_vehiculo.codigo DESC LIMIT 1";

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
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha surgido un error: " + ex);
            return null;
        }
    }
     public static ResultSet obtenerUltimaModificacionDetallesPago(String codigo){
      try {
            //indicamos la consulta a utilizar
            String sql="SELECT\n" +
                            "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.codigo) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CODIGO_DETALLE,\n" +
                            "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.tipo_interes) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS TIPO_INTERES,\n" +
                            "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.tiempo_meses) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS TIEMPO_MESES,\n" +
                            "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.amortizacion) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS AMORTIZACION_A_PAGAR,\n" +
                            "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.interes_mensual) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS INTERES_A_PAGAR,\n" +
                            "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.capital) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CAPITAL,\n" +
                            "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.interes_total) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS INTERES_TOTAL\n" +
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
                            "WHERE tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO' AND tb_financiamiento_vehiculo.numero_contrato = ?\n" +
                            "GROUP BY tb_financiamiento_vehiculo.numero_contrato;";

            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
                ConsultaSQL.setString(1, codigo);

            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();


            
            //si la funcion next() logra obtener un valor
            return estructuraTabla;
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Ha surgido un error: " + ex); 
            return null;
        }
     }
     
     public static double obtenerPorcentajeDeInteres(int codigo_financiamiento_vehiculo){
        
        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT porcentaje_interes \n" +
                        "FROM \n" +
                        "tb_detalles_financiamiento_vehiculo \n" +
                        "WHERE \n" +
                        "cod_financiamiento_vehiculos = ?";
            
           PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setInt(1, codigo_financiamiento_vehiculo);
            
            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();
            
            //si la funcion next() logra obtener un valor
            if(estructuraTabla.next()){
                double porcentajeInteres = estructuraTabla.getDouble("porcentaje_interes");
                return porcentajeInteres;
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return 0;
        }
        return 0;
    }
    
     
     //NUEVAS CONSULTAS PARA EL REEMPLAZO DE FORMULARIO DE PAGO
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
                        "WHERE tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO' AND tb_financiamiento_vehiculo.numero_contrato = ?\n" +
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
     
    public static int obtenerCantidadDePagos(int codigo_financiamiento_vehiculo){
        
        try {
            //Indicamos la consulta a utilizar
            String sql= "SELECT \n" +
                        "COUNT(*) AS RESULTADOS\n" +
                        "FROM\n" +
                        "tb_pagos_financiamiento_vehiculo\n" +
                        "INNER JOIN tb_detalles_financiamiento_vehiculo ON tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = tb_detalles_financiamiento_vehiculo.codigo\n" +
                        "INNER JOIN tb_financiamiento_vehiculo ON tb_financiamiento_vehiculo.codigo = tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos\n" +
                        "WHERE\n" +
                        "tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO' AND tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = ?";
            
           PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setInt(1, codigo_financiamiento_vehiculo);
            
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
    
    public static ResultSet obtenerDatosParaPago(String numero_contrato){
        try{
            //Indicamos la consulta a utilizar
            String sql= "SELECT\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.codigo) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CODIGO_DETALLE,\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.tipo_interes) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS TIPO_INTERES,\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.tiempo_meses) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS TIEMPO_MESES,\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.amortizacion) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS AMORTIZACION_A_PAGAR,\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.interes_mensual) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS INTERES_A_PAGAR,\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.capital) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS CAPITAL,\n" +
                        "(SELECT UPPER(tb_detalles_financiamiento_vehiculo.interes_total) FROM tb_detalles_financiamiento_vehiculo WHERE tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos = tb_financiamiento_vehiculo.codigo ORDER BY codigo DESC LIMIT 1) AS INTERES_TOTAL\n" +
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
                        "WHERE tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO' AND tb_financiamiento_vehiculo.numero_contrato = ?\n" +
                        "GROUP BY tb_financiamiento_vehiculo.numero_contrato;";

           PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos cual es el parametro a usar
            ConsultaSQL.setString(1, numero_contrato);
            
            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();

            /*solamente devolvemos el objeto del ResultSet*/

            return estructuraTabla;
        }
        catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }
        
    }
    
    public static ResultSet obtenerDatosActualizadosUltimoPagoRealizado(int cod_detalle_financiamiento_vehiculos){
        try{
            //Indicamos la consulta a utilizar
            String sql= "SELECT \n" +
                        "tb_pagos_financiamiento_vehiculo.mes_pagar,\n" +
                        "tb_pagos_financiamiento_vehiculo.capital_nuevo,\n" +
                        "tb_pagos_financiamiento_vehiculo.interes_nuevo\n" +
                        "FROM\n" +
                        "tb_pagos_financiamiento_vehiculo\n" +
                        "INNER JOIN tb_detalles_financiamiento_vehiculo ON tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = tb_detalles_financiamiento_vehiculo.codigo\n" +
                        "INNER JOIN tb_financiamiento_vehiculo ON tb_financiamiento_vehiculo.codigo = tb_detalles_financiamiento_vehiculo.cod_financiamiento_vehiculos\n" +
                        "WHERE\n" +
                        "tb_financiamiento_vehiculo.tipo_financiamiento = 'FINANCIAMIENTO MOTO' AND tb_pagos_financiamiento_vehiculo.cod_detalle_financiamiento_vehiculos = ?\n" +
                        "ORDER BY tb_pagos_financiamiento_vehiculo.codigo DESC LIMIT 1";

           PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);

            //indicamos cual es el parametro a usar
            ConsultaSQL.setInt(1, cod_detalle_financiamiento_vehiculos);

            //obtenemos la estructura de la tabla que devuelve la consulta sql
            ResultSet estructuraTabla = ConsultaSQL.executeQuery();

            /*solamente devolvemos el objeto del ResultSet*/

            return estructuraTabla;
        }
        catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error: " + ex);
            return null;
        }

    }
    
    public static boolean ingresarPago(String concepto, String fecha_pago, String numero_comprobante_pago, String ultimo_mes_pagado, String mes_pagar, double amortizacion_pagar,
                                          double gastos_administrativos, double interes_pagar, double total_pagar, double capital_actual, double capital_nuevo,
                                          double interes_actual, double interes_nuevo, InputStream pdf_comprobante_pago, int cod_detalle_financiamiento_vehiculos){
        
        try{
            //Indicamos la consulta a usar
            String sql = "INSERT INTO\n" +
                        "tb_pagos_financiamiento_vehiculo(concepto, fecha_pago, numero_comprobante_pago, ultimo_mes_pagado, mes_pagar, amortizacion_pagar, "
                        + "gastos_administrativos, interes_pagar, total_pagar, capital_actual, capital_nuevo, interes_actual, interes_nuevo, "
                        + "pdf_comprobante_pago, cod_detalle_financiamiento_vehiculos	)\n" +
                        "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
            
            /*El Statement es el interpretador de consultas e instrucciones SQL
              Y el PreparedStatemen permite indicar que parametros se van a usar 
              en la consulta SQL antes de interpretarla, o sea, "prepara la consulta
              para el interpretador de consultas >Statement<" */
            //PreparedStatement ConsultaSQL = con.prepareStatement(sql);
            PreparedStatement ConsultaSQL = ConexionBD.getVarCon().prepareStatement(sql);
            
            //indicamos los parametros a usar
            ConsultaSQL.setString(1, concepto);
            ConsultaSQL.setString(2, fecha_pago);
            ConsultaSQL.setString(3, numero_comprobante_pago);
            ConsultaSQL.setString(4, ultimo_mes_pagado);
            ConsultaSQL.setString(5, mes_pagar);
            ConsultaSQL.setDouble(6, amortizacion_pagar);
            ConsultaSQL.setDouble(7, gastos_administrativos);
            ConsultaSQL.setDouble(8, interes_pagar);
            ConsultaSQL.setDouble(9, total_pagar);
            ConsultaSQL.setDouble(10, capital_actual);
            ConsultaSQL.setDouble(11, capital_nuevo);
            ConsultaSQL.setDouble(12, interes_actual);
            ConsultaSQL.setDouble(13, interes_nuevo);
            ConsultaSQL.setBlob(14, pdf_comprobante_pago);
            ConsultaSQL.setInt(15, cod_detalle_financiamiento_vehiculos);
            
            
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