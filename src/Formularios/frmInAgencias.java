/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ConexionBD;
import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.plaf.basic.BasicInternalFrameUI;
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
public class frmInAgencias extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmInAgencias
     */
    public frmInAgencias() {
        initComponents();
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModuloCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblBotonNuevo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBotonPapelera = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblBotonInformacion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBotonDarDeBaja = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblBotonMoverInicio = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverFinal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarPorNombre = new javax.swing.JTextField();
        lblBotonBuscarCliente = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblModuloCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_agency_mouseEntered.png"))); // NOI18N
        lblModuloCliente.setAlignmentX(80.0F);
        getContentPane().add(lblModuloCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 176, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 880, 310));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 183));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_add_50x50.png"))); // NOI18N
        lblBotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonNuevoMouseClicked(evt);
            }
        });
        jPanel2.add(lblBotonNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 10, -1, -1));

        jLabel5.setText("DAR DE BAJA");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 150, -1, -1));

        lblBotonPapelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_recicle_bin_noempty_50x50.png"))); // NOI18N
        lblBotonPapelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonPapeleraMouseClicked(evt);
            }
        });
        jPanel2.add(lblBotonPapelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 90, -1, -1));

        jLabel6.setText("INFORMACIÓN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 70, -1, -1));

        lblBotonInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_info_50x50.png"))); // NOI18N
        lblBotonInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonInformacionMouseClicked(evt);
            }
        });
        jPanel2.add(lblBotonInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 10, -1, -1));

        jLabel7.setText("PAPELERA");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 150, -1, -1));

        lblBotonDarDeBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_delete_50x50.png"))); // NOI18N
        jPanel2.add(lblBotonDarDeBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 90, -1, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUEVO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 340, 183));

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N
        getContentPane().add(lblBotonMoverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 610, -1, -1));

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N
        getContentPane().add(lblBotonMoverAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 620, -1, -1));

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N
        getContentPane().add(lblBotonMoverAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 620, -1, -1));

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N
        getContentPane().add(lblBotonMoverFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 610, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(509, 183));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("BUSCAR POR NOMBRE:");

        lblBotonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBotonBuscarCliente)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarCliente)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 509, 183));

        jMenu1.setText("REPORTES");

        jMenuItem1.setText("FICHA DE AGENCIA");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("MAS OPCIONES");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotonNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonNuevoMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario de Nuevo
        frmInAgenciasNuevo frmNuevo = new frmInAgenciasNuevo();
        frmPrincipal.jdpPantallaPrincipal.add(frmNuevo);
        frmNuevo.show();
    }//GEN-LAST:event_lblBotonNuevoMouseClicked

    private void lblBotonPapeleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonPapeleraMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario para Restaurar Cliente de Papelera
        frmInAgenciasPapelera frmPapelera = new frmInAgenciasPapelera();
        frmPrincipal.jdpPantallaPrincipal.add(frmPapelera);
        frmPapelera.show();
    }//GEN-LAST:event_lblBotonPapeleraMouseClicked

    private void lblBotonInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonInformacionMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario de Información
        frmInAgenciasInfo frmInfo = new frmInAgenciasInfo();
        frmPrincipal.jdpPantallaPrincipal.add(frmInfo);
        frmInfo.show();
    }//GEN-LAST:event_lblBotonInformacionMouseClicked

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int codigo = 1;
        try {
            
            ConexionBD.Iniciar();
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("ReportParameter_CodigoAgencia", codigo);
            parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
            parametros.put("HeaderMembretePNG", this.getClass().getResourceAsStream("/Imagenes/header_membrete_reporte.png"));
            parametros.put("FooterMembretePNG", this.getClass().getResourceAsStream("/Imagenes/footer_membrete_reporte.png"));
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportAgencia_FichaAgencia.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
            jasperViewer.setTitle("FICHA DE AGENCIAS");
            ConexionBD.Finalizar();
        } catch (JRException e) {
            ConexionBD.Finalizar();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBotonBuscarCliente;
    private javax.swing.JLabel lblBotonDarDeBaja;
    private javax.swing.JLabel lblBotonInformacion;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JLabel lblBotonNuevo;
    private javax.swing.JLabel lblBotonPapelera;
    private javax.swing.JLabel lblModuloCliente;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtBuscarPorNombre;
    // End of variables declaration//GEN-END:variables
}
