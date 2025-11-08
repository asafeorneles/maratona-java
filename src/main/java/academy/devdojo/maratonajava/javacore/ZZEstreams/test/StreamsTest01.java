package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

//1. Oder LightNovel by title.
//2. Retrieve the first 3 titles light novel  with price less than 4.
public class StreamsTest01 {
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
        // Sem usar streams:
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);

        List<String> titles = new ArrayList<>();
        for (LightNovel lightNovel : lightNovels){
            if (lightNovel.getPrice() <= 4){
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }
        }
        System.out.println(titles);

        Optional<List<String>> listStrings = retrieveTitles(lightNovels, ln -> ln.getPrice() <= 4, listString -> listString.size() >= 3);
        System.out.println(listStrings);
    }

    public static Optional<List<String>> retrieveTitles (List<LightNovel> list, Predicate<LightNovel> predicate, Predicate<List<String>> predicateList){
        List<String> listString = new ArrayList<>();
        for (LightNovel lightNovel : list) {
            if (predicate.test(lightNovel)){
                listString.add(lightNovel.getTitle());
            }
            if (predicateList.test(listString)){
                break;
            }
        }
        return Optional.of(listString);
    }
}
