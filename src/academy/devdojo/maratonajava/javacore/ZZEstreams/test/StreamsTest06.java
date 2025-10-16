package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTest06 {

    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 10.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {

        // anyMatch -> Retorna um boolean, retorna true se algum elemento da lista passar pela lógica
        // allMatch -> Retorna um boolean, retorna true se todos os elementos da lista passar pela lógica
        // noneMatch -> Retorna um boolean, retorna true se nenhum elemento da lista passar pela lógica

        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 9));  // Retorna true se tiver algum LightNovel com preço maior que 9

        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0)); // Retorna true se todos os elementos da lista tiver o preço maior que 0

        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() > 0)); // Retorna true se nenhum dos elementos da lista tiver o preço maior que 0

        // findAny() -> Retorna um Optional<T>. Procura por um elemento. Bom pra ser usado quando você nao se importa com o resultado
        // findFirst() -> Retorna um Optional<T>. Procura pelo primeiro elemento que achar. Bom para ser usado com um sort.
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getPrice).reversed())
                .findFirst()
                .ifPresent(System.out::println);
    }

}
