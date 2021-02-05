/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import Clases.ClassCatalogoCarros_LlenarTabla;
import Clases.ClassMostrarAgencias;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_CatalogoDeCarros;
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
public class frmInCatalogoDeCarrosPapelera extends javax.swing.JInternalFrame {
    
    //VARIABLES GLOBALES
    //VARIABLE PARA CODIGO Y RESTAURACION
    int codigo = 0;
    boolean restaurarCarro = false;
    
    public frmInCatalogoDeCarrosPapelera() {
        initComponents();
        //CONEXION
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarCarrosEnPapelera(ConexionBaseDeDatos.ConexionBD_CatalogoDeCarros.mostrarTodoPapeleraCatalogoDeCarros());
        ConexionBaseDeDatos.ConexionBD.Finalizar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPapeleraCarrosBuscarPorPlaca = new javax.swing.JTextField();
        lblBotonBuscarCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBotonRestaurarCarro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPapeleraCarros = new javax.swing.JTable();
        lblBotonMoverFinal = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverInicio = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("BUSCAR PARÁMETROS:");

        txtPapeleraCarrosBuscarPorPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPapeleraCarrosBuscarPorPlacaKeyReleased(evt);
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
                    .addComponent(jLabel1)
                    .addComponent(txtPapeleraCarrosBuscarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lblBotonBuscarCliente)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonBuscarCliente)
                    .addComponent(txtPapeleraCarrosBuscarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonRestaurarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_restore_80x70.png"))); // NOI18N
        lblBotonRestaurarCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonRestaurarCarroMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("RESTAURAR REGISTRO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lblBotonRestaurarCarro)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lblBotonRestaurarCarro)
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(134, 185, 22));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAPELERA DE RECICLAJE: CARROS ELIMINADOS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(86, 86, 86))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tbPapeleraCarros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPapeleraCarros);

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblBotonMoverInicio)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverAtras)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverAdelante)
                        .addGap(18, 18, 18)
                        .addComponent(lblBotonMoverFinal)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonMoverInicio)
                    .addComponent(lblBotonMoverFinal)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBotonMoverAtras)
                            .addComponent(lblBotonMoverAdelante))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     private void mostrarCarrosEnPapelera(ResultSet estructuraTabla) {
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
            modelo.addColumn("DESCRIPCIÓN");
            modelo.addColumn("MARCA");
            modelo.addColumn("MODELO");
            modelo.addColumn("AGENCIA PROVEEDORA");
            
            //se definen los tamaÃ±os de las columnas
            tbPapeleraCarros.setModel(modelo);

            tbPapeleraCarros.getColumnModel().getColumn(0).setPreferredWidth(275);
            tbPapeleraCarros.getColumnModel().getColumn(0).setMaxWidth(300);
            tbPapeleraCarros.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbPapeleraCarros.getColumnModel().getColumn(1).setPreferredWidth(550);
            tbPapeleraCarros.getColumnModel().getColumn(1).setMaxWidth(600);
            tbPapeleraCarros.getColumnModel().getColumn(1).setMinWidth(5);
            
            tbPapeleraCarros.getColumnModel().getColumn(2).setPreferredWidth(300);
            tbPapeleraCarros.getColumnModel().getColumn(2).setMaxWidth(520);
            tbPapeleraCarros.getColumnModel().getColumn(2).setMinWidth(5);
            
            tbPapeleraCarros.getColumnModel().getColumn(3).setPreferredWidth(550);
            tbPapeleraCarros.getColumnModel().getColumn(3).setMaxWidth(600);
            tbPapeleraCarros.getColumnModel().getColumn(3).setMinWidth(5);        
            
            tbPapeleraCarros.getColumnModel().getColumn(4).setPreferredWidth(550);
            tbPapeleraCarros.getColumnModel().getColumn(4).setMaxWidth(600);
            tbPapeleraCarros.getColumnModel().getColumn(4).setMinWidth(5);       
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassCatalogoCarros_LlenarTabla person = new ClassCatalogoCarros_LlenarTabla( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                        estructuraTabla.getInt("codigo"),
                        estructuraTabla.getString("descripción"),
                        estructuraTabla.getString("marca"), 
                        estructuraTabla.getString("modelo"),
                        estructuraTabla.getString("agencia_proveedora"));
            
                // se aÃ±ade el registro encontrado al modelo de la tabla
                modelo.addRow(new Object[]{
                   
                    person.getCodigo(),
                    person.getDescripcion(),                   
                    person.getMarca(),
                    person.getModelo(),
                    person.getAgencia_proveedora(),
                    });
            }

            //se muestra todo en la tabla
            tbPapeleraCarros.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    private void lblBotonRestaurarCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonRestaurarCarroMouseClicked
         //BOTÓN PARA DAR DE BAJA
                
        int fila = tbPapeleraCarros.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
                for(int i=0; i<tbPapeleraCarros.getRowCount(); i++){
                if(tbPapeleraCarros.isRowSelected(i)){
                codigo = (int) tbPapeleraCarros.getValueAt(i, 0);
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de restaurar los datos?", "RESTAURAR", JOptionPane.YES_NO_OPTION);
        
                if(respuesta == 0){
                    ConexionBD.Iniciar();
                    restaurarCarro = ConexionBD_CatalogoDeCarros.restaurarCarro("VIGENTE", codigo);
                    ConexionBD.Finalizar();

                    //VERIFICAR SI SE DIO DE BAJA
                    if(restaurarCarro == true){
                        JOptionPane.showMessageDialog(null, "DATOS RESTAURADOS", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                        //ACTUALIZA LA TABLA PRINCIPAL
                        ConexionBaseDeDatos.ConexionBD.Iniciar();
                        actualizarTablaCatalogoCarros(ConexionBaseDeDatos.ConexionBD_CatalogoDeCarros.mostrarTodoCatalogoDeCarros());
                        ConexionBaseDeDatos.ConexionBD.Finalizar();
                        codigo = 0;
                        restaurarCarro = false;
                    }else{
                        JOptionPane.showMessageDialog(null, "HUBU UN ERROR AL RESTAURAR", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }            
                }
                
                break;   
           }
        }
        
    }//GEN-LAST:event_lblBotonRestaurarCarroMouseClicked

    private void txtPapeleraCarrosBuscarPorPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPapeleraCarrosBuscarPorPlacaKeyReleased
        // FILTRO PARA BUSQUEDA DENTRO DE LA  TABLA
        //SE CREA UNA VARIABLE DE TIPO DEFAULTABLEMODEL
        DefaultTableModel busquedaNombre;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaNombre = (DefaultTableModel) tbPapeleraCarros.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaNombre);
        tbPapeleraCarros.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtPapeleraCarrosBuscarPorPlaca.getText().toUpperCase()));
    }//GEN-LAST:event_txtPapeleraCarrosBuscarPorPlacaKeyReleased

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
            modelo.addColumn("DESCRIPCIÓN");
            modelo.addColumn("MARCA");
            modelo.addColumn("MODELO");
            modelo.addColumn("AGENCIA PROVEEDORA");

            //se definen los tamaÃ±os de las columnas
            frmInCatalogoDeCarros.tbCatalogoCarros.setModel(modelo);

            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(0).setPreferredWidth(275);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(0).setMaxWidth(300);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(0).setMinWidth(5);

            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(1).setPreferredWidth(550);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(1).setMaxWidth(600);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(1).setMinWidth(5);

            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(2).setPreferredWidth(300);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(2).setMaxWidth(520);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(2).setMinWidth(5);

            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(3).setPreferredWidth(550);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(3).setMaxWidth(600);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(3).setMinWidth(5);       

            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(4).setPreferredWidth(550);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(4).setMaxWidth(600);
            frmInCatalogoDeCarros.tbCatalogoCarros.getColumnModel().getColumn(4).setMinWidth(5);  
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 

                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassCatalogoCarros_LlenarTabla person = new ClassCatalogoCarros_LlenarTabla( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                        estructuraTabla.getInt("codigo"),
                        estructuraTabla.getString("descripción"),
                        estructuraTabla.getString("marca"),
                        estructuraTabla.getString("modelo"), 
                        estructuraTabla.getString("agencia_proveedora"));

                // se aÃ±ade el registro encontrado al modelo de la tabla
                modelo.addRow(new Object[]{

                    person.getCodigo(),
                    person.getDescripcion(),                   
                    person.getMarca(),
                    person.getModelo(),
                    person.getAgencia_proveedora(),
                    });
            }

        //se muestra todo en la tabla
        frmInCatalogoDeCarros.tbCatalogoCarros.setModel(modelo);

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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBotonBuscarCliente;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JLabel lblBotonRestaurarCarro;
    private javax.swing.JTable tbPapeleraCarros;
    private javax.swing.JTextField txtPapeleraCarrosBuscarPorPlaca;
    // End of variables declaration//GEN-END:variables
}
