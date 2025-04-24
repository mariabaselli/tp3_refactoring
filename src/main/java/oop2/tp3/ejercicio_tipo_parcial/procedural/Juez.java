package oop2.tp3.ejercicio_tipo_parcial.procedural;


import java.util.Collection;

public class Juez {
    private String nombre;
    private String apellido;
    private Collection<Causa> causasACargo;

    void agregarCausa(Causa causa) {
        this.causasACargo.add(causa);
    }

    Collection<Causa> causas() {
        return causasACargo;
    }
}
