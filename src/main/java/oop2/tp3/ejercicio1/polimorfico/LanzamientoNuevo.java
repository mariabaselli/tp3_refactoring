package oop2.tp3.ejercicio1.polimorfico;

public class LanzamientoNuevo implements TipoLanzamiento {
    public static final int PUNTOS_EXTRA = 1;
    private int codigoPrecio;

    public LanzamientoNuevo() {
        this.codigoPrecio = 2;
    }

    @Override
    public int otorgarPuntos() {
        return PUNTOS_EXTRA;
    }

    @Override
    public double calcularCosto(int diasAlquilados) {
        var monto = 0;
        monto += diasAlquilados * 3;
        return monto;
    }
}
