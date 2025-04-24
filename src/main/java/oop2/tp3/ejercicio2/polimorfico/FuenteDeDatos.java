package oop2.tp3.ejercicio2.polimorfico;

import java.io.IOException;
import java.util.List;

public interface FuenteDeDatos {
    List<String[]> toList() throws IOException;
}
