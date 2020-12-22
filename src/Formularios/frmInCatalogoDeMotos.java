 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import Clases.ClassCatalogoMotos_LlenarTabla;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_Agencias;
import ConexionBaseDeDatos.ConexionBD_CatalogoDeMotos;
import static Formularios.frmInAgencias.codigo_a_eliminar_o_activar;
import static Formularios.frmInAgencias.resultado_reincorporacion;
import static Formularios.frmPrincipal.jdpPantallaPrincipal;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Alberto
 */
public class frmInCatalogoDeMotos extends javax.swing.JInternalFrame {
int codigo;
    //VARIABLES GLOBALES
    //Variables para el Alto y Ancho de los Formularios
    int alto, ancho;
    
    public frmInCatalogoDeMotos() {
        initComponents(); 

        //ELIMINA EL HEADER DEL FORMULARIO INTERNO
        BasicInternalFrameUI frmInUI = (BasicInternalFrameUI) this.getUI();
        frmInUI.setNorthPane(null);
        //CONEXION:
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarDatos(ConexionBaseDeDatos.ConexionBD_CatalogoDeMotos.mostrarTodoCatalogoDeMotos());
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
        txtBuscarPorDPI = new javax.swing.JTextField();
        lblBotonBuscarCatalogoMotoPorPlaca = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBotonNuevoMoto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBotonPapeleraMoto = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblBotonInformacionMoto = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBotonDarDeBajaMoto = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblModuloCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCatalogoDeMotos = new javax.swing.JTable();
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
        setTitle("CATALOGO DE MOTOS");
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

        lblBotonBuscarCatalogoMotoPorPlaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 173, Short.MAX_VALUE))
                    .addComponent(txtBuscarPorDPI, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(lblBotonBuscarCatalogoMotoPorPlaca)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarPorDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarCatalogoMotoPorPlaca))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonNuevoMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_add_50x50.png"))); // NOI18N
        lblBotonNuevoMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonNuevoMotoMouseClicked(evt);
            }
        });

        jLabel5.setText("DAR DE BAJA");

        lblBotonPapeleraMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_recicle_bin_noempty_50x50.png"))); // NOI18N
        lblBotonPapeleraMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonPapeleraMotoMouseClicked(evt);
            }
        });

        jLabel6.setText("INFORMACIÓN");

        lblBotonInformacionMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_info_50x50.png"))); // NOI18N
        lblBotonInformacionMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonInformacionMotoMouseClicked(evt);
            }
        });

        jLabel7.setText("PAPELERA");

        lblBotonDarDeBajaMoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_delete_50x50.png"))); // NOI18N
        lblBotonDarDeBajaMoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonDarDeBajaMotoMouseClicked(evt);
            }
        });

        jLabel4.setFont(jLabel4.getFont());
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUEVO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonDarDeBajaMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBotonPapeleraMoto)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblBotonNuevoMoto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addGap(80, 80, 80)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(lblBotonInformacionMoto)
                                .addGap(79, 79, 79))))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(72, 72, 72))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonNuevoMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonInformacionMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonPapeleraMoto, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBotonDarDeBajaMoto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13))
        );

        lblModuloCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_catalogo_motos_mouseEntered.png"))); // NOI18N
        lblModuloCliente.setAlignmentX(80.0F);

        tbCatalogoDeMotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "DESCRIPCIÓN", "MARCA", "MODELO", "CORREO ELECTRÓNICO"
            }
        ));
        jScrollPane1.setViewportView(tbCatalogoDeMotos);

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N

        jMenu1.setText("REPORTES");

        jMenuItem2.setText("REPORTE 1");
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
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblModuloCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
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
    
    void mostrarDatos(ResultSet estructuraTabla) {
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            //Primero se Definen las Columnas
            modelo.addColumn("Codigo");         
            modelo.addColumn("Descripcion");
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");
            modelo.addColumn("Agencia Proveedora");
            
            //se definen los tamaÃ±os de las columnas
            tbCatalogoDeMotos.setModel(modelo);
            
            tbCatalogoDeMotos.getColumnModel().getColumn(0).setPreferredWidth(275);
            tbCatalogoDeMotos.getColumnModel().getColumn(0).setMaxWidth(300);
            tbCatalogoDeMotos.getColumnModel().getColumn(0).setMinWidth(5);
            
            tbCatalogoDeMotos.getColumnModel().getColumn(1).setPreferredWidth(550);
            tbCatalogoDeMotos.getColumnModel().getColumn(1).setMaxWidth(600);
            tbCatalogoDeMotos.getColumnModel().getColumn(1).setMinWidth(5);
            
            tbCatalogoDeMotos.getColumnModel().getColumn(2).setPreferredWidth(300);
            tbCatalogoDeMotos.getColumnModel().getColumn(2).setMaxWidth(520);
            tbCatalogoDeMotos.getColumnModel().getColumn(2).setMinWidth(5);
            
            tbCatalogoDeMotos.getColumnModel().getColumn(3).setPreferredWidth(550);
            tbCatalogoDeMotos.getColumnModel().getColumn(3).setMaxWidth(600);
            tbCatalogoDeMotos.getColumnModel().getColumn(3).setMinWidth(5);       
            
            tbCatalogoDeMotos.getColumnModel().getColumn(4).setPreferredWidth(550);
            tbCatalogoDeMotos.getColumnModel().getColumn(4).setMaxWidth(600);
            tbCatalogoDeMotos.getColumnModel().getColumn(4).setMinWidth(5);  
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
            tbCatalogoDeMotos.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    private void lblBotonNuevoMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonNuevoMotoMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario para Nueva Moto
        frmInCatalogoDeMotosNuevo frmCatalogoDeMotosNuevo = new frmInCatalogoDeMotosNuevo();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmCatalogoDeMotosNuevo.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmCatalogoDeMotosNuevo.getHeight()/2;
        
        jdpPantallaPrincipal.add(frmCatalogoDeMotosNuevo);
        frmCatalogoDeMotosNuevo.setLocation(ancho, alto);
        frmCatalogoDeMotosNuevo.show();
    }//GEN-LAST:event_lblBotonNuevoMotoMouseClicked

    private void lblBotonInformacionMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonInformacionMotoMouseClicked
        int fila = tbCatalogoDeMotos.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS
            for(int i=0; i<tbCatalogoDeMotos.getRowCount(); i++){
                if(tbCatalogoDeMotos.isRowSelected(i)){
                    codigo = (int) tbCatalogoDeMotos.getValueAt(i, 0);
                    //SE MANDAN LOS DATOS SELECCIONADOS
                    frmInCatalogoDeMotosInformacion.codigo_agencia = codigo;

                    //Abrir el Formulario para Información de Carros
                    frmInCatalogoDeMotosInformacion frmCatalogoDeMotosInformacion = new frmInCatalogoDeMotosInformacion();
                    ancho = (jdpPantallaPrincipal.getWidth()/2) - frmCatalogoDeMotosInformacion.getWidth()/2;
                    alto = (jdpPantallaPrincipal.getHeight()/2) - frmCatalogoDeMotosInformacion.getHeight()/2;

                    //ENVIAR EL PARAMETRO SELECCIONADOR

                    jdpPantallaPrincipal.add(frmCatalogoDeMotosInformacion);
                    frmCatalogoDeMotosInformacion.setLocation(ancho, alto);
                    frmCatalogoDeMotosInformacion.show();

                    return;
                }
            }
    }//GEN-LAST:event_lblBotonInformacionMotoMouseClicked

    private void lblBotonPapeleraMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonPapeleraMotoMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario para Información de la Moto
        frmInCatalogoDeMotosPapelera frmCatalogoDeMotosPapelera = new frmInCatalogoDeMotosPapelera();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmCatalogoDeMotosPapelera.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmCatalogoDeMotosPapelera.getHeight()/2;
        
        jdpPantallaPrincipal.add(frmCatalogoDeMotosPapelera);
        frmCatalogoDeMotosPapelera.setLocation(ancho, alto);
        frmCatalogoDeMotosPapelera.show();
    }//GEN-LAST:event_lblBotonPapeleraMotoMouseClicked

    private void txtBuscarPorDPIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPorDPIKeyReleased

        DefaultTableModel busquedaPlaca;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaPlaca = (DefaultTableModel) tbCatalogoDeMotos.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaPlaca);
        tbCatalogoDeMotos.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtBuscarPorDPI.getText().toUpperCase()));
    }//GEN-LAST:event_txtBuscarPorDPIKeyReleased

    private void lblBotonDarDeBajaMotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonDarDeBajaMotoMouseClicked
       int fila = tbCatalogoDeMotos.getSelectedRow();

        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Eliminar");
            return;
        }
        for(int i=0; i<tbCatalogoDeMotos.getRowCount(); i++){
            if(tbCatalogoDeMotos.isRowSelected(i)){
                codigo_a_eliminar_o_activar = (int) tbCatalogoDeMotos.getValueAt(i,0);
                break;
            }
        }
        int input = JOptionPane.showConfirmDialog(null, "Estas seguro que quieres eliminar el registro?");
        if (input==0){
            ConexionBD.Iniciar();
            resultado_reincorporacion = ConexionBD_CatalogoDeMotos.actualizarMotosPapelera("ELIMINADO", codigo_a_eliminar_o_activar);
            mostrarDatos(ConexionBD_CatalogoDeMotos.mostrarTodoCatalogoDeMotos());
            ConexionBD.Finalizar();
        }else{
            if (resultado_reincorporacion == false){
                JOptionPane.showMessageDialog(null,"Hubo un problema al intentar restaurar el registro seleccionado, pruebe de nuevo o contacte a soporte tecnico");
                return;
            }else if(resultado_reincorporacion == true){
                JOptionPane.showMessageDialog(null,"Registro dado de baja exitosamente");
            }}
    }//GEN-LAST:event_lblBotonDarDeBajaMotoMouseClicked


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
    private javax.swing.JLabel lblBotonBuscarCatalogoMotoPorPlaca;
    private javax.swing.JLabel lblBotonDarDeBajaMoto;
    private javax.swing.JLabel lblBotonInformacionMoto;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JLabel lblBotonNuevoMoto;
    private javax.swing.JLabel lblBotonPapeleraMoto;
    private javax.swing.JLabel lblModuloCliente;
    private javax.swing.JTable tbCatalogoDeMotos;
    private javax.swing.JTextField txtBuscarPorDPI;
    // End of variables declaration//GEN-END:variables
}
