package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto", 700), new Anime("One Piece", 1300), new Anime("Hunter x Hunter", 1500)));
        //Em métodos não estáticos, devemos criar um objeto da Classe de que o metodo pertence, e através dele, chamar o metodo por MR.
        AnimeComparator animeComparator = new AnimeComparator();

        animes.sort(animeComparator::comparatorByEpisodesNonStatic);
        System.out.println(animes);
    }
}
