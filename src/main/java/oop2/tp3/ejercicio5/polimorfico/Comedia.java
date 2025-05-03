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
        if (actuacion.numeroEspectadores() > 20) {
            monto += 10000 + 500 * (actuacion.numeroEspectadores() - 20);
        }
        monto += 300 * actuacion.numeroEspectadores();
        return monto;
    }

    @Override
    double informarCreditos(Actuacion actuacion) {
        return Math.max(actuacion.numeroEspectadores() - 30, 0) + Math.floor(actuacion.numeroEspectadores() / 5);
    }

}
