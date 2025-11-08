package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Collectors -> Grouping by
public class StreamsTest12 {
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
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();

        List<LightNovel> listDrama = new ArrayList<>();
        List<LightNovel> listFantasy = new ArrayList<>();
        List<LightNovel> listRomance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels){
            switch (lightNovel.getCategory()){
                case DRAMA:
                    listDrama.add(lightNovel); break;
                case FANTASY:
                    listFantasy.add(lightNovel); break;
                case ROMANCE:
                    listRomance.add(lightNovel); break;
            }
        }

        categoryListMap.put(Category.DRAMA, listDrama);
        categoryListMap.put(Category.FANTASY, listFantasy);
        categoryListMap.put(Category.ROMANCE, listRomance);
        System.out.println(categoryListMap);

        // Utilizando streams e collect:
        Map<Category, List<LightNovel>> collect = listFantasy.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
