package oop2.tp3.ejercicio1.polimorfico;

public class LanzamientoRegular implements TipoLanzamiento {
    public static final int PUNTOS_EXTRA = 0;
    private int codigoPrecio;

    public LanzamientoRegular() {
        this.codigoPrecio = 1;
    }

    @Override
    public int otorgarPuntos() {
        return PUNTOS_EXTRA;
    }

    @Override
    public double calcularCosto(int diasAlquilados) {
        var monto = 0;
        monto += 2;
        if (diasAlquilados > 2)
            monto += (diasAlquilados - 2) * 1.5;
        return monto;
    }

}
