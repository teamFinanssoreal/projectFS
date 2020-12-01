/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Geison
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        panelMenu = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        lblClientes = new javax.swing.JLabel();
        lblFinanciamientoCarros = new javax.swing.JLabel();
        lblAgencias = new javax.swing.JLabel();
        lblCatalogoCarros = new javax.swing.JLabel();
        lblCatalogoMotos = new javax.swing.JLabel();
        lblFinanciamientoMotos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE CONTROL FINANSSOREAL");

        panelMenu.setBackground(new java.awt.Color(134, 185, 22));

        lblInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_home.png"))); // NOI18N
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblInicioMouseExited(evt);
            }
        });

        lblClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_client.png"))); // NOI18N
        lblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClientesMouseExited(evt);
            }
        });

        lblFinanciamientoCarros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinanciamientoCarros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_car.png"))); // NOI18N
        lblFinanciamientoCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinanciamientoCarrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFinanciamientoCarrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFinanciamientoCarrosMouseExited(evt);
            }
        });

        lblAgencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_agency.png"))); // NOI18N
        lblAgencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgenciasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAgenciasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAgenciasMouseExited(evt);
            }
        });

        lblCatalogoCarros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCatalogoCarros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_catalogo_carros.png"))); // NOI18N
        lblCatalogoCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCatalogoCarrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCatalogoCarrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCatalogoCarrosMouseExited(evt);
            }
        });

        lblCatalogoMotos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCatalogoMotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_catalogo_motos.png"))); // NOI18N
        lblCatalogoMotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCatalogoMotosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCatalogoMotosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCatalogoMotosMouseExited(evt);
            }
        });

        lblFinanciamientoMotos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinanciamientoMotos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu_moto.png"))); // NOI18N
        lblFinanciamientoMotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFinanciamientoMotosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFinanciamientoMotosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblFinanciamientoMotosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
            .addComponent(lblAgencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCatalogoCarros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblCatalogoMotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFinanciamientoCarros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblFinanciamientoMotos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblClientes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAgencias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCatalogoCarros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCatalogoMotos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinanciamientoCarros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinanciamientoMotos)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(panelMenu, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(528, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //VARIABLES GLOBALES PARA DEFINIR QUE OPCION DEL MENU FUE SELECCIONADA
    boolean menuInicioSeleccionado = false;
    boolean menuClientesSeleccionado = false;
    boolean menuAgenciasSeleccionado = false;
    boolean menuCatalogoCarros = false;
    boolean menuCatalogoMotos = false;
    boolean menuFinanciamientoCarrosSeleccionado = false;
    boolean menuFinanciamientoMotosSeleccionado = false;
    
    //OBTIENE LA RUTA DE CADA IMAGEN QUE TENDRAN LOS BOTONES DEL MENU
    ImageIcon IconoMenuInicio = new ImageIcon("src/Imagenes/menu_home.png"); 
    ImageIcon IconoMenuClientes = new ImageIcon("src/Imagenes/menu_client.png"); 
    ImageIcon IconoMenuAgencia = new ImageIcon("src/Imagenes/menu_agency.png"); 
    ImageIcon IconoMenuCatalogoCarros = new ImageIcon("src/Imagenes/menu_catalogo_carros.png"); 
    ImageIcon IconoMenuCatalogoMotos = new ImageIcon("src/Imagenes/menu_catalogo_motos.png"); 
    ImageIcon IconoMenuFinanciamientoCarros = new ImageIcon("src/Imagenes/menu_car.png"); 
    ImageIcon IconoMenuFinanciamientoMotos = new ImageIcon("src/Imagenes/menu_moto.png"); 
            
    //FUNCION PARA REINICIAR EL MENU
    public void reiniciarMenu(){
        //SE REINICIAN LAS VARIABLES QUE INDICAN QUE UNA OPCION FUE SELECCIONADA
        menuInicioSeleccionado = false;
        menuClientesSeleccionado = false;
        menuAgenciasSeleccionado = false;
        menuCatalogoCarros = false;
        menuCatalogoMotos = false;
        menuFinanciamientoCarrosSeleccionado = false;
        menuFinanciamientoMotosSeleccionado = false;
        
        //SE REINICIAN LOS LABEL COLOCANDO LOS ICONOS POR DEFECTO DEL MENU
        lblInicio.setIcon(IconoMenuInicio);
        lblClientes.setIcon(IconoMenuClientes);
        lblAgencias.setIcon(IconoMenuAgencia);
        lblCatalogoCarros.setIcon(IconoMenuCatalogoCarros);
        lblCatalogoMotos.setIcon(IconoMenuCatalogoMotos);
        lblFinanciamientoCarros.setIcon(IconoMenuFinanciamientoCarros);
        lblFinanciamientoMotos.setIcon(IconoMenuFinanciamientoMotos);
    }
    
    private void lblInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseClicked
        //SE ANULA CUALQUIER OTRA SELECCIÓN REALIZADA EN EL MENU
        reiniciarMenu();
       
        // SELECCIONA EL MENU DE INICIO
        ImageIcon IconoMenuSeleccionado = new ImageIcon("src/Imagenes/menu_home_mouseClick.png"); // OBTIENE LA RUTA DEL ICONO
        lblInicio.setIcon(IconoMenuSeleccionado); //ESTABLECE EL ICONO EN EL LABEL
        menuInicioSeleccionado = true; // EL MENU INICIO HA SIDO SELECCIONADO
        
        JOptionPane.showMessageDialog(panelMenu, "Usted ha seleccionado el menú de Inicio");
        
    }//GEN-LAST:event_lblInicioMouseClicked

    private void lblInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseEntered
        //CUANDO EL CURSOR PASA SOBRE EL LABEL
        
         //Si la opcion no ha sido seleccionada antes, es posible cambiar el icono
        if (menuInicioSeleccionado != true) {
            ImageIcon IconoMenuSeleccionadoEntered = new ImageIcon("src/Imagenes/menu_home_mouseEntered.png"); // OBTIENE LA RUTA DEL ICONO
            lblInicio.setIcon(IconoMenuSeleccionadoEntered); //ESTABLECE EL ICONO EN EL LABEL
        }
        
    }//GEN-LAST:event_lblInicioMouseEntered

    private void lblInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMouseExited
        // CUANDO EL CURSOR SALE DEL LABEL
        
        //Si la opcion no fue seleccionada, regresa el icono por defecto
        if (menuInicioSeleccionado != true) {
            lblInicio.setIcon(IconoMenuInicio); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblInicioMouseExited

    private void lblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseClicked
        //SE ANULA CUALQUIER OTRA SELECCIÓN REALIZADA EN EL MENU
        reiniciarMenu();
        
        // SELECCIONA EL MENU DE CLIENTES
        ImageIcon IconoMenuSeleccionado = new ImageIcon("src/Imagenes/menu_client_mouseClick.png"); // OBTIENE LA RUTA DEL ICONO
        lblClientes.setIcon(IconoMenuSeleccionado); //ESTABLECE EL ICONO EN EL LABEL
        menuClientesSeleccionado = true; // EL MENU CLIENTES HA SIDO SELECCIONADO
        
        JOptionPane.showMessageDialog(panelMenu, "Usted ha seleccionado el menú de Clientes");
        
    }//GEN-LAST:event_lblClientesMouseClicked

    private void lblClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseEntered
        //CUANDO EL CURSOR PASA SOBRE EL LABEL
        
        //Si la opcion no fue seleccionada antes, es posible cambiar el icono
        if (menuClientesSeleccionado != true) {
            ImageIcon IconoMenuSeleccionadoEntered = new ImageIcon("src/Imagenes/menu_client_mouseEntered.png"); // OBTIENE LA RUTA DEL ICONO
            lblClientes.setIcon(IconoMenuSeleccionadoEntered); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblClientesMouseEntered

    private void lblClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientesMouseExited
       // CUANDO EL CURSOR SALE DEL LABEL
        
        //Si la opcion no fue seleccionada, regresa el icono por defecto
        if (menuClientesSeleccionado != true) {
            lblClientes.setIcon(IconoMenuClientes); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblClientesMouseExited

    private void lblFinanciamientoCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinanciamientoCarrosMouseClicked
        //SE ANULA CUALQUIER OTRA SELECCIÓN REALIZADA EN EL MENU
        reiniciarMenu();

        // SELECCIONA EL MENU DE FINANCIAMIENTO DE CARROS
        ImageIcon IconoMenuSeleccionado = new ImageIcon("src/Imagenes/menu_car_mouseClick.png"); // OBTIENE LA RUTA DEL ICONO
        lblFinanciamientoCarros.setIcon(IconoMenuSeleccionado); //ESTABLECE EL ICONO EN EL LABEL
        menuFinanciamientoCarrosSeleccionado = true; // EL MENU FINANCIAMIENTO DE CARROS HA SIDO SELECCIONADO
        
        JOptionPane.showMessageDialog(panelMenu, "Usted ha seleccionado el menú de Financiamiento de Carros");
        
    }//GEN-LAST:event_lblFinanciamientoCarrosMouseClicked

    private void lblFinanciamientoCarrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinanciamientoCarrosMouseEntered
        //CUANDO EL CURSOR PASA SOBRE EL LABEL
        
        //Si la opcion no ha sido seleccionada antes, es posible cambiar el icono
        if (menuFinanciamientoCarrosSeleccionado != true) {
            ImageIcon IconoMenuSeleccionadoEntered = new ImageIcon("src/Imagenes/menu_car_mouseEntered.png"); // OBTIENE LA RUTA DEL ICONO
            lblFinanciamientoCarros.setIcon(IconoMenuSeleccionadoEntered); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblFinanciamientoCarrosMouseEntered

    private void lblFinanciamientoCarrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinanciamientoCarrosMouseExited
        // CUANDO EL CURSOR SALE DEL LABEL
        
        //Si la opcion no fue seleccionada, regresa el icono por defecto
        if (menuFinanciamientoCarrosSeleccionado != true) {
            lblFinanciamientoCarros.setIcon(IconoMenuFinanciamientoCarros); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblFinanciamientoCarrosMouseExited

    private void lblAgenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgenciasMouseClicked
        //SE ANULA CUALQUIER OTRA SELECCIÓN REALIZADA EN EL MENU
        reiniciarMenu();
        
        // SELECCIONA EL MENU DE AGENCIAS
        ImageIcon IconoMenuSeleccionado = new ImageIcon("src/Imagenes/menu_agency_mouseClick.png"); // OBTIENE LA RUTA DEL ICONO
        lblAgencias.setIcon(IconoMenuSeleccionado); //ESTABLECE EL ICONO EN EL LABEL
        menuAgenciasSeleccionado = true; // EL MENU AGENCIAS HA SIDO SELECCIONADO
        
        JOptionPane.showMessageDialog(panelMenu, "Usted ha seleccionado el menú de Agencias");
        
    }//GEN-LAST:event_lblAgenciasMouseClicked

    private void lblAgenciasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgenciasMouseEntered
        //CUANDO EL CURSOR PASA SOBRE EL LABEL
        
        //Si la opcion no ha sido seleccionada antes, es posible cambiar el icono
        if (menuAgenciasSeleccionado != true) {
            ImageIcon IconoMenuSeleccionadoEntered = new ImageIcon("src/Imagenes/menu_agency_mouseEntered.png"); // OBTIENE LA RUTA DEL ICONO
            lblAgencias.setIcon(IconoMenuSeleccionadoEntered); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblAgenciasMouseEntered

    private void lblAgenciasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgenciasMouseExited
        // CUANDO EL CURSOR SALE DEL LABEL
        
        //Si la opcion no fue seleccionada, regresa el icono por defecto
        if (menuAgenciasSeleccionado != true) {
            lblAgencias.setIcon(IconoMenuAgencia); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblAgenciasMouseExited

    private void lblCatalogoCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatalogoCarrosMouseClicked
        //SE ANULA CUALQUIER OTRA SELECCIÓN REALIZADA EN EL MENU
        reiniciarMenu();
        
        // SELECCIONA EL MENU DE CATALOGO DE CARROS
        ImageIcon IconoMenuSeleccionado = new ImageIcon("src/Imagenes/menu_catalogo_carros_mouseClick.png"); // OBTIENE LA RUTA DEL ICONO
        lblCatalogoCarros.setIcon(IconoMenuSeleccionado); //ESTABLECE EL ICONO EN EL LABEL
        menuCatalogoCarros = true; // EL MENU CATALOGO DE CARROS HA SIDO SELECCIONADO
        
        JOptionPane.showMessageDialog(panelMenu, "Usted ha seleccionado el menú de catalogo de carros");
        
    }//GEN-LAST:event_lblCatalogoCarrosMouseClicked

    private void lblCatalogoCarrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatalogoCarrosMouseEntered
        //CUANDO EL CURSOR PASA SOBRE EL LABEL
        
        //Si la opcion no ha sido seleccionada antes, es posible cambiar el icono
        if (menuCatalogoCarros != true) {
            ImageIcon IconoMenuSeleccionadoEntered = new ImageIcon("src/Imagenes/menu_catalogo_carros_mouseEntered.png"); // OBTIENE LA RUTA DEL ICONO
            lblCatalogoCarros.setIcon(IconoMenuSeleccionadoEntered); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblCatalogoCarrosMouseEntered

    private void lblCatalogoCarrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatalogoCarrosMouseExited
        // CUANDO EL CURSOR SALE DEL LABEL
        
        //Si la opcion no fue seleccionada, regresa el icono por defecto
        if (menuCatalogoCarros != true) {
            lblCatalogoCarros.setIcon(IconoMenuCatalogoCarros); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblCatalogoCarrosMouseExited

    private void lblCatalogoMotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatalogoMotosMouseClicked
        //SE ANULA CUALQUIER OTRA SELECCIÓN REALIZADA EN EL MENU
        reiniciarMenu();
        
        // SELECCIONA EL MENU DE CATALOGO DE MOTOS
        ImageIcon IconoMenuSeleccionado = new ImageIcon("src/Imagenes/menu_catalogo_motos_mouseClick.png"); // OBTIENE LA RUTA DEL ICONO
        lblCatalogoMotos.setIcon(IconoMenuSeleccionado); //ESTABLECE EL ICONO EN EL LABEL
        menuCatalogoMotos = true; // EL MENU CATALOGO DE MOTOS HA SIDO SELECCIONADO
        
        JOptionPane.showMessageDialog(panelMenu, "Usted ha seleccionado el menú de Catalogo de Motos");
        
    }//GEN-LAST:event_lblCatalogoMotosMouseClicked

    private void lblCatalogoMotosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatalogoMotosMouseEntered
        //CUANDO EL CURSOR PASA SOBRE EL LABEL
        
        //Si la opcion no ha sido seleccionada antes, es posible cambiar el icono
        if (menuCatalogoMotos != true) {
            ImageIcon IconoMenuSeleccionadoEntered = new ImageIcon("src/Imagenes/menu_catalogo_motos_mouseEntered.png"); // OBTIENE LA RUTA DEL ICONO
            lblCatalogoMotos.setIcon(IconoMenuSeleccionadoEntered); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblCatalogoMotosMouseEntered

    private void lblCatalogoMotosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCatalogoMotosMouseExited
        // CUANDO EL CURSOR SALE DEL LABEL
        
        //Si la opcion no fue seleccionada, regresa el icono por defecto
        if (menuCatalogoMotos != true) {
            lblCatalogoMotos.setIcon(IconoMenuCatalogoMotos); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblCatalogoMotosMouseExited

    private void lblFinanciamientoMotosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinanciamientoMotosMouseClicked
        //SE ANULA CUALQUIER OTRA SELECCIÓN REALIZADA EN EL MENU
        reiniciarMenu();

        // SELECCIONA EL MENU DE FINANCIAMIENTO DE MOTOS
        ImageIcon IconoMenuSeleccionado = new ImageIcon("src/Imagenes/menu_moto_mouseClick.png"); // OBTIENE LA RUTA DEL ICONO
        lblFinanciamientoMotos.setIcon(IconoMenuSeleccionado); //ESTABLECE EL ICONO EN EL LABEL
        menuFinanciamientoMotosSeleccionado = true; // EL MENU FINANCIAMIENTO DE CARROS HA SIDO SELECCIONADO
        
        JOptionPane.showMessageDialog(panelMenu, "Usted ha seleccionado el menú de Financiamiento de Motos");
        
    }//GEN-LAST:event_lblFinanciamientoMotosMouseClicked

    private void lblFinanciamientoMotosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinanciamientoMotosMouseEntered
        //CUANDO EL CURSOR PASA SOBRE EL LABEL
        
        //Si la opcion no ha sido seleccionada antes, es posible cambiar el icono
        if (menuFinanciamientoMotosSeleccionado != true) {
            ImageIcon IconoMenuSeleccionadoEntered = new ImageIcon("src/Imagenes/menu_moto_mouseEntered.png"); // OBTIENE LA RUTA DEL ICONO
            lblFinanciamientoMotos.setIcon(IconoMenuSeleccionadoEntered); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblFinanciamientoMotosMouseEntered

    private void lblFinanciamientoMotosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFinanciamientoMotosMouseExited
        // CUANDO EL CURSOR SALE DEL LABEL
        
         //Si la opcion no fue seleccionada, regresa el icono por defecto
        if (menuFinanciamientoMotosSeleccionado != true) {
            lblFinanciamientoMotos.setIcon(IconoMenuFinanciamientoMotos); //ESTABLECE EL ICONO EN EL LABEL
        }
    }//GEN-LAST:event_lblFinanciamientoMotosMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel lblAgencias;
    private javax.swing.JLabel lblCatalogoCarros;
    private javax.swing.JLabel lblCatalogoMotos;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblFinanciamientoCarros;
    private javax.swing.JLabel lblFinanciamientoMotos;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
