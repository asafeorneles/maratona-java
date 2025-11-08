package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLazy {
    // Lazy initialization
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;
    {
        availableSeats.add("A1");
        availableSeats.add("B1");
    }

    // Construtor privado para não permitir criação de objetos durante o código em nenhuma classe
    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

    // Funciona, mas em códigos multiThreads não vai funcionar
//    public static AircraftSingletonLazy getINSTANCE(){
//        if (INSTANCE == null){
//            INSTANCE = new AircraftSingletonLazy("BONG-587");
//        }
//        return INSTANCE;
//    }

    // Com o synchronized, isso garante que duas threads não entrem ao mesmo tempo no getINSTANCE e criem mais de uma instancia.
    public static AircraftSingletonLazy getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class){
                if (INSTANCE == null){
                    INSTANCE = new AircraftSingletonLazy("BONG-587");
                }
            }
        }
        return INSTANCE;
    }
}
