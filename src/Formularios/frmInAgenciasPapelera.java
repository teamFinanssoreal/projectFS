/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
import Clases.ClassAgencias;
import Clases.ClassMostrarAgencias;
import Clases.ClassMostrarAgenciasPapelera;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_Agencias;
import static Formularios.frmInAgenciasInfo.codigo_direccion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Martin Rosales
 */
public class frmInAgenciasPapelera extends javax.swing.JInternalFrame {
    String calleav;
    String numcas;
    String zona;
    /**
     * Creates new form frmInAgenciasPapelera
     */
    public frmInAgenciasPapelera() {
        initComponents();
        //DESPLIUEGA EL FRAME EN EL CENTRO DE LA PANTALLA
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
        //CONEXION
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarPapeleraAgencias(ConexionBaseDeDatos.ConexionBD_Agencias.mostrarTodoPapeleraAgencias());
        ConexionBaseDeDatos.ConexionBD.Finalizar();
    }
    
    //DEFINE LAS VARIABLES PARA RESTAURAR DATOS
    public static int codigo_a_eliminar_o_activar;
    public static boolean resultado_reincorporacion;
        
    //FUNCIÓN PARA MOSTRAR DATOS
    public void mostrarPapeleraAgencias(ResultSet estructuraTabla) {
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
            tbPapeleraAgencias.setModel(modelo);
            
            tbPapeleraAgencias.getColumnModel().getColumn(0).setPreferredWidth(75);
            tbPapeleraAgencias.getColumnModel().getColumn(0).setMaxWidth(90);
            tbPapeleraAgencias.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbPapeleraAgencias.getColumnModel().getColumn(1).setPreferredWidth(150);
            tbPapeleraAgencias.getColumnModel().getColumn(1).setMaxWidth(200);
            tbPapeleraAgencias.getColumnModel().getColumn(1).setMinWidth(5);
            
            tbPapeleraAgencias.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbPapeleraAgencias.getColumnModel().getColumn(2).setMaxWidth(125);
            tbPapeleraAgencias.getColumnModel().getColumn(2).setMinWidth(5);
            
            tbPapeleraAgencias.getColumnModel().getColumn(3).setPreferredWidth(150);
            tbPapeleraAgencias.getColumnModel().getColumn(3).setMaxWidth(200);
            tbPapeleraAgencias.getColumnModel().getColumn(3).setMinWidth(5);      
            
                     
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassMostrarAgenciasPapelera person = new ClassMostrarAgenciasPapelera( 
                        //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                        estructuraTabla.getInt("codigo"), 
                        estructuraTabla.getString("nombre_casa_comercial"), 
                        estructuraTabla.getString("telefono"), 
                        estructuraTabla.getString("correo_electronico"));
                        
                        
                // se añade el registro encontrado al modelo de la tabla
                modelo.addRow(
                    new Object[]{                   
                    person.getCodigo(),
                    person.getNombre_casa_comercial(),                   
                    person.getTelefono(),
                    person.getCorreo_electronico()});
            }

