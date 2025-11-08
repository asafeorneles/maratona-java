package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaMyTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Sakura", "Naruto", "Kakashi", "Asafe", "Hashirama", "Guy", "Madara", "Bee"));
        List<String> namesSorted = sort(names, (s1, s2) -> s1.compareTo(s2));
        System.out.println(namesSorted);
    }

    private static <T> List<T> sort(List<T> list, Comparator<T> comparator){
        list.sort(comparator);
        return list;
    }
}
