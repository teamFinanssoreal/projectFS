/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassCatalogoMotos;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_CatalogoDeMotos;
import ConexionBaseDeDatos.ConexionBD_Cliente;
import static Formularios.frmInClienteInformacion.codigo_cliente;
import static Formularios.frmInClienteInformacion.codigo_direccion;
import static Formularios.frmPrincipal.jdpPantallaPrincipal;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author alber
 */
public class frmInCatalogoDeMotosInformacion extends javax.swing.JInternalFrame {

    //Variables Globales
    //Variables para Alto y Ancho de Formularios Internos
    int alto, ancho;
    //VARIABLES GLOBALES PARA DIRECCION
    public static int codigo_direccion;
    public static String nombre_direccion;
    public static boolean resultadoInstruccion;
    public static int codigo_agencia;
    
    int codigo_vehiculo;
    String codigo_agencias;
    String codigo_agencias_proveedora;
    String direccion_completa;
    //VARIABLE GLOBAL PARA DOCUMENTOS
    boolean verificarSiAgregoArchivo = false;
    FileInputStream fotoSiActualiza;
    InputStream fotoSiNoActualiza;
    String nombreArchivo, rutaArchivo;
    Blob fotoComparador;
    InputStream foto;
    /**
     * Creates new form frmInCatalogoDeCarrosInformacion
     */
    public frmInCatalogoDeMotosInformacion() {
        initComponents();
        this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
        //INICIA LA CONEXION A LA BD
                ConexionBD.Iniciar();
                llenarCampos(ConexionBaseDeDatos.ConexionBD_CatalogoDeMotos.MostrarTodoMotos(codigo_agencia));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFoto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtInformacionMotosDescripcion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInformacionMotosNumeroPlaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtInformacionMotosMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtInformacionMotosModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtInformacionMotosColor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtInformacionMotosMotor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtInformacionMotosIdGPS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtInformacionMotosChipGPS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtInformacionMotosFoto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtInformacionMotosAgenciaProveedora = new javax.swing.JTextField();
        lblBotonBuscarAgencia = new javax.swing.JLabel();
        lblBotonAdjuntarFoto = new javax.swing.JLabel();
        lblBotonActualizarRegistroCarro = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACIÓN DE LA MOTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jLabel1)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
        );

        jLabel2.setText("1. DESCRIPCIÓN:");

        txtInformacionMotosDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInformacionMotosDescripcionActionPerformed(evt);
            }
        });

        jLabel3.setText("2. NÚMERO DE PLACA:");

        txtInformacionMotosNumeroPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInformacionMotosNumeroPlacaKeyTyped(evt);
            }
        });

        jLabel4.setText("3. MARCA:");

        jLabel5.setText("4. MODELO:");

        jLabel6.setText("5. COLOR:");

        jLabel7.setText("6. MOTOR:");

        jLabel8.setText("7. ID DEL GPS:");

        txtInformacionMotosIdGPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInformacionMotosIdGPSKeyTyped(evt);
            }
        });

        jLabel9.setText("8. CHIP DEL GPS:");

        txtInformacionMotosChipGPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInformacionMotosChipGPSKeyTyped(evt);
            }
        });

        jLabel10.setText("9. FOTO:");

        txtInformacionMotosFoto.setEditable(false);

        jLabel12.setText("10. AGENCIA PROVEEDORA:");

        txtInformacionMotosAgenciaProveedora.setEditable(false);
        txtInformacionMotosAgenciaProveedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInformacionMotosAgenciaProveedoraActionPerformed(evt);
            }
        });

        lblBotonBuscarAgencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N
        lblBotonBuscarAgencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonBuscarAgenciaMouseClicked(evt);
            }
        });

        lblBotonAdjuntarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        lblBotonAdjuntarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonAdjuntarFotoMouseClicked(evt);
            }
        });

        lblBotonActualizarRegistroCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_save_50x50.png"))); // NOI18N
        lblBotonActualizarRegistroCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonActualizarRegistroCarroMouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_see_20x20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtInformacionMotosModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtInformacionMotosColor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel2)
                            .addComponent(txtInformacionMotosDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtInformacionMotosNumeroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtInformacionMotosMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(txtInformacionMotosChipGPS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel19))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtInformacionMotosFoto)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblBotonAdjuntarFoto))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(txtInformacionMotosMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(txtInformacionMotosIdGPS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInformacionMotosAgenciaProveedora, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBotonBuscarAgencia)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(lblBotonActualizarRegistroCarro)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInformacionMotosDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInformacionMotosNumeroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInformacionMotosMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInformacionMotosModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInformacionMotosColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInformacionMotosMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInformacionMotosIdGPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtInformacionMotosChipGPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBotonAdjuntarFoto)
                                    .addComponent(txtInformacionMotosFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(24, 24, 24)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInformacionMotosAgenciaProveedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBotonBuscarAgencia)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lblBotonActualizarRegistroCarro)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtInformacionMotosDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInformacionMotosDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInformacionMotosDescripcionActionPerformed

    private void txtInformacionMotosAgenciaProveedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInformacionMotosAgenciaProveedoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInformacionMotosAgenciaProveedoraActionPerformed

    private void lblBotonBuscarAgenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonBuscarAgenciaMouseClicked
        // TODO add your handling code here:
          //Abrir el Formulario para Buscar Agencias de Carros
        frmInCatalogoDeMotosBuscarAgencia frmCatalogoDeMotosBuscarAgencia = new frmInCatalogoDeMotosBuscarAgencia();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmCatalogoDeMotosBuscarAgencia.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmCatalogoDeMotosBuscarAgencia.getHeight()/2;
        frmInCatalogoDeMotosBuscarAgencia.comparador = true;
        jdpPantallaPrincipal.add(frmCatalogoDeMotosBuscarAgencia);
        frmCatalogoDeMotosBuscarAgencia.setLocation(ancho, alto);
        frmCatalogoDeMotosBuscarAgencia.show();
    }//GEN-LAST:event_lblBotonBuscarAgenciaMouseClicked
    private void llenarCampos(ResultSet estructuraTabla){
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassCatalogoMotos catalogo = new ClassCatalogoMotos( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                        estructuraTabla.getInt("codigo"),
                        estructuraTabla.getString("descripcion"),                        
                        estructuraTabla.getString("numero_placa"),
                        estructuraTabla.getString("marca"),
                        estructuraTabla.getString("modelo"),
                        estructuraTabla.getString("color"),
                        estructuraTabla.getString("motor"),
                        estructuraTabla.getString("id_gps"),
                        estructuraTabla.getString("chip_gps"),
                        estructuraTabla.getBytes("foto"),
                        estructuraTabla.getString("agencia_proveedora"),
                        estructuraTabla.getInt("codigo_seleccion_agencia_para_vehiculo"),
                        estructuraTabla.getInt("codigo_agencia_vehiculo"));
                //GUARDAR DATOS QUE NO SE AGREGARÁN A LOS TEXTBOX
                codigo_vehiculo = catalogo.getCodigo();
                codigo_agencias = catalogo.getAgencia_proveedora();
                codigo_direccion = catalogo.getCodigo_seleccion_agencia_para_vehiculo();               
                
                //OBTENER DIRECCION DEL CLIENTE
                direccion_completa = ConexionBaseDeDatos.ConexionBD.obtenerDireccionParaCliente(codigo_direccion);                
                
                //SE AGREGAN LOS DATOS A LAS CAJAS DE TEXTO
                txtInformacionMotosDescripcion.setText(catalogo.getDescripcion());
                txtInformacionMotosNumeroPlaca.setText(catalogo.getNumero_placa());
                txtInformacionMotosMarca.setText(catalogo.getMarca());
                txtInformacionMotosModelo.setText(catalogo.getModelo());
                txtInformacionMotosColor.setText(catalogo.getColor());
                txtInformacionMotosMotor.setText(catalogo.getMotor());
                txtInformacionMotosIdGPS.setText(catalogo.getId_gps());
                txtInformacionMotosChipGPS.setText(catalogo.getChip_gps());
                txtInformacionMotosFoto.setText("Foto Agregada");
                foto = new ByteArrayInputStream(catalogo.getFoto());
                txtInformacionMotosAgenciaProveedora.setText(codigo_agencias);
                ImageIcon fotografia = new ImageIcon(catalogo.getFoto());
                Image imagen = fotografia.getImage();
                Image nuevaImagen = imagen.getScaledInstance(268, 358, Image.SCALE_SMOOTH);
                ImageIcon fotografiaMostrar = new ImageIcon(nuevaImagen);
                lblFoto.setIcon(fotografiaMostrar);
            }
        }catch(SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    
    private void lblBotonActualizarRegistroCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonActualizarRegistroCarroMouseClicked
        //REALIZA LA VALIDACION DE CAMPOS VACIOS 
        if(txtInformacionMotosDescripcion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Descripcion");
        }else if (txtInformacionMotosNumeroPlaca.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Numero de Placa");
        }else if (txtInformacionMotosMarca.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Marca");
        }else if (txtInformacionMotosModelo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Modelo");
        }else if (txtInformacionMotosColor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Color");
        }else if (txtInformacionMotosMotor.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Motor");
        }else if (txtInformacionMotosIdGPS.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Id del GPS");
        }else if (txtInformacionMotosChipGPS.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Chip del GPS");
        }else if (txtInformacionMotosFoto.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Foto");
        }else if (txtInformacionMotosAgenciaProveedora.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: Agencia Proveedora");
        }  else{
             //PREPARAR ARCHIVO PARA BASE DE DATOS SI EXISTE UNO
        if(txtInformacionMotosFoto.getText().equals("")){
            foto = null;
        }else{
                String descripcion = txtInformacionMotosDescripcion.getText();
                String numero_placa = txtInformacionMotosNumeroPlaca.getText();
                String marca = txtInformacionMotosMarca.getText();
                String modelo = txtInformacionMotosModelo.getText();
                String color = txtInformacionMotosColor.getText();
                String motor = txtInformacionMotosMotor.getText();
                String id_gps = txtInformacionMotosIdGPS.getText();
                String chip_gps = txtInformacionMotosChipGPS.getText();               
                String agencia_proveedora = txtInformacionMotosAgenciaProveedora.getText();
                
            //PREPARAR ARCHIVO PARA BASE DE DATOS SI EXISTE UNO
                    if(txtInformacionMotosFoto.getText().equals("Foto Agregada")){        
                        //ACTUALIZACIÓN DE DATOS
                        ConexionBD.Iniciar();
                        resultadoInstruccion = ConexionBD_CatalogoDeMotos.actualizarMotos("VIGENTE", "MOTO", descripcion, numero_placa, marca, modelo, color, motor, id_gps, chip_gps, foto, codigo_agencia);
                      
                        ConexionBD_CatalogoDeMotos.EditarVehiculoAgencia(codigo_direccion, codigo_vehiculo);
                        ConexionBD.Finalizar();
                    }else{
                        //SENTENCIA PARA VERIFICAR SI AGREGÓ ARCHIVO O SI QUEDARÁ NULL
                        if(verificarSiAgregoArchivo == true){
                            File file = new File(rutaArchivo);
                            try {
                                fotoSiActualiza = new FileInputStream(file);
                            }catch (FileNotFoundException ex) {
                                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else{
                            fotoSiActualiza = null;
                        }
                        //ACTUALIZACIÓN DE DATOS
                        ConexionBD.Iniciar();
                        resultadoInstruccion = ConexionBD_CatalogoDeMotos.actualizarMotos("VIGENTE", "MOTO", descripcion, numero_placa, marca, modelo, color, motor, id_gps, chip_gps, fotoSiActualiza, codigo_agencia);
                        
                        ConexionBD_CatalogoDeMotos.EditarVehiculoAgencia(codigo_direccion, codigo_vehiculo);
                        ConexionBD.Finalizar(); 
                    }   
        }
                //SE VERIFICA SI SE REALIZÓ EL INGRESO DE DATOS
        if(resultadoInstruccion == true){
            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS ÉXITOSAMENTE");
            

            //LIMPIEZA DE VARIABLES GLOBALES
            resultadoInstruccion = false;
            codigo_direccion = 0;
            direccion_completa = null;
            nombreArchivo = null;
            rutaArchivo = null;
            foto = null;
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL INGRESAR LOS DATOS");
        }
        }
    }//GEN-LAST:event_lblBotonActualizarRegistroCarroMouseClicked

    private void txtInformacionMotosNumeroPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInformacionMotosNumeroPlacaKeyTyped
        noEspacios(evt);
    }//GEN-LAST:event_txtInformacionMotosNumeroPlacaKeyTyped

    private void txtInformacionMotosIdGPSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInformacionMotosIdGPSKeyTyped
        noEspacios(evt);
    }//GEN-LAST:event_txtInformacionMotosIdGPSKeyTyped

    private void txtInformacionMotosChipGPSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInformacionMotosChipGPSKeyTyped
        noEspacios(evt);
    }//GEN-LAST:event_txtInformacionMotosChipGPSKeyTyped

    private void lblBotonAdjuntarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonAdjuntarFotoMouseClicked
       //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos JPG, PNG", "jpg", "png");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivo = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivo = archivoSeleccionado.getSelectedFile().getPath();
            txtInformacionMotosFoto.setText(nombreArchivo);
            verificarSiAgregoArchivo = true;
        }
    }//GEN-LAST:event_lblBotonAdjuntarFotoMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        //VALIDAR SI EXISTE UN PDF AGREGADO
        if(txtInformacionMotosFoto.getText().equals("Foto Agregada")){
            JOptionPane.showMessageDialog(null, "Debe agregar una foto previamente a visualizar.");
            return;
        }
        //FUNCIÓN PARA VISUALIZAR PDF
            try{
                ProcessBuilder visualizar = new ProcessBuilder();//SE PREPARA EL PROCESSBUILDER PARA VIZUALIZAR
                visualizar.command("cmd.exe","/c",rutaArchivo);//SE LE BRINDA LA RUTA
                visualizar.start();//SE ABRE EL ARCHIVO
            }catch(IOException ex){
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jLabel19MouseClicked

    //VARIABLE AUXILIAR QUE ALMACENARA EL CARACTER INGRESADO
    Character simbolo;
    private void noEspacios (KeyEvent evt){
        //SE ALMACENA EL CARACTER
        simbolo = evt.getKeyChar();
        //SE COMPARA SI ES UN ESPACIO EN BLANCO
        if (simbolo == KeyEvent.VK_SPACE){
            //SI ES ASI SE CONSUME Y DESAPARECE EL VALOR, DEVOLVIENDO COMO QUE NO SE HUBIERA PRESIONADO NADA
            evt.consume();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBotonActualizarRegistroCarro;
    private javax.swing.JLabel lblBotonAdjuntarFoto;
    private javax.swing.JLabel lblBotonBuscarAgencia;
    private javax.swing.JLabel lblFoto;
    public static javax.swing.JTextField txtInformacionMotosAgenciaProveedora;
    private javax.swing.JTextField txtInformacionMotosChipGPS;
    private javax.swing.JTextField txtInformacionMotosColor;
    private javax.swing.JTextField txtInformacionMotosDescripcion;
    private javax.swing.JTextField txtInformacionMotosFoto;
    private javax.swing.JTextField txtInformacionMotosIdGPS;
    private javax.swing.JTextField txtInformacionMotosMarca;
    private javax.swing.JTextField txtInformacionMotosModelo;
    private javax.swing.JTextField txtInformacionMotosMotor;
    private javax.swing.JTextField txtInformacionMotosNumeroPlaca;
    // End of variables declaration//GEN-END:variables
}
