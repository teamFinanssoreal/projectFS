/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassMostrarAgencias;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_Agencias;
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

//

import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Martin Rosales
 */
public class frmInAgencias extends javax.swing.JInternalFrame {
int codigo;
    /**
     * Creates new form frmInAgencias
     */

        public frmInAgencias() {
        initComponents();
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarDatos(ConexionBaseDeDatos.ConexionBD_Agencias.mostrarTodoAgencias());
        ConexionBaseDeDatos.ConexionBD.Finalizar();
    }
    //DEFINE LAS VARIABLES PARA RESTAURAR DATOS
        public static int codigo_a_eliminar_o_activar;
        public static boolean resultado_reincorporacion;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModuloCliente = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarPorNombre = new javax.swing.JTextField();
        lblBotonBuscarCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBotonNuevo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBotonPapelera = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblBotonInformacion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBotonDarDeBaja = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgencias = new javax.swing.JTable();
        lblBotonMoverInicio = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverFinal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opFichaAgencia = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finanssoreal.png"))); // NOI18N
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

        lblModuloCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_agency_mouseEntered.png"))); // NOI18N
        lblModuloCliente.setAlignmentX(80.0F);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(509, 183));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("BUSCAR PARÁMETROS:");

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
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(199, 199, 199))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscarPorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBotonBuscarCliente)
                        .addGap(64, 64, 64))))
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(260, 183));

        lblBotonNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_add_50x50.png"))); // NOI18N
        lblBotonNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonNuevoMouseClicked(evt);
            }
        });

        jLabel5.setText("DAR DE BAJA");

        lblBotonPapelera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonPapelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_recicle_bin_noempty_50x50.png"))); // NOI18N
        lblBotonPapelera.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotonPapelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonPapeleraMouseClicked(evt);
            }
        });

        jLabel6.setText("INFORMACIÓN");

        lblBotonInformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_info_50x50.png"))); // NOI18N
        lblBotonInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotonInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonInformacionMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PAPELERA");

        lblBotonDarDeBaja.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonDarDeBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_delete_50x50.png"))); // NOI18N
        lblBotonDarDeBaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotonDarDeBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonDarDeBajaMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUEVO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBotonNuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBotonDarDeBaja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBotonInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBotonPapelera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonNuevo)
                    .addComponent(lblBotonInformacion))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonDarDeBaja)
                    .addComponent(lblBotonPapelera))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)))
        );

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

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        jMenu1.setText("REPORTES");

        opFichaAgencia.setText("FICHA DE AGENCIA");
        opFichaAgencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFichaAgenciaActionPerformed(evt);
            }
        });
        jMenu1.add(opFichaAgencia);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("MAS OPCIONES");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(lblModuloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBotonMoverInicio)
                        .addGap(16, 16, 16)
                        .addComponent(lblBotonMoverAtras)
                        .addGap(20, 20, 20)
                        .addComponent(lblBotonMoverAdelante)
                        .addGap(10, 10, 10)
                        .addComponent(lblBotonMoverFinal))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1))
                            .addComponent(jScrollPane1))))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloCliente)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonMoverInicio)
                    .addComponent(lblBotonMoverFinal)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBotonMoverAtras)
                            .addComponent(lblBotonMoverAdelante))))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void actualizarDatosdesdeFuera (){
        ConexionBD.Iniciar();
        mostrarDatos(ConexionBD_Agencias.mostrarTodoAgencias());
        ConexionBD.Finalizar();
    }
    private void mostrarDatos(ResultSet estructuraTabla) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int filas, int columnas){
                    if(columnas == 4){
                        return true;
                    }else{
                        return false;
                    }
                }
            };
            //Primero se Definen las Columnas
            modelo.addColumn("CODIGO");         
            modelo.addColumn("NOMBRE");
            modelo.addColumn("TELÉFONO");
            modelo.addColumn("CORREO ELECTRÓNICO");
            
            //se definen los tamaÃ±os de las columnas
            tbAgencias.setModel(modelo);
            
           tbAgencias.getColumnModel().getColumn(0).setPreferredWidth(275);
           tbAgencias.getColumnModel().getColumn(0).setMaxWidth(300);
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
                modelo.addRow(new Object[]{
                   
                    person.getCodigo(),
                    person.getNombre_casa_comercial(),                   
                    person.getTelefono(),
                    person.getCorreo_electronico()});
            }

            //se muestra todo en la tabla
            tbAgencias.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
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

    private void opFichaAgenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFichaAgenciaActionPerformed
        // TODO add your handling code here:
        
        //SI NO SELECCIONA UN REGISTRO DE LA TABLA, DETIENE LA EJECUCIÓN DEL CODIGO
        int fila = tbAgencias.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        
        //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
        for(int i=0; i<tbAgencias.getRowCount(); i++){
            if(tbAgencias.isRowSelected(i)){
                codigo = (int) tbAgencias.getValueAt(i, 0);
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
                break;   
           }
        }
        
    }//GEN-LAST:event_opFichaAgenciaActionPerformed

    private void txtBuscarPorNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorNombreKeyReleased
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
        int fila = tbAgencias.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
                for(int i=0; i<tbAgencias.getRowCount(); i++){
                if(tbAgencias.isRowSelected(i)){
                codigo = (int) tbAgencias.getValueAt(i, 0);
                //DETERMINA QUE FORMULARIO DESPLEGO ESTE INTERNAL FRAME
                frmInAgenciasInfo.codigo_agencia = codigo;
                frmInAgenciasInfo frmInfo = new frmInAgenciasInfo();
                frmPrincipal.jdpPantallaPrincipal.add(frmInfo);
                frmInfo.show();
                break;   
           }
        }
    }//GEN-LAST:event_lblBotonInformacionMouseClicked

    private void lblBotonDarDeBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonDarDeBajaMouseClicked
        int fila = tbAgencias.getSelectedRow();

        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Eliminar");
            return;
        }
        for(int i=0; i<tbAgencias.getRowCount(); i++){
            if(tbAgencias.isRowSelected(i)){
                codigo_a_eliminar_o_activar = (int) tbAgencias.getValueAt(i,0);
                break;
            }
        }
        int input = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro?");
        if (input==0){
            ConexionBD.Iniciar();
            resultado_reincorporacion = ConexionBD_Agencias.actualizarAgenciasPapelera("ELIMINADO", codigo_a_eliminar_o_activar);
            mostrarDatos(ConexionBD_Agencias.mostrarTodoAgencias());
            ConexionBD.Finalizar();
        }else{
            if (resultado_reincorporacion == false){
                JOptionPane.showMessageDialog(null,"Hubo un problema al intentar restaurar el registro seleccionado, pruebe de nuevo o contacte a soporte tecnico");
                return;
            }else if(resultado_reincorporacion == true){
                //ACTUALIZA LA TABLA PRINCIPAL
                ConexionBaseDeDatos.ConexionBD.Iniciar();
                mostrarDatos(ConexionBaseDeDatos.ConexionBD_Agencias.mostrarTodoAgencias());
                ConexionBaseDeDatos.ConexionBD.Finalizar();
                JOptionPane.showMessageDialog(null,"Registro dado de baja exitosamente");
            }
        }
    }//GEN-LAST:event_lblBotonDarDeBajaMouseClicked

    

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
    private javax.swing.JMenuItem opFichaAgencia;
    public static javax.swing.JTable tbAgencias;
    private javax.swing.JTextField txtBuscarPorNombre;
    // End of variables declaration//GEN-END:variables
}
