package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Gerando Streams -> Forma de trabalhar com Streams sem ter que criar listas
public class StreamsTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " ")); // rangeClosed() -> Conta de 1 a 50
        System.out.println();
        IntStream.range(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " ")); // range() -> Conta de 1 a 49 (Último número passado -1)
        System.out.println();

        Stream.of("Gomo", " gomo", " no", " pistol!")
                .map(String::toUpperCase)
                .forEach(i -> System.out.print(i + " "));
        System.out.println();

        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))){ //Coletamos as linhas do arquivos e temos um Stream<String> que nos ajuda a trabalhar melhor com as Strings
            lines
                .filter(s -> s.contains("Java")) // Podemos filtrar as linhas do arquivo
                .forEach(System.out::println); // Imprimimos

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
