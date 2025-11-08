package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("Naruto", 700), new Anime("One Piece", 1300), new Anime("Hunter x Hunter", 1500)));

        // Usando Classe Anônima
        animes.sort(new Comparator<Anime>() {
            @Override
            public int compare(Anime o1, Anime o2) {
                return Integer.compare(o1.getEpisodes(), o2.getEpisodes());
            }
        });
        // Usando Lambda (Chama 2 métodos, portanto podemos criar um metodo para fazer a funcao do compare e chamar usando Method Reference)
        animes.sort((a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));

        // Usando Method Reference
        animes.sort(AnimeComparator::comparatorByTitle);

        animes.sort(AnimeComparator::comparatorByEpisodes);

        System.out.println(animes);
    }
}