            //se muestra todo en la tabla
            tbPapeleraAgencias.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
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
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPapeleraCarrosBuscarPorPlaca = new javax.swing.JTextField();
        lblBotonBuscarCliente = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblBotonRestaurarCarro3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPapeleraAgencias = new javax.swing.JTable();
        lblBotonMoverFinal = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverInicio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finanssoreal.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(750, 605));
        setPreferredSize(new java.awt.Dimension(750, 605));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAPELERA DE RECICLAJE: REGISTROS DE AGENCIAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 100));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("BUSCAR PARÁMETROS:");

        txtPapeleraCarrosBuscarPorPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPapeleraCarrosBuscarPorPlacaKeyReleased(evt);
            }
        });

        lblBotonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N
        lblBotonBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonBuscarClienteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtPapeleraCarrosBuscarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblBotonBuscarCliente)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonBuscarCliente)
                    .addComponent(txtPapeleraCarrosBuscarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 130));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonRestaurarCarro3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonRestaurarCarro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_restore_50x50.png"))); // NOI18N
        lblBotonRestaurarCarro3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBotonRestaurarCarro3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonRestaurarCarro3MouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("RESTAURAR REGISTRO");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBotonRestaurarCarro3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(lblBotonRestaurarCarro3)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, 130));

        tbPapeleraAgencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE DE LA AGENCIA", "TELÉFONO", "CORREO ELECTRÓNICO"
            }
        ));
        jScrollPane1.setViewportView(tbPapeleraAgencias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 600, 200));

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N
        getContentPane().add(lblBotonMoverFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 500, -1, -1));

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N
        getContentPane().add(lblBotonMoverAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, -1, -1));

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N
        getContentPane().add(lblBotonMoverAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, -1, -1));

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N
        getContentPane().add(lblBotonMoverInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotonRestaurarCarro3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonRestaurarCarro3MouseClicked
        int fila = tbPapeleraAgencias.getSelectedRow();
        
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Restaurar");
            return;
        }
        for(int i=0; i<tbPapeleraAgencias.getRowCount(); i++){
            if(tbPapeleraAgencias.isRowSelected(i)){
                codigo_a_eliminar_o_activar = (int) tbPapeleraAgencias.getValueAt(i,0);
                break;
            }
        }
        int input = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres restaurar el registro?");
        if(input != 0)return; //SI NO SLECCIONA LA OPCIÓN "SI" AL MOMENTO DE SOLICITARLE LA CONFIRMACIÓN
        ConexionBD.Iniciar();
        resultado_reincorporacion = ConexionBD_Agencias.actualizarAgenciasPapelera("VIGENTE", codigo_a_eliminar_o_activar);
        ConexionBD.Finalizar();
        
        if(resultado_reincorporacion == false){
            JOptionPane.showMessageDialog(null, "Hubo un problema al intentar restaurar el registro seleccionado");
            return;
        }
        
        //ACTUALIZA LA TABLA PRINCIPAL DE LA PAPELERA.
        ConexionBD.Iniciar();
        actualizarTablaAgencias(ConexionBaseDeDatos.ConexionBD_Agencias.mostrarTodoAgencias());
        mostrarPapeleraAgencias(ConexionBD_Agencias.mostrarTodoPapeleraAgencias());
        JOptionPane.showMessageDialog(null, "El registro se ha restaurado exitosamente");
        ConexionBD.Finalizar();
        
        
    }//GEN-LAST:event_lblBotonRestaurarCarro3MouseClicked

    private void lblBotonBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonBuscarClienteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblBotonBuscarClienteMouseClicked

    private void txtPapeleraCarrosBuscarPorPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPapeleraCarrosBuscarPorPlacaKeyReleased
        //FILTRO PARA BUSQUEDA DENTRO DE LA  TABLA
        //SE CREA UNA VARIABLE DE TIPO DEFAULTABLEMODEL
        DefaultTableModel busquedaNombre;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaNombre = (DefaultTableModel) tbPapeleraAgencias.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaNombre);
        tbPapeleraAgencias.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtPapeleraCarrosBuscarPorPlaca.getText().toUpperCase()));
    }//GEN-LAST:event_txtPapeleraCarrosBuscarPorPlacaKeyReleased
    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {                                         
        ConexionBD.Iniciar();
        mostrarPapeleraAgencias(ConexionBD_Agencias.mostrarTodoPapeleraAgencias());
        ConexionBD.Finalizar();
    } 
    
    //FUNCIÓN PARA ACTUALIZAR LA TABLA PRINCIPAL DEL MÓDULO    
    private void actualizarTablaAgencias(ResultSet estructuraTabla) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            //Primero se Definen las Columnas
            modelo.addColumn("CODIGO");         
            modelo.addColumn("NOMBRE");
            modelo.addColumn("TELÉFONO");
            modelo.addColumn("CORREO ELECTRÓNICO");
            
            //se definen los tamaÃ±os de las columnas
            frmInAgencias.tbAgencias.setModel(modelo);
            
            frmInAgencias.tbAgencias.getColumnModel().getColumn(0).setPreferredWidth(275);
            frmInAgencias.tbAgencias.getColumnModel().getColumn(0).setMaxWidth(300);
            frmInAgencias.tbAgencias.getColumnModel().getColumn(0).setMinWidth(5);
            
            frmInAgencias.tbAgencias.getColumnModel().getColumn(1).setPreferredWidth(550);
            frmInAgencias.tbAgencias.getColumnModel().getColumn(1).setMaxWidth(600);
            frmInAgencias.tbAgencias.getColumnModel().getColumn(1).setMinWidth(5);
            
            frmInAgencias.tbAgencias.getColumnModel().getColumn(2).setPreferredWidth(300);
            frmInAgencias.tbAgencias.getColumnModel().getColumn(2).setMaxWidth(520);
            frmInAgencias.tbAgencias.getColumnModel().getColumn(2).setMinWidth(5);
            
            frmInAgencias.tbAgencias.getColumnModel().getColumn(3).setPreferredWidth(550);
            frmInAgencias.tbAgencias.getColumnModel().getColumn(3).setMaxWidth(600);
            frmInAgencias.tbAgencias.getColumnModel().getColumn(3).setMinWidth(5);        
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
            frmInAgencias.tbAgencias.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBotonBuscarCliente;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JLabel lblBotonRestaurarCarro3;
    private javax.swing.JTable tbPapeleraAgencias;
    private javax.swing.JTextField txtPapeleraCarrosBuscarPorPlaca;
    // End of variables declaration//GEN-END:variables
}
