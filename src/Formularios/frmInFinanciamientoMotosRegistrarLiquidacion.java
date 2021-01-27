/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_FinanciamientoMotos;
import static Formularios.frmInFinanciamientoMotosRegistrarPago.codigo_financiamiento;
import static Formularios.frmInFinanciamientoMotosRegistrarPago.numeroContrato;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.util.converter.LocalDateStringConverter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Martin Rosales
 */
public class frmInFinanciamientoMotosRegistrarLiquidacion extends javax.swing.JInternalFrame {

    //VARIABLES GLOBALES
    //VARIABLES PARA OBTENER NOMBRE Y RUTA DEL ARCHIVO
    String nombreArchivo;
    String rutaArchivo;
    FileInputStream comprobante;
    
    //OBTENER DATO SELECCIONADO
    public static String numeroContrato = null;
    public static int codigoFinanciamiento = 0;
    
    //VARIAABLE PARA VERIFICAR SI SE GUARDARON DATOS
    boolean guardarDatos = false;
    
    //VARIABLES PARA GUARDAR DATOS QUE NO SE MUESTREN
    String tipoDeInteres = null;
    double gastos_administrativos = 0;
    int cantidadPagos = 0;
    int cod_detalle_financiamiento = 0;
    int cantidad_pagos_restantes = 0;
    
