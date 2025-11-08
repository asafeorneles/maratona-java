package academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.dominio;

public class Celular {
    private String nome;

    public Celular(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
