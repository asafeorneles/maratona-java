package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.AircraftSingletonEnum;
import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.AircraftSingletonLazy;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("A1");
        bookSeat("A1");
    }

    private static void bookSeat(String seat) {
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE; // Cria sempre o mesmo objeto em memória
        System.out.println(instance.hashCode());
        System.out.println(instance.bookSeat(seat));
    }
}
