package oop2.tp3.ejercicio1.polimorfico;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<>();
    private String name;
    private int puntosObtenidos;

    Cliente(String nombre) {
        this.name = nombre;
        this.puntosObtenidos = 0;
    }

    void alquilar(Alquiler rental) {
        alquileres.add(rental);
        sumarPuntos(rental);
    }

    void sumarPuntos(Alquiler rental) {
        this.puntosObtenidos++;
        this.puntosObtenidos += rental.otorgaPuntosExtra();
    }

    int informarPuntos() {
        return this.puntosObtenidos;
    }

    double calcularDeuda() {
        double resultado = 0;
        for (Alquiler alquiler : alquileres) {
            resultado += alquiler.calcularCosto();
        }
        return resultado;
    }

}
