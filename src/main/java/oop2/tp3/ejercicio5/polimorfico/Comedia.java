package oop2.tp3.ejercicio5.polimorfico;

public class Comedia extends Evento {
    public Comedia(String nombreEvento) {
        super(nombreEvento);
    }

    @Override
    protected String nombreEvento() {
        return super.nombreEvento();
    }

    @Override
    boolean existeNombre(String nombre) {
        if (this.nombreEvento() == nombre) return true;
        return false;
    }

    @Override
    float informarPago(Actuacion actuacion) {
        float monto = 30000;
        if (actuacion.numberoEspectadores() > 20) {
            monto += 10000 + 500 * (actuacion.numberoEspectadores() - 20);
        }
        monto += 300 * actuacion.numberoEspectadores();
        return monto;
    }

    @Override
    double informarCreditos(Actuacion actuacion) {
        return Math.max(actuacion.numberoEspectadores() - 30, 0) + Math.floor(actuacion.numberoEspectadores() / 5);
    }

}
