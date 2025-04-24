package oop2.tp3.ejercicio3.polimorfico;

public class Cena implements Detalle_Gasto {
    String nombreGasto;

    public Cena() {
        this.nombreGasto = "Cena";
    }

    @Override
    public String obtenerNombre() {
        return nombreGasto;
    }

    @Override
    public int obtenerGastoCena(int monto) {
        return monto;
    }

    @Override
    public int obtenerGastoDesayuno(int monto) {
        return 0;
    }

}
