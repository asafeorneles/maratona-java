package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        List<Carro> carroList = criarUmArrayComUmObjeto(new Carro("Camaro"));
        System.out.println(carroList);
    }

    public static <T> List<T> criarUmArrayComUmObjeto(T t){ // Retorna uma lista de acordo com o tipo do elemento que passarmos
        return List.of(t);
    }

    public static <T extends Animal> List<T> criarUmArrayComUmObjeto(T t){ // Aqui, permite apenas a passagem de elementos cujo tipo extenda de Animal
        return List.of(t);
    }

    public static <T extends Comparable<T>>  List<T> criarUmArrayComUmObjeto(T t){ // Aqui, permite apenas a passagem de elementos cujo tipo implementa Comparable (Uma interface).
        return List.of(t);
    }

}
