package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;
    {
        availableSeats.add("A1");
        availableSeats.add("B1");
    }

    public Aircraft(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }
}
