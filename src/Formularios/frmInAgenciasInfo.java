/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassAgencias;
import Clases.ClassMostrarAgencias;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_Agencias;
import static Formularios.frmInAgenciasBuscarDireccion.codigo;
import static Formularios.frmInAgenciasNuevo.codigo_direccion;
import static Formularios.frmInAgenciasNuevo.resultadoInstruccion;
import static Formularios.frmInAgenciasNuevo.txtDireccion;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Martin Rosales
 */
public class frmInAgenciasInfo extends javax.swing.JInternalFrame {
//VARIABLES GLOBALES PARA DIRECCION
    public static int codigo_direccion;
    public static String nombre_direccion;
    public static int codigo_agencia;
    int codigo_agencias;
    String state;
    String direccion_completa;
    
    //VARIABLE GLOBAL PARA DOCUMENTOS
    String nombreArchivo, rutaArchivo;
    FileInputStream pdfParaDpiSiActualiza;
    InputStream pdfParaDpiSiNoActualiza;
    boolean verificarSiAgregoArchivo = false;
    
    //VARIABLES GLOBALES PARA GUARDAR DATOS QUE NO SE MOSTRARÁN EN LOS TXT
    public static int codigo_cliente;
    
    Blob pdfDpi;
    /**
     * Creates new form frmInAgenciasInfo
     */
    public frmInAgenciasInfo() {
        initComponents();
        //DESPLIEGA EL FRAME EN EL CENTRO DE LA PANTALLA
                this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
                //INICIA LA CONEXION A LA BD
                ConexionBD.Iniciar();
                llenarCampos(ConexionBD_Agencias.obtenerTodosLosDatosAgencias(codigo_agencia));
                ConexionBD.Finalizar();  }

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
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblGuardar = new javax.swing.JLabel();
        lblBusqueda = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumCasa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtZona = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPatentes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMinimumSize(new java.awt.Dimension(480, 605));
        setPreferredSize(new java.awt.Dimension(480, 605));

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INFORMACION DE AGENCIAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel2.setText("1. NOMBRE:");

        jLabel3.setText("2. TELEFONO:");

        jLabel4.setText("3. CORREO ELECTRONICO:");

        jLabel5.setText("7. DIRECCIÓN");

        txtDireccion.setEditable(false);

        lblGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_save_50x50.png"))); // NOI18N
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
        });

        lblBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_search_20x20.png"))); // NOI18N
        lblBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBusquedaMouseClicked(evt);
            }
        });

        jLabel6.setText("4. CALLE/AVENIDA");

        jLabel7.setText("5. NÚMERO DE CASA");

        jLabel8.setText("6. ZONA");

        jLabel9.setText("8. PATENTES Y RTU: ");

        txtPatentes.setEditable(false);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pdf_20x20.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_see_20x20.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblBusqueda))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPatentes, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblGuardar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBusqueda))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(lblGuardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        //Validar Campos Vacios
        if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Vacio: Nombre");
        }else if(txtTelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Vacio: Telefono");
        }else if(txtCorreo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Vacio: Correo Electronico");
        }else if(txtDireccion.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Vacio: Dirección");
        }else if(txtCalle.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Vacio: Calle");
        }else if(txtNumCasa.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Vacio: Número de Casa");
        }else if(txtZona.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Vacio: Zona");
        }else{
            //SE EVALUA FORMATO INGRESADO EN CADA CAMPO
            if(!isNumeric(txtTelefono.getText())){
                JOptionPane.showMessageDialog(rootPane, "Ingrese Un Valor Numerico en el Campo: Telefono");
            }else if (!isNumeric(txtZona.getText())){
                JOptionPane.showMessageDialog(rootPane, "Ingrese Un Valor Numerico en el Campo: Zona");
            }else {
                //SE DELIMITAN CIERTOS CAMPOS DEPENDIENDO LOS CARACTERES MAXIMOS PERMITIDOS
                String contador;
                //VARIABLE QUE RECIBE EL CAMPO DETERMINADO Y COMPARARA SU LONGITUD
                contador=txtTelefono.getText();
                if(contador.length()>15){
                    JOptionPane.showMessageDialog(rootPane, "Telefono: Solo Puede Ingresar 8 Numeros Como Maximo");
                }else{ contador=txtZona.getText();
                    if(contador.length()>2){
                        JOptionPane.showMessageDialog(rootPane, "Zona: Solo Puede Ingresar 2 Numeros Como Maximo");
                    }else{
                        //TODOS LOS CAMPOS VERIFICADOS CORRECTAMENTE, PASA A INGRESARLOS A LA BD
                        String nombre = txtNombre.getText();
                        String telefono = txtTelefono.getText();
                        String correo = txtCorreo.getText();
                        String calle = txtCalle.getText();
                        String numcasa = txtNumCasa.getText();
                        String zona = txtZona.getText();
                        int direccion = codigo_direccion;
                        
                        //PREPARAR ARCHIVO PARA BASE DE DATOS SI EXISTE UNO
                    if(txtPatentes.getText().equals("PDF Agregado")){
                        try {
                            pdfParaDpiSiNoActualiza = pdfDpi.getBinaryStream();
                            //DEVUELVE LOS VALORES YA EDITADOS
                            ConexionBD.Iniciar();
                            resultadoInstruccion = ConexionBD_Agencias.actualizarAgencias("VIGENTE", nombre, telefono, correo, calle, numcasa, zona, direccion, pdfParaDpiSiNoActualiza, codigo_agencias);
                            ConexionBD.Finalizar();
                        } catch (SQLException ex) {
                            Logger.getLogger(frmInClienteInformacion.class.getName()).log(Level.SEVERE, null, ex);
                            }  
                    }else{
                            //SENTENCIA PARA VERIFICAR SI AGREGÓ ARCHIVO O SI QUEDARÁ NULL
                            if(verificarSiAgregoArchivo == true){
                                File file = new File(rutaArchivo);
                                try {
                                    pdfParaDpiSiActualiza = new FileInputStream(file);
                                }catch (FileNotFoundException ex) {
                                    Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }else{
                                pdfParaDpiSiActualiza = null;
                            }           
                                ConexionBD.Iniciar();
                                resultadoInstruccion = ConexionBD_Agencias.actualizarAgencias("VIGENTE", nombre, telefono, correo, calle, numcasa, zona, direccion, pdfParaDpiSiActualiza, codigo_agencias);
                                ConexionBD.Finalizar();           
                                //DETERMINA SI LOS DATOS SE INGRESARON CORRECTAMENTE O SI EXISTIO UN ERROR
                                if(resultadoInstruccion == false){
                                    JOptionPane.showMessageDialog(null,"Hubo un problema al intentar agregar el registro, contacte a soporte tecnico si el problema persiste");
                                }else if (resultadoInstruccion == true ){
                                    JOptionPane.showMessageDialog(null, "Datos ingresados correctamente");
                                    //RESETEA LOS CAMPOS DE TEXTO
                                    txtNombre.setText("");
                                    txtTelefono.setText("");
                                    txtCorreo.setText("");
                                    txtCalle.setText("");
                                    txtNumCasa.setText("");
                                    txtZona.setText("");
                                    txtDireccion.setText("");
                                    //ACTUALIZA LA TABLA PRINCIPAL
                                    ConexionBaseDeDatos.ConexionBD.Iniciar();
                                    actualizarTablaAgencias(ConexionBaseDeDatos.ConexionBD_Agencias.mostrarTodoAgencias());
                                    ConexionBaseDeDatos.ConexionBD.Finalizar();
                                }
                    }
                }
            }
        }
    }
    }//GEN-LAST:event_lblGuardarMouseClicked
