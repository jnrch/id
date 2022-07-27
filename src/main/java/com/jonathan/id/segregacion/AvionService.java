package com.jonathan.id.segregacion;

public class AvionService implements Vehiculo, Avion {

    @Override
    public void volar() {
        System.out.println("El avion puede volar");
    }

    @Override
    public void acelerar() {
        System.out.println("El avion puede acelerar");
    }

    @Override
    public void detenerse() {
        System.out.println("El avion puede detenerse");
    }

    @Override
    public void aterrizar() {
        System.out.println("El avion puede aterrizar");
    }
}
