package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Jett", "Chamber", "Reyna", "Raze"));

        list.sort((s1,s2) -> s1.compareTo(s2)); // Com Lambda
        list.sort(String::compareTo); // Com Method Reference
        System.out.println(list);

        // Podemos explorar mais ainda
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        Integer i = numStringToInteger.apply("5");
        System.out.println(i + 2);

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Jett"));

    }
}
