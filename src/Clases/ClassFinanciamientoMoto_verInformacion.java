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
public class ClassFinanciamientoMoto_verInformacion {
    private String dpi_cliente;
    private String nombre_cliente;
    private String telefono_cliente;
    private String direccion_cliente;
    
    private byte[] foto_vehiculo;
    private String descripcion_vehiculo;
    private String marca_vehiculo;
    private String modelo_vehiculo;
    private String agencia_proveedora;
    
    private String condicion_credito;
    private String numero_contrato;
    private Double capital;
    private Double porcentaje_interes;
    private String tipo_interes;
    private int tiempo_meses;
    private String fecha_inicio;
    private String fecha_final;
    private Double amortizacion;
    private Double interes_mensual;
    private Double interes_total;
    private Double cuota_mensual;
    
    private Blob pdf_contrato;
    private Blob pdf_recibo_agua_luz_telefono;
    private Blob pdf_constancia_ingresos_estados_cuenta;
    private Blob pdf_patentes_rtu_o_constancia_laboral;

    public String getDpi_cliente() {
        return dpi_cliente;
    }

    public void setDpi_cliente(String dpi_cliente) {
        this.dpi_cliente = dpi_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public byte[] getFoto_vehiculo() {
        return foto_vehiculo;
    }

    public void setFoto_vehiculo(byte[] foto_vehiculo) {
        this.foto_vehiculo = foto_vehiculo;
    }

    public String getDescripcion_vehiculo() {
        return descripcion_vehiculo;
    }

    public void setDescripcion_vehiculo(String descripcion_vehiculo) {
        this.descripcion_vehiculo = descripcion_vehiculo;
    }

    public String getMarca_vehiculo() {
        return marca_vehiculo;
    }

    public void setMarca_vehiculo(String marca_vehiculo) {
        this.marca_vehiculo = marca_vehiculo;
    }

    public String getModelo_vehiculo() {
        return modelo_vehiculo;
    }

    public void setModelo_vehiculo(String modelo_vehiculo) {
        this.modelo_vehiculo = modelo_vehiculo;
    }

    public String getAgencia_proveedora() {
        return agencia_proveedora;
    }

    public void setAgencia_proveedora(String agencia_proveedora) {
        this.agencia_proveedora = agencia_proveedora;
    }

    public String getCondicion_credito() {
        return condicion_credito;
    }

    public void setCondicion_credito(String condicion_credito) {
        this.condicion_credito = condicion_credito;
    }

    public String getNumero_contrato() {
        return numero_contrato;
    }

    public void setNumero_contrato(String numero_contrato) {
        this.numero_contrato = numero_contrato;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getPorcentaje_interes() {
        return porcentaje_interes;
    }

    public void setPorcentaje_interes(Double porcentaje_interes) {
        this.porcentaje_interes = porcentaje_interes;
    }

    public String getTipo_interes() {
        return tipo_interes;
    }

    public void setTipo_interes(String tipo_interes) {
        this.tipo_interes = tipo_interes;
    }

    public int getTiempo_meses() {
        return tiempo_meses;
    }

    public void setTiempo_meses(int tiempo_meses) {
        this.tiempo_meses = tiempo_meses;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }

    public Double getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(Double amortizacion) {
        this.amortizacion = amortizacion;
    }

    public Double getInteres_mensual() {
        return interes_mensual;
    }

    public void setInteres_mensual(Double interes_mensual) {
        this.interes_mensual = interes_mensual;
    }

    public Double getInteres_total() {
        return interes_total;
    }

    public void setInteres_total(Double interes_total) {
        this.interes_total = interes_total;
    }

    public Double getCuota_mensual() {
        return cuota_mensual;
    }

    public void setCuota_mensual(Double cuota_mensual) {
        this.cuota_mensual = cuota_mensual;
    }

    public Blob getPdf_contrato() {
        return pdf_contrato;
    }

    public void setPdf_contrato(Blob pdf_contrato) {
        this.pdf_contrato = pdf_contrato;
    }

    public Blob getPdf_recibo_agua_luz_telefono() {
        return pdf_recibo_agua_luz_telefono;
    }

    public void setPdf_recibo_agua_luz_telefono(Blob pdf_recibo_agua_luz_telefono) {
        this.pdf_recibo_agua_luz_telefono = pdf_recibo_agua_luz_telefono;
    }

    public Blob getPdf_constancia_ingresos_estados_cuenta() {
        return pdf_constancia_ingresos_estados_cuenta;
    }

    public void setPdf_constancia_ingresos_estados_cuenta(Blob pdf_constancia_ingresos_estados_cuenta) {
        this.pdf_constancia_ingresos_estados_cuenta = pdf_constancia_ingresos_estados_cuenta;
    }

    public Blob getPdf_patentes_rtu_o_constancia_laboral() {
        return pdf_patentes_rtu_o_constancia_laboral;
    }

    public void setPdf_patentes_rtu_o_constancia_laboral(Blob pdf_patentes_rtu_o_constancia_laboral) {
        this.pdf_patentes_rtu_o_constancia_laboral = pdf_patentes_rtu_o_constancia_laboral;
    }
    
    
    
}
