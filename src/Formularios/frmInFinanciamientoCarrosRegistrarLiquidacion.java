/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.converter.LocalDateStringConverter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Martin Rosales
 */
public class frmInFinanciamientoCarrosRegistrarLiquidacion extends javax.swing.JInternalFrame {

    //VARIABLES GLOBALES
    //VARIABLES PARA OBTENER NOMBRE Y RUTA DEL ARCHIVO
    String nombreArchivo;
    String rutaArchivo;
    FileInputStream comprobante;
    
    //OBTENER DATO SELECCIONADO
    public static int codigoFinanciamiento = 0;
    
    //VARIAABLE PARA VERIFICAR SI SE GUARDARON DATOS
    boolean guardarDatos = false;
    
    public frmInFinanciamientoCarrosRegistrarLiquidacion() {
        initComponents();
        //DESPLIUEGA EL FRAME EN EL CENTRO DE LA PANTALLA
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
    
        //OBTENER E INSERTAR FECHA DEL SISTEMA
        Date fechaHoy = new Date();
        dtFechaPAgo.setDate(fechaHoy);
        
        //VERIFICAR SI HA REALIZADO PAGOS ANTERIORES
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        int cantidadPagos = ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.obtenerCantidadDePagos(codigoFinanciamiento);
        ConexionBaseDeDatos.ConexionBD.Finalizar();
        
        if(cantidadPagos < 1){//ESTO SE REALIZARÁ SI NO HA HECHO NINGÚN PAGO
            llenarCamposPrimerPago();
        }else{//SI LO HA HECHO,  SE OBTENDRÁ EL ÚLTIMO PAGO
            ConexionBaseDeDatos.ConexionBD.Iniciar();
            llenarCamposConUltimoPago(ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.obtenerDatosUltimoPagoRealizado(codigoFinanciamiento));
            ConexionBaseDeDatos.ConexionBD.Finalizar();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dtFechaPAgo = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroComprobante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPDF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUltimoMes = new javax.swing.JTextField();
        txtInteresActual = new javax.swing.JTextField();
        txtCapitalActual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtInteresTotalRestante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAmortizacionTotalRestante = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtPorcentajePorLiquidacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtGastosAdministrativos = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        lblFinalizado = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMinimumSize(new java.awt.Dimension(604, 642));
        setPreferredSize(new java.awt.Dimension(767, 660));

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR LIQUIDACIÓN DE FINANCIAMIENTO DE CARROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel2.setText("1. CONCEPTO");

        txtConcepto.setEditable(false);
        txtConcepto.setText("LIQUIDACIÓN");

        jLabel3.setText("2. FECHA DE PAGO");

        dtFechaPAgo.setDateFormatString("yyyy-MM-dd");
        dtFechaPAgo.setEnabled(false);

        jLabel4.setText("3. NUMERO DE COMPROBANTE DE PAGO");

        txtNumeroComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroComprobanteKeyTyped(evt);
            }
        });

        jLabel5.setText("4. PDF DE COMPROBANTE DE PAGO");

        txtPDF.setEditable(false);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pdf_20x20.png"))); // NOI18N

        jLabel8.setText("5. ULTIMO MES DE PAGO");

        txtUltimoMes.setEditable(false);

        txtInteresActual.setEditable(false);

        txtCapitalActual.setEditable(false);

        jLabel11.setText("6. CAPITAL ACTUAL");

        txtInteresTotalRestante.setEditable(false);

        jLabel12.setText("9. INTERES TOTAL RESTANTE");

        txtAmortizacionTotalRestante.setEditable(false);

        jLabel13.setText("8. AMORTIZACIÓN TOTAL RESTANTE");

        txtPorcentajePorLiquidacion.setEditable(false);

        jLabel14.setText("11. PORCENTAJE POR LIQUIDACION");

        txtGastosAdministrativos.setEditable(false);

        jLabel15.setText("10. GASTOS ADMINISTRATIVOS");

        jLabel16.setText("13. TOTAL A PAGAR");

        txtTotalPagar.setEditable(false);

        lblFinalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_accept_50x50.png"))); // NOI18N
        lblFinalizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinalizadoMouseClicked(evt);
            }
        });

        jLabel18.setText("7. INTERES ACTUAL");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_see_20x20.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConcepto, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(dtFechaPAgo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtPorcentajePorLiquidacion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtInteresTotalRestante, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtInteresActual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel17))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel7))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtGastosAdministrativos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addComponent(txtAmortizacionTotalRestante, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCapitalActual, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtUltimoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(lblFinalizado))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dtFechaPAgo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(txtNumeroComprobante, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(txtPDF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUltimoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapitalActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInteresActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInteresTotalRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmortizacionTotalRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPorcentajePorLiquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGastosAdministrativos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFinalizado)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos PDF", "pdf");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivo = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivo = archivoSeleccionado.getSelectedFile().getPath();
            
            txtPDF.setText(nombreArchivo);
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        //VALIDAR SI EXISTE UN PDF AGREGADO
        if(txtPDF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe agregar un Documento previamente a visualizar.");
            return;
        }

        //FUNCIÓN PARA VISUALIZAR LA IMAGEN
        try{
            ProcessBuilder visualizar = new ProcessBuilder();
            visualizar.command("cmd.exe","/c",rutaArchivo);
            visualizar.start();
        }catch(IOException ex){
            Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void txtNumeroComprobanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroComprobanteKeyTyped
        //FUNCIÓN PARA NO PERMITIR ESPACIOS
        char datoIngesado = evt.getKeyChar();
        
        if(Character.isWhitespace(datoIngesado)){
            evt.consume();
        }
        
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
    }//GEN-LAST:event_txtNumeroComprobanteKeyTyped

    private void lblFinalizadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinalizadoMouseClicked
         //VALIDAR CAMPOS VACÍOS
        if(validarCampos() == false){
            return;
        }
        
        //CAMBIAR EL FORMATO DE LA FECHA
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaPago = formato.format(dtFechaPAgo.getDate());
        
        //PREPARACIÓN DEL ARCHIVO AGREGADO
        File file = new File(rutaArchivo);
        try {
            comprobante = new FileInputStream(file);
        }catch (FileNotFoundException ex) {
            Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //VARIABLES QUE NO ESTAN EN CAJAS DE TEXTO, ESTARÁN EN LOS CALCULOS
        double interes_nuevo = 120.00;
        double capital_nuevo = 20.00;
        
        //INSE5RTAR DATOS
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        guardarDatos = ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.ingresarPago(txtConcepto.getText().toUpperCase(), fechaPago, txtNumeroComprobante.getText().toUpperCase(), 
                txtUltimoMes.getText().toUpperCase(), txtUltimoMes.getText().toUpperCase(), Double.parseDouble(txtCapitalActual.getText()), Double.parseDouble(txtGastosAdministrativos.getText()), 
                Double.parseDouble(txtPorcentajePorLiquidacion.getText()), Double.parseDouble(txtInteresTotalRestante.getText()), Double.parseDouble(txtTotalPagar.getText()), Double.parseDouble(txtCapitalActual.getText()), 
                capital_nuevo, Double.parseDouble(txtInteresActual.getText()), interes_nuevo, comprobante, codigoFinanciamiento);
        ConexionBaseDeDatos.ConexionBD.Finalizar();
        
        //VERIFICAR SI SE GUARDARON LOS DATOS
        if(guardarDatos == true){
            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS ÉXITOSAMENTE");
            
            //VACIAR VARIABLES Y CERRAR FORMULARIO
            nombreArchivo = null;
            rutaArchivo = null;
            interes_nuevo = 0;
            capital_nuevo = 0;
            comprobante = null;
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL INGRESAR LOS DATOS");
        }
    }//GEN-LAST:event_lblFinalizadoMouseClicked

    //FUNCIONES
    //FUNCIÓN PARA LLENAR CAMPOS SI ES EL PRIMER PAGO
    private void llenarCamposPrimerPago(){
        //SOLO SE LLENAN CAMPOS QUE APARECERÁN EN LAS CAJAS DE TEXTO, ESTOS DATOS SERÁN REEMPLAZADOS POR CALCULOS
        //NOTA: NO SE ESTÁN AGREGANDO DATOS COMO GASTOS DE OPERACIÓN, YA QUE NO TIENEN CAMPO PARA MOSTRAR, SOLO SE INCLUIRÁ EN LA CONSULTA DE INSERT
        txtCapitalActual.setText("0.00");
        txtInteresActual.setText("0.00");
        txtAmortizacionTotalRestante.setText("0.00");
        txtInteresTotalRestante.setText("0.00");
        txtGastosAdministrativos.setText("0.00");
        txtPorcentajePorLiquidacion.setText("0.00");
        txtTotalPagar.setText("120.00");
        
        //OBTENER E INSERTAR MES A PAGAR
        Month mes = LocalDate.now().getMonth();
        String nombreMes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        txtUltimoMes.setText(nombreMes.toUpperCase());
    }
    
    //FUNCIÓN PARA LLENAR CAMPOS SI YA SE HA REALIZADO PAGOS ANTERIORES
    private void llenarCamposConUltimoPago(ResultSet estructuraTabla){
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                txtUltimoMes.setText(estructuraTabla.getString("mes_pagar"));
                txtCapitalActual.setText(String.valueOf(estructuraTabla.getDouble("capital_actual")));
                txtInteresActual.setText(String.valueOf(estructuraTabla.getDouble("interes_actual")));
                txtAmortizacionTotalRestante.setText("120.00");//SE CAMBIARÁ POR LOS CALCULOS REALIZADOS
                txtInteresTotalRestante.setText("10.00");//SE CAMBIARÁ POR LOS CALCULOS REALIZADOS
                txtGastosAdministrativos.setText(String.valueOf(estructuraTabla.getDouble("gastos_administrativos")));
                txtPorcentajePorLiquidacion.setText("100.00"); //SE CAMBIARÁ POR LOS CALCULOS REALIZADOS
                txtTotalPagar.setText("200.00");//SE CAMBIARÁ POR LOS CALCULOS REALIZADOS
            }
        }catch(SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    
    //FUNCIÓN PARA VALIDAR CAMPOS
    private boolean validarCampos(){
        if(txtNumeroComprobante.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Número de Comprobante");
            txtNumeroComprobante.requestFocusInWindow();
            return false;
        }
        if(txtPDF.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - PDF de Comprobante");
            txtPDF.requestFocusInWindow();
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dtFechaPAgo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFinalizado;
    private javax.swing.JTextField txtAmortizacionTotalRestante;
    private javax.swing.JTextField txtCapitalActual;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtGastosAdministrativos;
    private javax.swing.JTextField txtInteresActual;
    private javax.swing.JTextField txtInteresTotalRestante;
    private javax.swing.JTextField txtNumeroComprobante;
    private javax.swing.JTextField txtPDF;
    private javax.swing.JTextField txtPorcentajePorLiquidacion;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtUltimoMes;
    // End of variables declaration//GEN-END:variables
}
