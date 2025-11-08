package academy.devdojo.maratonajava.AaFixacao.javacorre.Colecoes.ZeroUm.dominio;

import java.util.ArrayList;
import java.util.Iterator;

public class Loja {
    protected ArrayList<Produto> produtos;

    public Loja (ArrayList<Produto> produtos){
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto p){
        if (!produtos.contains(p)){
            produtos.add(p);
        } else {
            System.out.println("Erro ao adicionar produto. O produto já existe!");
        }
    }

//    public void removerProduto(int id){
//        for (Produto produto : this.produtos){
//            if (produto.getId() == id){
//                this.produtos.remove(produto);
//                System.out.println("Produto removido com sucesso!");
//            } else {
//                System.out.println("Erro ao remover produto. O produto não existente.");
//            }
//        }
//    }

    public void removerProduto(int id){
        int contador = -1;
        Iterator<Produto> produtoIterator = produtos.iterator();
        while (produtoIterator.hasNext()){
            Produto produto = produtoIterator.next();
            if (produto.getId() == id){
                produtoIterator.remove();
                System.out.println("Produto removido com sucesso!");
                contador ++;
            }
        }
        if (contador < 0){
            System.out.println("Erro ao remover produto. O produto não existente.");
        }
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public void buscarProdutoPorNome(String nome){
        int contador = -1;
        for (Produto produto : produtos){
            if (produto.getNome().contains(nome)){
                System.out.println(produto);
                contador ++;
            }
        }
        if (contador < 0){
            System.out.println("Produto nao encontrado!");
        }

    }


    public void listarProdutos(){
        System.out.println(produtos);
    }

    public void alterarPreco(int id, double novoPreco){
        for (Produto produto : produtos){
            if (produto.getId() == id){
                produto.setPreco(novoPreco);
            }
        }
    }


}