private void llenarCampos(ResultSet estructuraTabla){
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                
                //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
                ClassAgencias agencia = new ClassAgencias( //se instancia un objeto de la clase correspondiente para llenar la tabla mediante un while
                        estructuraTabla.getInt("codigo"),                        
                        estructuraTabla.getString("state"),
                        estructuraTabla.getString("nombre_casa_comercial"),
                        estructuraTabla.getString("telefono"),
                        estructuraTabla.getString("correo_electronico"),
                        estructuraTabla.getString("calle_avenida"),
                        estructuraTabla.getString("numero_casa"),
                        estructuraTabla.getString("zona"),
                        estructuraTabla.getInt("cod_direccion"),
                        estructuraTabla.getBlob("pdf_patentes_rtu"));
                
                //GUARDAR DATOS QUE NO SE AGREGARÁN A LOS TEXTBOX
                codigo_agencias = agencia.getCodigo();
                state = agencia.getState();
                codigo_direccion = agencia.getCod_direccion();
                pdfDpi = agencia.getPdf_dpi();
                
                //OBTENER DIRECCION DEL CLIENTE
                direccion_completa = ConexionBaseDeDatos.ConexionBD.obtenerDireccionParaCliente(codigo_direccion);                
                
                //SE AGREGAN LOS DATOS A LAS CAJAS DE TEXTO
                txtNombre.setText(agencia.getNombre_casa_comercial());
                txtTelefono.setText(agencia.getTelefono());
                txtCorreo.setText(agencia.getCorreo_electronico());
                txtCalle.setText(agencia.getCalle_avenida());
                txtNumCasa.setText(agencia.getNumero_casa());
                txtZona.setText(agencia.getZona());
                txtDireccion.setText(direccion_completa); 
                if(pdfDpi != null){
                    txtPatentes.setText("PDF Agregado");
                }
            }
        }catch(SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    private void lblBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBusquedaMouseClicked
        //DESPLIEGA EL FORMULARIO DE BUSQUEDA DE DIRECCION
        frmInAgenciasBuscarDireccion frmBusqueda = new frmInAgenciasBuscarDireccion();
        frmPrincipal.jdpPantallaPrincipal.add(frmBusqueda);
        //DA VALOR AL COMPARADOR
        frmInAgenciasBuscarDireccion.comparador=true;
        frmBusqueda.show();
    }//GEN-LAST:event_lblBusquedaMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        //VALIDAR SI EXISTE UN PDF AGREGADO
        if(txtPatentes.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe agregar un PDF previamente a visualizar.");
            return;
        }

        //FUNCIÓN PARA VISUALIZAR PDF
        if(verificarSiAgregoArchivo == true){//PRIMER IF POR SI SE AGREGA NUEVO ARCHIVO
            try{
                ProcessBuilder visualizar = new ProcessBuilder();//SE PREPARA EL PROCESSBUILDER PARA VIZUALIZAR
                visualizar.command("cmd.exe","/c",rutaArchivo);//SE LE BRINDA LA RUTA
                visualizar.start();//SE ABRE EL ARCHIVO
            }catch(IOException ex){
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{            
            try { 
                //SE PREPARA EL ARCHIVO BLOB COMO INPUTSTREAM
                InputStream bos = pdfDpi.getBinaryStream();        
                
                //SE REALIZAN LAS CONVERSIONES
                int tamanoInput = bos.available();
                byte[] datosPDF = new byte[tamanoInput];
                bos.read(datosPDF, 0, tamanoInput);
                
                //SE DESCARGA EL ARCHIVO EN LA RUTA DEL ROOT DEL PROYECTO
                OutputStream out = new FileOutputStream("temporal.pdf");
                out.write(datosPDF);

                //SE CIERRAN LOS STREAM
                out.close();
                bos.close();   
                
                //NUEVAMENTE CON PROCESSBUILDER SE VISUALIZA EL ARCHIVO DESCARGADO
                ProcessBuilder visualizar = new ProcessBuilder();
                visualizar.command("cmd.exe","/c","temporal.pdf");
                visualizar.start();
                
            }catch (IOException | NumberFormatException  | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Debe cerrar todos los archivos previamente abiertos. - " + ex.getMessage());
            }            
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       // TODO add your handling code here:
         //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos PDF", "pdf");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);
        
        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivo = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivo = archivoSeleccionado.getSelectedFile().getPath();
            
            txtPatentes.setText(nombreArchivo);
            
            //SE MODIFICA LA BANDERA PARA INDICAR QUE SE AGREGÓ UN ARCHIVO
            verificarSiAgregoArchivo = true;
        }

    }//GEN-LAST:event_jLabel11MouseClicked

        //VERIFICA SI EL VALOR DE UN CAMPO ES NUMERICO
        private static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCorreo;
    public static javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumCasa;
    private javax.swing.JTextField txtPatentes;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtZona;
    // End of variables declaration//GEN-END:variables
}
