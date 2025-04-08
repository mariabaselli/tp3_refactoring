package oop2.tp3.ejercicio1.polimorfico;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;
    private int puntosObtenidos;

    Cliente(String nombre) {
        this.name = nombre;
        this.puntosObtenidos = 0;
    }

    void alquilar(Alquiler rental) {
        alquileres.add(rental);
        sumarPuntos();
        if (rental.otorgaPuntosExtra()) {
            sumarPuntos();
        }
    }

    void sumarPuntos() {
        this.puntosObtenidos++;
    }

    int informarPuntos() {
        return this.puntosObtenidos;
    }

    double calcularDeuda(Alquiler rental) {
        return rental.calcularCosto();
    }

}
