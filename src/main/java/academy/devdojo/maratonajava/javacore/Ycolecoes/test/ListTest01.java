package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
//        List nomes = new ArrayList(); 1.4
        List<String> nomes = new ArrayList<>(16); // 1.5 (Agora podemos definir o tipo do ArrayList)
        nomes.add("Asafe");
        nomes.add("Maratona Java");
        System.out.println(nomes.remove("asafe")); // Não removeu pois o objeto que foi passado está errado.
        System.out.println();

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Orneles");
        nomes2.add("Deve Dojo");

        nomes.addAll(nomes2); // Adiciona todos os valores de uma lista a outra (Inclui valores repetidos. Para evitar isso, é bom fazer na marra usando for).

        for (Object nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("----------");

        for (int i = 0; i < nomes.size(); i++) { // No arraylist, se tem nome.size() em vez de nome.length (array comum)
            System.out.println(nomes.get(i)); // No arrayList se tem nome.get(i) em vez de nome[i] (array comum)
        }

        List<Integer> numeros = new ArrayList<>(); // List só aceita objetos.
        numeros.add(1);
        numeros.add(2);

    }
}
