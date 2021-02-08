/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import ConexionBaseDeDatos.ConexionBD;
import Formularios.frmPrincipal;
import javax.swing.JFrame;

/**
 *
 * @author Geison
 */

public class ProjectFS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConexionBD.Iniciar();
        ConexionBD.Finalizar();
        
        frmPrincipal Principal = new frmPrincipal();
        Principal.setLocationRelativeTo(null);
        Principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        Principal.setVisible(true);
          
    }
    
}
