package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Comprador comprador1 = new Comprador("Asafe Orneles");
        Comprador comprador2 = new Comprador("Alice Orneles");

        Manga manga1 = new Manga(5L, "Berserk", 19.99);
        Manga manga2 = new Manga(3L, "Hunter x Hunter", 5.50);
        Manga manga3 = new Manga(1L, "Naruto", 20.00);
        Manga manga4 = new Manga(4L, "Attack on Titan", 29.90);
        Manga manga5 = new Manga(2L, "One Punchman", 15.00);

        Map <Comprador, Manga> compradorManga = new HashMap<>();
        compradorManga.put(comprador1, manga2);
        compradorManga.put(comprador2, manga3);

        for (Map.Entry<Comprador, Manga> entry : compradorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
