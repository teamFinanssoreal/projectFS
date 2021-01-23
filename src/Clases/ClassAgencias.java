/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Blob;

/**
 *
 * @author svhju
 */
public class ClassAgencias {
     private int codigo;
    private String state;
    private String nombre_casa_comercial;
    private String telefono;
    private String correo_electronico;
    private String calle_avenida;
    private String numero_casa;
    private String zona;
    private int cod_direccion;
    private Blob pdf_dpi;

    public ClassAgencias(int codigo, String state, String nombre_casa_comercial, String telefono, String correo_electronico, String calle_avenida, String numero_casa, String zona, int cod_direccion, Blob pdf_dpi) {
        this.codigo = codigo;
        this.state = state;
        this.nombre_casa_comercial = nombre_casa_comercial;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.calle_avenida = calle_avenida;
        this.numero_casa = numero_casa;
        this.zona = zona;
        this.cod_direccion = cod_direccion;
        this.pdf_dpi = pdf_dpi;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNombre_casa_comercial() {
        return nombre_casa_comercial;
    }

    public void setNombre_casa_comercial(String nombre_casa_comercial) {
        this.nombre_casa_comercial = nombre_casa_comercial;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getCalle_avenida() {
        return calle_avenida;
    }

    public void setCalle_avenida(String calle_avenida) {
        this.calle_avenida = calle_avenida;
    }

    public String getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(String numero_casa) {
        this.numero_casa = numero_casa;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getCod_direccion() {
        return cod_direccion;
    }

    public void setCod_direccion(int cod_direccion) {
        this.cod_direccion = cod_direccion;
    }

    public Blob getPdf_dpi() {
        return pdf_dpi;
    }

    public void setPdf_dpi(Blob pdf_dpi) {
        this.pdf_dpi = pdf_dpi;
    }

   
    
    
}
