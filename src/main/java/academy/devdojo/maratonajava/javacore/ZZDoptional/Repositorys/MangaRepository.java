package academy.devdojo.maratonajava.javacore.ZZDoptional.Repositorys;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.ArrayList;
import java.util.List;

public class MangaRepository {
    public static List<Manga> mangas = new ArrayList<>(List.of(
            new Manga(1, "One Punchman", 75),
            new Manga(2, "Death Note", 25),
            new Manga(3, "Jujutsu Kaisen", 120)
    ));


}
