package academy.devdojo.maratonajava.javacore.ZZKjunit.dominio;

import java.util.Objects;

// Classes records são classes cujo o objetivo da criação é criar uma classe já final, mais enxuta, onde já possui accessors(Getters)
public record Manga(String name, int episodes) {
    public Manga { // Construtor que não permite nome ser nulo
        Objects.requireNonNull(name);
    }
}
