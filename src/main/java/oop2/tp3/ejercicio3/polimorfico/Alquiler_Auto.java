package oop2.tp3.ejercicio3.polimorfico;

public class Alquiler_Auto implements Detalle_Gasto {
    String nombreGasto;

    public Alquiler_Auto() {
        this.nombreGasto = "Alquiler de Autos";
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
        return 0;
    }

}
