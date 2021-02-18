/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassFinanciamientoCarro_LlenarTabla;
import Clases.ClassFinanciamientoCarro_verInformacion;
import ConexionBaseDeDatos.ConexionBD;
import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Martin Rosales
 */
public class frmInFinanciamientoCarrosInfo extends javax.swing.JInternalFrame {

    //VARIABLES GLOBALES
    //VARIABLES PARA RECIBIR DATOS DEL FORMULARIO
    static int codigoDeFinanciamiento = 0;
    
    //VARIABLE PARA AGREGAR LA FOTO
    InputStream fotoVehiculo;
    
    //VARIABLES PARA GUARDAR PDF
    Blob pdfContrato;
    Blob pdfRecibo;
    Blob pdfConstancia;
    Blob pdfPatentes;
    
    //ARCHIVOS PARA ACTUALIZARA DOCUMENTOS
    FileInputStream contratoNuevo;
    FileInputStream reciboNuevo;
    FileInputStream constanciaNueva;
    FileInputStream patenteNueva;
    
    //VARIABLE GLOBAL PARA DOCUMENTOS
    String nombreArchivoContrato, rutaArchivoContrato;
    String nombreArchivoRecibo, rutaArchivoRecibo;
    String nombreArchivoConstancia, rutaArchivoConstancia;
    String nombreArchivoPatentes, rutaArchivoPatentes;
    
    //VARIABLE BOOLEANAN PARA VERIFICAR SI AGREGÓ NUEVO ARCHIVO
    boolean nuevoContrato = false;
    boolean nuevoRecibo = false;
    boolean nuevaConstancia = false;
    boolean nuevaPatente = false;
    
    //VARIABLES PARA SABER SI ACTUALIZÓ CORRECATAMENTE
    boolean datosGuardar = false;
    
    
    public frmInFinanciamientoCarrosInfo() {
        initComponents();
        //DESPLIUEGA EL FRAME EN EL CENTRO DE LA PANTALLA
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
        
        //LLENAR DATOS
        ConexionBD.Iniciar();
        llenarCampos(ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.obtenerTodosLosDatosDelFinanciamientoDelCarro(codigoDeFinanciamiento));
        ConexionBD.Finalizar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDpi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        panelFoto = new javax.swing.JPanel();
        labelFoto = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtDetalleVehiculoDescripcion = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtDetalleVehiculoMarca = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtDetalleVehiculoModelo = new javax.swing.JTextField();
        txtDetalleVehiculoAgenciaProveedora = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNumeroContrato = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCapital = new javax.swing.JTextField();
        txtTiempoMeses = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtPorcentajeInteres = new javax.swing.JTextField();
        cmbTipoInteres = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        dtFechaFinalizacion = new com.toedter.calendar.JDateChooser();
        txtInteresMensual = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtInteresTotal = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtPagoMensual = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        dtFechaInicio = new com.toedter.calendar.JDateChooser();
        txtAmortizacion = new javax.swing.JTextField();
        txtCondicionCredito = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lblArchivosAdjuntos = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtContrato = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtRecibo = new javax.swing.JTextField();
        lblArchivosAdjuntos2 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtConsatancia = new javax.swing.JTextField();
        lblArchivosAdjuntos3 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtPatentes = new javax.swing.JTextField();
        lblArchivosAdjuntos4 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finanssoreal.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(870, 605));
        setPreferredSize(new java.awt.Dimension(870, 605));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("*CAMPOS NO MODIFICABLES*");

        jLabel4.setText("1.1 DPI");

        txtDpi.setEditable(false);

        jLabel5.setText("2.1 NOMBRE");

        txtNombre.setEditable(false);

        jLabel6.setText("3.1 TELEFONO");

        txtTelefono.setEditable(false);

        txtDireccion.setEditable(false);

