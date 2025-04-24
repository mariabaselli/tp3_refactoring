package oop2.tp3.ejercicio5.polimorfico;

public class Drama extends Evento {
    public Drama(String nombreEvento) {
        super(nombreEvento);
    }

    @Override
    double informarCreditos(Actuacion actuacion) {
        return Math.max(actuacion.numberoEspectadores() - 30, 0);
    }

    @Override
    boolean existeNombre(String nombre) {
        if (nombreEvento() == nombre) return true;
        return false;
    }

    @Override
    protected String nombreEvento() {
        return super.nombreEvento();
    }

    @Override
    float informarPago(Actuacion actuacion) {
        float monto = 40000;
        if (actuacion.numberoEspectadores() > 30) {
            monto += 1000 * (actuacion.numberoEspectadores() - 30);
        }
        return monto;

    }

}
