package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class PredicatePorTamanhoString implements Predicate<String>{
    @Override
    public boolean test(String s) {
        return s.length() == 5;
    }
}

public class TestePredicateConcret {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Asafe", "Kelvao", "Alice", "Arisu", "Orneles", "Luffy"));
        // Metodo 1 - Classe Concreta
        PredicatePorTamanhoString predicatePorTamanhoString = new PredicatePorTamanhoString();
        System.out.println(filtrar(names, predicatePorTamanhoString));
        System.out.println("---------");

        // Metodo 2 - Lambda
        System.out.println(filtrar(names, s -> s.length() == 5));
        System.out.println("---------");

        // Metodo 3 - Classe concreta
        System.out.println(filtrar(names, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 5;
            }
        }));
        System.out.println("-----------------");

        // Metodo 4 - Objeto
        Predicate<String> stringPredicate = s-> s.length() == 5;
        System.out.println(filtrar(names, stringPredicate));
        System.out.println("------------");

        // Metodo 5 - Objeto
        System.out.println(filtrar(names, TestePredicateConcret::checkLength5));
    }

    private static <T> List<T> filtrar(List<T> lista, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();
        for (T e : lista) {
            if(predicate.test(e)){
                filteredList.add(e);
            }

        }
        return filteredList;
    }

    public static boolean checkLength5(String s){
        return s.length() == 5;
    }
}
