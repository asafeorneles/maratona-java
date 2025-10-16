package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest03 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        // Situação em que precisamos printar a list:
//      lightNovels.stream().forEach(System.out::println); // Não há necessidade de utilizar o stream() para printar. A propria List já possui um metodo pra isso
        lightNovels.forEach(System.out::println);

        Stream<LightNovel> stream = lightNovels.stream(); // Criar uma variável Stream só faz sentido quando for precisar de um Stream pra ser consumido por outro metodo por exemplo.
        long count = stream
                .distinct() // Precisa do equals() e do hashCode() criados no Objeto
                .filter(fn -> fn.getPrice() <= 4)
                .count(); // Retorna um long, com a quantidade de objetos no array
        System.out.println(count);
    }

}
