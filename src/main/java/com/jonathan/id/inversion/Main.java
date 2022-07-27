package com.jonathan.id.inversion;

public class Main {
    public static void main(String[] args) {

        CocheService cocheService = new CocheService((coche) -> {});
        Coche coche = new Coche();
        coche.setMarca("Ford");
        coche.setModelo("Focus");
        coche.setAnio(2011);
        cocheService.guardarCoche(coche);
    }
}
