package oop2.tp3.ejercicio3.polimorfico;

public class Desayuno implements Detalle_Gasto {
    String nombreGasto;

    public Desayuno() {
        this.nombreGasto = "Desayuno";
    }

    @Override
    public String obtenerNombre() {
        return nombreGasto;
    }

    @Override
    public int obtenerGastoCena(int monto) {
        return 0;
    }

    @Override
    public int obtenerGastoDesayuno(int monto) {
        return monto;
    }

}

