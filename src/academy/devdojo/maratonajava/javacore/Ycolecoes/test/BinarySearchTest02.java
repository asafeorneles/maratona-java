package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {

        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Berserk", 19.99));
        mangas.add(new Manga(3L, "Hunter x Hunter", 5.50));
        mangas.add(new Manga(1L, "Naruto", 20.00));
        mangas.add(new Manga(4L, "Attack on Titan", 29.90));
        mangas.add(new Manga(2L, "One Punchman", 15.00));

        Collections.sort(mangas);
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        System.out.println("-----------------");

        mangas.sort(mangaByIdComparator);
        for (Manga manga: mangas){
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(7L, "Hunter x Hunter", 5.50);

        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
