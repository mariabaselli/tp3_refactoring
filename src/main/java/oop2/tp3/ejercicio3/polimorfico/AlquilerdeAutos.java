package oop2.tp3.ejercicio3.polimorfico;

public class AlquilerdeAutos implements Detalle_Gasto {

    private String nombreGasto;

    public AlquilerdeAutos() {
        this.nombreGasto = "Alquiler de Autos";
    }

    @Override
    public String obtenerNombre() {
        return this.nombreGasto;
    }

    @Override
    public int obtenerMontoComida(int monto) {
        return 0;
    }

    @Override
    public boolean excesoGastoCena(int monto) {
        return false;
    }

    @Override
    public boolean excesoGastoDesayuno(int monto) {
        return false;
    }
}
