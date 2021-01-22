/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassFinanciamientoCarro_LlenarTabla;
import Clases.ClassFinanciamientoMoto_LlenarTabla;
import java.beans.PropertyVetoException;
import java.sql.ResultSet;
import java.sql.SQLException;
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
public class frmInFinanciamientoMotos extends javax.swing.JInternalFrame {
    String codigo;
    int codigoFinanciamiento;
    String numContrato;
    /**
     * Creates new form frmInFinanciamientoMotos
     */
    public frmInFinanciamientoMotos() { //--------------------CLASE PRINCIPAL 
        initComponents();
        //DESPLIEGA EL FRAME EN EL CENTRO DE LA PANTALLA
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);;
        
        //ELIMINA EL HEADER DEL FORMULARIO INTERNO
        BasicInternalFrameUI frmInUI = (BasicInternalFrameUI) this.getUI();
        frmInUI.setNorthPane(null);
        
        //Conexion:
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarDatos(ConexionBaseDeDatos.ConexionBD_FinanciamientoMotos.mostrarTodoFinanciamientoMotos());
        ConexionBaseDeDatos.ConexionBD.Finalizar();
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
        jLabel5 = new javax.swing.JLabel();
        lblEstadoCuenta = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblRegistrarPago = new javax.swing.JLabel();
        lblBotonMoverInicio = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverFinal = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblBotonBuscarCliente1 = new javax.swing.JLabel();
        txtBuscarPorNombre1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblNuevo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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

        lblModuloCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_moto_mouseEntered.png"))); // NOI18N
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

        jLabel5.setText("REGISTRAR PAGO");

        lblEstadoCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_history_50x50.png"))); // NOI18N
        lblEstadoCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEstadoCuentaMouseClicked(evt);
            }
        });

        jLabel7.setText("REGISTRAR LIQUIDACION");

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
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblEstadoCuenta)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblRegistrarPago)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(64, 64, 64))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRegistrarPago)
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstadoCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonBuscarCliente1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N

        txtBuscarPorNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPorNombre1KeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("BUSCAR PARÁMETROS:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtBuscarPorNombre1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBotonBuscarCliente1)))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel8)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPorNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarCliente1))
                .addGap(69, 69, 69))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_add_50x50.png"))); // NOI18N
        lblNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNuevoMouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("NUEVO");

        jLabel11.setText("INFORMACIÓN");

        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_info_50x50.png"))); // NOI18N
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNuevo)
                        .addGap(40, 40, 40)
                        .addComponent(lblInfo))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel11)))
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNuevo)
                    .addComponent(lblInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("REPORTES");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("MAS OPCIONES");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBotonMoverInicio)
                .addGap(16, 16, 16)
                .addComponent(lblBotonMoverAtras)
                .addGap(20, 20, 20)
                .addComponent(lblBotonMoverAdelante)
                .addGap(10, 10, 10)
                .addComponent(lblBotonMoverFinal)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(82, 82, 82))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblModuloCliente)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloCliente)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonMoverInicio)
                    .addComponent(lblBotonMoverFinal)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBotonMoverAtras)
                            .addComponent(lblBotonMoverAdelante))))
                .addGap(16, 16, 16))
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
                ClassFinanciamientoMoto_LlenarTabla usuario = new ClassFinanciamientoMoto_LlenarTabla ( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
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
    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(frmInAgencias.class.getName()).log(Level.SEVERE, null, ex);
        }
        //ELIMINA EL HEADER DEL FRAME
        BasicInternalFrameUI bui = (BasicInternalFrameUI) this.getUI();
        bui.setNorthPane(null);
    }//GEN-LAST:event_formInternalFrameOpened

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
                codigoFinanciamiento =  (int) tbClientes.getValueAt(i, 0);
                numContrato =  tbClientes.getValueAt(i, 2).toString();
                //DETERMINA QUE FORMULARIO DESPLEGO ESTE INTERNAL FRAME
                frmInFinanciamientoMotosRegistrarLiquidacion.codigo_financiamiento = codigoFinanciamiento;
                frmInFinanciamientoMotosRegistrarPago.numeroContrato = numContrato;
                frmInFinanciamientoMotosRegistrarLiquidacion frmLiquidacion = new frmInFinanciamientoMotosRegistrarLiquidacion();
                frmPrincipal.jdpPantallaPrincipal.add(frmLiquidacion);
                frmLiquidacion.show();
                break;   
           }
        }
        
    }//GEN-LAST:event_lblEstadoCuentaMouseClicked

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
                codigoFinanciamiento =  (int) tbClientes.getValueAt(i, 0);
                numContrato =  tbClientes.getValueAt(i, 2).toString();
                //DETERMINA QUE FORMULARIO DESPLEGO ESTE INTERNAL FRAME
                frmInFinanciamientoMotosRegistrarPago.codigo_financiamiento = codigoFinanciamiento;
                frmInFinanciamientoMotosRegistrarPago.numeroContrato = numContrato;
                frmInFinanciamientoMotosRegistrarPago frmRegistrarPago = new frmInFinanciamientoMotosRegistrarPago();
                frmPrincipal.jdpPantallaPrincipal.add(frmRegistrarPago);
                frmRegistrarPago.show();
                break;   
           }
        }
        
    }//GEN-LAST:event_lblRegistrarPagoMouseClicked

    private void lblNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNuevoMouseClicked
        frmInFinanciamientoMotosNuevo frmNuevo = new frmInFinanciamientoMotosNuevo();
        frmPrincipal.jdpPantallaPrincipal.add(frmNuevo);
        frmNuevo.show();
    }//GEN-LAST:event_lblNuevoMouseClicked

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro para Ver Informacion");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
                for(int i=0; i<tbClientes.getRowCount(); i++){
                if(tbClientes.isRowSelected(i)){
                codigo =  (String) tbClientes.getValueAt(i, 2);
                //DETERMINA QUE FORMULARIO DESPLEGO ESTE INTERNAL FRAME
                frmInFinanciamientoMotosInfo.codigo_agencia = codigo;
                frmInFinanciamientoMotosInfo frmInfo = new frmInFinanciamientoMotosInfo();
                frmPrincipal.jdpPantallaPrincipal.add(frmInfo);
                frmInfo.show();
                break;   
           }
        }
    }//GEN-LAST:event_lblInfoMouseClicked

    private void txtBuscarPorNombre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorNombre1KeyReleased
                    // TODO add your handling code here:
        DefaultTableModel busquedaParametros;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaParametros = (DefaultTableModel) tbClientes.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaParametros);
        tbClientes.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtBuscarPorNombre1.getText().toUpperCase()));
    }//GEN-LAST:event_txtBuscarPorNombre1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBotonBuscarCliente1;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JLabel lblEstadoCuenta;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblModuloCliente;
    private javax.swing.JLabel lblNuevo;
    private javax.swing.JLabel lblRegistrarPago;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTextField txtBuscarPorNombre1;
    // End of variables declaration//GEN-END:variables
}
