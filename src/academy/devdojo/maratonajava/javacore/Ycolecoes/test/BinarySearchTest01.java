package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        Collections.sort(numeros);
        // (-(ponto de inserção) -1)
        // index 0,1,2,3
        // value 0,2,3,4
        System.out.println(Collections.binarySearch(numeros, 8));
    }
}
