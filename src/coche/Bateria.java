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
public class Bateria {
    
    private String marca;
    private int capacidad;
    private String especificaciones;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEspecificaciones() {
        return especificaciones;
    }

    public void setEspecificaciones(String especificaciones) {
        this.especificaciones = especificaciones;
    }

    @Override
    public String toString() {
        return "Bateria{" + "marca=" + marca + ", capacidad=" + capacidad + ", especificaciones=" + especificaciones + '}';
    }
    
}
