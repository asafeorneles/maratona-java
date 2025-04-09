package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 7", 5500);
        Tomate tomate = new Tomate("Tomate Andrea", 12);

        tomate.setDataDeValidade("25/09/2025");

        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("-----------------------------");
        CalculadoraImposto.calcularImpostoProduto(produto);
    }
}
