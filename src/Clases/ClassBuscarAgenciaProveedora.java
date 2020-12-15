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
public class ClassBuscarAgenciaProveedora {
    private int codigo;
    private String nombre_casa_comercial;
    private String dirección;

    public ClassBuscarAgenciaProveedora(int codigo, String nombre_casa_comercial, String dirección) {
        this.codigo = codigo;
        this.nombre_casa_comercial = nombre_casa_comercial;
        this.dirección = dirección;
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

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    
}
