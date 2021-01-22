/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ClassFinanciamientoMoto_RegistrarPago;
import Clases.ClassFinanciamientoMoto_verInformacion;
import ConexionBaseDeDatos.ConexionBD;
import ConexionBaseDeDatos.ConexionBD_FinanciamientoMotos;
import static Formularios.frmInFinanciamientoMotosInfo.codigo_agencia;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static java.lang.Double.parseDouble;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.xml.bind.DatatypeConverter.parseDouble;

/**
 *
 * @author Martin Rosales
 */
public class frmInFinanciamientoMotosRegistrarPago extends javax.swing.JInternalFrame {
public static int codigo_financiamiento;
public static String numeroContrato;
public static boolean resultadoInstruccion = false;

int codigoDetalle = 0, tiempoMeses = 0;
String tipoInteres, ultimoMes;
double amortizacionPagar = 0.0, interesPagar = 0.0, capital = 0.0, interesTotal = 0.0, gastosAdministrativos = 0.0, capitalActual = 0.0, interesActual = 0.0;

boolean verificarSiAgregoArchivo = false;
 String nombreArchivo1, rutaArchivo1;
    FileInputStream pdf1;
    Blob  pdfA1;
    int comparadorCampos;
    /**
     * Creates new form frmInFinanciamientoMotosRegistrarPago
     */
    public frmInFinanciamientoMotosRegistrarPago() {
        initComponents(); 
                    ConexionBD.Iniciar();
                    comparadorCampos = ConexionBD_FinanciamientoMotos.verificarPagoAnterior(codigo_financiamiento);
                    if (comparadorCampos >= 1){
                    llenadoCampos2(ConexionBaseDeDatos.ConexionBD_FinanciamientoMotos.obtenerUltimaModificacionDetallesPago(numeroContrato));
                    llenadoCampos(ConexionBaseDeDatos.ConexionBD_FinanciamientoMotos.obtenerDatosUltimoPagoRealizado(codigoDetalle));
                    }else if(comparadorCampos == 0){
                    llenadoCampos2(ConexionBaseDeDatos.ConexionBD_FinanciamientoMotos.obtenerUltimaModificacionDetallesPago(numeroContrato));
                    }
                    ConexionBD.Finalizar();      
        //DESPLIUEGA EL FRAME EN EL CENTRO DE LA PANTALLA
                this.setLocation ((frmPrincipal.jdpPantallaPrincipal.getWidth () - this.getWidth ()) / 2,(frmPrincipal.jdpPantallaPrincipal.getHeight () - this.getHeight ()) / 2);
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
        jLabel2 = new javax.swing.JLabel();
        txtConcepto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroComprobante = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPDF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUltimoMes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtMesPagar = new javax.swing.JTextField();
        txtInteresPagar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAmortizacionPagar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCapitalNuevo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCapitalActual = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtInteresNuevo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtInteresActual = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        lblFinalizado = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtFechaPago = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setMinimumSize(new java.awt.Dimension(604, 613));
        setPreferredSize(new java.awt.Dimension(604, 613));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("REGISTRAR PAGOS DE FINANCIAMIENTO DE MOTOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addContainerGap(416, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("1. CONCEPTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        txtConcepto.setEditable(false);
        txtConcepto.setText("PAGO NORMAL");
        getContentPane().add(txtConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 210, -1));

        jLabel3.setText("2. FECHA DE PAGO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, -1, -1));

        jLabel4.setText("3. NUMERO DE COMPROBANTE DE PAGO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtNumeroComprobante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroComprobanteKeyTyped(evt);
            }
        });
        getContentPane().add(txtNumeroComprobante, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 210, -1));

        jLabel5.setText("4. PDF DE COMPROBANTE DE PAGO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        txtPDF.setEditable(false);
        getContentPane().add(txtPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 150, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_adjunto_20x20.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icon_pdf_20x20.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, -1, -1));

        jLabel8.setText("5. ULTIMO MES DE PAGO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        txtUltimoMes.setEditable(false);
        getContentPane().add(txtUltimoMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 210, -1));

        jLabel9.setText("6. MES A PAGAR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        txtMesPagar.setEditable(false);
        getContentPane().add(txtMesPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 210, -1));

        txtInteresPagar.setEditable(false);
        getContentPane().add(txtInteresPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 210, -1));

        jLabel10.setText("jLabel9");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, -1, -1));

        txtAmortizacionPagar.setEditable(false);
        getContentPane().add(txtAmortizacionPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 210, -1));

        jLabel11.setText("7. AMORTIZACION A PAGAR");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        txtCapitalNuevo.setEditable(false);
        getContentPane().add(txtCapitalNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 210, -1));

        jLabel12.setText("10. CAPITAL NUEVO");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        txtCapitalActual.setEditable(false);
        getContentPane().add(txtCapitalActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 210, -1));

        jLabel13.setText("9. CAPITAL ACTUAL");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txtInteresNuevo.setEditable(false);
        getContentPane().add(txtInteresNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 210, -1));

        jLabel14.setText("12. INTERES NUEVO");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, -1, -1));

        txtInteresActual.setEditable(false);
        getContentPane().add(txtInteresActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 210, -1));

        jLabel15.setText("11. INTERES ACTUAL");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jLabel16.setText("13. TOTAL A PAGAR");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));

        txtTotalPagar.setEditable(false);
        getContentPane().add(txtTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 140, -1));

        lblFinalizado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_accept_50x50.png"))); // NOI18N
        lblFinalizado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinalizadoMouseClicked(evt);
            }
        });
        getContentPane().add(lblFinalizado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        jLabel18.setText("8. INTERES A PAGAR");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        txtFechaPago.setEditable(false);
        getContentPane().add(txtFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void llenadoCampos(ResultSet estructuraTabla){
    txtFechaPago.setText(fechaActual());
        Calendar c1 = Calendar.getInstance();
        String mes;
        mes = Integer.toString(c1.get(Calendar.MONTH));
        switch(mes){
            case "0": txtMesPagar.setText("Enero"); break;
            case "1": txtMesPagar.setText("Febrero"); break;
            case "2": txtMesPagar.setText("Marzo"); break;
            case "3": txtMesPagar.setText("Abril"); break;
            case "4": txtMesPagar.setText("Mayo"); break;
            case "5": txtMesPagar.setText("Junio"); break;
            case "6": txtMesPagar.setText("Julio"); break;
            case "7": txtMesPagar.setText("Agosto"); break;
            case "8": txtMesPagar.setText("Septiembre"); break;
            case "9": txtMesPagar.setText("Octubre"); break;
            case "10": txtMesPagar.setText("Noviembre"); break;
            case "11": txtMesPagar.setText("Diciembre"); break;
            default: txtMesPagar.setText("Error"); break;
        }
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                 //se obtienen los datos de la base de datos mediante el uso del constructor de la clase correspondiente
              
                //VARIABLES PARA CAMPOS CALCULABLES
                
                ultimoMes = estructuraTabla.getString("mes_pagar");
                capitalActual = estructuraTabla.getDouble("capital_nuevo");
                interesActual = estructuraTabla.getDouble("interes_nuevo");
                //SE LLENAN LOS CAMPOS CALCULABLES
                
                //VARIABLES PARA CAMPOS CALCULABLES
                double capitalNuevo = capitalActual - amortizacionPagar;
                double interesNuevo = interesActual - interesPagar;
                
                if (capitalNuevo == 0.0 && interesNuevo == 0.0){
                    gastosAdministrativos = Double.valueOf(JOptionPane.showInputDialog("Ingrese Gastos Administrativos"));
                }
                double totalPagar = amortizacionPagar + interesPagar + gastosAdministrativos;
                txtUltimoMes.setText(ultimoMes);
                txtCapitalActual.setText(String.valueOf(capitalActual));
                txtInteresActual.setText(String.valueOf(interesActual));
                txtInteresNuevo.setText(String.valueOf(interesNuevo));
                txtCapitalNuevo.setText(String.valueOf(capitalNuevo));
                txtTotalPagar.setText(String.valueOf(totalPagar));
            }
        }catch(SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    
    private void llenadoCampos2(ResultSet estructuraTabla){
        txtFechaPago.setText(fechaActual());
        Calendar c1 = Calendar.getInstance();
        String mes;
        mes = Integer.toString(c1.get(Calendar.MONTH));
        switch(mes){
            case "0": txtMesPagar.setText("Enero"); break;
            case "1": txtMesPagar.setText("Febrero"); break;
            case "2": txtMesPagar.setText("Marzo"); break;
            case "3": txtMesPagar.setText("Abril"); break;
            case "4": txtMesPagar.setText("Mayo"); break;
            case "5": txtMesPagar.setText("Junio"); break;
            case "6": txtMesPagar.setText("Julio"); break;
            case "7": txtMesPagar.setText("Agosto"); break;
            case "8": txtMesPagar.setText("Septiembre"); break;
            case "9": txtMesPagar.setText("Octubre"); break;
            case "10": txtMesPagar.setText("Noviembre"); break;
            case "11": txtMesPagar.setText("Diciembre"); break;
            default: txtMesPagar.setText("Error"); break;
        }
        
        //ConexionBD.Iniciar();
        //ConexionBD_FinanciamientoMotos.obtenerUltimaModificacionDetallesPago(codigo_financiamiento);
        //ConexionBD.Finalizar();
        try{
            //se usa un while ya que se va a recorrer fila por fila lo que se obtuvo de la BD.
            while (estructuraTabla.next()) { 
                 
                codigoDetalle = estructuraTabla.getInt("CODIGO_DETALLE");
                tipoInteres = estructuraTabla.getString("TIPO_INTERES");
                tiempoMeses = estructuraTabla.getInt("TIEMPO_MESES");
                amortizacionPagar = estructuraTabla.getDouble("AMORTIZACION_A_PAGAR");
                interesPagar = estructuraTabla.getDouble("INTERES_A_PAGAR");
                capital = estructuraTabla.getDouble("CAPITAL");
                interesTotal = estructuraTabla.getDouble("INTERES_TOTAL");                               
               
                //VARIABLES PARA CAMPOS CALCULABLES
                double capitalNuevo = capital - amortizacionPagar;
                double interesNuevo = interesTotal - interesPagar;
                double totalPagar = amortizacionPagar + interesPagar + gastosAdministrativos;
                
                txtUltimoMes.setText("N/A");
                txtAmortizacionPagar.setText(String.valueOf(amortizacionPagar));
                txtInteresPagar.setText(String.valueOf(interesPagar));
                txtCapitalActual.setText(String.valueOf(capital));
                txtCapitalNuevo.setText(String.valueOf(capitalNuevo));
                txtInteresActual.setText(String.valueOf(interesTotal));
                txtInteresNuevo.setText(String.valueOf(interesNuevo));
                txtTotalPagar.setText(String.valueOf(totalPagar));          
            }
        }catch(SQLException ex){
            Logger.getLogger(ConexionBaseDeDatos.ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Parece que Hubo un error al cargar la tabla: " + ex);
        }
    }
    private void txtNumeroComprobanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroComprobanteKeyTyped
        noEspacios(evt);
    }//GEN-LAST:event_txtNumeroComprobanteKeyTyped

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //SE SELECCIONA EL ARCHIVO A SUBIR
        JFileChooser archivoSeleccionado = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos PDF", "pdf");
        archivoSeleccionado.setFileFilter(filtro);
        int opcion = archivoSeleccionado.showOpenDialog(this);

        if(opcion == JFileChooser.APPROVE_OPTION){
            nombreArchivo1 = archivoSeleccionado.getSelectedFile().getName();
            rutaArchivo1 = archivoSeleccionado.getSelectedFile().getPath();
            txtPDF.setText(nombreArchivo1);
            verificarSiAgregoArchivo = true;
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void lblFinalizadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinalizadoMouseClicked
        if (validacionCampos()== true){  
            //CAMBIAR EL FORMATO DE LA FECHA
        
            //PREPARACIÓN DE DOCUMENTOS PARA GUARDAR E INGRESAR
            File comprobante = new File(rutaArchivo1);
            try {
                pdf1 =  new FileInputStream(comprobante);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(frmInClienteNuevo.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //VARIABLES PARA CALCULOS 
            Double gastos_administrativos = 0.00, porcentaje_liquidacion = 0.00, total_pagar = 0.00;
            ConexionBD.Iniciar();
            ConexionBD_FinanciamientoMotos.obtenerUltimoPagoRealizado(codigo_financiamiento);
            resultadoInstruccion = ConexionBD_FinanciamientoMotos.ingresarRegistroPago(txtConcepto.getText().toUpperCase(), txtFechaPago.getText(), txtNumeroComprobante.getText(), txtMesPagar.getText(), txtMesPagar.getText(), Double.parseDouble(txtAmortizacionPagar.getText()), 
            gastos_administrativos, Double.parseDouble(txtInteresPagar.getText()), total_pagar, Double.parseDouble(txtCapitalActual.getText()), 
            Double.parseDouble(txtCapitalNuevo.getText()), Double.parseDouble(txtInteresActual.getText()), Double.parseDouble(txtInteresNuevo.getText()), pdf1, codigo_financiamiento);
            ConexionBD.Finalizar();
            
            if(resultadoInstruccion == true  ){
                JOptionPane.showMessageDialog(null, "Datos Ingresados Correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "Datos Ingresados Erroneamente");
            }
        }
    }//GEN-LAST:event_lblFinalizadoMouseClicked

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
    
    private  boolean validacionCampos(){
        if(txtNumeroComprobante.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: NUMERO DE COMPROBANTE DE PAGO");
            return false;
        } if(txtPDF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Campo Vacio: PDF DE COMPROBANTE DE PAGO");
            return false;
        }
        return true;
    }
    
    public static String fechaActual(){
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        
        return formatoFecha.format(fecha);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFinalizado;
    private javax.swing.JTextField txtAmortizacionPagar;
    private javax.swing.JTextField txtCapitalActual;
    private javax.swing.JTextField txtCapitalNuevo;
    private javax.swing.JTextField txtConcepto;
    private javax.swing.JTextField txtFechaPago;
    private javax.swing.JTextField txtInteresActual;
    private javax.swing.JTextField txtInteresNuevo;
    private javax.swing.JTextField txtInteresPagar;
    private javax.swing.JTextField txtMesPagar;
    private javax.swing.JTextField txtNumeroComprobante;
    private javax.swing.JTextField txtPDF;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtUltimoMes;
    // End of variables declaration//GEN-END:variables
}
