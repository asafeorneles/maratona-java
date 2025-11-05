package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSeats;

    // Construtor
    AircraftSingletonEnum() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("A1");
        this.availableSeats.add("B1");
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
