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
public class ClassFinanciamientoMoto_BuscarVehiculo {
    private int codigo;
    private String descripcion;
    private String marca;
    private String modelo;
    private String agencia_proveedora;

    public ClassFinanciamientoMoto_BuscarVehiculo(int codigo, String descripcion, String marca, String modelo, String agencia_proveedora) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.modelo = modelo;
        this.agencia_proveedora = agencia_proveedora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAgencia_proveedora() {
        return agencia_proveedora;
    }

    public void setAgencia_proveedora(String agencia_proveedora) {
        this.agencia_proveedora = agencia_proveedora;
    }
    
    
}
