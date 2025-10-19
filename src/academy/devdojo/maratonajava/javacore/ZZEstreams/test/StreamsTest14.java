package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Collectors -> Funções com Agrupamentos
public class StreamsTest14 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 10.99, Category.FANTASY),
            new LightNovel("Overlord", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no Life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 6.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.ROMANCE)
    ));
    public static void main(String[] args) {
        // A quantidade de cada elemento por categoria -> Collectors.counting()
        Map<Category, Long> collect1 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(collect1);

        // O maior/menor elemento de cada categoria:
        Map<Category, Optional<LightNovel>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect2);

        // Por retornar um Map<Category, Optional<LightNovel>>, temos que tirar esse optional da seguinte forma:
        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        System.out.println(collect3);
    }
}
