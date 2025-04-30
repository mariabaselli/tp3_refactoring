package oop2.tp3.ejercicio3.polimorfico;

public class Cena implements Detalle_Gasto {
    private String nombreGasto;

    public Cena() {
        this.nombreGasto = "Cena";
    }

    @Override
    public String obtenerNombre() {
        return this.nombreGasto;
    }

    @Override
    public int obtenerMontoComida(int monto) {
        return monto;
    }

    @Override
    public boolean excesoGastoCena(int monto) {
        return monto > 5000;
    }

    @Override
    public boolean excesoGastoDesayuno(int monto) {
        return false;
    }
}
