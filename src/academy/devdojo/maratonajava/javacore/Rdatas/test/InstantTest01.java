package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;
import java.time.LocalDateTime;

public class InstantTest01 {
    public static void main(String[] args) {
        Instant now = Instant.now(); // Retorna como padrão o zulu time, tempo padrão globalmente
        System.out.println(now);
        System.out.println(LocalDateTime.now()); // Retorna como padrão o locale do meu sistema operacional
        System.out.println(now.getEpochSecond()); // Retorna os segundos desde la pra 1970 até hoje.
        System.out.println(now.getNano()); // Retorna o nanossegundo do segundo

        /* A vantagem em usar o instant é que ele retorna um horario padrao globalmente e também possibilita
        trabalhar com nanossegundos.
        */
    }
}
