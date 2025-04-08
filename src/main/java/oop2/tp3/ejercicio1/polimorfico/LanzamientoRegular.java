package oop2.tp3.ejercicio1.polimorfico;

public class LanzamientoRegular implements TipoLanzamiento {
    private int codigoPrecio;

    public LanzamientoRegular(int codigoPrecio) {
        this.codigoPrecio = codigoPrecio;
    }

    @Override
    public double calcularCosto(Alquiler alquiler) {
        double monto= 0;
        monto += 2;
        if (alquiler.diasAlquilados() > 2)
            monto += (alquiler.diasAlquilados() - 2) * 1.5;
        return monto;
    }

    @Override
    public boolean nuevoLanzamiento(Libro libro) {
        return false;
    }
}
