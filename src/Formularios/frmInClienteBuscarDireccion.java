/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassBuscarDireccion;
import Clases.ConexionBD;
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
public class frmInClienteBuscarDireccion extends javax.swing.JInternalFrame {

    //VARIABLES GLOBALES
    int codigo;
    String direccion;
    
    //VARIABLES GLOBALES PUBLICAS
    public static boolean comparador;
    
    public frmInClienteBuscarDireccion() {
        initComponents();
        
        ConexionBD.Iniciar();
        mostrarDatos(ConexionBD.mostrarTodoDireccion());
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDireccionCliente = new javax.swing.JTable();
        txtBuscarPorFiltrado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblBotonBuscarCliente = new javax.swing.JLabel();
        lblBotonMoverInicio = new javax.swing.JLabel();
        lblBotonMoverAtras1 = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverFinal = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBotonAceptar = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jPanel3.setBackground(new java.awt.Color(134, 185, 22));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSCAR DIRECCIÓN CLIENTE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(147, 147, 147))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tbDireccionCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbDireccionCliente);

        txtBuscarPorFiltrado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPorFiltradoKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("FILTRADO DE INFORMACIÓN:");

        lblBotonBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        lblBotonMoverAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        lblBotonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_accept_25x25.png"))); // NOI18N
        lblBotonAceptar.setText("ACEPTAR");
        lblBotonAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblBotonAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonAceptarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(lblBotonMoverInicio)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverAtras1)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverAdelante)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverFinal))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscarPorFiltrado)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonBuscarCliente))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBotonAceptar)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBotonAceptar)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBuscarPorFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBotonBuscarCliente))
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBotonMoverFinal)
                            .addComponent(lblBotonMoverInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBotonMoverAtras1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBotonMoverAdelante, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(19, 19, 19))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
    private void txtBuscarPorFiltradoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorFiltradoKeyReleased
        // FILTRO PARA BUSQUEDA DENTRO DE LA  TABLA
        //SE CREA UNA VARIABLE DE TIPO DEFAULTABLEMODEL
        DefaultTableModel busquedaDireccion;
        
        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaDireccion = (DefaultTableModel) tbDireccionCliente.getModel();
        
        //SE GENERA UN TABLEROWSORTER Y SE AGRUEGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaDireccion);
        tbDireccionCliente.setRowSorter(tr);
         
        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtBuscarPorFiltrado.getText().toUpperCase()));
    }//GEN-LAST:event_txtBuscarPorFiltradoKeyReleased

    private void lblBotonAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonAceptarMouseClicked
        //VALIDAR LA SELECCION DE DATOS
        if(tbDireccionCliente.isColumnSelected(1)){
            // TOMAR LOS DATOS SELECCIONADOS
            for(int i=0; i<tbDireccionCliente.getRowCount(); i++){
                if(tbDireccionCliente.isRowSelected(i)){
                    codigo = (int) tbDireccionCliente.getValueAt(i, 0);
                    direccion = tbDireccionCliente.getValueAt(i, 1).toString();

                    if(comparador == true){
                        //SE MANDAN LOS DATOS SELECCIONADOS
                        frmInClienteNuevo.codigo_direccion = codigo;
                        frmInClienteNuevo.direccion_completa = direccion; 
                        frmInClienteNuevo.txtRegistroClienteDireccion.setText(direccion);
                    }else if(comparador == false){
                        //SE MANDAN LOS DATOS SELECCIONADOS
                        frmInClienteInformacion.codigo_direccion = codigo;
                        frmInClienteInformacion.direccion_completa = direccion; 
                        frmInClienteInformacion.txtInformacionClienteDireccion.setText(direccion);
                    }                
                    dispose();
                    return;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un dato para agregar.");
        }

        
    }//GEN-LAST:event_lblBotonAceptarMouseClicked

    //FUNCIÓN PARA MOSTRAR DATOS
    private void mostrarDatos(ResultSet estructuraTabla) {
        try {
            DefaultTableModel modelo = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int filas, int columnas){
                    if(columnas == 2){
                        return true;
                    }else{
                        return false;
                    }
                }
            };
            //Primero se Definen las Columnas
            modelo.addColumn("CÓDIGO");           
            modelo.addColumn("DIRECCIÓN");
            
            
            //se definen los tamaños de las columnas
            tbDireccionCliente.setModel(modelo);
            
            tbDireccionCliente.getColumnModel().getColumn(0).setPreferredWidth(60);
            tbDireccionCliente.getColumnModel().getColumn(0).setMaxWidth(90);
            tbDireccionCliente.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbDireccionCliente.getColumnModel().getColumn(1).setPreferredWidth(450);
            tbDireccionCliente.getColumnModel().getColumn(1).setMaxWidth(450);
            tbDireccionCliente.getColumnModel().getColumn(1).setMinWidth(5);
            
                     
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassBuscarDireccion direccion = new ClassBuscarDireccion( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                        estructuraTabla.getInt("codigo"),                        
                        estructuraTabla.getString("direccion"));
                

                // se añade el registro encontrado al modelo de la tabla
                modelo.addRow(new Object[]{direccion.getCodigo(),                   
                    direccion.getNombre_direccion()});
            }
            
            //se muestra todo en la tabla
            tbDireccionCliente.setModel(modelo);
            
           

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBotonAceptar;
    private javax.swing.JLabel lblBotonBuscarCliente;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras1;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JTable tbDireccionCliente;
    private javax.swing.JTextField txtBuscarPorFiltrado;
    // End of variables declaration//GEN-END:variables
}
