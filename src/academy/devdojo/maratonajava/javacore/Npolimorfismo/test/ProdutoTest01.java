package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10 i7", 11000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao tv = new Televisao("Sansung 50\" ", 10);

        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImpostoProduto(tv);
    }

}
