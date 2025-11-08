package academy.devdojo.maratonajava.javacore.ZZAclassesinternas;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.Comparator;
import java.util.List;

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Barco> barcos = List.of(new Barco("Canoa"), new Barco("Lancha"));

        //Isso é util para casos bem pontuais, pois esse Comparator por exemplo, vai ser usado apenas essa vez.
        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco barco1, Barco barco2) {
                return barco1.getNome().compareTo(barco2.getNome());
            }
        });
    }
}
