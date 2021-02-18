/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassMostrarClientes;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_Cliente;
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
 * @author alber
 */
public class frmInClientePapelera extends javax.swing.JInternalFrame {

    //VARIABLES GLOBALES
    //VARABLE PARA CONFIRMAR LA RESTAURACIÓN
    boolean restaurarCliente = false;
    
    //VARIABLE PARA DAR DE BAJA
    boolean darDeBaja = false;
    
    int codigo; //variable para obtener el codigo de un registro (ver más info y borrar)
    public frmInClientePapelera() {
        initComponents();
        //Conexion:
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarClientesPapelera(ConexionBaseDeDatos.ConexionBD_Cliente.mostrarTodoPapeleraClientes());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPapeleraBuscar = new javax.swing.JTextField();
        lblBotonBuscarCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBotonRestaurarCliente = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPapeleraClientes = new javax.swing.JTable();
        lblBotonMoverFinal = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverInicio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finanssoreal.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("BUSCAR PARÁMETROS:");

        txtPapeleraBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPapeleraBuscarKeyReleased(evt);
            }
        });

        lblBotonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPapeleraBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblBotonBuscarCliente)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPapeleraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonRestaurarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_restore_80x70.png"))); // NOI18N
        lblBotonRestaurarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonRestaurarClienteMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("RESTAURAR REGISTRO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblBotonRestaurarCliente))
                    .addComponent(jLabel7))
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(lblBotonRestaurarCliente)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(134, 185, 22));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAPELERA DE RECICLAJE: CLIENTES ELIMINADOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tbPapeleraClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPapeleraClientes);

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBotonMoverInicio)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverAtras)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverAdelante)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverFinal))
                    .addComponent(jScrollPane1))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonMoverFinal)
                    .addComponent(lblBotonMoverInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBotonMoverAtras, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBotonMoverAdelante, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mostrarClientesPapelera(ResultSet estructuraTabla) {
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
            tbPapeleraClientes.setModel(modelo);
            
            tbPapeleraClientes.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbPapeleraClientes.getColumnModel().getColumn(0).setMaxWidth(55);
            tbPapeleraClientes.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbPapeleraClientes.getColumnModel().getColumn(1).setPreferredWidth(100);
            tbPapeleraClientes.getColumnModel().getColumn(1).setMaxWidth(110);
            tbPapeleraClientes.getColumnModel().getColumn(1).setMinWidth(5);
            
            tbPapeleraClientes.getColumnModel().getColumn(2).setPreferredWidth(200);
            tbPapeleraClientes.getColumnModel().getColumn(2).setMaxWidth(205);
            tbPapeleraClientes.getColumnModel().getColumn(2).setMinWidth(5);
            
            tbPapeleraClientes.getColumnModel().getColumn(3).setPreferredWidth(70);
            tbPapeleraClientes.getColumnModel().getColumn(3).setMaxWidth(75);
            tbPapeleraClientes.getColumnModel().getColumn(3).setMinWidth(5);
            
            tbPapeleraClientes.getColumnModel().getColumn(4).setPreferredWidth(170);
            tbPapeleraClientes.getColumnModel().getColumn(4).setMaxWidth(175);
            tbPapeleraClientes.getColumnModel().getColumn(4).setMinWidth(5);
            
            /*tbClientes.getColumnModel().getColumn(5).setPreferredWidth(170);
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
            tbPapeleraClientes.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
            
    private void lblBotonRestaurarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonRestaurarClienteMouseClicked
        //BOTÓN PARA DAR DE BAJA
                
        int fila = tbPapeleraClientes.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
                for(int i=0; i<tbPapeleraClientes.getRowCount(); i++){
                if(tbPapeleraClientes.isRowSelected(i)){
                codigo = (int) tbPapeleraClientes.getValueAt(i, 0);
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de restaurar los datos?", "RESTAURAR", JOptionPane.YES_NO_OPTION);
        
                if(respuesta == 0){
                    ConexionBD.Iniciar();
                    restaurarCliente = ConexionBD_Cliente.restaurarCliente("VIGENTE", codigo);
                    ConexionBD.Finalizar();

                    //VERIFICAR SI SE DIO DE BAJA
                    if(restaurarCliente == true){
                        JOptionPane.showMessageDialog(null, "DATOS RESTAURADOS", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                        //ACTUALIZA LA TABLA PRINCIPAL
                        ConexionBaseDeDatos.ConexionBD.Iniciar();
                        actualizarTablaClientes(ConexionBaseDeDatos.ConexionBD_Cliente.mostrarTodoClientes());
                        ConexionBaseDeDatos.ConexionBD.Finalizar();
                    }else{
                        JOptionPane.showMessageDialog(null, "HUBU UN ERROR AL RESTAURAR", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }            
                }
                
                break;   
           }
        }
        
    }//GEN-LAST:event_lblBotonRestaurarClienteMouseClicked

    private void txtPapeleraBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPapeleraBuscarKeyReleased
        // TODO add your handling code here:
                // TODO add your handling code here:
        DefaultTableModel busquedaDPI;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaDPI = (DefaultTableModel) tbPapeleraClientes.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaDPI);
        tbPapeleraClientes.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtPapeleraBuscar.getText().toUpperCase()));
    }//GEN-LAST:event_txtPapeleraBuscarKeyReleased

    
    //ACTUALIZAR LA TABLA PRINCIPAL DE CLIENTES
    private void actualizarTablaClientes(ResultSet estructuraTabla) {
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
            frmInClientes.tbClientes.setModel(modelo);
            
            frmInClientes.tbClientes.getColumnModel().getColumn(0).setPreferredWidth(100);
            frmInClientes.tbClientes.getColumnModel().getColumn(0).setMaxWidth(110);
            frmInClientes.tbClientes.getColumnModel().getColumn(0).setMinWidth(5);
            
            frmInClientes.tbClientes.getColumnModel().getColumn(1).setPreferredWidth(120);
            frmInClientes.tbClientes.getColumnModel().getColumn(1).setMaxWidth(130);
            frmInClientes.tbClientes.getColumnModel().getColumn(1).setMinWidth(5);
            
            frmInClientes.tbClientes.getColumnModel().getColumn(2).setPreferredWidth(300);
            frmInClientes.tbClientes.getColumnModel().getColumn(2).setMaxWidth(310);
            frmInClientes.tbClientes.getColumnModel().getColumn(2).setMinWidth(5);
            
            frmInClientes.tbClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            frmInClientes.tbClientes.getColumnModel().getColumn(3).setMaxWidth(110);
            frmInClientes.tbClientes.getColumnModel().getColumn(3).setMinWidth(5);
            
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
            frmInClientes.tbClientes.setModel(modelo);

            
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBotonBuscarCliente;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JLabel lblBotonRestaurarCliente;
    private javax.swing.JTable tbPapeleraClientes;
    private javax.swing.JTextField txtPapeleraBuscar;
    // End of variables declaration//GEN-END:variables
}
