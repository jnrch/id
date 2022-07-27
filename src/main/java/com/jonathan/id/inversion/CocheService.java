package com.jonathan.id.inversion;

public class CocheService implements ICocheService {
    Persistencia persistencia;

    public CocheService(Persistencia persistencia) {
        this.persistencia = persistencia;
    }

    public void guardarCoche(Coche coche) {
        System.out.println("Guardando el coche de marca " + coche.getMarca() + " y modelo " + coche.getModelo());
        persistencia.guardar(coche);
    }
}
