package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversao0Test01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(numeros);
        System.out.println(Arrays.toString(listToArray));

        System.out.println("------------");

        Integer [] numerosArray = {1,2,3};

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12); // Temos um pequeno problema pois o asList faz um link entre o array e a lista. Assim se alterar a lista, tambem altera o array.
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("-------------");

        List<Integer> arrayToList2 = new ArrayList<>(Arrays.asList(numerosArray));
        arrayToList2.add(6);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList2);
    }
}
