/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;


import Clases.ClassCatalogoCarros_LlenarTabla;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_CatalogoDeCarros;
import static Formularios.frmPrincipal.jdpPantallaPrincipal;
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
public class frmInCatalogoDeCarros extends javax.swing.JInternalFrame {
    //VARIABLES GLOBALES
    //Variablea Globales para mostrar Formularios
    int alto, ancho;
    
    //VARIABLE PARA ENVIAR DATO SELECCIONADOR
    int codigo_vehiculo;
    
    //VARIABLE BOOLEANA PRA DAR DE BAJA
    boolean darDeBaja = false;
    
    
    
    public frmInCatalogoDeCarros() {
        initComponents(); 
        
        //ELIMINA EL HEADER DEL FORMULARIO INTERNO
        BasicInternalFrameUI frmInUI = (BasicInternalFrameUI) this.getUI();
        frmInUI.setNorthPane(null);
        //CONEXION:
        ConexionBaseDeDatos.ConexionBD.Iniciar();
        mostrarDatos(ConexionBaseDeDatos.ConexionBD_CatalogoDeCarros.mostrarTodoCatalogoDeCarros());
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
        txtCatalogoCarrosBuscarPorPlaca = new javax.swing.JTextField();
        lblBotonBuscarCarro = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblBotonNuevoCarro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblBotonPapeleraCarro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblBotonInformacionCarro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblBotonDarDeBajaCarrro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblModuloCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCatalogoCarros = new javax.swing.JTable();
        lblBotonMoverInicio = new javax.swing.JLabel();
        lblBotonMoverAtras = new javax.swing.JLabel();
        lblBotonMoverAdelante = new javax.swing.JLabel();
        lblBotonMoverFinal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        opReportes = new javax.swing.JMenu();
        opFichaDeCarro = new javax.swing.JMenuItem();
        opCatalogoCompletoCarros = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setTitle("CATALOGO DE CARROS");
        setToolTipText("");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finanssoreal.png"))); // NOI18N
        setMinimumSize(new java.awt.Dimension(974, 665));
        setPreferredSize(new java.awt.Dimension(974, 665));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("BUSCAR PARÁMETROS:");

        txtCatalogoCarrosBuscarPorPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCatalogoCarrosBuscarPorPlacaKeyReleased(evt);
            }
        });

        lblBotonBuscarCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N

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
                    .addComponent(txtCatalogoCarrosBuscarPorPlaca, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(lblBotonBuscarCarro)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCatalogoCarrosBuscarPorPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarCarro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBotonNuevoCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonNuevoCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_add_50x50.png"))); // NOI18N
        lblBotonNuevoCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonNuevoCarroMouseClicked(evt);
            }
        });

        jLabel5.setText("DAR DE BAJA");

        lblBotonPapeleraCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonPapeleraCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_recicle_bin_noempty_50x50.png"))); // NOI18N
        lblBotonPapeleraCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonPapeleraCarroMouseClicked(evt);
            }
        });

        jLabel6.setText("INFORMACIÓN");

        lblBotonInformacionCarro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonInformacionCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_info_50x50.png"))); // NOI18N
        lblBotonInformacionCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonInformacionCarroMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PAPELERA");

        lblBotonDarDeBajaCarrro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBotonDarDeBajaCarrro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_delete_50x50.png"))); // NOI18N
        lblBotonDarDeBajaCarrro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonDarDeBajaCarrroMouseClicked(evt);
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
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBotonNuevoCarro, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBotonInformacionCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblBotonDarDeBajaCarrro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(51, 51, 51)
                        .addComponent(lblBotonPapeleraCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonNuevoCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblBotonInformacionCarro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonPapeleraCarro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblBotonDarDeBajaCarrro, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13))
        );

        lblModuloCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_catalogo_carros_mouseEntered.png"))); // NOI18N
        lblModuloCliente.setAlignmentX(80.0F);

        tbCatalogoCarros.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbCatalogoCarros);

        lblBotonMoverInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_left_64x64.png"))); // NOI18N

        lblBotonMoverAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_left_50x50.png"))); // NOI18N

        lblBotonMoverAdelante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_nolimit_right_50x50.png"))); // NOI18N

        lblBotonMoverFinal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_paginacion_limit_right_64x64.png"))); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N

        opReportes.setText("REPORTES");

        opFichaDeCarro.setText("FICHA DE CARRO");
        opFichaDeCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opFichaDeCarroActionPerformed(evt);
            }
        });
        opReportes.add(opFichaDeCarro);

        opCatalogoCompletoCarros.setText("CATÁLOGO COMPLETO DE CARROS");
        opCatalogoCompletoCarros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opCatalogoCompletoCarrosActionPerformed(evt);
            }
        });
        opReportes.add(opCatalogoCompletoCarros);

        jMenuBar1.add(opReportes);

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
                                .addGap(30, 30, 30)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
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
            modelo.addColumn("DESCRIPCIÓN");
            modelo.addColumn("MARCA");
            modelo.addColumn("MODELO");
            modelo.addColumn("AGENCIA PROVEEDORA");

            //se definen los tamaÃ±os de las columnas
            tbCatalogoCarros.setModel(modelo);

            tbCatalogoCarros.getColumnModel().getColumn(0).setPreferredWidth(275);
            tbCatalogoCarros.getColumnModel().getColumn(0).setMaxWidth(300);
            tbCatalogoCarros.getColumnModel().getColumn(0).setMinWidth(5);

            tbCatalogoCarros.getColumnModel().getColumn(1).setPreferredWidth(550);
            tbCatalogoCarros.getColumnModel().getColumn(1).setMaxWidth(600);
            tbCatalogoCarros.getColumnModel().getColumn(1).setMinWidth(5);

            tbCatalogoCarros.getColumnModel().getColumn(2).setPreferredWidth(300);
            tbCatalogoCarros.getColumnModel().getColumn(2).setMaxWidth(520);
            tbCatalogoCarros.getColumnModel().getColumn(2).setMinWidth(5);

            tbCatalogoCarros.getColumnModel().getColumn(3).setPreferredWidth(550);
            tbCatalogoCarros.getColumnModel().getColumn(3).setMaxWidth(600);
            tbCatalogoCarros.getColumnModel().getColumn(3).setMinWidth(5);       

            tbCatalogoCarros.getColumnModel().getColumn(4).setPreferredWidth(550);
            tbCatalogoCarros.getColumnModel().getColumn(4).setMaxWidth(600);
            tbCatalogoCarros.getColumnModel().getColumn(4).setMinWidth(5);  
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
        tbCatalogoCarros.setModel(modelo);

        } catch (SQLException ex) {
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    private void lblBotonNuevoCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonNuevoCarroMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario para Nuevo Carro
        frmInCatalogoDeCarrosNuevo frmCatalogoDeCarrosNuevo = new frmInCatalogoDeCarrosNuevo();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmCatalogoDeCarrosNuevo.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmCatalogoDeCarrosNuevo.getHeight()/2;
        
        jdpPantallaPrincipal.add(frmCatalogoDeCarrosNuevo);
        frmCatalogoDeCarrosNuevo.setLocation(ancho, alto);
        frmCatalogoDeCarrosNuevo.show();
    }//GEN-LAST:event_lblBotonNuevoCarroMouseClicked

    private void lblBotonInformacionCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonInformacionCarroMouseClicked
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
        //VALIDAR LA SELECCION DE DATOS
        if(tbCatalogoCarros.isColumnSelected(0) || tbCatalogoCarros.isColumnSelected(1) || tbCatalogoCarros.isColumnSelected(2) ||  tbCatalogoCarros.isColumnSelected(3) || tbCatalogoCarros.isColumnSelected(4)){
            // TOMAR LOS DATOS SELECCIONADOS
            for(int i=0; i<tbCatalogoCarros.getRowCount(); i++){
                if(tbCatalogoCarros.isRowSelected(i)){
                    codigo_vehiculo = (int) tbCatalogoCarros.getValueAt(i, 0);

                                     
                    //SE MANDAN LOS DATOS SELECCIONADOS
                    frmInCatalogoDeCarrosInformacion.formularioFinanciamiento = false;
                    frmInCatalogoDeCarrosInformacion.codigo_vehiculo = codigo_vehiculo;
                    
                            
                    //Abrir el Formulario para Información de Carros
                    frmInCatalogoDeCarrosInformacion frmCatalogoDeCarrosInformacion = new frmInCatalogoDeCarrosInformacion();
                    ancho = (jdpPantallaPrincipal.getWidth()/2) - frmCatalogoDeCarrosInformacion.getWidth()/2;
                    alto = (jdpPantallaPrincipal.getHeight()/2) - frmCatalogoDeCarrosInformacion.getHeight()/2;

                    //ENVIAR EL PARAMETRO SELECCIONADOR

                    jdpPantallaPrincipal.add(frmCatalogoDeCarrosInformacion);
                    frmCatalogoDeCarrosInformacion.setLocation(ancho, alto);
                    frmCatalogoDeCarrosInformacion.show();
                  
                    return;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un dato para agregar.");
        }



        
    }//GEN-LAST:event_lblBotonInformacionCarroMouseClicked

    private void lblBotonPapeleraCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonPapeleraCarroMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario para Papelera de Carros
        frmInCatalogoDeCarrosPapelera frmCatalogoDeCarrosPapelera = new frmInCatalogoDeCarrosPapelera();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmCatalogoDeCarrosPapelera.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmCatalogoDeCarrosPapelera.getHeight()/2;
        
        jdpPantallaPrincipal.add(frmCatalogoDeCarrosPapelera);
        frmCatalogoDeCarrosPapelera.setLocation(ancho, alto);
        frmCatalogoDeCarrosPapelera.show();
    }//GEN-LAST:event_lblBotonPapeleraCarroMouseClicked

    private void txtCatalogoCarrosBuscarPorPlacaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatalogoCarrosBuscarPorPlacaKeyReleased

        DefaultTableModel busquedaPlaca;

        //SE TRASLADAN LOS PARÁMETROS DEL JTABLE A LA DEFAULTMODELTABLE
        busquedaPlaca = (DefaultTableModel) tbCatalogoCarros.getModel();

        //SE GENERA UN TABLEROWSORTER Y SE AGREGA  NUESTRA TABLA
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(busquedaPlaca);
        tbCatalogoCarros.setRowSorter(tr);

        //SE FILTRAN LOS DATOS DE ACUERDO A LOS PARÁMETROS INGRESADOS EN EL TXT
        tr.setRowFilter(RowFilter.regexFilter(txtCatalogoCarrosBuscarPorPlaca.getText().toUpperCase()));
    }//GEN-LAST:event_txtCatalogoCarrosBuscarPorPlacaKeyReleased

    private void lblBotonDarDeBajaCarrroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonDarDeBajaCarrroMouseClicked
        //BOTÓN PARA DAR DE BAJA
        
        int fila = tbCatalogoCarros.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un Registro a Editar");
            return;
        }
        //Abrir el Formulario de Información
        // TOMAR LOS DATOS SELECCIONADOS  
        for(int i=0; i<tbCatalogoCarros.getRowCount(); i++){
            if(tbCatalogoCarros.isRowSelected(i)){
                codigo_vehiculo = (int) tbCatalogoCarros.getValueAt(i, 0);
                int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de dar de baja a dato?", "Dar de Baja", JOptionPane.YES_NO_OPTION);
        
                if(respuesta == 0){
                    ConexionBD.Iniciar();
                    darDeBaja = ConexionBD_CatalogoDeCarros.darDeBajaACarro("ELIMINADO", codigo_vehiculo);
                    ConexionBD.Finalizar();

                    //VERIFICAR SI SE DIO DE BAJA
                    if(darDeBaja == true){
                        //ACTUALIZA LA TABLA PRINCIPAL
                        ConexionBaseDeDatos.ConexionBD.Iniciar();
                        mostrarDatos(ConexionBaseDeDatos.ConexionBD_CatalogoDeCarros.mostrarTodoCatalogoDeCarros());
                        ConexionBaseDeDatos.ConexionBD.Finalizar();
                        JOptionPane.showMessageDialog(null, "DATOS DADOS DE BAJA", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
                        codigo_vehiculo = 0;
                    }else{
                        JOptionPane.showMessageDialog(null, "HUBU UN ERROR AL DAR DE BAJA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        codigo_vehiculo = 0;
                    }            
                }
                
                break;   
           }
        }
    }//GEN-LAST:event_lblBotonDarDeBajaCarrroMouseClicked

    private void opFichaDeCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opFichaDeCarroActionPerformed
        // TODO add your handling code here:
        //SI NO SELECCIONA UN REGISTRO DE LA TABLA, DETIENE LA EJECUCIÓN DEL CODIGO
        int fila = tbCatalogoCarros.getSelectedRow(); 
        if(fila<0){
            JOptionPane.showMessageDialog(null, "Seleccione un registro para generar el documento");
            return;
        }
        
        //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
        for(int i=0; i<tbCatalogoCarros.getRowCount(); i++){
            if(tbCatalogoCarros.isRowSelected(i)){
                codigo_vehiculo = (int) tbCatalogoCarros.getValueAt(i, 0);
                try {

                    ConexionBD.Iniciar();
                    Map parametros = new HashMap();
                    parametros.clear();
                    parametros.put("ReportParameter_CodigoVehiculo", codigo_vehiculo);
                    parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
                    parametros.put("HeaderMembretePNG", this.getClass().getResourceAsStream("/Imagenes/header_membrete_reporte.png"));
                    parametros.put("FooterMembretePNG", this.getClass().getResourceAsStream("/Imagenes/footer_membrete_reporte.png"));
                    JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportCatalogoCarros_FichaCarro.jasper"));
                    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
                    JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                    jasperViewer.setVisible(true);
                    jasperViewer.setTitle("FICHA DE VEHICULO");
                    ConexionBD.Finalizar();
                } catch (JRException e) {
                    ConexionBD.Finalizar();
                }
                break;   
           }
        }
    }//GEN-LAST:event_opFichaDeCarroActionPerformed

    private void opCatalogoCompletoCarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opCatalogoCompletoCarrosActionPerformed
        // TODO add your handling code here:
                
        
        
        //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
        try {
            ConexionBD.Iniciar();
            Map parametros = new HashMap();
            parametros.clear();
            parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
            parametros.put("HeaderMembretePNG", this.getClass().getResourceAsStream("/Imagenes/header_membrete_reporte.png"));
            parametros.put("FooterMembretePNG", this.getClass().getResourceAsStream("/Imagenes/footer_membrete_reporte.png"));
            JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportCatalogoCarros_Catalogo.jasper"));
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
            JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
            jasperViewer.setVisible(true);
            jasperViewer.setTitle("CATÁLOGO DE CARROS");
            ConexionBD.Finalizar();
        } catch (JRException e) {
            ConexionBD.Finalizar();
        }
    }//GEN-LAST:event_opCatalogoCompletoCarrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBotonBuscarCarro;
    private javax.swing.JLabel lblBotonDarDeBajaCarrro;
    private javax.swing.JLabel lblBotonInformacionCarro;
    private javax.swing.JLabel lblBotonMoverAdelante;
    private javax.swing.JLabel lblBotonMoverAtras;
    private javax.swing.JLabel lblBotonMoverFinal;
    private javax.swing.JLabel lblBotonMoverInicio;
    private javax.swing.JLabel lblBotonNuevoCarro;
    private javax.swing.JLabel lblBotonPapeleraCarro;
    private javax.swing.JLabel lblModuloCliente;
    private javax.swing.JMenuItem opCatalogoCompletoCarros;
    private javax.swing.JMenuItem opFichaDeCarro;
    private javax.swing.JMenu opReportes;
    public static javax.swing.JTable tbCatalogoCarros;
    private javax.swing.JTextField txtCatalogoCarrosBuscarPorPlaca;
    // End of variables declaration//GEN-END:variables
}
