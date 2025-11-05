package academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.test;

import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZGpadroesDeProjeto.dominio.AircraftSingletonEager;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("A1");
        bookSeat("A1"); // A princípio era para esta chamada de metodo nos retornar false pois cada aeronave possui assentos distintos.
        // Isso não ocorre pois cada vez que chamamos bookSeat, é criado um novo objeto sendo trabalhado em locais diferentes da memória.
    }

    static void bookSeat(String seat){
        Aircraft aircraft = new Aircraft("BONG-587");
        System.out.println(aircraft.bookSeat(seat));
//        System.out.println("Endereço de memória: " + AircraftSingletonEager.getINSTANCE()); // Apenas para ilustrar que independente da classe que chama o getINSTANCE, sempre vai ser o mesmo obj
    }
}
