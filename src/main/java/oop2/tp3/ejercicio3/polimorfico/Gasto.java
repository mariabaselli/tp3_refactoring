package oop2.tp3.ejercicio3.polimorfico;

class Gasto {
    Detalle_Gasto tipoGasto;
    int monto;

    public Gasto(Detalle_Gasto tipoGasto, int monto) {
        this.tipoGasto = tipoGasto;
        this.monto = monto;
    }

    public String obtenerNombre() {
        return tipoGasto.obtenerNombre();
    }

    public int obtenerMontoComida() {
        return tipoGasto.obtenerMontoComida(this.monto);
    }

    public boolean excesoGastoComida() {
        return tipoGasto.excesoGastoCena(this.monto) || tipoGasto.excesoGastoDesayuno(this.monto);
        
    }
}