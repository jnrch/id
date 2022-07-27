package com.jonathan.id.segregacion;

public class CocheService implements Vehiculo {

    @Override
    public void acelerar() {
        System.out.println("El coche puede acelerar");
    }

    @Override
    public void detenerse() {
        System.out.println("El coche puede detenerse");
    }
}
