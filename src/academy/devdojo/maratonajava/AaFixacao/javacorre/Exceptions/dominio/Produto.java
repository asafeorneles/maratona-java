package academy.devdojo.maratonajava.AaFixacao.javacorre.Exceptions.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Argumento Ilegal! Nome nao pode ser nulo nem vazio.");
        }else{
            this.nome = nome;
        }
        if (preco <= 0){
            throw new IllegalArgumentException("Argumento Ilegal! Preço tem que ser maior que zero.");
        }else {
            this.preco = preco;
        }
        if (quantidade < 0){
            throw new IllegalArgumentException("Argumento Ilegal! Quantidade nao pode ser negativo.");
        }else{
            this.quantidade = quantidade;
        }
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
