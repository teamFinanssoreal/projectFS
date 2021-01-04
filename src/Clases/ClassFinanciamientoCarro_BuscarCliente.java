/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author svhju
 */
public class ClassFinanciamientoCarro_BuscarCliente {
    private int codigo;
    private String dpi;
    private String nombre;

    public ClassFinanciamientoCarro_BuscarCliente(int codigo, String dpi, String nombre) {
        this.codigo = codigo;
        this.dpi = dpi;
        this.nombre = nombre;
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
    
    
    
}
