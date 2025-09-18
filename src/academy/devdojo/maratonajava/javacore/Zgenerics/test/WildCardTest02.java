package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());

    // Sem o WildCard no metodo, dá erro em compilação pois para o java, as listas nao tem polimorfismo
        printConsulta(cachorros);
        printConsulta(gatos);

        System.out.println("--------");

        //Dá erro de compilação pois o metodo que está sendo chamado só aceita Animal e Superclasses de Animal
//        printConsultaAnimal(cachorros);

        List<Animal> animals = new ArrayList<>();
        printConsultaAnimal(animals);
    }

    private static void printConsulta(List<? extends Animal> animais) { // Aceita Animal e tudo que for filho
        for (Animal animal : animais) {
            animal.consulta();
        }
    }

    private static void printConsultaAnimal(List <? super Animal> animais){
        // Agora podemos add na lista pois temos garantia que tudo o que passar neste metodo, é um Animal
        animais.add(new Gato());
        animais.add(new Cachorro());

        for (Object o : animais) {
            if (o instanceof Cachorro){
                ((Animal) o).consulta();
            }
        }

    }

}
