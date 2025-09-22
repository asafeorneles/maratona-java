package academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.service;

import academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.dominio.Celular;
import academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.dominio.Computador;

import java.util.ArrayList;
import java.util.List;

public class ComprarService <T>{
    List<T> produtos = new ArrayList<>();

    public ComprarService (List<T> produtos){
        this.produtos = produtos;
    }

    public T comprarProduto(){
        T t = produtos.remove(1);
        if (t instanceof Celular){
            System.out.println("Buscando celulares disponíveis");
            System.out.println("Comprando celular: " + t);
            System.out.println("Celulares disponíveis: ");
            System.out.println(produtos);
            return t;
        } else if (t instanceof Computador){
            System.out.println("Buscando computadores disponíveis");
            System.out.println("Comprando computador: " + t);
            System.out.println("Computadores disponíveis: ");
            System.out.println(produtos);
            return t;
        }
        else {
            return t;
        }
    }

    public void devolverProduto(T t){
        if (t instanceof Celular){
            System.out.println("Devolvendo o celular: " + t);
            produtos.add(t);
            System.out.println("Celulares disponíveis: ");
            System.out.println(produtos);
        } else if (t instanceof Computador){
            System.out.println("Devolvendo o computador: " + t);
            produtos.add(t);
            System.out.println("Computadores disponíveis: ");
            System.out.println(produtos);
        }

    }

}
