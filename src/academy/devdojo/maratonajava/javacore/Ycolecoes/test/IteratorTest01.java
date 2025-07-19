package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(5L, "Berserk", 19.99, 0));
        mangas.add(new Manga(3L, "Hunter x Hunter", 5.50, 3));
        mangas.add(new Manga(1L, "Naruto", 20.00, 0));
        mangas.add(new Manga(4L, "Attack on Titan", 29.90,0));
        mangas.add(new Manga(2L, "One Punchman", 15.00, 4));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){ // O iterator gerencia a list, checkando objetos antes de remover
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0); // Programação funcional (Mais avançada um pouco). Mas simplifica o código de cima

        System.out.println(mangas);
    }
}
