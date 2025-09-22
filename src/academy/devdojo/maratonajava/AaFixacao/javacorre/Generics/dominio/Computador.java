package academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.dominio;

public class Computador {
    private String nome;

    public Computador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