    public frmInFinanciamientoMotosRegistrarLiquidacion() {
        initComponents();
        //DESPLIUEGA EL FRAME EN EL CENTRO DE LA PANTALLA
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
    
        //OBTENER E INSERTAR FECHA DEL SISTEMA
        Date fechaHoy = new Date();
        dtFechaPAgo.setDate(fechaHoy);
        
        //OBTENER E INSERTAR MES A PAGAR
        Month mes = LocalDate.now().getMonth();
        String nombreMes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        txtMesPagar.setText(nombreMes.toUpperCase());
        
        //VERIFICAR SI HA REALIZADO PAGOS ANTERIORES
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        cantidadPagos = ConexionBD_FinanciamientoMotos.verificarPagoAnterior(codigoFinanciamiento);
        if(cantidadPagos == 0){//ESTO SE REALIZARÁ SI NO HA HECHO NINGÚN PAGO
            llenarCamposPrimerPago(ConexionBD_FinanciamientoMotos.obtenerUltimaModificacionDetallesPago(numeroContrato));
        }else if (cantidadPagos >= 1){//SI LO HA HECHO,  SE OBTENDRÁ EL ÚLTIMO PAGO
            llenarCamposPagoNormal(ConexionBD_FinanciamientoMotos.obtenerUltimaModificacionDetallesPago(numeroContrato));
            llenarCamposPagoNormal2(ConexionBD_FinanciamientoMotos.obtenerDatosUltimoPagoRealizado(cod_detalle_financiamiento));
            ConexionBaseDeDatos.ConexionBD.Finalizar();
            
            
            gastos_administrativos = Double.parseDouble(JOptionPane.showInputDialog(this, "Ingrese los Gastos Administrativos por ser Último Pago"));   
            DecimalFormat df = new DecimalFormat("###.##");
            double total_pagar = ((Double.parseDouble(txtCapitalActual.getText()) + Double.parseDouble(txtInteresActual.getText()))) + gastos_administrativos;
            txtTotalPagar.setText(String.valueOf(df.format(total_pagar)));
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
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
        jLabel9 = new javax.swing.JLabel();
        txtMesPagar = new javax.swing.JTextField();
        txtInteresPagar = new javax.swing.JTextField();
        txtAmortizacionPAgar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCapitalNuevo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCapitalActual = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtInteresNuevo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtInteresActual = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        lblFinalizado = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMinimumSize(new java.awt.Dimension(604, 613));
        setPreferredSize(new java.awt.Dimension(677, 660));

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRAR LIQUIDACIÓN");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(20, Short.MAX_VALUE))
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

        jLabel9.setText("6. MES A PAGAR");

        txtMesPagar.setEditable(false);

        txtInteresPagar.setEditable(false);

        txtAmortizacionPAgar.setEditable(false);

        jLabel11.setText("7. AMORTIZACION A PAGAR");

        txtCapitalNuevo.setEditable(false);

        jLabel12.setText("10. CAPITAL NUEVO");

        txtCapitalActual.setEditable(false);

        jLabel13.setText("9. CAPITAL ACTUAL");

        txtInteresNuevo.setEditable(false);

        jLabel14.setText("12. INTERES NUEVO");

        txtInteresActual.setEditable(false);

        jLabel15.setText("11. INTERES ACTUAL");

        jLabel16.setText("13. TOTAL A PAGAR");

        txtTotalPagar.setEditable(false);

        lblFinalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_accept_50x50.png"))); // NOI18N
        lblFinalizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinalizadoMouseClicked(evt);
            }
        });

        jLabel18.setText("8. INTERES A PAGAR");

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
                .addGap(80, 80, 80)
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
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMesPagar, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtInteresNuevo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCapitalNuevo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtInteresPagar, javax.swing.GroupLayout.Alignment.LEADING)
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
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtInteresActual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                .addComponent(txtCapitalActual, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtAmortizacionPAgar, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(txtUltimoMes, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 219, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFinalizado)
                .addGap(308, 308, 308))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroComprobante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUltimoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMesPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAmortizacionPAgar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInteresPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapitalNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCapitalActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInteresNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInteresActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFinalizado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
        
        //INSE5RTAR DATOS
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        guardarDatos = ConexionBaseDeDatos.ConexionBD_FinanciamientoMotos.ingresarRegistroPago(txtConcepto.getText().toUpperCase(), fechaPago, txtNumeroComprobante.getText().toUpperCase(), 
                txtUltimoMes.getText().toUpperCase(), txtMesPagar.getText().toUpperCase(), Double.parseDouble(txtAmortizacionPAgar.getText()), gastos_administrativos, 
                Double.parseDouble(txtInteresPagar.getText()), Double.parseDouble(txtTotalPagar.getText()), Double.parseDouble(txtCapitalActual.getText()), 
                Double.parseDouble(txtCapitalNuevo.getText()), Double.parseDouble(txtInteresActual.getText()), Double.parseDouble(txtInteresNuevo.getText()), comprobante, cod_detalle_financiamiento);
        ConexionBaseDeDatos.ConexionBD.Finalizar();
        
        //VERIFICAR SI SE GUARDARON LOS DATOS
        if(guardarDatos == true){
            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS ÉXITOSAMENTE");
            
            //VACIAR VARIABLES Y CERRAR FORMULARIO
            nombreArchivo = null;
            rutaArchivo = null;
            gastos_administrativos = 0;
            comprobante = null;
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL INGRESAR LOS DATOS");
        }
        
        // GENERA EL REPORTE CON EL COMPROBANTE DE PAGO
        try {
            ConexionBD.Iniciar();
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportFinanciamientoMotos_ComprobanteLiquidacion.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
            jasperViewer.setTitle("COMPROBANTE DE PAGO");
            ConexionBD.Finalizar();
        } catch (JRException e) {
            ConexionBD.Finalizar();
        }
    }//GEN-LAST:event_lblFinalizadoMouseClicked

    //FUNCIONES
    //FUNCIÓN PARA LLENAR CAMPOS SI ES EL PRIMER PAGO
    private void llenarCamposPrimerPago(ResultSet estructuraTabla){
        //SOLO SE LLENAN CAMPOS QUE APARECERÁN EN LAS CAJAS DE TEXTO, ESTOS DATOS SERÁN REEMPLAZADOS POR CALCULOS
        //NOTA: NO SE ESTÁN AGREGANDO DATOS COMO GASTOS DE OPERACIÓN, YA QUE NO TIENEN CAMPO PARA MOSTRAR, SOLO SE INCLUIRÁ EN LA CONSULTA DE INSERT
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                //SE ALMACENA TIPO DE INTERES PARA VERIFICAR SI ES INTERES VARIADO O FIJO
                cod_detalle_financiamiento = estructuraTabla.getInt("codigo_detalle");
                tipoDeInteres = estructuraTabla.getString("tipo_interes");
                cantidad_pagos_restantes = estructuraTabla.getInt("tiempo_meses");
                
                //SI ES INTERES FIJO
                if(tipoDeInteres.equals("FIJO")){
                    txtUltimoMes.setText("N/A");
                    txtAmortizacionPAgar.setText(String.valueOf(estructuraTabla.getDouble("amortizacion_a_pagar")));
                    txtInteresPagar.setText(String.valueOf(estructuraTabla.getDouble("interes_a_pagar")));
                    txtCapitalActual.setText(String.valueOf(estructuraTabla.getDouble("capital")));
                    txtCapitalNuevo.setText("0.0");
                    txtInteresActual.setText(String.valueOf(estructuraTabla.getDouble("interes_total")));
                    txtInteresNuevo.setText("0.0");
                    //SI EL CAPITAL NUEVO ES 0 SE AGREGARÁN GASTOS ADMINISTRATIVOS AL TOTAL A PAGAR
                    gastos_administrativos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Monto de Gastos Administrativos"));                    
                    double total_pagar = ((estructuraTabla.getDouble("amortizacion_a_pagar") + estructuraTabla.getDouble("interes_a_pagar")) * cantidad_pagos_restantes) + gastos_administrativos;
                    txtTotalPagar.setText(String.valueOf(total_pagar));
                }else{//SI TOMA ESTE CAMINO, EL TIPO DE INTERES ES VARIADO
                
                }
                
            }
        }catch(SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    
    //FUNCIÓN PARA LLENAR CAMPOS SI YA SE HA REALIZADO PAGOS ANTERIORES
    private void llenarCamposPagoNormal(ResultSet estructuraTabla){
        
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                //SE ALMACENA TIPO DE INTERES PARA VERIFICAR SI ES INTERES VARIADO O FIJO
                cod_detalle_financiamiento = estructuraTabla.getInt("codigo_detalle");
                tipoDeInteres = estructuraTabla.getString("tipo_interes");
                cantidad_pagos_restantes = estructuraTabla.getInt("tiempo_meses") - cantidadPagos;
                
                //SI ES INTERES FIJO
                if(tipoDeInteres.equals("FIJO")){
                    txtAmortizacionPAgar.setText(String.valueOf(estructuraTabla.getDouble("amortizacion_a_pagar")));
                    txtInteresPagar.setText(String.valueOf(estructuraTabla.getDouble("interes_a_pagar")));
                    
                    
                }else{//SI TOMA ESTE CAMINO, EL TIPO DE INTERES ES VARIADO
                
                }
            }
        }catch(SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    
    //FUNCIÓN PARA LLENAR CAMPOS SI YA SE HA REALIZADO PAGOS ANTERIORES
    private void llenarCamposPagoNormal2(ResultSet estructuraTabla){
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                txtUltimoMes.setText(estructuraTabla.getString("mes_pagar"));
                txtCapitalActual.setText(String.valueOf(estructuraTabla.getDouble("capital_nuevo")));
                txtInteresActual.setText(String.valueOf(estructuraTabla.getDouble("interes_nuevo")));
                
                //FORMULAS PARA LLENAR
                txtCapitalNuevo.setText("0.0");
                txtInteresNuevo.setText("0.0");
                
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
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFinalizado;
    private javax.swing.JTextField txtAmortizacionPAgar;
    private javax.swing.JTextField txtCapitalActual;
    private javax.swing.JTextField txtCapitalNuevo;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtInteresActual;
    private javax.swing.JTextField txtInteresNuevo;
    private javax.swing.JTextField txtInteresPagar;
    private javax.swing.JTextField txtMesPagar;
    private javax.swing.JTextField txtNumeroComprobante;
    private javax.swing.JTextField txtPDF;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtUltimoMes;
    // End of variables declaration//GEN-END:variables
}
