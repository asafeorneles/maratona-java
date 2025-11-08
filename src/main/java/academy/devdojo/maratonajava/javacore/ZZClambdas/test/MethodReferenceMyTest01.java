package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceMyTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("5", "14", "12", "3"));
        List<Integer> numbers = numberStringToIntegerMethod(list, Integer::parseInt);
        System.out.println(numbers);

        ///////////////////
        Function<String, Integer> numbers2 = Integer::parseInt;
        for (String s : list) {
            Integer r = numbers2.apply(s);
            System.out.println(r + 1);
        }

        //////////////////
        List<String> list1 = new ArrayList<>(List.of("Jett", "Brim", "Chamber", "Reyna", "Raze"));
        List<String> list2 = new ArrayList<>(List.of("Iso", "Raze", "Tejo", "Brim", "Sova"));

        BiPredicate<List<String>, String> biPredicate = List::contains; // e como se fosse lambda: (list, elemento) -> list.contains(elemento);
        List<String> doubleNames = checkName(list1, list2, biPredicate);
        System.out.println(doubleNames);

    }

    private static <T, R> List<R> numberStringToIntegerMethod(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }

    private static <T> List<T> checkName(List<T> list, List<T> list2, BiPredicate<List<T>, T> biPredicate) {
        List<T> result = new ArrayList<>();
        for (T t1 : list) {
            if (biPredicate.test(list2, t1)) { //Se o objeto da lista 1 conter na lista 2, add na lista de resultados.
                result.add(t1);
            }
        }
        return result;
    }
}
