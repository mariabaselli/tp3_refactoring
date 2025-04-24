package oop2.tp3.ejercicio1.polimorfico;

public class Alquiler {
    Libro copiaLibro;
    private int diasAlquilados;

    public Alquiler(Libro libro, int diasAlquilados) {
        this.copiaLibro = libro.copia();
        this.diasAlquilados = diasAlquilados;
    }

    int diasAlquilados() {
        return this.diasAlquilados;
    }


    double calcularCosto() {
        return copiaLibro.informarValor(diasAlquilados);
    }


    int otorgaPuntosExtra() {
        var resultado = 0;
        if (this.diasAlquilados() > 1) {
            resultado = copiaLibro.otorgaPuntos();
        }
        return resultado;
    }
}
