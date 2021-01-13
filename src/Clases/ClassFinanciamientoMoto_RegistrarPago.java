/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Blob;

/**
 *
 * @author Martin Rosales
 */
public class ClassFinanciamientoMoto_RegistrarPago {
 private String ultimo_mes_pagado;
 private Double amortizacion_pagar;
 private Double gastos_administrativos;
 private Double porcentaje_liquidacion;
 private Double interes_pagar;
 private Double total_pagar;
 private Double capital_actual;
 private Double capital_nuevo;
 private Double interes_actual;
 private Double interes_nuevo;

    public ClassFinanciamientoMoto_RegistrarPago(String ultimo_mes_pagado, Double amortizacion_pagar, Double gastos_administrativos, Double porcentaje_liquidacion, Double interes_pagar, Double total_pagar, Double capital_actual, Double capital_nuevo, Double interes_actual, Double interes_nuevo) {
        this.ultimo_mes_pagado = ultimo_mes_pagado;
        this.amortizacion_pagar = amortizacion_pagar;
        this.gastos_administrativos = gastos_administrativos;
        this.porcentaje_liquidacion = porcentaje_liquidacion;
        this.interes_pagar = interes_pagar;
        this.total_pagar = total_pagar;
        this.capital_actual = capital_actual;
        this.capital_nuevo = capital_nuevo;
        this.interes_actual = interes_actual;
        this.interes_nuevo = interes_nuevo;
    }

    public String getUltimo_mes_pagado() {
        return ultimo_mes_pagado;
    }

    public void setUltimo_mes_pagado(String ultimo_mes_pagado) {
        this.ultimo_mes_pagado = ultimo_mes_pagado;
    }

    public Double getAmortizacion_pagar() {
        return amortizacion_pagar;
    }

    public void setAmortizacion_pagar(Double amortizacion_pagar) {
        this.amortizacion_pagar = amortizacion_pagar;
    }

    public Double getGastos_administrativos() {
        return gastos_administrativos;
    }

    public void setGastos_administrativos(Double gastos_administrativos) {
        this.gastos_administrativos = gastos_administrativos;
    }

    public Double getPorcentaje_liquidacion() {
        return porcentaje_liquidacion;
    }

    public void setPorcentaje_liquidacion(Double porcentaje_liquidacion) {
        this.porcentaje_liquidacion = porcentaje_liquidacion;
    }

    public Double getInteres_pagar() {
        return interes_pagar;
    }

    public void setInteres_pagar(Double interes_pagar) {
        this.interes_pagar = interes_pagar;
    }

    public Double getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(Double total_pagar) {
        this.total_pagar = total_pagar;
    }

    public Double getCapital_actual() {
        return capital_actual;
    }

    public void setCapital_actual(Double capital_actual) {
        this.capital_actual = capital_actual;
    }

    public Double getCapital_nuevo() {
        return capital_nuevo;
    }

    public void setCapital_nuevo(Double capital_nuevo) {
        this.capital_nuevo = capital_nuevo;
    }

    public Double getInteres_actual() {
        return interes_actual;
    }

    public void setInteres_actual(Double interes_actual) {
        this.interes_actual = interes_actual;
    }

    public Double getInteres_nuevo() {
        return interes_nuevo;
    }

    public void setInteres_nuevo(Double interes_nuevo) {
        this.interes_nuevo = interes_nuevo;
    }

   
 
}
