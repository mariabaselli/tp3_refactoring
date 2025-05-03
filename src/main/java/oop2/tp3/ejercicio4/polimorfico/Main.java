package oop2.tp3.ejercicio4.polimorfico;


import org.jdbi.v3.core.Jdbi;

public class Main {

    public static void main(String[] args) {

        Jdbi jdbi = Jdbi.create("jdbc:hsqldb:mem;create=true");

        new SetUpDatabase(jdbi).setUp();

        var repo = new PersonaRepository(jdbi);
        var personas = repo.buscarPorNombre("Vla");
        for (Persona persona : personas) {
            System.out.println(persona.nombre() + " " + persona.apellido());
            var optionalPersona = repo.buscarId(3L);
            optionalPersona.ifPresent(persona1 -> System.out.println(persona.nombre() + " " + persona.apellido()));

        }
    }
}
