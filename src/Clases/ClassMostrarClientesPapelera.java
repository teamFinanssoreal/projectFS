/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Betza
 */
public class ClassMostrarClientesPapelera {
    private int codigo;
    private String dpi;
    private String nombre;
    private String telefono;
    private String correo_electronico;

    public ClassMostrarClientesPapelera(int codigo, String dpi, String nombre, String telefono, String correo_electronico) {
        this.codigo = codigo;
        this.dpi = dpi;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
