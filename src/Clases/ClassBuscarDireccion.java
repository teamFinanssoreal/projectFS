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
public class ClassBuscarDireccion {
    private int codigo;
    private int nombre_direccion;

    public ClassBuscarDireccion(int codigo, int nombre_direccion) {
        this.codigo = codigo;
        this.nombre_direccion = nombre_direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNombre_direccion() {
        return nombre_direccion;
    }

    public void setNombre_direccion(int nombre_direccion) {
        this.nombre_direccion = nombre_direccion;
    }
    
    
}
