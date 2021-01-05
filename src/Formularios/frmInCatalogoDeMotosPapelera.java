/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import Clases.ClassCatalogoMotos_LlenarTabla;
import Clases.ClassMostrarAgencias;
import Clases.ClassMostrarCatalogoMotosPapelera;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_CatalogoDeMotos;
import static Formularios.frmInAgencias.codigo_a_eliminar_o_activar;
import static Formularios.frmInAgencias.resultado_reincorporacion;
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
public class frmInCatalogoDeMotosPapelera extends javax.swing.JInternalFrame {
    
    
    public frmInCatalogoDeMotosPapelera() {
        initComponents();
        //CONEXION
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarMotosEnPapelera(ConexionBaseDeDatos.ConexionBD_CatalogoDeMotos.mostrarTodoPapeleraCatalogoDeMotos());
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
        txtPapeleraMotosBuscarPorPlaca = new javax.swing.JTextField();
        lblBotonBuscarCliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBotonRestaurarCarro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPapeleraMotos = new javax.swing.JTable();
        lblBotonMoverFinal = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverInicio = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("BUSCAR:");

        txtPapeleraMotosBuscarPorPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPapeleraMotosBuscarPorPlacaKeyReleased(evt);
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
                    .addComponent(txtPapeleraMotosBuscarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblBotonBuscarCliente)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonBuscarCliente)
                    .addComponent(txtPapeleraMotosBuscarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(39, 39, 39))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblBotonRestaurarCarro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblBotonRestaurarCarro)
                .addGap(27, 27, 27)
                .addComponent(jLabel7)
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(134, 185, 22));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAPELERA DE RECICLAJE: MOTOS ELIMINADAS");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        tbPapeleraMotos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbPapeleraMotos);

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
    private void mostrarMotosEnPapelera(ResultSet estructuraTabla) {        
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            //Primero se Definen las Columnas
            modelo.addColumn("CÓDIGO");         
            modelo.addColumn("DESCRIPCIÓN");
            modelo.addColumn("MARCA");
            modelo.addColumn("MODELO");
            modelo.addColumn("AGENCIA PROVEEDORA");
            
            //se definen los tamaÃ±os de las columnas
            tbPapeleraMotos.setModel(modelo);

            tbPapeleraMotos.getColumnModel().getColumn(0).setPreferredWidth(275);
            tbPapeleraMotos.getColumnModel().getColumn(0).setMaxWidth(300);
            tbPapeleraMotos.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbPapeleraMotos.getColumnModel().getColumn(1).setPreferredWidth(550);
            tbPapeleraMotos.getColumnModel().getColumn(1).setMaxWidth(600);
            tbPapeleraMotos.getColumnModel().getColumn(1).setMinWidth(5);
            
            tbPapeleraMotos.getColumnModel().getColumn(2).setPreferredWidth(300);
            tbPapeleraMotos.getColumnModel().getColumn(2).setMaxWidth(520);
            tbPapeleraMotos.getColumnModel().getColumn(2).setMinWidth(5);
            
            tbPapeleraMotos.getColumnModel().getColumn(3).setPreferredWidth(550);
            tbPapeleraMotos.getColumnModel().getColumn(3).setMaxWidth(600);
            tbPapeleraMotos.getColumnModel().getColumn(3).setMinWidth(5);        
            
            tbPapeleraMotos.getColumnModel().getColumn(4).setPreferredWidth(550);
            tbPapeleraMotos.getColumnModel().getColumn(4).setMaxWidth(600);
            tbPapeleraMotos.getColumnModel().getColumn(4).setMinWidth(5);       
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassCatalogoMotos_LlenarTabla person = new ClassCatalogoMotos_LlenarTabla( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
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
            tbPapeleraMotos.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    private void lblBotonRestaurarCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonRestaurarCarroMouseClicked
        int fila = tbPapeleraMotos.getSelectedRow();

        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Restaurar");
            return;
        }
        for(int i=0; i<tbPapeleraMotos.getRowCount(); i++){
            if(tbPapeleraMotos.isRowSelected(i)){
                codigo_a_eliminar_o_activar = (int) tbPapeleraMotos.getValueAt(i,0);
                break;
            }
        }
        int input = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres restaurar el registro?");
        if (input==0){
            ConexionBD.Iniciar();
            resultado_reincorporacion = ConexionBD_CatalogoDeMotos.actualizarMotosPapelera("VIGENTE", codigo_a_eliminar_o_activar);
            mostrarMotosEnPapelera(ConexionBD_CatalogoDeMotos.mostrarTodoPapeleraCatalogoDeMotos());
            ConexionBD.Finalizar();
        }else{
            if (resultado_reincorporacion == false){
                JOptionPane.showMessageDialog(null,"Hubo un problema al intentar restaurar el registro seleccionado, pruebe de nuevo o contacte a soporte tecnico");
                return;
            }else if(resultado_reincorporacion == true){
                JOptionPane.showMessageDialog(null,"Registro dado de baja exitosamente");
            }}
    }//GEN-LAST:event_lblBotonRestaurarCarroMouseClicked

    private void txtPapeleraMotosBuscarPorPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPapeleraMotosBuscarPorPlacaKeyReleased
        // FILTRO PARA BUSQUEDA DENTRO DE LA  TABLA
        //SE CREA UNA VARIABLE DE TIPO DEFAULTABLEMODEL
        DefaultTableModel busquedaNombre;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaNombre = (DefaultTableModel) tbPapeleraMotos.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaNombre);
        tbPapeleraMotos.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtPapeleraMotosBuscarPorPlaca.getText().toUpperCase()));
    }//GEN-LAST:event_txtPapeleraMotosBuscarPorPlacaKeyReleased


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
    private javax.swing.JLabel lblBotonRestaurarCarro;
    private javax.swing.JTable tbPapeleraMotos;
    private javax.swing.JTextField txtPapeleraMotosBuscarPorPlaca;
    // End of variables declaration//GEN-END:variables
}
