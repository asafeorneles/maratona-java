package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("A1");
        bookSeat("A1"); // Agora retorna falso, pois estamos trabalhando sempre com o mesmo objeto em memória.
//        AircraftTest01.bookSeat("A1"); // Independente da classe que o getINSTANCE estiver, sempre vai trabalhar com o mesmo objeto
    }

    private static void bookSeat(String seat){
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE(); // Cria sempre o mesmo objeto em memória
        System.out.println("Endereço de memória: " + AircraftSingletonEager.getINSTANCE());
        System.out.println(aircraft.bookSeat(seat));
    }
}
