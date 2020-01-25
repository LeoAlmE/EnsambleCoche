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
public class Ensamble {
    
    public static void main(String[] args) {
        
        MotorElectrico me = new MotorElectrico();
        me.setCveMotor(1);
        me.setMarca("nissan");
        me.setDescripcionTec("motor nuevo");
        me.setCosto(1520.56);
        
        Bateria bate = new Bateria();
        bate.setMarca("LTH");
        bate.setCapacidad(25);
        bate.setEspecificaciones("Bateria mediana");
        
        Cargador car = new Cargador();
        car.setMarca("Meridian");
        car.setCapacidad(35);
        
        Inversor inv = new Inversor();
        inv.setMarca("Proto");
        inv.setCapacidad(30);
        
        CocheElectrico ce = new CocheElectrico();
        ce.setMarca("nissan");
        ce.setModelo(2015);
        ce.setBate(bate);
        ce.setCarga(car);
        ce.setInv(inv);
        ce.setMotor(me);
        
        System.out.println(ce.toString());

    }
    
}
