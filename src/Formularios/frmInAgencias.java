/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassAgencias;
import Clases.ClassMostrarAgencias;
import Clases.ConexionBD;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


/**
 *
 * @author Martin Rosales
 */
public class frmInAgencias extends javax.swing.JInternalFrame {
    /**
     * Creates new form frmInAgencias
     */
    //VARIABLES GLOBALES
    //Variables para Posicionar los Internal Frames de Clientes
    int ancho, alto;
    //Private Paginador<TAgencias> _paginadorClientes;
    
    public frmInAgencias() {
        initComponents();
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
        ConexionBD.Iniciar();
        mostrarDatos(ConexionBD.mostrarTodoAgencias());
        ConexionBD.Finalizar();
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
        tbAgencias = new javax.swing.JTable();
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

        tbAgencias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAgencias);

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
        jLabel3.setText("BÚSQUEDA GENERAL:");

        txtBuscarPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarPorNombreActionPerformed(evt);
            }
        });
        txtBuscarPorNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPorNombreKeyReleased(evt);
            }
        });

        lblBotonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonBuscarCliente)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarCliente)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 510, 183));

        jMenu1.setText("REPORTES");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("MAS OPCIONES");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        boolean resultado_eliminacion = false, resultado_reincorporacion = false;
        int codigo_personal_para_ver_informacion;
        int codigo_a_eliminar_o_reactivar;
        String matriz[][];
            
        private void mostrarDatos(ResultSet estructuraTabla) {
               //mostrar datos
            try {
            DefaultTableModel modelo = new DefaultTableModel();
            //Primero se Definen las Columnas
            modelo.addColumn("Código");         
            modelo.addColumn("Nombre de casa comercial");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Correo Electrónico");
            
            
            //se definen los tamaños de las columnas
            tbAgencias.setModel(modelo);
            
            tbAgencias.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbAgencias.getColumnModel().getColumn(0).setMaxWidth(120);
            tbAgencias.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbAgencias.getColumnModel().getColumn(1).setPreferredWidth(550);
            tbAgencias.getColumnModel().getColumn(1).setMaxWidth(600);
            tbAgencias.getColumnModel().getColumn(1).setMinWidth(5);
            
            tbAgencias.getColumnModel().getColumn(2).setPreferredWidth(300);
            tbAgencias.getColumnModel().getColumn(2).setMaxWidth(520);
            tbAgencias.getColumnModel().getColumn(2).setMinWidth(5);
            
            tbAgencias.getColumnModel().getColumn(3).setPreferredWidth(550);
            tbAgencias.getColumnModel().getColumn(3).setMaxWidth(600);
            tbAgencias.getColumnModel().getColumn(3).setMinWidth(5);        
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            
            while (estructuraTabla.next()) { 
                
            
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassMostrarAgencias person = new ClassMostrarAgencias( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                        estructuraTabla.getInt("codigo"),
                        estructuraTabla.getString("nombre_casa_comercial"), 
                        estructuraTabla.getString("telefono"), 
                        estructuraTabla.getString("correo_electronico"));
            
                // se aÃ±ade el registro encontrado al modelo de la tabla
                modelo.addRow(new Object[]{person.getCodigo(),
                    person.getNombre_casa_comercial(),                   
                    person.getTelefono(),
                    person.getCorreo_electronico()});
            }

            //se muestra todo en la tabla
            tbAgencias.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
        
        
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

    private void txtBuscarPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarPorNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarPorNombreActionPerformed

    private void txtBuscarPorNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorNombreKeyReleased
        // TODO add your handling code here:
        // FILTRO PARA BUSQUEDA DENTRO DE LA  TABLA
        //SE CREA UNA VARIABLE DE TIPO DEFAULTABLEMODEL
        DefaultTableModel busquedaNombre;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaNombre = (DefaultTableModel) tbAgencias.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaNombre);
        tbAgencias.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtBuscarPorNombre.getText().toUpperCase()));
    }//GEN-LAST:event_txtBuscarPorNombreKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
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
    private javax.swing.JTable tbAgencias;
    private javax.swing.JTextField txtBuscarPorNombre;
    // End of variables declaration//GEN-END:variables
}
