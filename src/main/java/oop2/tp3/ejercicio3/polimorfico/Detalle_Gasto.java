package oop2.tp3.ejercicio3.polimorfico;

public interface Detalle_Gasto {

    String obtenerNombre();

    int obtenerMontoComida(int monto);

    boolean excesoGastoCena(int monto);

    boolean excesoGastoDesayuno(int monto);
}
