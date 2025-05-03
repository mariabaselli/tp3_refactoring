package oop2.tp3.ejercicio_tipo_parcial.polimorfico;


import java.util.ArrayList;
import java.util.Collection;

public class Juez {
    private String nombre;
    private String apellido;
    private Collection<Causa> causasACargo;

    public Juez(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.causasACargo = new ArrayList<>();
    }


    public void agregarCausa(Causa causa) {
        this.causasACargo.add(causa);
    }

    Collection<Causa> causas() {
        return causasACargo;
    }

    public int cantidadCausas() {
        return causasACargo.size();
    }
}
