/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassMostrarClientes;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_Cliente;
import static Formularios.frmInClientes.tbClientes;
import static Formularios.frmPrincipal.jdpPantallaPrincipal;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;

/**
 *
 * @author alberto
 */



public class frmInClienteNuevo extends javax.swing.JInternalFrame {
    //VARIABLES GLOBALES
    //Variables para el Alto y Ancho del Formulario
    int alto, ancho;
    
    //VARIABLES PARA OBTENER DIRECCION Y CODIGO DE DIRECCION
    public static int codigo_direccion;
    public static String direccion_completa;
    
    //VARIABLE PARA SABER SI SE INGRESÓ CORRECTAMENTE EL REGISTRO DEL CLIENTE
    boolean ingresarCliente = false;
    
    
    //VARIABLE GLOBAL PARA DOCUMENTOS
    String nombreArchivo, rutaArchivo;
    FileInputStream pdfParaDpi;
    
    public frmInClienteNuevo() {
        initComponents();     
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtRegistroClienteDPI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRegistroClienteNombres = new javax.swing.JTextField();
        txtRegistroClienteApellidos = new javax.swing.JTextField();
        cmbRegistroClienteGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRegistroClienteTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRegistroClienteCorreoElectronico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRegistroClienteDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRegistroClienteCuentaBancaria = new javax.swing.JTextField();
        txtRegistroClientePerfilFacebook = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtRegistroClientePerfilInstagram = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtRegistroClientePDFDPI = new javax.swing.JTextField();
        lblBotonBuscarDireccion = new javax.swing.JLabel();
        lblBotonAdjuntarArchivo = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dcRegistroFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtRegistroClienteCalleAvenida = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtRegistroClienteNumeroCasa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtRegistroClienteZona = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORMULARIO DE REGISTRO DE CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setText("1. DPI:");

        txtRegistroClienteDPI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroClienteDPIKeyTyped(evt);
            }
        });

        jLabel3.setText("2. NOMBRES:");

        cmbRegistroClienteGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Género...", "Masculino", "Femenino" }));

        jLabel4.setText("3. APELLIDOS:");

        jLabel5.setText("4. GÉNERO:");

        jLabel6.setText("5. FECHA NACIMIENTO:");

        jLabel7.setText("6. TELÉFONO:");

        txtRegistroClienteTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroClienteTelefonoKeyTyped(evt);
            }
        });

        jLabel8.setText("7. CORREO ELECTRÓNICO:");

        jLabel9.setText("11. DIRECCIÓN:");

        txtRegistroClienteDireccion.setEditable(false);
        txtRegistroClienteDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegistroClienteDireccionActionPerformed(evt);
            }
        });

        jLabel10.setText("12. CUENTA BANCARIA:");

        txtRegistroClienteCuentaBancaria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroClienteCuentaBancariaKeyTyped(evt);
            }
        });

        jLabel11.setText("13. PERFIL DE FACEBOOK:");

        jLabel12.setText("14. PERFIL DE INSTAGRAM:");

        jLabel13.setText("15. PDF DE DPI:");

        txtRegistroClientePDFDPI.setEditable(false);

        lblBotonBuscarDireccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N
        lblBotonBuscarDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonBuscarDireccionMouseClicked(evt);
            }
        });

        lblBotonAdjuntarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        lblBotonAdjuntarArchivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBotonAdjuntarArchivoMouseClicked(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pdf_20x20.png"))); // NOI18N

        dcRegistroFechaNacimiento.setDateFormatString("yyyy-MM-dd");

        jLabel15.setText("8. CALLE/AVENIDA:");

        jLabel16.setText("9. NÚMERO DE CASA:");

        txtRegistroClienteNumeroCasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroClienteNumeroCasaKeyTyped(evt);
            }
        });

        jLabel17.setText("10. ZONA:");

        txtRegistroClienteZona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRegistroClienteZonaKeyTyped(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_see_20x20.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_accept_50x50.png"))); // NOI18N
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtRegistroClienteCalleAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtRegistroClienteNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(txtRegistroClienteZona, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRegistroClientePerfilFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRegistroClientePerfilInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel13)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel14)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel19)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(txtRegistroClientePDFDPI))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblBotonAdjuntarArchivo))
                                .addComponent(jLabel10)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(dcRegistroFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRegistroClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(txtRegistroClienteCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel2)
                                .addComponent(txtRegistroClienteDPI)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(txtRegistroClienteNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRegistroClienteApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(cmbRegistroClienteGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(txtRegistroClienteCuentaBancaria)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(txtRegistroClienteDireccion))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lblBotonBuscarDireccion)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel18)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegistroClienteDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistroClienteNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistroClienteApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbRegistroClienteGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRegistroClienteTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRegistroClienteCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcRegistroFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegistroClienteCalleAvenida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistroClienteNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistroClienteZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBotonBuscarDireccion)
                    .addComponent(txtRegistroClienteDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegistroClienteCuentaBancaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRegistroClientePerfilFacebook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRegistroClientePerfilInstagram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtRegistroClientePDFDPI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblBotonAdjuntarArchivo)))
                    .addComponent(jLabel19))
                .addGap(27, 27, 27)
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblBotonBuscarDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonBuscarDireccionMouseClicked
        // TODO add your handling code here:
        //Abrir el Formulario Direccion
        frmInClienteBuscarDireccion frmClientesBuscarDireccion = new frmInClienteBuscarDireccion();
        ancho = (jdpPantallaPrincipal.getWidth()/2) - frmClientesBuscarDireccion.getWidth()/2;
        alto = (jdpPantallaPrincipal.getHeight()/2) - frmClientesBuscarDireccion.getHeight()/2;
        
        frmInClienteBuscarDireccion.comparador = true;
        jdpPantallaPrincipal.add(frmClientesBuscarDireccion);
        frmClientesBuscarDireccion.setLocation(ancho, alto);
        frmClientesBuscarDireccion.show();
    }//GEN-LAST:event_lblBotonBuscarDireccionMouseClicked
    
    
    
    private void lblBotonGuardarRegistroMouseClicked(java.awt.event.MouseEvent evt) {                                                     
        
    }                                                    

    private void lblBotonAdjuntarArchivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBotonAdjuntarArchivoMouseClicked
        //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos PDF", "pdf");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivo = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivo = archivoSeleccionado.getSelectedFile().getPath();
            
            txtRegistroClientePDFDPI.setText(nombreArchivo);
        }
        
    }//GEN-LAST:event_lblBotonAdjuntarArchivoMouseClicked

    private void txtRegistroClienteDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegistroClienteDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegistroClienteDireccionActionPerformed

    private void txtRegistroClienteDPIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroClienteDPIKeyTyped
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
        
    }//GEN-LAST:event_txtRegistroClienteDPIKeyTyped

    private void txtRegistroClienteNumeroCasaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroClienteNumeroCasaKeyTyped
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
    }//GEN-LAST:event_txtRegistroClienteNumeroCasaKeyTyped

    private void txtRegistroClienteZonaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroClienteZonaKeyTyped
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
    }//GEN-LAST:event_txtRegistroClienteZonaKeyTyped

    private void txtRegistroClienteCuentaBancariaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroClienteCuentaBancariaKeyTyped
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
    }//GEN-LAST:event_txtRegistroClienteCuentaBancariaKeyTyped

    private void txtRegistroClienteTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRegistroClienteTelefonoKeyTyped
        // VALIDACIÓN DE SOLO NÚMEROS
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "Solo se permite el ingreso de números.");
        }
    }//GEN-LAST:event_txtRegistroClienteTelefonoKeyTyped

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        //VALIDAR SI EXISTE UN PDF AGREGADO
        if(txtRegistroClientePDFDPI.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe agregar un PDF previamente a visualizar.");
            return;
        }
        
        //FUNCIÓN PARA VISUALIZAR PDF
        try{
            ProcessBuilder visualizar = new ProcessBuilder();
            visualizar.command("cmd.exe","/c",rutaArchivo);
            visualizar.start();
        }catch(IOException ex){
            Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        //VALIDAR CAMPOS VACÍOS
        if(validarCampos() == false){
            return;
        }

        //CAMBIAR EL FORMATO DE LA FECHA
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaNacimiento = formato.format(dcRegistroFechaNacimiento.getDate());

        //PREPARAR ARCHIVO PARA BASE DE DATOS SI EXISTE UNO
        if(txtRegistroClientePDFDPI.getText().equals("")){
            pdfParaDpi = null;
        }else{
            File file = new File(rutaArchivo);
            try {
                pdfParaDpi = new FileInputStream(file);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //SE REGISTRAN LOS DATOS EN LA BASE DE DATOS
        ConexionBD.Iniciar();
        ingresarCliente = ConexionBD_Cliente.ingresarCliente("VIGENTE", txtRegistroClienteDPI.getText().toUpperCase(), txtRegistroClienteNombres.getText().toUpperCase(), txtRegistroClienteApellidos.getText().toUpperCase(),
            cmbRegistroClienteGenero.getSelectedItem().toString().toUpperCase(), fechaNacimiento, txtRegistroClienteTelefono.getText().toUpperCase(),
            txtRegistroClienteCorreoElectronico.getText(), txtRegistroClienteCalleAvenida.getText().toUpperCase(), txtRegistroClienteNumeroCasa.getText().toUpperCase(),
            txtRegistroClienteZona.getText().toUpperCase(), codigo_direccion, txtRegistroClienteCuentaBancaria.getText().toUpperCase(),
            txtRegistroClientePerfilFacebook.getText().toUpperCase(), txtRegistroClientePerfilInstagram.getText().toUpperCase(), pdfParaDpi);
        ConexionBD.Finalizar();

        //SE VERIFICA SI SE REALIZÓ EL INGRESO DE DATOS
        if(ingresarCliente == true){
            JOptionPane.showMessageDialog(null, "DATOS INGRESADOS ÉXITOSAMENTE");

            //LIMPIEZA DE CAMPOS
            vaciarCampos();
            
            //ACTUALIZA LA TABLA PRINCIPAL
            ConexionBaseDeDatos.ConexionBD.Iniciar();
            actualizarTablaClientes(ConexionBaseDeDatos.ConexionBD_Cliente.mostrarTodoClientes());
            ConexionBaseDeDatos.ConexionBD.Finalizar();
            

            //LIMPIEZA DE VARIABLES GLOBALES
            ingresarCliente = false;
            codigo_direccion = 0;
            direccion_completa = null;
            nombreArchivo = null;
            rutaArchivo = null;
            pdfParaDpi = null;
        }else{
            JOptionPane.showMessageDialog(null, "HUBO UN ERROR AL INGRESAR LOS DATOS");
        }
    }//GEN-LAST:event_jLabel18MouseClicked

                                                  

    //FUNCIONES
    //FUNCION PARA VALIDAR DATOS
    private boolean validarCampos(){
        if(txtRegistroClienteDPI.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - DPI");
            txtRegistroClienteDPI.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteNombres.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Nombres");
            txtRegistroClienteNombres.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteApellidos.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Apellidos");
            txtRegistroClienteApellidos.requestFocusInWindow();
            return false;
        }
        if(cmbRegistroClienteGenero.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Seleccione Género");
            cmbRegistroClienteGenero.requestFocusInWindow();
            return false;
        }
        if(dcRegistroFechaNacimiento.getDate() == null){
            JOptionPane.showMessageDialog(null, "Agregue Fecha de Nacimiento");
            dcRegistroFechaNacimiento.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Teléfono");
            txtRegistroClienteTelefono.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteCorreoElectronico.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Correo Electrónico");
            txtRegistroClienteCorreoElectronico.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteCalleAvenida.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Calle/Avenida");
            txtRegistroClienteCalleAvenida.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteNumeroCasa.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Número de Casa");
            txtRegistroClienteNumeroCasa.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteZona.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Zona");
            txtRegistroClienteZona.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Dirección");
            txtRegistroClienteDireccion.requestFocusInWindow();
            return false;
        }
        if(txtRegistroClienteCuentaBancaria.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo Vacío - Cuenta Bancaria");
            txtRegistroClienteCuentaBancaria.requestFocusInWindow();
            return false;
        }
        return true;
    }
    
    
    
    //FUNCIÓN PARA VACIAR CAMPOS
    private void vaciarCampos(){
        txtRegistroClienteDPI.setText("");
        txtRegistroClienteNombres.setText("");
        txtRegistroClienteApellidos.setText("");
        cmbRegistroClienteGenero.setSelectedIndex(0);
        dcRegistroFechaNacimiento.setDate(null);
        txtRegistroClienteTelefono.setText("");
        txtRegistroClienteCorreoElectronico.setText("");
        txtRegistroClienteCalleAvenida.setText("");
        txtRegistroClienteNumeroCasa.setText("");
        txtRegistroClienteZona.setText("");
        txtRegistroClienteDireccion.setText("");
        txtRegistroClienteCuentaBancaria.setText("");
        txtRegistroClientePerfilFacebook.setText("");
        txtRegistroClientePerfilInstagram.setText("");
        txtRegistroClientePDFDPI.setText("");
    }
    
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
    private javax.swing.JComboBox<String> cmbRegistroClienteGenero;
    private com.toedter.calendar.JDateChooser dcRegistroFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel lblBotonAdjuntarArchivo;
    private javax.swing.JLabel lblBotonBuscarDireccion;
    private javax.swing.JTextField txtRegistroClienteApellidos;
    private javax.swing.JTextField txtRegistroClienteCalleAvenida;
    private javax.swing.JTextField txtRegistroClienteCorreoElectronico;
    private javax.swing.JTextField txtRegistroClienteCuentaBancaria;
    private javax.swing.JTextField txtRegistroClienteDPI;
    public static javax.swing.JTextField txtRegistroClienteDireccion;
    private javax.swing.JTextField txtRegistroClienteNombres;
    private javax.swing.JTextField txtRegistroClienteNumeroCasa;
    private javax.swing.JTextField txtRegistroClientePDFDPI;
    private javax.swing.JTextField txtRegistroClientePerfilFacebook;
    private javax.swing.JTextField txtRegistroClientePerfilInstagram;
    private javax.swing.JTextField txtRegistroClienteTelefono;
    private javax.swing.JTextField txtRegistroClienteZona;
    // End of variables declaration//GEN-END:variables
}
