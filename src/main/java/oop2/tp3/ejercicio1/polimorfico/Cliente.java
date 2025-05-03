package oop2.tp3.ejercicio1.polimorfico;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public static final String LABEL_NOMBRE_VACIO = "El nombre no puede estar vacio";
    private List<Alquiler> alquileres = new ArrayList<>();
    private String nombre;
    private int puntosObtenidos;

    Cliente(String nombre) {
        this.nombre = nombre;
        if (nombre == null || nombre.isBlank()) {
            throw new RuntimeException(LABEL_NOMBRE_VACIO);
        }
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
