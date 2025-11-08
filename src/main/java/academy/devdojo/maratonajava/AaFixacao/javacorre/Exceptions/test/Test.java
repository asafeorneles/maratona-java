package academy.devdojo.maratonajava.AaFixacao.javacorre.Exceptions.test;

import academy.devdojo.maratonajava.AaFixacao.javacorre.Exceptions.dominio.Produto;

public class Test {
    public static void main(String[] args) {
        criarProduto("Teclado", 170.90, 4);
        criarProduto("Mouse", 105.40, -8); // erro
        criarProduto("CPU", 0, 9);         // erro
        criarProduto("", 260, 23);         // erro
    }

    private static void criarProduto(String nome, double preco, int quantidade) {
        try {
            Produto p = new Produto(nome, preco, quantidade);
            System.out.println("Produto criado: " + p.getNome());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao criar produto [" + nome + "]: " + e.getMessage());
        }
    }
}

