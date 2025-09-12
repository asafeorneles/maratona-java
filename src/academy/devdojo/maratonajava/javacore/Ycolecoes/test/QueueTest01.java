package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        fila.add("C");
        fila.add("A");
        fila.add("B");

        for (String s : fila) { // Não ordena necessariamente os objetos quando estão em memória.
            System.out.println(s);
        }

        System.out.println("----------------");

        while (!fila.isEmpty()){ // Agora sim ela remove na ordenação estabelecida no objeto.
            System.out.println(fila.poll()); // o .rremove remove o primeiro elemento mas lança excessão se estiver vazio. Se usar .poll e estiver vazia, retorna null.
        }
    }
}
