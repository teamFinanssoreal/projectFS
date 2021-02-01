/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassMostrarClientes;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_Cliente;
import static Formularios.frmPrincipal.jdpPantallaPrincipal;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
 * @author Alberto
 */
public class frmInClientes extends javax.swing.JInternalFrame {
    
    
    //VARIABLES GLOBALES
    //Variables para Posicionar los Internal Frames de Clientes
    int ancho, alto;
    
    //VARIABLE PARA DAR DE BAJA
    boolean darDeBaja = false;
    
    int codigo; //variable para obtener el codigo de un registro (ver más info y borrar)
    
    //VARIABLE PARA ACTUALIZAR LA TABLA AUTOMÁTICAMENTE
    public static boolean actualizarTabla = false;
    Timer timer = new Timer (1000, new ActionListener (){
            public void actionPerformed(ActionEvent e)
            {
                // Aquí el código que queramos ejecutar.
                if(actualizarTabla==true){
                    //ACTUALIZA LA TABLA PRINCIPAL
                    ConexionBaseDeDatos.ConexionBD.Iniciar();
                    mostrarDatos(ConexionBaseDeDatos.ConexionBD_Cliente.mostrarTodoClientes());
                    ConexionBaseDeDatos.ConexionBD.Finalizar();
                    actualizarTabla=false;
                }
             }
    });
    
   public frmInClientes() {
        initComponents(); 
        
        //ELIMINA EL HEADER DEL FORMULARIO INTERNO
        BasicInternalFrameUI frmInUI = (BasicInternalFrameUI) this.getUI();
        frmInUI.setNorthPane(null);
        
        //Conexion:
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarDatos(ConexionBaseDeDatos.ConexionBD_Cliente.mostrarTodoClientes());
        ConexionBaseDeDatos.ConexionBD.Finalizar();
        
        timer.start();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarPorDPI = new javax.swing.JTextField();
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
        lblModuloCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        lblBotonMoverInicio = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverFinal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("CLIENTES");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(974, 665));
        setPreferredSize(new java.awt.Dimension(974, 665));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("BUSCAR PARÁMETROS:");

        txtBuscarPorDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPorDPIKeyReleased(evt);
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtBuscarPorDPI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBotonBuscarCliente)
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPorDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_add_50x50.png"))); // NOI18N
        lblBotonNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonNuevoMouseClicked(evt);
            }
        });

        jLabel5.setText("DAR DE BAJA");

        lblBotonPapelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_recicle_bin_noempty_50x50.png"))); // NOI18N
        lblBotonPapelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonPapeleraMouseClicked(evt);
            }
        });

        jLabel6.setText("INFORMACIÓN");

        lblBotonInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_info_50x50.png"))); // NOI18N
        lblBotonInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonInformacionMouseClicked(evt);
            }
        });

        jLabel7.setText("PAPELERA");

        lblBotonDarDeBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_delete_50x50.png"))); // NOI18N
        lblBotonDarDeBaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonDarDeBajaMouseClicked(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUEVO");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBotonNuevo)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBotonDarDeBaja))
                        .addGap(13, 13, 13))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonPapelera)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonInformacion)
                        .addGap(16, 16, 16)))
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonInformacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBotonPapelera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBotonDarDeBaja)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13))
        );

        lblModuloCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_client_mouseEntered.png"))); // NOI18N
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
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbClientes);

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N

        jMenu1.setText("REPORTES");

        jMenuItem2.setText("FICHA DE CLIENTE");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("MÁS OPCIONES");

        jMenuItem1.setText("OPCIÓN 1");
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblBotonMoverInicio)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverAtras)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverAdelante)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverFinal))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblModuloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(32, 32, 32)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblModuloCliente)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonMoverFinal)
                    .addComponent(lblBotonMoverInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBotonMoverAtras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBotonMoverAdelante, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
    boolean resultado_eliminacion = false, resultado_reincorporacion = false;
    int codigo_personal_para_ver_informacion;
    int codigo_a_eliminar_o_reactivar;
    String matriz[][];
        
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
            modelo.addColumn("DPI");
            modelo.addColumn("NOMBRES Y APELLIDOS");
            //modelo.addColumn("Fecha Nac.");
            modelo.addColumn("TELÉFONO");
            modelo.addColumn("CORREO ELECTRÓNICO");
            //modelo.addColumn("Direccion");
            //modelo.addColumn("Tipo Serv.");
            
            //se definen los tamaños de las columnas
            tbClientes.setModel(modelo);
            
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbClientes.getColumnModel().getColumn(0).setMaxWidth(110);
            tbClientes.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(1).setPreferredWidth(120);
            tbClientes.getColumnModel().getColumn(1).setMaxWidth(130);
            tbClientes.getColumnModel().getColumn(1).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(2).setPreferredWidth(300);
            tbClientes.getColumnModel().getColumn(2).setMaxWidth(310);
            tbClientes.getColumnModel().getColumn(2).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbClientes.getColumnModel().getColumn(3).setMaxWidth(110);
            tbClientes.getColumnModel().getColumn(3).setMinWidth(5);
            
            /*tbClientes.getColumnModel().getColumn(4).setPreferredWidth(80);
            tbClientes.getColumnModel().getColumn(4).setMaxWidth(110);
            tbClientes.getColumnModel().getColumn(4).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(5).setPreferredWidth(170);
            tbClientes.getColumnModel().getColumn(5).setMaxWidth(200);
            tbClientes.getColumnModel().getColumn(5).setMinWidth(5);
            
            tbClientes.getColumnModel().getColumn(6).setPreferredWidth(80);
            tbClientes.getColumnModel().getColumn(6).setMaxWidth(110);
            tbClientes.getColumnModel().getColumn(6).setMinWidth(5);*/
            
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassMostrarClientes usuario = new ClassMostrarClientes( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                    estructuraTabla.getInt("codigo"),
                    estructuraTabla.getString("dpi"),
                    estructuraTabla.getString("nombre"), 
                    estructuraTabla.getString("telefono"), 
                    estructuraTabla.getString("correo_electronico"));

                // se añade el registro encontrado al modelo de la tabla
                modelo.addRow(new Object[]{
                    usuario.getCodigo(),                  
                    usuario.getDpi(),
                    usuario.getNombre(),
                    usuario.getTelefono(),
                    usuario.getCorreo_electronico()});
            }

            
            //se muestra todo en la tabla
            tbClientes.setModel(modelo);

            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    private void lblBotonNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonNuevoMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario de Nuevo
        frmInClienteNuevo frmClientesNuevo = new frmInClienteNuevo();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmClientesNuevo.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmClientesNuevo.getHeight()/2;
        
        jdpPantallaPrincipal.add(frmClientesNuevo);
        frmClientesNuevo.setLocation(ancho, alto);
        frmClientesNuevo.show();
    }//GEN-LAST:event_lblBotonNuevoMouseClicked

    private void lblBotonInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonInformacionMouseClicked
        // TODO add your handling code here:
        
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
                for(int i=0; i<tbClientes.getRowCount(); i++){
                if(tbClientes.isRowSelected(i)){
                codigo = (int) tbClientes.getValueAt(i, 0);
                frmInClienteInformacion.codigo_cliente = codigo;
                //Abrir el Formulario de Información
                frmInClienteInformacion frmClientesInformacion = new frmInClienteInformacion();
                ancho = (jdpPantallaPrincipal.getWidth()/2) - frmClientesInformacion.getWidth()/2;
                alto = (jdpPantallaPrincipal.getHeight()/2) - frmClientesInformacion.getHeight()/2;

                jdpPantallaPrincipal.add(frmClientesInformacion);
                frmClientesInformacion.setLocation(ancho, alto);
                frmClientesInformacion.show();
                break;   
           }
        }
        
       
    }//GEN-LAST:event_lblBotonInformacionMouseClicked

    private void lblBotonPapeleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonPapeleraMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario para Restaurar Cliente de Papelera
        frmInClientePapelera frmClientesPapelera = new frmInClientePapelera();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmClientesPapelera.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmClientesPapelera.getHeight()/2;
        
        jdpPantallaPrincipal.add(frmClientesPapelera);
        frmClientesPapelera.setLocation(ancho, alto);
        frmClientesPapelera.show();
    }//GEN-LAST:event_lblBotonPapeleraMouseClicked

    private void lblBotonDarDeBajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonDarDeBajaMouseClicked
        //BOTÓN PARA DAR DE BAJA
        
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
                for(int i=0; i<tbClientes.getRowCount(); i++){
                if(tbClientes.isRowSelected(i)){
                codigo = (int) tbClientes.getValueAt(i, 0);
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de dar de baja a dato?", "Dar de Baja", JOptionPane.YES_NO_OPTION);
        
                if(respuesta == 0){
                    ConexionBD.Iniciar();
                    darDeBaja = ConexionBD_Cliente.darDeBajaACliente("ELIMINADO", codigo);
                    ConexionBD.Finalizar();

                    //VERIFICAR SI SE DIO DE BAJA
                    if(darDeBaja == true){
                        JOptionPane.showMessageDialog(null, "DATOS DADOS DE BAJA", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "HUBU UN ERROR AL DAR DE BAJA", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }            
                }
                
                break;   
           }
        }
        
        
    }//GEN-LAST:event_lblBotonDarDeBajaMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        
        
        int fila = tbClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        
        //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
        for(int i=0; i<tbClientes.getRowCount(); i++){
            if(tbClientes.isRowSelected(i)){
                codigo = (int) tbClientes.getValueAt(i, 0);
                try{
                    ConexionBD.Iniciar();
                    Map parametros = new HashMap();
                    parametros.clear();
                    parametros.put("RerportParameter_CodigoCliente", codigo);
                    parametros.put("FooterMembretePNG", this.getClass().getResourceAsStream("/Imagenes/footer_membrete_reporte.png"));
                    parametros.put("HeaderMembretePNG", this.getClass().getResourceAsStream("/Imagenes/header_membrete_reporte.png"));
                    parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
                    JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportCliente_FichaCliente.jasper"));
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
                    JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                    jasperViewer.setVisible(true);
                    jasperViewer.setTitle("FICHA DE CLIENTE");
                    ConexionBD.Finalizar();
                }catch(JRException e ){
                    ConexionBD.Finalizar();
                }
                break;   
           }
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtBuscarPorDPIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorDPIKeyReleased

        DefaultTableModel busquedaDPI;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaDPI = (DefaultTableModel) tbClientes.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaDPI);
        tbClientes.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtBuscarPorDPI.getText().toUpperCase()));
    }//GEN-LAST:event_txtBuscarPorDPIKeyReleased

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbClientesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
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
    private javax.swing.JTextField txtBuscarPorDPI;
    // End of variables declaration//GEN-END:variables
}
