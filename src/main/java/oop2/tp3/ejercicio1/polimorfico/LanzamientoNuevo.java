package oop2.tp3.ejercicio1.polimorfico;

public class LanzamientoNuevo implements TipoLanzamiento {
    private int codigoPrecio;

    public LanzamientoNuevo(int codigoPrecio) {
        this.codigoPrecio = codigoPrecio;
    }

    @Override
    public double calcularCosto(Alquiler alquiler) {
        var monto = 0;
        monto += alquiler.diasAlquilados() * 3;
        return monto;
    }

    @Override
    public boolean nuevoLanzamiento(Libro libro) {
        return true;
    }
}
