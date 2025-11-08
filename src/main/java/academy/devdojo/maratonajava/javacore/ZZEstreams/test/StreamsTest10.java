package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Gerando Streams -> Criando Streams com valores "Infinitos"
public class StreamsTest10 {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n + 2) // "Crie para mim números somados de 2 em 2 começando com o número 1"
                .limit(10) // Limite de interações, não do ultimo número a ser gerado
                .forEach(System.out::println);

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        // (0, 1) (1, 2) (2, 3) (3, 5) (5, 8)
        // Se trabalharmos com array, cada array teriam 2 indices: [0], [1]

        // Imprimindo os arrays
        Stream.iterate(new int [] {0,1}, a -> new int [] {a[1], a[0] + a[1]}) // A primeira posição do array gerado, é a posição 1 do array anterior
                // e a segunda posição do array gerado é a posição 0 do array anterior somada com a posição 1 do array anterior
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));
        System.out.println();

        // Imprimindo os valores dos arrays
        Stream.iterate(new int [] {0,1}, a -> new int [] {a[1], a[0] + a[1]})
                .map(a -> a[0])
                .limit(10)
                .forEach(System.out::println);
        System.out.println();

        ThreadLocalRandom random = ThreadLocalRandom.current(); // Gerar números aleatórios
        Stream.generate(() -> random.nextInt(1,1000))
                .limit(10)
                .forEach(System.out::println);

    }
}
