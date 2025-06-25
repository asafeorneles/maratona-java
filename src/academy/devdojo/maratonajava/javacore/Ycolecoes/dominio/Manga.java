package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga implements Comparable<Manga>{ // Comparable torna possível organiza-la em uma lista.
    private Long id;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id, "O id nao pode ser null");
        Objects.requireNonNull(nome, "Nome nao pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id == manga.id && Double.compare(preco, manga.preco) == 0 && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int compareTo(Manga outroManga) {
        // Se this < outroManga, return negativo (-1).
        // Se this == outroManga, return 0.
        // Se this > outroManga, return positivo (1).

        // Ordenar pelo id (long)
//        if (this.id < outroManga.getId()){
//            return -1;
//        } else if (this.id == outroManga.getId()) {
//            return 0;
//        }else {
//            return 1;
//        }

        // Como se trata de um Long, ele já possui a própia implementaçao do Comparable
//        return this.id.compareTo(outroManga.getId());

        // Mesma coisa com a String.
        return this.nome.compareTo(outroManga.getNome());

        // Pelo preço
//        return Double.compare(this.preco, outroManga.getPreco());
    }
}
