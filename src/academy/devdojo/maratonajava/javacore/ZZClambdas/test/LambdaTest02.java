package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {

        List<String> names = List.of("Satoru Gojo", "Toji");
        // Chamamos a funçao passando um tipo e retornando outro tipo. (Não é obrigatório retornar tipos diferentes).
        List<Integer> namesLength = map(names, (String s) -> s.length());
        System.out.println(namesLength);

        // Aqui retornou o mesmo tipo (String).
        List<String> namesUpperCase = map(names, (String s) -> s.toUpperCase());
        System.out.println(namesUpperCase);
    }


    private static <T, R> List<R> map(List<T> list, Function <T, R> function){
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e); // O r é o resultado que vai ser add na lista de Resultados a partir do que definirmos na lambda.
            result.add(r);
        }
        return result;
    }
}
