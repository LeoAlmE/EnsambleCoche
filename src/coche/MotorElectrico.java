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
public class MotorElectrico {
 
    private int cveMotor;
    private String marca;
    private String descripcionTec;
    private double Costo;

    public int getCveMotor() {
        return cveMotor;
    }

    public void setCveMotor(int cveMotor) {
        this.cveMotor = cveMotor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcionTec() {
        return descripcionTec;
    }

    public void setDescripcionTec(String descripcionTec) {
        this.descripcionTec = descripcionTec;
    }

    public double getCosto() {
        return Costo;
    }

    public void setCosto(double Costo) {
        this.Costo = Costo;
    }

    @Override
    public String toString() {
        return "MotorElectrico{" + "cveMotor=" + cveMotor + ", marca=" + marca + ", descripcionTec=" + descripcionTec + ", Costo=" + Costo + '}';
    }
    
}
