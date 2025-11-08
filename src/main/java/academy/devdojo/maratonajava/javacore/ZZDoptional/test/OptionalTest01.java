package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        //String name = findName("orneles");
        //System.out.println(name.toUpperCase()); // Isso vai dar um nullPointException pois retornou null e está tentando passar null para UpperCase

        Optional<String> o1 = Optional.of("Zafao do corre"); // Retorna uma String
        Optional<String> o2 = Optional.ofNullable("Zafao do corre"); // Retorna uma String, e se tiver nulo, Retorna Optional.empty
        Optional<String> o3 = Optional.empty(); // Retorna um Optional.empty
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);

        System.out.println("-------------");
        Optional<String> optionalFindName = findName("Asafe"); // findName() retorna uma String
        String empty = optionalFindName.orElse("empty");// Retorna o valor de optionalFindName (Asafe), se nao encontrado (null), retorna a mensagem que personalizamos (Empty).
        System.out.println(empty);
        optionalFindName.ifPresent(s-> System.out.println(s.toUpperCase())); // Se optionalFindName ter um valor, realize a lógica.
        // ifPresent não retorna nada, ou seja, variáveis não podem recebe-lo


    }

//    public static String findName(String name){
//        List<String> names = List.of("Asafe", "Orneles");
//        int i = names.indexOf(name);
//        if (i >= 0){
//            return names.get(i);
//        } else{
//            return null;
//        }
//    }

    // Agora com Optional, o metodo passa a ser assim:
    public static Optional<String> findName(String name){
        List<String> names = List.of("Asafe", "Orneles");
        int i = names.indexOf(name);
        if (i >= 0){
            return Optional.of(names.get(i));
        } else{
            return Optional.empty();
        }
    }
}
