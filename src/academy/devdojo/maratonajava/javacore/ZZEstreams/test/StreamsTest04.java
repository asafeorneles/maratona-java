package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest04 {
    public static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no Life", 2.99),
            new LightNovel("Fullmetal Alchemist", 6.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        List<List<String>> cruzeiro = new ArrayList<>();

        List<String> atacantes = List.of("Kaio Jorge", "Arroyo", "Gabigol");
        List<String> volantes = List.of("Lucas Silva", "Lucas Romero", "Christian");
        List<String> defensores = List.of("Villalba", "Fabrício Bruno", "Cássio");

        cruzeiro.add(atacantes);
        cruzeiro.add(volantes);
        cruzeiro.add(defensores);


        for (List<String> list : cruzeiro){
            for (String s : list){
                System.out.println(s);
            }
        }

        System.out.println("-------------");

        cruzeiro.stream() // O cruzeiro.stream() cria um Stream<List<String>>
                .flatMap(List::stream) // O List::stream fala: Para cada lista (por exemplo, atacantes, volantes, defensores), crie um Stream<String> com os elementos dessa lista. Isso permite que a gente trabalhe com os Elementos da Lista, as Strings.
                // O flatMap junta (achata) todos esses streams em um só: Stream<String> para nao ter Stream<Stream<Strings>>
                .forEach(System.out::println); // Com o Stream<String>, podemos trabalhar diretamente com as Strings, neste caso, printamos.
    }

}
