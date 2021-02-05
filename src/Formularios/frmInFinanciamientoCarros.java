/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassFinanciamientoCarro_LlenarTabla;
import ConexionBaseDeDatos.ConexionBD;
import static Formularios.frmPrincipal.jdpPantallaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
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
public class frmInFinanciamientoCarros extends javax.swing.JInternalFrame {

    //VARIABLES GLOBALES
    //VARIABLES PARA MANDAR EL DATO SELECCIONADO
    String numeroContrato = null;
    int codigoFinanciamiento = 0;
    
    //VARIABLES PARA EL TAMAÑO DE FORMULARIOS
    int ancho, alto;
    
    
     //VARIABLE PARA ACTUALIZAR LA TABLA AUTOMÁTICAMENTE
       
    public frmInFinanciamientoCarros() { //--------------------CLASE PRINCIPAL 
        initComponents();
        //DESPLIEGA EL FRAME EN EL CENTRO DE LA PANTALLA
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);;
        
        //ELIMINA EL HEADER DEL FORMULARIO INTERNO
        BasicInternalFrameUI frmInUI = (BasicInternalFrameUI) this.getUI();
        frmInUI.setNorthPane(null);
        
        //Conexion:
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarDatos(ConexionBaseDeDatos.ConexionBD_FinanciamientoCarros.mostrarTodoFinanciamientoCarros());
        ConexionBaseDeDatos.ConexionBD.Finalizar();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModuloCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblEstadoCuenta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRegistrarPago = new javax.swing.JLabel();
        lblBotonMoverInicio = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverFinal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblBotonBuscarCliente1 = new javax.swing.JLabel();
        txtBuscarPorNombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblBotonNuevo1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblBotonInformacion1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        opVerHistorialCredito = new javax.swing.JMenuItem();
        opVerEstadoCuentaCredito = new javax.swing.JMenu();
        opVerEstadoCuentaCreditoGerencial = new javax.swing.JMenuItem();
        opVerEstadoCuentaCreditoCliente = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lblModuloCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_car_mouseEntered.png"))); // NOI18N
        lblModuloCliente.setAlignmentX(80.0F);

        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "DPI", "NOMBRE DEL CLIENTE", "TELÉFONO", "CORREO ELECTRÓNICO"
            }
        ));
        jScrollPane1.setViewportView(tbClientes);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRAR PAGO");

        lblEstadoCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstadoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_history_50x50.png"))); // NOI18N
        lblEstadoCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEstadoCuentaMouseClicked(evt);
            }
        });

        jLabel7.setText("REGISTRAR LIQUIDACIÓN");

        lblRegistrarPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistrarPago.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quetzales_25x25.png"))); // NOI18N
        lblRegistrarPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarPagoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblRegistrarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEstadoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lblRegistrarPago)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(13, 13, 13)
                .addComponent(lblEstadoCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonBuscarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N

        txtBuscarPorNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPorNombre1KeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("BUSCAR PARÁMETROS:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPorNombre1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 129, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addComponent(lblBotonBuscarCliente1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPorNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarCliente1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonNuevo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonNuevo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_add_50x50.png"))); // NOI18N
        lblBotonNuevo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonNuevo1MouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NUEVO");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("INFORMACIÓN");

        lblBotonInformacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonInformacion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_info_50x50.png"))); // NOI18N
        lblBotonInformacion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonInformacion1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonNuevo1))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBotonInformacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonNuevo1)
                    .addComponent(lblBotonInformacion1))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)))
        );

        jMenu1.setText("REPORTES");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("MAS OPCIONES");

        opVerHistorialCredito.setText("VER HISTORIAL DEL CRÉDITO");
        opVerHistorialCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opVerHistorialCreditoActionPerformed(evt);
            }
        });
        jMenu2.add(opVerHistorialCredito);

        opVerEstadoCuentaCredito.setText("VER ESTADO DE CUENTA DEL CRÉDITO");

        opVerEstadoCuentaCreditoGerencial.setText("GERENCIAL");
        opVerEstadoCuentaCreditoGerencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opVerEstadoCuentaCreditoGerencialActionPerformed(evt);
            }
        });
        opVerEstadoCuentaCredito.add(opVerEstadoCuentaCreditoGerencial);

        opVerEstadoCuentaCreditoCliente.setText("CLIENTE");
        opVerEstadoCuentaCreditoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opVerEstadoCuentaCreditoClienteActionPerformed(evt);
            }
        });
        opVerEstadoCuentaCredito.add(opVerEstadoCuentaCreditoCliente);

        jMenu2.add(opVerEstadoCuentaCredito);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModuloCliente)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblBotonMoverInicio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBotonMoverAtras)
                                .addGap(18, 18, 18)
                                .addComponent(lblBotonMoverAdelante)
                                .addGap(18, 18, 18)
                                .addComponent(lblBotonMoverFinal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1))
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblModuloCliente)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addGap(19, 19, 19)
                        .addComponent(lblBotonMoverInicio))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBotonMoverFinal)
                            .addComponent(lblBotonMoverAdelante)
                            .addComponent(lblBotonMoverAtras))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        private void mostrarDatos(ResultSet estructuraTabla) {
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
            tbClientes.setModel(modelo);
            
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(150);
            tbClientes.getColumnModel().getColumn(0).setMaxWidth(150);
            tbClientes.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(250);
            tbClientes.getColumnModel().getColumn(1).setMaxWidth(250);
            tbClientes.getColumnModel().getColumn(1).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(240);
            tbClientes.getColumnModel().getColumn(2).setMaxWidth(240);
            tbClientes.getColumnModel().getColumn(2).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(140);
            tbClientes.getColumnModel().getColumn(3).setMaxWidth(140);
            tbClientes.getColumnModel().getColumn(3).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(4).setPreferredWidth(200);
            tbClientes.getColumnModel().getColumn(4).setMaxWidth(200);
            tbClientes.getColumnModel().getColumn(4).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(5).setPreferredWidth(290);
            tbClientes.getColumnModel().getColumn(5).setMaxWidth(290);
            tbClientes.getColumnModel().getColumn(5).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(6).setPreferredWidth(200);
            tbClientes.getColumnModel().getColumn(6).setMaxWidth(200);
            tbClientes.getColumnModel().getColumn(6).setMinWidth(5);
            
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
            tbClientes.setModel(modelo);

            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
        
    private void lblEstadoCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstadoCuentaMouseClicked
      int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro para Registrar Pago");
            return;
        }
        //Abrir el Formulario de Información 
        // TOMAR LOS DATOS SELECCIONADOS
        for(int i=0; i<tbClientes.getRowCount(); i++){
            if(tbClientes.isRowSelected(i)){
                codigoFinanciamiento = (int) tbClientes.getValueAt(i, 0);
                numeroContrato = tbClientes.getValueAt(i, 2).toString();


                //SE MANDAN LOS DATOS SELECCIONADOS
                frmInFinanciamientoCarrosRegistrarLiquidacion.codigoFinanciamiento = codigoFinanciamiento;
                frmInFinanciamientoCarrosRegistrarLiquidacion.numeroContrato = numeroContrato;


                //Abrir el Formulario para Información de Carros
                frmInFinanciamientoCarrosRegistrarLiquidacion frmFinanciamientosLiquidacion = new frmInFinanciamientoCarrosRegistrarLiquidacion();
                ancho = (jdpPantallaPrincipal.getWidth()/2) - frmFinanciamientosLiquidacion.getWidth()/2;
                alto = (jdpPantallaPrincipal.getHeight()/2) - frmFinanciamientosLiquidacion.getHeight()/2;

                //ENVIAR EL PARAMETRO SELECCIONADOR

                jdpPantallaPrincipal.add(frmFinanciamientosLiquidacion);
                frmFinanciamientosLiquidacion.setLocation(ancho, alto);
                frmFinanciamientosLiquidacion.show();

                return;
            }
        }
        
    }//GEN-LAST:event_lblEstadoCuentaMouseClicked

    private void lblBotonNuevo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonNuevo1MouseClicked
        frmInFinanciamientoCarrosNuevo frmNuevo = new frmInFinanciamientoCarrosNuevo();
        frmPrincipal.jdpPantallaPrincipal.add(frmNuevo);
        frmNuevo.show();
    }//GEN-LAST:event_lblBotonNuevo1MouseClicked

    private void lblBotonInformacion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonInformacion1MouseClicked
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
        for(int i=0; i<tbClientes.getRowCount(); i++){
            if(tbClientes.isRowSelected(i)){
                codigoFinanciamiento= (int) tbClientes.getValueAt(i, 0);
                frmInFinanciamientoCarrosInfo.codigoDeFinanciamiento = codigoFinanciamiento;
                //Abrir el Formulario de Información
                frmInFinanciamientoCarrosInfo frmFinanciamientoCarros = new frmInFinanciamientoCarrosInfo();
                ancho = (jdpPantallaPrincipal.getWidth()/2) - frmFinanciamientoCarros.getWidth()/2;
                alto = (jdpPantallaPrincipal.getHeight()/2) - frmFinanciamientoCarros.getHeight()/2;

                jdpPantallaPrincipal.add(frmFinanciamientoCarros);
                frmFinanciamientoCarros.setLocation(ancho, alto);
                frmFinanciamientoCarros.show();
                break;   
           }
        }
    }//GEN-LAST:event_lblBotonInformacion1MouseClicked

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        //MAXIMIZA EL TAMA;O DE LA VENTANA DEPENDIENDO DE LA PANTALLA
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmInAgencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ELIMINA EL HEADER DEL FRAME
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }//GEN-LAST:event_formInternalFrameOpened

    private void lblRegistrarPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarPagoMouseClicked
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro para Registrar Pago");
            return;
        }
        //Abrir el Formulario de Información 
        // TOMAR LOS DATOS SELECCIONADOS
        for(int i=0; i<tbClientes.getRowCount(); i++){
            if(tbClientes.isRowSelected(i)){
                codigoFinanciamiento = (int) tbClientes.getValueAt(i, 0);
                numeroContrato = tbClientes.getValueAt(i, 2).toString();


                //SE MANDAN LOS DATOS SELECCIONADOS
                frmInFinanciamientoCarrosRegistrarPago.codigoFinanciamiento = codigoFinanciamiento;
                frmInFinanciamientoCarrosRegistrarPago.numeroContrato = numeroContrato;


                //Abrir el Formulario para Información de Carros
                frmInFinanciamientoCarrosRegistrarPago frmFinanciamientosPago = new frmInFinanciamientoCarrosRegistrarPago();
                ancho = (jdpPantallaPrincipal.getWidth()/2) - frmFinanciamientosPago.getWidth()/2;
                alto = (jdpPantallaPrincipal.getHeight()/2) - frmFinanciamientosPago.getHeight()/2;

                //ENVIAR EL PARAMETRO SELECCIONADOR

                jdpPantallaPrincipal.add(frmFinanciamientosPago);
                frmFinanciamientosPago.setLocation(ancho, alto);
                frmFinanciamientosPago.show();

                return;
            }
        }
    }//GEN-LAST:event_lblRegistrarPagoMouseClicked

    private void txtBuscarPorNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorNombre1KeyReleased
        // TODO add your handling code here:
        DefaultTableModel busquedaParametros;

        //SE TRASLADAN LOS PARÁMETRO---S DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaParametros = (DefaultTableModel) tbClientes.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaParametros);
        tbClientes.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtBuscarPorNombre1.getText().toUpperCase()));
    }//GEN-LAST:event_txtBuscarPorNombre1KeyReleased

    private void opVerHistorialCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opVerHistorialCreditoActionPerformed
        String numero_contrato = null;
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un registro para ver el historial");
            return;
        }
        
        //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
        for(int i=0; i<tbClientes.getRowCount(); i++){
            if(tbClientes.isRowSelected(i)){
                numero_contrato = String.valueOf(tbClientes.getValueAt(i, 2));
                try{
                    ConexionBD.Iniciar();
                    Map parametros = new HashMap();
                    parametros.clear();
                    parametros.put("ReportParameter_NumeroContrato", numero_contrato);
                    parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
                    JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportFinanciamientoCarros_HistorialDeCredito.jasper"));
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
                    JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                    jasperViewer.setVisible(true);
                    jasperViewer.setTitle("HISTORIAL DEL CRÉDITO");
                    ConexionBD.Finalizar();
                }catch(JRException e ){
                    ConexionBD.Finalizar();
                }
                break;   
           }
        }
    }//GEN-LAST:event_opVerHistorialCreditoActionPerformed

    private void opVerEstadoCuentaCreditoGerencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opVerEstadoCuentaCreditoGerencialActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String numero_contrato = null;
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un registro para ver el estado de cuenta");
            return;
        }
        
        //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
        for(int i=0; i<tbClientes.getRowCount(); i++){
            if(tbClientes.isRowSelected(i)){
                numero_contrato = String.valueOf(tbClientes.getValueAt(i, 2));
                try{
                    ConexionBD.Iniciar();
                    Map parametros = new HashMap();
                    parametros.clear();
                    parametros.put("ReportParameter_NumeroContrato", numero_contrato);
                    parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
                    JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportFinanciamientoCarros_EstadoCuenta.jasper"));
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
                    JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                    jasperViewer.setVisible(true);
                    jasperViewer.setTitle("ESTADO DE CUENTA DEL CRÉDITO");
                    ConexionBD.Finalizar();
                }catch(JRException e ){
                    ConexionBD.Finalizar();
                }
                break;   
           }
        }
    }//GEN-LAST:event_opVerEstadoCuentaCreditoGerencialActionPerformed

    private void opVerEstadoCuentaCreditoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opVerEstadoCuentaCreditoClienteActionPerformed
        // TODO add your handling code here:
        String numero_contrato = null;
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un registro para ver el estado de cuenta");
            return;
        }
        
        //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
        for(int i=0; i<tbClientes.getRowCount(); i++){
            if(tbClientes.isRowSelected(i)){
                numero_contrato = String.valueOf(tbClientes.getValueAt(i, 2));
                try{
                    ConexionBD.Iniciar();
                    Map parametros = new HashMap();
                    parametros.clear();
                    parametros.put("ReportParameter_NumeroContrato", numero_contrato);
                    parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
                    JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportFinanciamientoCarros_EstadoCuenta_Cliente.jasper"));
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
                    JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                    jasperViewer.setVisible(true);
                    jasperViewer.setTitle("ESTADO DE CUENTA DEL CRÉDITO");
                    ConexionBD.Finalizar();
                }catch(JRException e ){
                    ConexionBD.Finalizar();
                }
                break;   
           }
        }
    }//GEN-LAST:event_opVerEstadoCuentaCreditoClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBotonBuscarCliente1;
    private javax.swing.JLabel lblBotonInformacion1;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JLabel lblBotonNuevo1;
    private javax.swing.JLabel lblEstadoCuenta;
    private javax.swing.JLabel lblModuloCliente;
    private javax.swing.JLabel lblRegistrarPago;
    private javax.swing.JMenu opVerEstadoCuentaCredito;
    private javax.swing.JMenuItem opVerEstadoCuentaCreditoCliente;
    private javax.swing.JMenuItem opVerEstadoCuentaCreditoGerencial;
    private javax.swing.JMenuItem opVerHistorialCredito;
    public static javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtBuscarPorNombre1;
    // End of variables declaration//GEN-END:variables
}
