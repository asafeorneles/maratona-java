package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hunter x Hunter");
        mangas.add("Naruto");
        mangas.add("Attack on Titan");
        mangas.add("One Punchman");

        Collections.sort(mangas); // Organiza os index. Como é String, organiza em ordem alfabética.

        for (String manga: mangas){
            System.out.println(manga);
        }

        List<Double> dinheiros = new ArrayList<>(6);
        dinheiros.add(21.54);
        dinheiros.add(10.70);
        dinheiros.add(11.85);
        dinheiros.add(100.99);
        dinheiros.add(5.70);

        Collections.sort(dinheiros); // Organiza os index. Como é Double, organiza em ordem crescente.

        System.out.println(dinheiros);
    }
}