        jLabel7.setText("DIRECCION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txtDpi)
                    .addComponent(txtNombre)
                    .addComponent(txtTelefono)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("1. DETALLES DEL CLIENTE", jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        panelFoto.setBackground(new java.awt.Color(255, 255, 255));
        panelFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelFotoLayout = new javax.swing.GroupLayout(panelFoto);
        panelFoto.setLayout(panelFotoLayout);
        panelFotoLayout.setHorizontalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        );
        panelFotoLayout.setVerticalGroup(
            panelFotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        jLabel26.setText("DESCRIPCIÓN");

        txtDetalleVehiculoDescripcion.setEditable(false);

        jLabel30.setText("MARCA");

        txtDetalleVehiculoMarca.setEditable(false);

        jLabel34.setText("MODELO");

        txtDetalleVehiculoModelo.setEditable(false);

        txtDetalleVehiculoAgenciaProveedora.setEditable(false);

        jLabel37.setText("AGENCIA PROVEEDORA");

        jLabel38.setText("*CAMPOS OBLIGATORIOS*");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26)
                    .addComponent(txtDetalleVehiculoDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel30)
                    .addComponent(txtDetalleVehiculoMarca)
                    .addComponent(jLabel34)
                    .addComponent(txtDetalleVehiculoModelo)
                    .addComponent(jLabel37)
                    .addComponent(txtDetalleVehiculoAgenciaProveedora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel38)
                .addGap(120, 120, 120))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(4, 4, 4)
                        .addComponent(txtDetalleVehiculoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel30)
                        .addGap(4, 4, 4)
                        .addComponent(txtDetalleVehiculoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel34)
                        .addGap(4, 4, 4)
                        .addComponent(txtDetalleVehiculoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37)
                        .addGap(4, 4, 4)
                        .addComponent(txtDetalleVehiculoAgenciaProveedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("2. DETALLES DEL VEHÍCULO", jPanel5);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setText("2.1 CONDICION DEL CREDITO: ");

        jLabel9.setText("2.2 NUMERO DE CONTRATO");

        txtNumeroContrato.setEditable(false);
        txtNumeroContrato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroContratoKeyTyped(evt);
            }
        });

        jLabel10.setText("2.3 CAPITAL");

        txtCapital.setEditable(false);
        txtCapital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapitalKeyTyped(evt);
            }
        });

        txtTiempoMeses.setEditable(false);
        txtTiempoMeses.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTiempoMesesKeyTyped(evt);
            }
        });

        jLabel11.setText("2.6 TIEMPO EN MESES");

        jLabel12.setText("2.5 TIPO DE INTERES");

        jLabel13.setText("2.4 PORCENTAJE DE INTERES");

        txtPorcentajeInteres.setEditable(false);
        txtPorcentajeInteres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeInteresKeyTyped(evt);
            }
        });

        cmbTipoInteres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción...", "FIJO", "VARIADO" }));
        cmbTipoInteres.setEnabled(false);

        jLabel16.setText("2.7 FECHA DE INICIO");

        dtFechaFinalizacion.setDateFormatString("yyyy-MM-dd");
        dtFechaFinalizacion.setEnabled(false);

        txtInteresMensual.setEditable(false);

        jLabel14.setText("2.11 INTERES MENSUAL");

        jLabel19.setText("2.10 AMORTIZACION");

        txtInteresTotal.setEditable(false);

        jLabel20.setText("2.9 FECHA DE FINALIZACION");

        jLabel22.setText("2.13 PAGO MENSUAL");

        txtPagoMensual.setEditable(false);

        jLabel23.setText("2.12 INTERES TOTAL");

        dtFechaInicio.setDateFormatString("yyyy-MM-dd");
        dtFechaInicio.setEnabled(false);

        txtAmortizacion.setEditable(false);

        txtCondicionCredito.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel16)
                        .addComponent(jLabel14)
                        .addComponent(dtFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(txtInteresMensual))
                    .addComponent(txtPorcentajeInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCondicionCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cmbTipoInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNumeroContrato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23)
                        .addComponent(txtInteresTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dtFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtTiempoMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(txtAmortizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel22)
                        .addComponent(txtPagoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtFechaFinalizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(txtInteresTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtCapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCondicionCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4)
                                .addComponent(txtTiempoMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPorcentajeInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel19)
                                .addGap(8, 8, 8)
                                .addComponent(txtAmortizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txtPagoMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dtFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtInteresMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("3. DETALLES DEL CREDITO", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setText("3.1 CONTRATO");

        lblArchivosAdjuntos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        lblArchivosAdjuntos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArchivosAdjuntosMouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_see_20x20.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pdf_20x20.png"))); // NOI18N

        txtContrato.setEditable(false);

        jLabel25.setText("3.2 RECIBO DE AGUA, LUZ O TELEFONO");

        txtRecibo.setEditable(false);

        lblArchivosAdjuntos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        lblArchivosAdjuntos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArchivosAdjuntos2MouseClicked(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_see_20x20.png"))); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pdf_20x20.png"))); // NOI18N

        jLabel29.setText("3.3 CONSTANCIA DE INGRESOS O ESTADOS DE CUENTA");

        txtConsatancia.setEditable(false);

        lblArchivosAdjuntos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        lblArchivosAdjuntos3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArchivosAdjuntos3MouseClicked(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_see_20x20.png"))); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pdf_20x20.png"))); // NOI18N

        jLabel33.setText("3.5 PATENTES Y RTU / CONSTANCIA LABORAL DEL CLIENTE");

        txtPatentes.setEditable(false);

        lblArchivosAdjuntos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        lblArchivosAdjuntos4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblArchivosAdjuntos4MouseClicked(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_see_20x20.png"))); // NOI18N
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pdf_20x20.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel17)
                .addContainerGap(503, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel29)
                            .addComponent(jLabel33))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContrato))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRecibo))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtConsatancia))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatentes)))))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblArchivosAdjuntos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblArchivosAdjuntos2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel27))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblArchivosAdjuntos3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(lblArchivosAdjuntos4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35)))))
                .addGap(133, 133, 133))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel17)
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(txtContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel25)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRecibo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel29)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConsatancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(5, 5, 5)
                        .addComponent(jLabel33)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36)
                            .addComponent(txtPatentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(lblArchivosAdjuntos))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArchivosAdjuntos2)
                            .addComponent(jLabel27))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArchivosAdjuntos3)
                            .addComponent(jLabel31))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblArchivosAdjuntos4)
                            .addComponent(jLabel35)))))
        );

        jTabbedPane1.addTab("4. DOCUMENTOS ADJUNTOS", jPanel4);

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACION DEL FINANCIAMIENTO DE CARROS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_save_50x50.png"))); // NOI18N
        jLabel2.setText("ACTUALIZAR");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblArchivosAdjuntosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArchivosAdjuntosMouseClicked
        //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos PDF", "pdf");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivoContrato = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivoContrato = archivoSeleccionado.getSelectedFile().getPath();
            
            txtContrato.setText(nombreArchivoContrato);
            nuevoContrato = true;
        }
    }//GEN-LAST:event_lblArchivosAdjuntosMouseClicked

    private void lblArchivosAdjuntos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArchivosAdjuntos2MouseClicked
         //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos PDF", "pdf");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivoRecibo = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivoRecibo = archivoSeleccionado.getSelectedFile().getPath();
            
            txtRecibo.setText(nombreArchivoRecibo);
            nuevoRecibo = true;
        }
    }//GEN-LAST:event_lblArchivosAdjuntos2MouseClicked

    private void lblArchivosAdjuntos3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArchivosAdjuntos3MouseClicked
         //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos PDF", "pdf");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivoConstancia = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivoConstancia = archivoSeleccionado.getSelectedFile().getPath();
            
            txtConsatancia.setText(nombreArchivoConstancia);
            nuevaConstancia = true;
        }
    }//GEN-LAST:event_lblArchivosAdjuntos3MouseClicked

    private void lblArchivosAdjuntos4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblArchivosAdjuntos4MouseClicked
        //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos PDF", "pdf");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivoPatentes = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivoPatentes = archivoSeleccionado.getSelectedFile().getPath();
            
            txtPatentes.setText(nombreArchivoPatentes);
            nuevaPatente = true;
        }
    }//GEN-LAST:event_lblArchivosAdjuntos4MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        //FUNCIÓN PARA VISUALIZAR PDF
        if(nuevoContrato == true){//PRIMER IF POR SI SE AGREGA NUEVO ARCHIVO
            try{
                ProcessBuilder visualizar = new ProcessBuilder();//SE PREPARA EL PROCESSBUILDER PARA VIZUALIZAR
                visualizar.command("cmd.exe","/c",rutaArchivoContrato);//SE LE BRINDA LA RUTA
                visualizar.start();//SE ABRE EL ARCHIVO
            }catch(IOException ex){
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{            
            try { 
                //SE PREPARA EL ARCHIVO BLOB COMO INPUTSTREAM
                InputStream bos = pdfContrato.getBinaryStream();        
                
                //SE REALIZAN LAS CONVERSIONES
                int tamanoInput = bos.available();
                byte[] datosPDF = new byte[tamanoInput];
                bos.read(datosPDF, 0, tamanoInput);
                
                //SE DESCARGA EL ARCHIVO EN LA RUTA DEL ROOT DEL PROYECTO
                OutputStream out = new FileOutputStream("Contrato.pdf");
                out.write(datosPDF);

                //SE CIERRAN LOS STREAM
                out.close();
                bos.close();   
                
                //NUEVAMENTE CON PROCESSBUILDER SE VISUALIZA EL ARCHIVO DESCARGADO
                ProcessBuilder visualizar = new ProcessBuilder();
                visualizar.command("cmd.exe","/c","Contrato.pdf");
                visualizar.start();
                
            }catch (IOException | NumberFormatException  | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Debe cerrar todos los archivos previamente abiertos. - " + ex.getMessage());
            }            
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        //FUNCIÓN PARA VISUALIZAR PDF
        if(nuevoRecibo == true){//PRIMER IF POR SI SE AGREGA NUEVO ARCHIVO
            try{
                ProcessBuilder visualizar = new ProcessBuilder();//SE PREPARA EL PROCESSBUILDER PARA VIZUALIZAR
                visualizar.command("cmd.exe","/c",rutaArchivoRecibo);//SE LE BRINDA LA RUTA
                visualizar.start();//SE ABRE EL ARCHIVO
            }catch(IOException ex){
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{            
            try { 
                //SE PREPARA EL ARCHIVO BLOB COMO INPUTSTREAM
                InputStream bos = pdfRecibo.getBinaryStream();        
                
                //SE REALIZAN LAS CONVERSIONES
                int tamanoInput = bos.available();
                byte[] datosPDF = new byte[tamanoInput];
                bos.read(datosPDF, 0, tamanoInput);
                
                //SE DESCARGA EL ARCHIVO EN LA RUTA DEL ROOT DEL PROYECTO
                OutputStream out = new FileOutputStream("Recibo.pdf");
                out.write(datosPDF);

                //SE CIERRAN LOS STREAM
                out.close();
                bos.close();   
                
                //NUEVAMENTE CON PROCESSBUILDER SE VISUALIZA EL ARCHIVO DESCARGADO
                ProcessBuilder visualizar = new ProcessBuilder();
                visualizar.command("cmd.exe","/c","Recibo.pdf");
                visualizar.start();
                
            }catch (IOException | NumberFormatException  | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Debe cerrar todos los archivos previamente abiertos. - " + ex.getMessage());
            }            
        }
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        //FUNCIÓN PARA VISUALIZAR PDF
        if(nuevaConstancia == true){//PRIMER IF POR SI SE AGREGA NUEVO ARCHIVO
            try{
                ProcessBuilder visualizar = new ProcessBuilder();//SE PREPARA EL PROCESSBUILDER PARA VIZUALIZAR
                visualizar.command("cmd.exe","/c",rutaArchivoConstancia);//SE LE BRINDA LA RUTA
                visualizar.start();//SE ABRE EL ARCHIVO
            }catch(IOException ex){
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{            
            try { 
                //SE PREPARA EL ARCHIVO BLOB COMO INPUTSTREAM
                InputStream bos = pdfConstancia.getBinaryStream();        
                
                //SE REALIZAN LAS CONVERSIONES
                int tamanoInput = bos.available();
                byte[] datosPDF = new byte[tamanoInput];
                bos.read(datosPDF, 0, tamanoInput);
                
                //SE DESCARGA EL ARCHIVO EN LA RUTA DEL ROOT DEL PROYECTO
                OutputStream out = new FileOutputStream("Constancia.pdf");
                out.write(datosPDF);

                //SE CIERRAN LOS STREAM
                out.close();
                bos.close();   
                
                //NUEVAMENTE CON PROCESSBUILDER SE VISUALIZA EL ARCHIVO DESCARGADO
                ProcessBuilder visualizar = new ProcessBuilder();
                visualizar.command("cmd.exe","/c","Constancia.pdf");
                visualizar.start();
                
            }catch (IOException | NumberFormatException  | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Debe cerrar todos los archivos previamente abiertos. - " + ex.getMessage());
            }            
        }
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        //FUNCIÓN PARA VISUALIZAR PDF
        if(nuevaPatente == true){//PRIMER IF POR SI SE AGREGA NUEVO ARCHIVO
            try{
                ProcessBuilder visualizar = new ProcessBuilder();//SE PREPARA EL PROCESSBUILDER PARA VIZUALIZAR
                visualizar.command("cmd.exe","/c",rutaArchivoPatentes);//SE LE BRINDA LA RUTA
                visualizar.start();//SE ABRE EL ARCHIVO
            }catch(IOException ex){
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{            
            try { 
                //SE PREPARA EL ARCHIVO BLOB COMO INPUTSTREAM
                InputStream bos = pdfPatentes.getBinaryStream();        
                
                //SE REALIZAN LAS CONVERSIONES
                int tamanoInput = bos.available();
                byte[] datosPDF = new byte[tamanoInput];
                bos.read(datosPDF, 0, tamanoInput);
                
                //SE DESCARGA EL ARCHIVO EN LA RUTA DEL ROOT DEL PROYECTO
                OutputStream out = new FileOutputStream("Patente.pdf");
                out.write(datosPDF);

                //SE CIERRAN LOS STREAM
                out.close();
                bos.close();   
                
                //NUEVAMENTE CON PROCESSBUILDER SE VISUALIZA EL ARCHIVO DESCARGADO
                ProcessBuilder visualizar = new ProcessBuilder();
                visualizar.command("cmd.exe","/c","Patente.pdf");
                visualizar.start();
                
            }catch (IOException | NumberFormatException  | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Debe cerrar todos los archivos previamente abiertos. - " + ex.getMessage());
            }            
        }
    }//GEN-LAST:event_jLabel35MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //VALIDAR PESTAÑA 3 SI SE REALIZARON CAMBIOS
        if(validarCamposTab3() == false){
            return;
        }
        
        //PREPARAR LOS PDF SI SE AGREGARON NUEVOS
        if(nuevoContrato == true){
            File contrato = new File(rutaArchivoContrato);
            try {
                contratoNuevo = new FileInputStream(contrato);
                ConexionBD.Iniciar();
                ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.actualizarContrato(contratoNuevo, codigoDeFinanciamiento);
                ConexionBD.Finalizar();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(nuevoRecibo == true){
            File contrato = new File(rutaArchivoRecibo);
            try {
                reciboNuevo = new FileInputStream(contrato);
                ConexionBD.Iniciar();
                ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.actualizarRecibo(reciboNuevo, codigoDeFinanciamiento);
                ConexionBD.Finalizar();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(nuevaConstancia == true){
            File contrato = new File(rutaArchivoConstancia);
            try {
                constanciaNueva = new FileInputStream(contrato);
                ConexionBD.Iniciar();
                ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.actualizarConstancia(constanciaNueva, codigoDeFinanciamiento);
                ConexionBD.Finalizar();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(nuevaPatente == true){
            File contrato = new File(rutaArchivoPatentes);
            try {
                patenteNueva = new FileInputStream(contrato);
                ConexionBD.Iniciar();
                ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.actualizarPatente(patenteNueva, codigoDeFinanciamiento);
                ConexionBD.Finalizar();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //PREPARAR FECHA DE INICIO Y FINALIZACIÓN
        //CAMBIAR EL FORMATO DE LA FECHA
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicio = formato.format(dtFechaInicio.getDate());
        String fechaFinalizacion = formato.format(dtFechaFinalizacion.getDate());
        
        ConexionBD.Iniciar();        
        ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.actualizarFinanciamientoCarros("FINANCIAMIENTO CARRO", 
                                                            txtNumeroContrato.getText().toUpperCase(), codigoDeFinanciamiento);
        datosGuardar = ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.actualizarDetalleFinanciamientoCarros(txtCondicionCredito.getText().toUpperCase(), 
                                Double.parseDouble(txtCapital.getText()), Double.parseDouble(txtPorcentajeInteres.getText()), cmbTipoInteres.getSelectedItem().toString(), 
                                Integer.parseInt(txtTiempoMeses.getText()), fechaInicio, fechaFinalizacion, Double.parseDouble(txtInteresMensual.getText()), Double.parseDouble(txtAmortizacion.getText()), 
                                Double.parseDouble(txtPagoMensual.getText()), Double.parseDouble(txtInteresTotal.getText()), 0, codigoDeFinanciamiento);
        ConexionBD.Finalizar();
            
        
        if(datosGuardar == true){
            JOptionPane.showMessageDialog(null, "DATOS REGISTRADOS EXITOSAMENTE");
            
            //SE LIMPIAN VARIABLES
            codigoDeFinanciamiento = 0;

            //VARIABLE GLOBAL PARA DOCUMENTOS
            nombreArchivoContrato=null;
            rutaArchivoContrato = null;
            nombreArchivoRecibo = null; 
            rutaArchivoRecibo = null;
            nombreArchivoConstancia = null;
            rutaArchivoConstancia = null;
            nombreArchivoPatentes = null;
            rutaArchivoPatentes = null;

            //VARIABLES GLOBALES PARA GUARDAR DOCUMENTOS
             pdfContrato = null;
             pdfRecibo = null;
             pdfConstancia = null;
             pdfPatentes = null;


            //VERIFICAR DATOS GUARDADOS
            datosGuardar = false;
            
            //ARCHIVOS PARA ACTUALIZARA DOCUMENTOS
            contratoNuevo = null;
            reciboNuevo = null;
            constanciaNueva = null;
            patenteNueva = null;
            
            //ACTUALIZA LA TABLA PRINCIPAL
            ConexionBaseDeDatos.ConexionBD.Iniciar();
            actualizarTablaCatalogoCarros(ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.mostrarTodoFinanciamientoCarros());
            ConexionBaseDeDatos.ConexionBD.Finalizar();
            
            //SE CIERRA EL FORMULARIO
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "HUBU UN ERROR AL GUARDAR LOS DATOS");
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtNumeroContratoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroContratoKeyTyped
        //FUNCIÓN PARA NO PERMITIR ESPACIOS
        char datoIngesado = evt.getKeyChar();
        
        if(Character.isWhitespace(datoIngesado)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroContratoKeyTyped

    private void txtCapitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapitalKeyTyped
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
        
        //FUNCIÓN PARA NO PERMITIR ESPACIOS
        char datoIngesado = evt.getKeyChar();
        
        if(Character.isWhitespace(datoIngesado)){
            evt.consume();
        }
    }//GEN-LAST:event_txtCapitalKeyTyped

    private void txtPorcentajeInteresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeInteresKeyTyped
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
        
        //FUNCIÓN PARA NO PERMITIR ESPACIOS
        char datoIngesado = evt.getKeyChar();
        
        if(Character.isWhitespace(datoIngesado)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPorcentajeInteresKeyTyped

    private void txtTiempoMesesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiempoMesesKeyTyped
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
        
        //FUNCIÓN PARA NO PERMITIR ESPACIOS
        char datoIngesado = evt.getKeyChar();
        
        if(Character.isWhitespace(datoIngesado)){
            evt.consume();
        }
    }//GEN-LAST:event_txtTiempoMesesKeyTyped

    //FUNCIONES
    //FUNCIÓN PARA LLENAR LOS DATOS
    private void llenarCampos(ResultSet estructuraTabla){
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassFinanciamientoCarro_verInformacion financiamiento = new ClassFinanciamientoCarro_verInformacion( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                        estructuraTabla.getString("dpi_cliente"),                        
                        estructuraTabla.getString("nombre_cliente"),
                        estructuraTabla.getString("telefono_cliente"),
                        estructuraTabla.getString("direccion_cliente"),
                        
                        estructuraTabla.getBytes("foto_vehiculo"),
                        estructuraTabla.getString("descripcion_vehiculo"),
                        estructuraTabla.getString("marca_vehiculo"),
                        estructuraTabla.getString("modelo_vehiculo"),
                        estructuraTabla.getString("agencia_proveedora_vehiculo"),
                        
                        estructuraTabla.getString("condicion_credito"),
                        estructuraTabla.getString("numero_contrato"),
                        estructuraTabla.getDouble("capital"),
                        estructuraTabla.getDouble("porcentaje_interes"),
                        estructuraTabla.getString("tipo_interes"),
                        estructuraTabla.getInt("tiempo_meses"),
                        estructuraTabla.getString("fecha_inicial"),
                        estructuraTabla.getString("fecha_finalizacion"),
                        estructuraTabla.getDouble("amortizacion"),
                        estructuraTabla.getDouble("interes_mensual"),
                        estructuraTabla.getDouble("interes_total"),
                        estructuraTabla.getDouble("cuota_mensual"),
                
                        estructuraTabla.getBlob("pdf_contrato"),
                        estructuraTabla.getBlob("pdf_recibo_agua_luz_telefono"),
                        estructuraTabla.getBlob("pdf_constancia_ingresos_estados_cuenta"),
                        estructuraTabla.getBlob("pdf_patentes_rtu_o_constancia_laboral"));
                
                //GUARDAR DATOS QUE NO SE AGREGARÁN A LOS TEXTBOX
                pdfContrato = financiamiento.getPdf_contrato();
                pdfRecibo = financiamiento.getPdf_recibo_agua_luz_telefono();
                pdfConstancia = financiamiento.getPdf_constancia_ingresos_estados_cuenta();
                pdfPatentes = financiamiento.getPdf_patentes_rtu_o_constancia_laboral();
                             
                
                //SE AGREGA LA FOTO   
                fotoVehiculo = new ByteArrayInputStream(financiamiento.getFoto_vehiculo());
                ImageIcon fotografia = new ImageIcon(financiamiento.getFoto_vehiculo());
                Image imagen = fotografia.getImage();
                Image nuevaImagen = imagen.getScaledInstance(291, 250, Image.SCALE_SMOOTH);
                ImageIcon fotografiaMostrar = new ImageIcon(nuevaImagen);
                labelFoto.setIcon(fotografiaMostrar); 
                
                //AGEGAR EL COMBOBOX
                if(financiamiento.getTipo_interes().equals("FIJO")){
                    cmbTipoInteres.setSelectedIndex(1);
                }else{
                    cmbTipoInteres.setSelectedIndex(2);
                }
                
                //SE AGREGAN LAS FECHAS
                //CONVERSIÓN DE FECHA DE STRING A DATE
                DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaInicio = null;
                Date fechaFinal = null;
                try {
                    fechaInicio = formato.parse(financiamiento.getFecha_inicio());
                    fechaFinal = formato.parse(financiamiento.getFecha_final());
                } catch (ParseException ex) {
                    Logger.getLogger(frmInClienteInformacion.class.getName()).log(Level.SEVERE, null, ex);
                }
        
                                
                //SE AGREGAN LOS DATOS A LAS CAJAS DE TEXTO
                txtDpi.setText(financiamiento.getDpi_cliente());
                txtNombre.setText(financiamiento.getNombre_cliente());
                txtTelefono.setText(financiamiento.getTelefono_cliente());
                txtDireccion.setText(financiamiento.getDireccion_cliente());
                
                txtDetalleVehiculoDescripcion.setText(financiamiento.getDescripcion_vehiculo());
                txtDetalleVehiculoMarca.setText(financiamiento.getMarca_vehiculo());
                txtDetalleVehiculoModelo.setText(financiamiento.getModelo_vehiculo());
                txtDetalleVehiculoAgenciaProveedora.setText(financiamiento.getAgencia_proveedora());
                
                txtCondicionCredito.setText(financiamiento.getCondicion_credito());                
                txtNumeroContrato.setText(financiamiento.getNumero_contrato());
                txtCapital.setText(financiamiento.getCapital().toString());
                txtPorcentajeInteres.setText(financiamiento.getPorcentaje_interes().toString());
                txtTiempoMeses.setText(String.valueOf(financiamiento.getTiempo_meses()));
                dtFechaInicio.setDate(fechaInicio);
                dtFechaFinalizacion.setDate(fechaFinal);
                txtAmortizacion.setText(financiamiento.getAmortizacion().toString());
                txtInteresMensual.setText(financiamiento.getInteres_mensual().toString());
                txtInteresTotal.setText(financiamiento.getInteres_total().toString());
                txtPagoMensual.setText(financiamiento.getCuota_mensual().toString());
                
                txtContrato.setText("PDF CONTRATO DE "  + financiamiento.getNombre_cliente());
                txtRecibo.setText("PDF RECIBO DE "  + financiamiento.getNombre_cliente());
                txtConsatancia.setText("PDF CONSTANCIA DE "  + financiamiento.getNombre_cliente());
                txtPatentes.setText("PDF PATENTES DE "  + financiamiento.getNombre_cliente());
                
                                
            }
        }catch(SQLException ex){
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    
    //FUNCIONES
    //FUNCIÓN PARA VALIDAR PESTAÑA 3
    private boolean validarCamposTab3(){
        if(txtNumeroContrato.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Número de Contrato");
            txtNumeroContrato.requestFocusInWindow();
            return false;
        }
        if(txtCapital.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Capital");
            txtCapital.requestFocusInWindow();
            return false;
        }
        if(txtPorcentajeInteres.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Porcentaje de Interés");
            txtPorcentajeInteres.requestFocusInWindow();
            return false;
        }
        if(cmbTipoInteres.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Campo no Seleccionado - Tipo de Interés");
            cmbTipoInteres.requestFocusInWindow();
            return false;
        }
        if(txtTiempoMeses.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Tiempo en Meses");
            txtTiempoMeses.requestFocusInWindow();
            return false;
        }
        if(dtFechaInicio.getDate() == null){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Fecha de Inicio");
            dtFechaInicio.requestFocusInWindow();
            return false;
        }
        if(dtFechaFinalizacion.getDate() == null){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Fecha de Finalización");
            dtFechaFinalizacion.requestFocusInWindow();
            return false;
        }
        if(txtAmortizacion.getText().equals("")){
            JOptionPane.showConfirmDialog(null, "Campo Vacío - Amortización");
            txtAmortizacion.requestFocusInWindow();
            return false;
        }
        if(txtInteresMensual.getText().equals("")){
            JOptionPane.showConfirmDialog(null, "Campo Vacío - Interés Mensual");
            txtInteresMensual.requestFocusInWindow();
            return false;
        }
        if(txtInteresTotal.getText().equals("")){
            JOptionPane.showConfirmDialog(null, "Campo Vacío - Interés Total");
            txtInteresTotal.requestFocusInWindow();
            return false;
        }
        if(txtPagoMensual.getText().equals("")){
            JOptionPane.showConfirmDialog(null, "Campo Vacío - Pago Mensual");
            txtPagoMensual.requestFocusInWindow();
            return false;
        }
        return true;
    }
    
    //FUNCIÓN PARA ACTUALIZAR LA TABLA PRINCIPAL DEL MÓDULO
    private void actualizarTablaCatalogoCarros(ResultSet estructuraTabla) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int filas, int columnas){
                if(columnas == 5){
                    return true;
                }else{
                    return false;
                }
            }
            };
            //Primero se Definen las Columnas
            modelo.addColumn("CÓDIGO");
            modelo.addColumn("CONDICIÓN DEL CRÉDITO");
            modelo.addColumn("NÚMERO DE CONTRATO");
            modelo.addColumn("CAPITAL");
            modelo.addColumn("DPI DEL CLIENTE");
            modelo.addColumn("NOMBRE DEL CLIENTE");
            modelo.addColumn("DESCRIPCIÓN");
            //modelo.addColumn("Tipo Serv.");
            
            //se definen los tamaños de las columnas
            frmInFinanciamientoCarros.tbClientes.setModel(modelo);
            
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(0).setPreferredWidth(150);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(0).setMaxWidth(150);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(0).setMinWidth(5);
            
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(1).setMaxWidth(250);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(1).setMinWidth(5);
            
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(2).setPreferredWidth(240);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(2).setMaxWidth(240);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(2).setMinWidth(5);
            
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(3).setPreferredWidth(140);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(3).setMaxWidth(140);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(3).setMinWidth(5);
            
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(4).setPreferredWidth(200);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(4).setMaxWidth(200);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(4).setMinWidth(5);
            
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(5).setPreferredWidth(290);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(5).setMaxWidth(290);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(5).setMinWidth(5);
            
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(6).setPreferredWidth(200);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(6).setMaxWidth(200);
            frmInFinanciamientoCarros.tbClientes.getColumnModel().getColumn(6).setMinWidth(5);
            
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassFinanciamientoCarro_LlenarTabla usuario = new ClassFinanciamientoCarro_LlenarTabla ( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                    estructuraTabla.getInt("codigo"),
                    estructuraTabla.getString("condicion_credito"),
                    estructuraTabla.getString("numero_contrato"), 
                    estructuraTabla.getString("capital"), 
                    estructuraTabla.getString("dpi"),
                    estructuraTabla.getString("nombre"),
                    estructuraTabla.getString("descripcion"));

                // se añade el registro encontrado al modelo de la tabla
                modelo.addRow(new Object[]{
                    usuario.getCodigo(),                  
                    usuario.getCondicion_credito(),
                    usuario.getNumero_contrato(),
                    usuario.getCapital(),
                    usuario.getDpi(),
                    usuario.getNombre(),
                    usuario.getDescripcion()});
            }

            
            //se muestra todo en la tabla
            frmInFinanciamientoCarros.tbClientes.setModel(modelo);

            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbTipoInteres;
    private com.toedter.calendar.JDateChooser dtFechaFinalizacion;
    private com.toedter.calendar.JDateChooser dtFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelFoto;
    private javax.swing.JLabel lblArchivosAdjuntos;
    private javax.swing.JLabel lblArchivosAdjuntos2;
    private javax.swing.JLabel lblArchivosAdjuntos3;
    private javax.swing.JLabel lblArchivosAdjuntos4;
    private javax.swing.JPanel panelFoto;
    private javax.swing.JTextField txtAmortizacion;
    private javax.swing.JTextField txtCapital;
    private javax.swing.JTextField txtCondicionCredito;
    private javax.swing.JTextField txtConsatancia;
    private javax.swing.JTextField txtContrato;
    private javax.swing.JTextField txtDetalleVehiculoAgenciaProveedora;
    private javax.swing.JTextField txtDetalleVehiculoDescripcion;
    private javax.swing.JTextField txtDetalleVehiculoMarca;
    private javax.swing.JTextField txtDetalleVehiculoModelo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDpi;
    private javax.swing.JTextField txtInteresMensual;
    private javax.swing.JTextField txtInteresTotal;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroContrato;
    private javax.swing.JTextField txtPagoMensual;
    private javax.swing.JTextField txtPatentes;
    private javax.swing.JTextField txtPorcentajeInteres;
    private javax.swing.JTextField txtRecibo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTiempoMeses;
    // End of variables declaration//GEN-END:variables
}
