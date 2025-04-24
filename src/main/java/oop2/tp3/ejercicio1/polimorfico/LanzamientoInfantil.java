package oop2.tp3.ejercicio1.polimorfico;


public class LanzamientoInfantil implements TipoLanzamiento {
    public static final int PUNTOS_EXTRA = 0;
    private int codigoPrecio;

    public LanzamientoInfantil() {
        this.codigoPrecio = 0;
    }

    @Override
    public int otorgarPuntos() {
        return PUNTOS_EXTRA;
    }

    @Override
    public double calcularCosto(int diasAlquilados) {
        var monto = 0;
        monto += 1.5;
        if (diasAlquilados > 3) {
            monto += (diasAlquilados - 3) * 1.5;
        }
        return monto;
    }
}
