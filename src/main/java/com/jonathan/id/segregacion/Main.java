package com.jonathan.id.segregacion;

public class Main {
    public static void main(String[] args) {
        AvionService avionService = new AvionService();
        avionService.acelerar();
        avionService.detenerse();
        avionService.aterrizar();
        avionService.volar();

        CocheService cocheService = new CocheService();
        cocheService.acelerar();
        cocheService.detenerse();
    }
}
