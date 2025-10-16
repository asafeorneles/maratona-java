package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest05 {
    public static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        List<String[]> letters = new ArrayList<>();

        for (String s : words){
            letters.add(s.split(""));
        }

        for (String[] s : letters){
            for (String string : s){
                System.out.println(string);
            }
        }

        List<String> stringStream = words.stream() // transforma as palavras em stream: Stream<String>
                .map(s -> s.split("")) // Transforma cada palavra (Stream<Strings>) em um array de string: Stream<String[]>
                .flatMap(Arrays::stream) // Pega cada array de String e transforma essas String (Letras) em um Stream<String>, permitindo que trabalhemos com elas
                .collect(Collectors.toList()); // Coloca essas Strings em uma lista.

    }

}
