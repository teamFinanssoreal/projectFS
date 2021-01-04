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
public class ClassFinanciamientoCarro_LlenarTabla {
    private int codigo;
    private String numero_contrato;
    private String condicion_credito;
    private String capital;
    private String dpi;
    private String nombre;
    private String descripcion;

    public ClassFinanciamientoCarro_LlenarTabla(int codigo, String numero_contrato, String condicion_credito, String capital, String dpi, String nombre, String descripcion) {
        this.codigo = codigo;
        this.numero_contrato = numero_contrato;
        this.condicion_credito = condicion_credito;
        this.capital = capital;
        this.dpi = dpi;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumero_contrato() {
        return numero_contrato;
    }

    public void setNumero_contrato(String numero_contrato) {
        this.numero_contrato = numero_contrato;
    }

    public String getCondicion_credito() {
        return condicion_credito;
    }

    public void setCondicion_credito(String condicion_credito) {
        this.condicion_credito = condicion_credito;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
