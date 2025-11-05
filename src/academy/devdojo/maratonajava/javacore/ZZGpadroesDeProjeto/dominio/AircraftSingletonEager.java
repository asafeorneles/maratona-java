package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    // Eager initialization
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("BONG-587");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;
    {
        availableSeats.add("A1");
        availableSeats.add("B1");
    }

    // Construtor privado para não permitir criação de objetos durante o código em nenhuma classe
    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

    public static AircraftSingletonEager getINSTANCE(){
        return INSTANCE;
    }
}
