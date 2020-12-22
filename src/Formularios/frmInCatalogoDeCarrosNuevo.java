/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_CatalogoDeCarros;
import static Formularios.frmPrincipal.jdpPantallaPrincipal;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author alber
 */
public class frmInCatalogoDeCarrosNuevo extends javax.swing.JInternalFrame {
    //VARIABLES GLOBALES    
    //Variables para Alto y Ancho de Formularios Internos
    int alto, ancho;
    
    //VARIABLES GLOBALES PARA OBTENER CODIGO Y DIRECCION
    public static int codigo_agencia;
    public static String nombre_agencia;
    
    //VARIABLES PARA OBTENER NOMBRE Y RUTA DEL ARCHIVO
    String nombreArchivo;
    String rutaArchivo;
    FileInputStream foto;
    
    //VARIABLE PARA SABER SI SE INGRESO DATO
    boolean ingresoCarro = false;
    int ultimoCarroIngresado = 0;
    boolean ingresoSeleccionAgenciaCarro = false;

    public frmInCatalogoDeCarrosNuevo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRegistroCarrosDescripcion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRegistroCarrosNumeroPlaca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRegistroCarrosMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRegistroCarrosModelo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtRegistroCarrosColor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRegistroCarrosMotor = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRegistroCarrosIdGPS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRegistroCarrosChipGPS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRegistroCarrosFoto = new javax.swing.JTextField();
        lblBotonAdjuntarFoto = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtRegistroCarrosAgenciaProveedora = new javax.swing.JTextField();
        lblBotonBuscarAgenciaProveedora = new javax.swing.JLabel();
        lblBotonGuardarRegistroCarro = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRAR NUEVO CARRO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtRegistroCarrosDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroCarrosDescripcionActionPerformed(evt);
            }
        });

        jLabel2.setText("1. DESCRIPCIÓN:");

        jLabel3.setText("2. NÚMERO DE PLACA:");

        txtRegistroCarrosNumeroPlaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroCarrosNumeroPlacaKeyTyped(evt);
            }
        });

        jLabel4.setText("3. MARCA:");

        jLabel5.setText("4. MODELO:");

        jLabel6.setText("5. COLOR:");

        jLabel7.setText("6. MOTOR:");

        jLabel8.setText("7. ID DEL GPS:");

        txtRegistroCarrosIdGPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroCarrosIdGPSKeyTyped(evt);
            }
        });

        jLabel9.setText("8. CHIP DEL GPS:");

        txtRegistroCarrosChipGPS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroCarrosChipGPSKeyTyped(evt);
            }
        });

        jLabel10.setText("9. FOTO:");

        txtRegistroCarrosFoto.setEditable(false);

        lblBotonAdjuntarFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        lblBotonAdjuntarFoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonAdjuntarFotoMouseClicked(evt);
            }
        });

        jLabel12.setText("10. AGENCIA PROVEEDORA:");

        txtRegistroCarrosAgenciaProveedora.setEditable(false);
        txtRegistroCarrosAgenciaProveedora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroCarrosAgenciaProveedoraActionPerformed(evt);
            }
        });

        lblBotonBuscarAgenciaProveedora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N
        lblBotonBuscarAgenciaProveedora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonBuscarAgenciaProveedoraMouseClicked(evt);
            }
        });

        lblBotonGuardarRegistroCarro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_accept_50x50.png"))); // NOI18N
        lblBotonGuardarRegistroCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonGuardarRegistroCarroMouseClicked(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(lblBotonGuardarRegistroCarro)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegistroCarrosDescripcion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtRegistroCarrosModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtRegistroCarrosColor)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(txtRegistroCarrosNumeroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtRegistroCarrosMarca)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtRegistroCarrosMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtRegistroCarrosIdGPS)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(txtRegistroCarrosChipGPS, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(txtRegistroCarrosFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblBotonAdjuntarFoto))))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(txtRegistroCarrosAgenciaProveedora, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblBotonBuscarAgenciaProveedora)))
                                .addGap(0, 2, Short.MAX_VALUE)))))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCarrosDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCarrosNumeroPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCarrosMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCarrosModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCarrosColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCarrosMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCarrosIdGPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegistroCarrosChipGPS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtRegistroCarrosFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBotonAdjuntarFoto))))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRegistroCarrosAgenciaProveedora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBotonBuscarAgenciaProveedora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblBotonGuardarRegistroCarro)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegistroCarrosDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroCarrosDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroCarrosDescripcionActionPerformed

    private void txtRegistroCarrosAgenciaProveedoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroCarrosAgenciaProveedoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroCarrosAgenciaProveedoraActionPerformed
   
    private void lblBotonBuscarAgenciaProveedoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonBuscarAgenciaProveedoraMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario para Buscar Agencias de Carros
        frmInCatalogoDeCarrosBuscarAgencia frmCatalogoDeCarrosBuscarAgencia = new frmInCatalogoDeCarrosBuscarAgencia();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmCatalogoDeCarrosBuscarAgencia.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmCatalogoDeCarrosBuscarAgencia.getHeight()/2;
        
        frmInCatalogoDeCarrosBuscarAgencia.comparador =  true;
        
        jdpPantallaPrincipal.add(frmCatalogoDeCarrosBuscarAgencia);
        frmCatalogoDeCarrosBuscarAgencia.setLocation(ancho, alto);
        frmCatalogoDeCarrosBuscarAgencia.show();
    }//GEN-LAST:event_lblBotonBuscarAgenciaProveedoraMouseClicked

    private void lblBotonAdjuntarFotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonAdjuntarFotoMouseClicked
         //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Fotografía", "jpg", "png", "jpeg");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivo = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivo = archivoSeleccionado.getSelectedFile().getPath();
            
            txtRegistroCarrosFoto.setText(nombreArchivo);
        }
    }//GEN-LAST:event_lblBotonAdjuntarFotoMouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        //VALIDAR SI EXISTE UN PDF AGREGADO
        if(txtRegistroCarrosFoto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe agregar una Imagen previamente a visualizar.");
            return;
        }

        //FUNCIÓN PARA VISUALIZAR LA IMAGEN
        try{
            ProcessBuilder visualizar = new ProcessBuilder();
            visualizar.command("cmd.exe","/c",rutaArchivo);
            visualizar.start();
        }catch(IOException ex){
            Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void lblBotonGuardarRegistroCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonGuardarRegistroCarroMouseClicked
        // TODO add your handling code here:
        //VALIDAR CAMPOS VACÍOS
        if(validarCampos() == false){
            return;
        }
        
        File file = new File(rutaArchivo);
        try {
            foto = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ConexionBD.Iniciar();
        ingresoCarro = ConexionBD_CatalogoDeCarros.ingresarCatalogoCarro("VIGENTE", "CARRO", txtRegistroCarrosDescripcion.getText().toUpperCase(), 
                                                txtRegistroCarrosNumeroPlaca.getText().toUpperCase(), txtRegistroCarrosMarca.getText().toUpperCase(), 
                                                txtRegistroCarrosModelo.getText().toUpperCase(), txtRegistroCarrosColor.getText().toUpperCase(), 
                                                txtRegistroCarrosMotor.getText().toUpperCase(), txtRegistroCarrosIdGPS.getText().toUpperCase(), 
                                                txtRegistroCarrosChipGPS.getText().toUpperCase(), foto);
        ultimoCarroIngresado = ConexionBD_CatalogoDeCarros.obtenerUltimoCarroIngresado();
        ingresoSeleccionAgenciaCarro = ConexionBD_CatalogoDeCarros.ingresarSeleccionDeAgenciaParaVehiculo(ultimoCarroIngresado, codigo_agencia);
        ConexionBD.Finalizar();
        
        //SE VERIFICA SI SE REALIZÓ EL INGRESO DE DATOS
        if(ingresoCarro == true && ingresoSeleccionAgenciaCarro == true){
            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS ÉXITOSAMENTE");

            //LIMPIEZA DE CAMPOS
            vaciarCampos();

            //LIMPIEZA DE VARIABLES GLOBALES
            codigo_agencia = 0;
            nombre_agencia = null;
            ingresoCarro = false;
            ultimoCarroIngresado = 0;
            ingresoSeleccionAgenciaCarro = false;
            nombreArchivo = null;
            rutaArchivo = null;
            foto = null;
        }else{
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL INGRESAR LOS DATOS");
        }
    }//GEN-LAST:event_lblBotonGuardarRegistroCarroMouseClicked

    private void txtRegistroCarrosNumeroPlacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroCarrosNumeroPlacaKeyTyped
        //FUNCIÓN PARA NO PERMITIR ESPACIOS
        char datoIngesado = evt.getKeyChar();
        
        if(Character.isWhitespace(datoIngesado)){
            evt.consume();
        }
    }//GEN-LAST:event_txtRegistroCarrosNumeroPlacaKeyTyped

    private void txtRegistroCarrosIdGPSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroCarrosIdGPSKeyTyped
        //FUNCIÓN PARA NO PERMITIR ESPACIOS
        char datoIngesado = evt.getKeyChar();
        
        if(Character.isWhitespace(datoIngesado)){
            evt.consume();
        }
    }//GEN-LAST:event_txtRegistroCarrosIdGPSKeyTyped

    private void txtRegistroCarrosChipGPSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroCarrosChipGPSKeyTyped
        //FUNCIÓN PARA NO PERMITIR ESPACIOS
        char datoIngesado = evt.getKeyChar();
        
        if(Character.isWhitespace(datoIngesado)){
            evt.consume();
        }
    }//GEN-LAST:event_txtRegistroCarrosChipGPSKeyTyped

    //FUNCIONES
    //FUNCIÓN PARA VALIDAR CAMPOS VACÍOS
    private boolean validarCampos(){
        if(txtRegistroCarrosDescripcion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Descripción");
            txtRegistroCarrosDescripcion.requestFocusInWindow();
            return false;
        }
        if(txtRegistroCarrosNumeroPlaca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Número de Placa");
            txtRegistroCarrosNumeroPlaca.requestFocusInWindow();
            return false;
        }
        if(txtRegistroCarrosMarca.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Marca");
            txtRegistroCarrosMarca.requestFocusInWindow();
            return false;
        }        
        if(txtRegistroCarrosModelo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Modelo");
            txtRegistroCarrosModelo.requestFocusInWindow();
            return false;
        }
        if(txtRegistroCarrosColor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Color");
            txtRegistroCarrosColor.requestFocusInWindow();
            return false;
        }
        if(txtRegistroCarrosMotor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Motor");
            txtRegistroCarrosMotor.requestFocusInWindow();
            return false;
        }
        if(txtRegistroCarrosIdGPS.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Id de GPS");
            txtRegistroCarrosIdGPS.requestFocusInWindow();
            return false;
        }
        if(txtRegistroCarrosChipGPS.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Chip de GPS");
            txtRegistroCarrosChipGPS.requestFocusInWindow();
            return false;
        }   
        if(txtRegistroCarrosFoto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Fotografía");
            txtRegistroCarrosFoto.requestFocusInWindow();
            return false;
        }
        if(txtRegistroCarrosAgenciaProveedora.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Agencia Proveedora");
            txtRegistroCarrosAgenciaProveedora.requestFocusInWindow();
            return false;
        }
        return true;
    }
    
    //FUNCIÓN PARA VACIAR CAMPOS
    private void vaciarCampos(){
        txtRegistroCarrosDescripcion.setText("");
        txtRegistroCarrosNumeroPlaca.setText("");
        txtRegistroCarrosMarca.setText("");
        txtRegistroCarrosModelo.setText("");
        txtRegistroCarrosColor.setText("");
        txtRegistroCarrosMotor.setText("");
        txtRegistroCarrosIdGPS.setText("");
        txtRegistroCarrosChipGPS.setText("");
        txtRegistroCarrosFoto.setText("");
        txtRegistroCarrosAgenciaProveedora.setText("");
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
    private javax.swing.JLabel lblBotonAdjuntarFoto;
    private javax.swing.JLabel lblBotonBuscarAgenciaProveedora;
    private javax.swing.JLabel lblBotonGuardarRegistroCarro;
    public static javax.swing.JTextField txtRegistroCarrosAgenciaProveedora;
    private javax.swing.JTextField txtRegistroCarrosChipGPS;
    private javax.swing.JTextField txtRegistroCarrosColor;
    private javax.swing.JTextField txtRegistroCarrosDescripcion;
    private javax.swing.JTextField txtRegistroCarrosFoto;
    private javax.swing.JTextField txtRegistroCarrosIdGPS;
    private javax.swing.JTextField txtRegistroCarrosMarca;
    private javax.swing.JTextField txtRegistroCarrosModelo;
    private javax.swing.JTextField txtRegistroCarrosMotor;
    private javax.swing.JTextField txtRegistroCarrosNumeroPlaca;
    // End of variables declaration//GEN-END:variables
}
