package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.AircraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("A1");
        bookSeat("A1");

        // Com essa gambiarra aqui ainda é possivel criar outra instancia diferente (Se tiver alguem fazendo isso no código, pode descer o sarrafo)
        Constructor<AircraftSingletonEager> constructor = AircraftSingletonEager.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonEager aircraftSingletonEager = constructor.newInstance("BONG-587");
        System.out.println(aircraftSingletonEager);

    }

    private static void bookSeat(String seat) {
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getINSTANCE(); // Cria sempre o mesmo objeto em memória
        System.out.println("Endereço de memória: " + AircraftSingletonLazy.getINSTANCE());
        System.out.println(aircraft.bookSeat(seat));
    }
}
