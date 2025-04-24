package oop2.tp3.ejercicio_tipo_parcial.polimorfico;

import java.util.Collection;

public class Controlador {
    private Collection<Juez> jueces;

    public int calcularCausasTotales() {
        int cantidadCausas = 0;
        for (Juez juez : jueces) {
            cantidadCausas += juez.cantidadCausas();
        }
        return cantidadCausas;
    }
}

