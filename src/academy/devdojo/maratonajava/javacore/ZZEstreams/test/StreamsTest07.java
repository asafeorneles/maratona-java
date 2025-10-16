package academy.devdojo.maratonajava.javacore.ZZEstreams.test;


import java.util.List;
import java.util.Optional;

//Reduce
public class StreamsTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6);

        // Situação: Somar valores da lista - 1
        integers.stream().reduce((x,y) -> x+y).ifPresent(System.out::println); // Retorna um Optional<T> (A lista pode estar vazia)
        System.out.println(integers.stream().reduce(0,(x,y) -> x+y)); // Retorna um Integer quando passamos um identificador.

        System.out.println("-----------");

        // Situação: Somar valores da lista - 2 (Usando o metodo do próprio Integer)
        integers.stream().reduce(Integer::sum).ifPresent(System.out::println); // Retorna um Optional<T> (A lista pode estar vazia)
        System.out.println(integers.stream().reduce(0,Integer::sum)); // Retorna um Integer quando passamos um identificador.

        System.out.println("-----------");

        // Situação: Multiplicar valores da lista
        integers.stream().reduce((x,y) -> x*y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (x,y) -> x*y));

        System.out.println("-----------");

        // Situação: Retornar o maior valor da lista - 1
        integers.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));
    }

}

