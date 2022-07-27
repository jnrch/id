package com.jonathan.id.inversion;

public class MySqlDb implements Persistencia {

    @Override
    public void guardar(Coche coche) {
        System.out.println("Guardando el coche " + coche.toString());
    }
}
