package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
//        Set<Manga> mangas = new LinkedHashSet<>(); O linkedHashSet permite a organização na lista da forma que inserimos.
        mangas.add(new Manga(5L, "Berserk", 19.99));
        mangas.add(new Manga(3L, "Hunter x Hunter", 5.50));
        mangas.add(new Manga(1L, "Naruto", 20.00));
        mangas.add(new Manga(4L, "Attack on Titan", 29.90));
        mangas.add(new Manga(2L, "One Punchman", 15.00));

        for (Manga manga : mangas){
            System.out.println(manga);
        }

    }
}
