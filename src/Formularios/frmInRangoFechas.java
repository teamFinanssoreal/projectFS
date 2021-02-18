/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import ConexionBaseDeDatos.ConexionBD;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author alber
 */
public class frmInRangoFechas extends javax.swing.JInternalFrame {
    
    //VARIABLES GLOBALES
    public static boolean variableFormulario = false;
    
    public frmInRangoFechas() {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        dcFechaInicial = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        dcFechaFinal = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Finanssoreal.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(134, 185, 22));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RANGO DE FECHAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel6.setText("FECHA INICIAL:");

        dcFechaInicial.setDateFormatString("yyyy-MM-dd");

        jLabel7.setText("FECHA FINAL:");

        dcFechaFinal.setDateFormatString("yyyy-MM-dd");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/crud_accept_50x50.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        //VALIDACIONES DE CAMPOS    
        if(dcFechaInicial.getDate() == null){
            JOptionPane.showMessageDialog(this, "Ingrese la Fecha Inicial");
            return;
        }
        
        if(dcFechaFinal.getDate() == null){
            JOptionPane.showMessageDialog(this, "Ingrese la Fecha Final");
            return;
        }
        
        //PREPARACIÓN DE FECHAS EN EL FORMATO ESTABLECIDO
        //CAMBIAR EL FORMATO DE LA FECHA
        DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaInicial = formato.format(dcFechaInicial.getDate());
        String fechaFinal = formato.format(dcFechaFinal.getDate());
        
        //SE DETERMINA SI ES DEL FINANCIAMIENTO DE MOTOS O CARROS
        if(variableFormulario == false){//SI ES FALSA, EL REPORTE SERÁ SOBRE CARROS
            //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
            try {
                ConexionBD.Iniciar();
                Map parametros = new HashMap();
                parametros.clear();
                parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
                parametros.put("ReportParameter_FechaInicial", fechaInicial);
                parametros.put("ReportParameter_FechaFinal", fechaFinal);
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportFinanciamientoCarros_CantidadFinanciamientos.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
                JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setVisible(true);
                jasperViewer.setTitle("FINANCIAMIEDNTOS DE CARROS");
                ConexionBD.Finalizar();
                this.dispose();
            } catch (JRException e) {
                JOptionPane.showMessageDialog(this, e);
                ConexionBD.Finalizar();
            }
        }else{
            //ABRE LA VENTANA QUE CONTIENE EL REPORTE SELECIONADO
            try {
                ConexionBD.Iniciar();
                Map parametros = new HashMap();
                parametros.clear();
                parametros.put("LogoFinanssorealPNG", this.getClass().getResourceAsStream("/Imagenes/logo_finanssoreal.png"));
                parametros.put("ReportParameter_FechaInicial", fechaInicial);
                parametros.put("ReportParameter_FechaFinal", fechaFinal);
                JasperReport jasperReport = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/ReportFinanciamientoMotos_CantidadFinanciamientos.jasper"));
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ConexionBD.getVarCon());
                JasperViewer jasperViewer = new JasperViewer(jasperPrint, false);
                jasperViewer.setVisible(true);
                jasperViewer.setTitle("FINANCIAMIEDNTOS DE MOTOS");
                ConexionBD.Finalizar();
                this.dispose();
            } catch (JRException e) {
                JOptionPane.showMessageDialog(this, e);
                ConexionBD.Finalizar();
            }
        }
        
        
    }//GEN-LAST:event_jLabel18MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dcFechaFinal;
    private com.toedter.calendar.JDateChooser dcFechaInicial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
