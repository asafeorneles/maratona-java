package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga manga01, Manga manga02) {
        return manga01.getId().compareTo(manga02.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Berserk", 19.99));
        mangas.add(new Manga(3L, "Hunter x Hunter", 5.50));
        mangas.add(new Manga(1L, "Naruto", 20.00));
        mangas.add(new Manga(4L, "Attack on Titan", 29.90));
        mangas.add(new Manga(2L, "One Punchman", 15.00));

        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Collections.sort(mangas);
        System.out.println("-----------------");

        for (Manga manga: mangas){
            System.out.println(manga);
        }

//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("-----------------");

        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
