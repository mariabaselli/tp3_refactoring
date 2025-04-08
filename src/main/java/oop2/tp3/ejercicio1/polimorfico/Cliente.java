package oop2.tp3.ejercicio1.polimorfico;

import oop2.tp3.ejercicio1.procedural.Alquiler;
import oop2.tp3.ejercicio1.procedural.Libro;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private String name;
    private int puntosAlquilerFrecuente;

    public Cliente(String nombre) {

        this.name = nombre;
        this.puntosAlquilerFrecuente = 0;
    }

    public static void abonarAlquiler(Alquiler unAlquiler, Libro unLibro) {



    }



            // sumo puntos por alquiler
            puntosAlquilerFrecuente++;
            // bonus por dos días de alquiler de un nuevo lanzamiento
            if ((alquiler.copia().libro().codigoPrecio() == Libro.NUEVO_LANZAMIENTO)
                    && alquiler.diasAlquilados() > 1) {
                puntosAlquilerFrecuente++;
            }
        }
        resultado[0] = total;
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
    }

    public void alquilar(Alquiler rental) {
        alquileres.add(rental);
    }
}
