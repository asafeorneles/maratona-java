package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class Test {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto");

        System.out.println(anime.getNome());
        for (int episodio : anime.getEpisodios()) {
            if (episodio == 51) {
                System.out.println();
            }
            System.out.print(episodio + " ");
        }

    }
}
