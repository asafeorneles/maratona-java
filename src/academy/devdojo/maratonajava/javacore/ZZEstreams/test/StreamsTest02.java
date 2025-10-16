package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//1. Oder LightNovel by title.
//2. Retrieve the first 3 titles light novel  with price less than 4.
public class StreamsTest02 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        List <String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(lightNovel -> lightNovel.getTitle())) //Ordena a list
                .filter(ln -> ln.getPrice() <= 4) // Filtra elementos da lista através da lógica passada do Predicate
                .limit(3) // Limita a quantidade de elementos na lista
                .map(LightNovel::getTitle) // Pega o elemento da lista e retorna outro (LigthNovel -> String)
                .collect(Collectors.toList()); // Coleta e retorna a List atraver do Collectors.toList()

        System.out.println(titles);
    }

}
