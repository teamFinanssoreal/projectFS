/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Martin Rosales
 */
public class ClassMostrarAgenciasPapelera {
     private int codigo;
   private String nombre_casa_comercial;
   private String telefono;
   private String correo_electronico;

    public ClassMostrarAgenciasPapelera(int codigo, String nombre_casa_comercial, String telefono, String correo_electronico) {
        this.codigo = codigo;
        this.nombre_casa_comercial = nombre_casa_comercial;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

   
}
