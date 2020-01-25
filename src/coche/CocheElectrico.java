/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author USUARIO
 */
public class CocheElectrico {
    
    private String marca;
    private int modelo;
    private Bateria bate;
    private Cargador carga;
    private Inversor inv;
    private MotorElectrico motor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Bateria getBate() {
        return bate;
    }

    public void setBate(Bateria bate) {
        this.bate = bate;
    }

    public Cargador getCarga() {
        return carga;
    }

    public void setCarga(Cargador carga) {
        this.carga = carga;
    }

    public Inversor getInv() {
        return inv;
    }

    public void setInv(Inversor inv) {
        this.inv = inv;
    }

    public MotorElectrico getMotor() {
        return motor;
    }

    public void setMotor(MotorElectrico motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" + "marca=" + marca + ", modelo=" + modelo + ", bate=" + bate + ", carga=" + carga + ", inv=" + inv + ", motor=" + motor + '}';
    }
    
}
