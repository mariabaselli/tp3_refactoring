package oop2.tp3.ejercicio1.polimorfico;


public class LanzamientoInfantil implements TipoLanzamiento {
    private int codigoPrecio;

    public LanzamientoInfantil(int codigoPrecio) {
        this.codigoPrecio = codigoPrecio;
    }

    @Override
    public double calcularCosto(Alquiler alquiler) {
        var monto = 0;
        monto += 1.5;
        if (alquiler.diasAlquilados() > 3)
            monto += (alquiler.diasAlquilados() - 3) * 1.5;
        return monto;
    }

    @Override
    public boolean nuevoLanzamiento(Libro libro) {
        return false;
    }
}
