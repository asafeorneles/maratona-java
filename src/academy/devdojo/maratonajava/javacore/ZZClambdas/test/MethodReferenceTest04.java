package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {

        Supplier<AnimeComparator> newAnimeComparator = AnimeComparator::new;
        AnimeComparator animeComparator = newAnimeComparator.get();

        List<Anime> animes = new ArrayList<>(List.of(
                new Anime("Naruto", 700),
                new Anime("One Piece", 1300),
                new Anime("Hunter x Hunter", 1500)
        ));

        animes.sort(animeComparator::comparatorByEpisodesNonStatic);
        System.out.println(animes);

        // Lambda
//        BiFunction<String, Integer, Anime> newAnime = (name, ep ) -> new Anime(name, ep);
//        animes.add(newAnime.apply("Attack on Titan", 146));
//        System.out.println(animes);

        // Method Reference
        BiFunction<String, Integer, Anime> newAnime = Anime::new;
        animes.add(newAnime.apply("Attack on Titan", 146));
        System.out.println(animes);
    }
}
