/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Blob;

/**
 *
 * @author Víctor H. Jucub
 */
public class ClassCliente {
    private int codigo;
    private String state;
    private String dpi;
    private String nombres;
    private String apellidos;
    private String fecha_nacimiento;
    private String genero;
    private String telefono;
    private String correo_electronico;
    private String calle_avenida;
    private String numero_casa;
    private String zona;
    private int cod_direccion;
    private String cuenta_bancaria;
    private String enlace_facebook;
    private String enlace_instagram;
    private Blob pdf_dpi;

    public ClassCliente(int codigo, String state, String dpi, String nombres, String apellidos, String fecha_nacimiento, String genero, String telefono, String correo_electronico, String calle_avenida, String numero_casa, String zona, int cod_direccion, String cuenta_bancaria, String enlace_facebook, String enlace_instagram, Blob pdf_dpi) {
        this.codigo = codigo;
        this.state = state;
        this.dpi = dpi;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
        this.calle_avenida = calle_avenida;
        this.numero_casa = numero_casa;
        this.zona = zona;
        this.cod_direccion = cod_direccion;
        this.cuenta_bancaria = cuenta_bancaria;
        this.enlace_facebook = enlace_facebook;
        this.enlace_instagram = enlace_instagram;
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

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
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

    public String getCuenta_bancaria() {
        return cuenta_bancaria;
    }

    public void setCuenta_bancaria(String cuenta_bancaria) {
        this.cuenta_bancaria = cuenta_bancaria;
    }

    public String getEnlace_facebook() {
        return enlace_facebook;
    }

    public void setEnlace_facebook(String enlace_facebook) {
        this.enlace_facebook = enlace_facebook;
    }

    public String getEnlace_instagram() {
        return enlace_instagram;
    }

    public void setEnlace_instagram(String enlace_instagram) {
        this.enlace_instagram = enlace_instagram;
    }

    public Blob getPdf_dpi() {
        return pdf_dpi;
    }

    public void setPdf_dpi(Blob pdf_dpi) {
        this.pdf_dpi = pdf_dpi;
    }

    

    
    
}
