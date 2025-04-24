package oop2.tp3.ejercicio3.polimorfico;

class Gasto {
    Detalle_Gasto tipoGasto;
    int monto;

    public Gasto(Detalle_Gasto tipoGasto, int monto) {
        this.tipoGasto = tipoGasto;
        this.monto = monto;
    }

    int obtenerGasto() {
        return monto;
    }

    int obtenerGastoCena() {
        return tipoGasto.obtenerGastoCena(monto);
    }

    String obtenerNombre() {
        return tipoGasto.obtenerNombre();
    }

    int obtenerGastoDesayuno() {
        return tipoGasto.obtenerGastoDesayuno(monto);
    }

}
