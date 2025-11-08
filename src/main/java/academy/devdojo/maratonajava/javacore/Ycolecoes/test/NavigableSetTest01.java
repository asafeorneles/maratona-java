package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneComparatorTest implements Comparator<Smartphone>{ // Como Smartphone nao possui comparable e O TreeSet nescessita de um
    // meio de comparação, usar o comparator é uma forma,
    @Override
    public int compare(Smartphone smartphone1, Smartphone smartphone2) {
        return smartphone1.getMarca().compareTo(smartphone2.getMarca());
    }
}

class MangaComparatorPreco implements Comparator <Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneComparatorTest()); // Sempre que usar o Compare, devemos passá-lo no TreeSet.
        set.add(new Smartphone("123", "Nókia"));
        System.out.println(set);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaComparatorPreco());
        mangas.add(new Manga(5L, "Berserk", 9.99, 0));
        mangas.add(new Manga(3L, "Hunter x Hunter", 5.50, 3));
        mangas.add(new Manga(1L, "Naruto", 20.00, 0));
        mangas.add(new Manga(4L, "Attack on Titan", 29.90,0));
        mangas.add(new Manga(2L, "One Punchman", 15.00, 4));
        mangas.add(new Manga(10L, "Aaragon", 16.00, 4));
        mangas.add(new Manga(10L, "Aaragon", 16.00, 4));

        for (Manga manga : mangas){ // Manga manga : mangas.descendingSet() -> ordena de forma decrescente.
            System.out.println(manga);
        }

        System.out.println("---------------------");

        // Retorna o objeto do TreeSet:
        // lower retorna o <
        // floor retorna <=
        // higher retorna o >
        // ceiling retorna o >=

        Manga juju = new Manga(5L, "Jujutsu no Kaisen", 9.99, 0);

        System.out.println(mangas.lower(juju));
        System.out.println(mangas.floor(juju));
        System.out.println(mangas.higher(juju));
        System.out.println(mangas.ceiling(juju));


        // Utilizando pollFirst ou pollLast, removemos o primeiro ou o ultimo da lista.
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());
    }
}
