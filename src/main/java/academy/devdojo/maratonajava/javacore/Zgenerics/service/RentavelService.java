package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentavelService<T> {
    private List<T> produtos = new ArrayList<>();

    public RentavelService(List<T> produtos){
        this.produtos = produtos;
    }

    public T buscarProdutoDisponivel(){
        System.out.println("Buscando produtos disponíveis");
        T t = produtos.remove(0);
        System.out.println("Alugando o produto: " + t);
        System.out.println("Produtos disponíveis para alugar: ");
        System.out.println(produtos);
        return t;
    }

    public void devolverProdutoAlugado(T t){
        System.out.println("Devolvendo o produto: " + t);
        produtos.add(t);
        System.out.println("Produtos disponíveis para alugar: ");
        System.out.println(produtos);
    }
}
