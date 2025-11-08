package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(Comparator.reverseOrder()); // Podemos usar o Comparator.reverseOrder() para ivertar a ordem do compareTo
        mangas.add(new Manga(5L, "Berserk", 19.99));
        mangas.add(new Manga(3L, "Hunter x Hunter", 5.50));
        mangas.add(new Manga(1L, "Naruto", 20.00));
        mangas.add(new Manga(4L, "Attack on Titan", 29.90));
        mangas.add(new Manga(2L, "One Punchman", 15.00));
        mangas.add(new Manga(10L, "Aaragon", 16.00, 4));

        while (!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }

    }
}
