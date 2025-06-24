package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneList01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2", "Iphone");
        Smartphone s2 = new Smartphone("1H3HD", "Xiaomi");
        Smartphone s3 = new Smartphone("7F32H", "Samsung");

        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3); // Podemos definir a posição do arrayList para armazenar o objeto.
//        smartphones.clear(); // Limpa o conteúdo da lista

        for (Smartphone smartphone: smartphones){
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("1H3HD", "Xiaomi");
        System.out.println(smartphones.contains(s4)); // Verifica se a lista contém um smartphone através do equals. (Definimos o equals para verificar o serialNumber);
        int indexSmartphone = smartphones.indexOf(s4); // Retorna a posição que o smartphone se encontra na lista. Se não tiver na lista, retorna -1 (Index inexistente).
        System.out.println(indexSmartphone);
        System.out.println(smartphones.get(indexSmartphone)); // Se pode trabalhar com o index e trazer o objeto de determinada posição dentro da lista.

        // Através desses métodos, podemos trabalhar com condições. Ex: Se existir na lista, faça tal coisa.
        // Importante lembrar que quando formos trabalhar com collections, é indispensável sobrescrever e definir o equals e o hashCode nas classes que vão ser trabalhadas.
    }
}
