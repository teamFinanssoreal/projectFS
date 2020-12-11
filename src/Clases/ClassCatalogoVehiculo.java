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
public class ClassCatalogoVehiculo {
    
    //VARIABLES PARA PANTALLA DE 
    private int codigo;
    private String descripcion;
    private String numero_placa;
    private String marca;
    private String modelo;
    private String color;
    private String motor;
    private String id_gps;
    private String chip_gps;
    private byte[] foto;
    private String agencia_proveedora;
    private int codigo_seleccion_agencia_para_vehiculo;
    private int codigo_agencia_vehiculo;

    public ClassCatalogoVehiculo(int codigo, String descripcion, String numero_placa, String marca, String modelo, String color, String motor, String id_gps, String chip_gps, byte[] foto, String agencia_proveedora, int codigo_seleccion_agencia_para_vehiculo, int codigo_agencia_vehiculo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.numero_placa = numero_placa;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.id_gps = id_gps;
        this.chip_gps = chip_gps;
        this.foto = foto;
        this.agencia_proveedora = agencia_proveedora;
        this.codigo_seleccion_agencia_para_vehiculo = codigo_seleccion_agencia_para_vehiculo;
        this.codigo_agencia_vehiculo = codigo_agencia_vehiculo;
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

    public String getNumero_placa() {
        return numero_placa;
    }

    public void setNumero_placa(String numero_placa) {
        this.numero_placa = numero_placa;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getId_gps() {
        return id_gps;
    }

    public void setId_gps(String id_gps) {
        this.id_gps = id_gps;
    }

    public String getChip_gps() {
        return chip_gps;
    }

    public void setChip_gps(String chip_gps) {
        this.chip_gps = chip_gps;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getAgencia_proveedora() {
        return agencia_proveedora;
    }

    public void setAgencia_proveedora(String agencia_proveedora) {
        this.agencia_proveedora = agencia_proveedora;
    }

    public int getCodigo_seleccion_agencia_para_vehiculo() {
        return codigo_seleccion_agencia_para_vehiculo;
    }

    public void setCodigo_seleccion_agencia_para_vehiculo(int codigo_seleccion_agencia_para_vehiculo) {
        this.codigo_seleccion_agencia_para_vehiculo = codigo_seleccion_agencia_para_vehiculo;
    }

    public int getCodigo_agencia_vehiculo() {
        return codigo_agencia_vehiculo;
    }

    public void setCodigo_agencia_vehiculo(int codigo_agencia_vehiculo) {
        this.codigo_agencia_vehiculo = codigo_agencia_vehiculo;
    }
    
    
    
}
