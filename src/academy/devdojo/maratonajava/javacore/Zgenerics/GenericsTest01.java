package academy.devdojo.maratonajava.javacore.Zgenerics;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Comprador;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

//        Antigamente no java 1.4, as listas eram dessa forma. Sem especificar com generics, ex: <String>
//        List lista = new ArrayList<>();
//        lista.add("Demon Slayer");
//        lista.add(123L);
//        lista.add(new Comprador("Asafe"));
//
//        for (Object object : lista) {
//            System.out.println(object);
//

        // Type Erasure
        List <String> lista = new ArrayList<>();
        lista.add("Demon Slayer");
        lista.add("Demon Slayer");

        for (String s : lista) {
            System.out.println(s);
        }

        System.out.println("------------");

        addLista(lista, new Comprador("Asafe Orneles"));

        for (Object s : lista) {
            System.out.println(s);
        }

    }

    public static void addLista(List lista, Comprador comprador){
        lista.add(comprador);
    }
}
