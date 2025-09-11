package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Comprador;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Comprador comprador1 = new Comprador("Asafe Orneles");
        Comprador comprador2 = new Comprador("Alice Orneles");

        Manga manga1 = new Manga(5L, "Berserk", 19.99);
        Manga manga2 = new Manga(3L, "Hunter x Hunter", 5.50);
        Manga manga3 = new Manga(1L, "Naruto", 20.00);
        Manga manga4 = new Manga(4L, "Attack on Titan", 29.90);
        Manga manga5 = new Manga(2L, "One Punchman", 15.00);

        List<Manga> mangaCompradorList1 = List.of(manga1, manga2, manga5);
        List<Manga> mangaCompradorList2 = List.of(manga3, manga4);
        Map <Comprador, List<Manga>> compradorManga = new HashMap<>(); // Usando o LinkedHashMap<>(), ele mantém a ordem que inserimos
        compradorManga.put(comprador1, mangaCompradorList1);
        compradorManga.put(comprador2, mangaCompradorList2);

        for (Map.Entry<Comprador, List<Manga>> entry : compradorManga.entrySet()){
            System.out.println("-----" + entry.getKey().getNome());
            for (Manga manga : entry.getValue()){
                System.out.println("------------" + manga.getNome());
            }
        }
    }
}
