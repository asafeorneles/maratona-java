package academy.devdojo.maratonajava.AaFixacao.javacorre.Colecoes.ZeroUm.test;

import academy.devdojo.maratonajava.AaFixacao.javacorre.Colecoes.ZeroUm.dominio.Loja;
import academy.devdojo.maratonajava.AaFixacao.javacorre.Colecoes.ZeroUm.dominio.Produto;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja(new ArrayList<>());
        Produto tv = new Produto(1, "Sansung Smart", 1900);
        Produto celular = new Produto(2, "Iphone 15", 4200);
        Produto pc = new Produto(3, "MacBook", 3600);
        Produto creatina = new Produto(7, "Creatina Soldiers", 70);
        Produto blusa = new Produto(5, "Slim fit Zara", 120);

        loja.adicionarProduto(tv);
        loja.adicionarProduto(celular);
        loja.adicionarProduto(pc);
        loja.adicionarProduto(creatina);
        loja.adicionarProduto(blusa);

        Collections.sort(loja.getProdutos());
        loja.listarProdutos();

        System.out.println("___________ BUSCAR PRODUTOS ___________");

        loja.buscarProdutoPorNome("MacBoo");
        loja.buscarProdutoPorNome("MacBook");
        loja.buscarProdutoPorNome("arroz");

        System.out.println("___________ ALTERAR PREÇO DE PRODUTOS ___________");
        loja.alterarPreco(7, 89);
        loja.listarProdutos();

        System.out.println("___________ REMOVER PRODUTOS ___________");
        loja.removerProduto(2);
        loja.listarProdutos();
    }
}
