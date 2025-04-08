package oop2.tp3.ejercicio1.polimorfico;


public class Main {
    public static void main(String args[]) {
        Libro elTunel = new Libro("El Túnel", new LanzamientoRegular());
        System.out.print("Dirección de memoria del original:" + elTunel);
        Libro antesDelFin = new Libro("Antes del Fin", new LanzamientoRegular());
        Alquiler alquilerElTunel = new Alquiler(elTunel, 5);
        Alquiler alquilerAntesDelFin = new Alquiler(antesDelFin, 3);
        Cliente yo = new Cliente("Javier");
        yo.alquilar(alquilerElTunel);
        yo.alquilar(alquilerAntesDelFin);
        System.out.println(alquilerElTunel.calcularCosto());
        System.out.print("Direccion de memoria de la copia:" + alquilerElTunel.copiaLibro);
    }
}