package oop2.tp3.ejercicio3.polimorfico;

public class Desayuno implements Detalle_Gasto {
    private String nombreGasto;

    public Desayuno() {
        this.nombreGasto = "Desayuno";
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
        return false;
    }

    @Override
    public boolean excesoGastoDesayuno(int monto) {
        return monto > 1000;
    }
}
