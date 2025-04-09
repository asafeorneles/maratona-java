package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Taxavel;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
//    public static void calcularImpostoComputador(Computador computador) {
//        System.out.println("Relatorio de imposto do computador");
//        double imposto = computador.calcularImposto();
//        System.out.println("Computador: " + computador.getNome());
//        System.out.println("Valor: " + computador.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//
//    }
//
//    public static void calcularImpostoTomate(Tomate tomate) {
//        System.out.println("Relatorio de imposto do tomate");
//        double imposto = tomate.calcularImposto();
//        System.out.println("Tomate: " + tomate.getNome());
//        System.out.println("Valor: " + tomate.getValor());
//        System.out.println("Imposto a ser pago: " + imposto);
//
//    }

    public static void calcularImpostoProduto(Produto produto){ //
        System.out.println("Relatorio de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);

        // Criamos uma referencia tomate que se torna uma cópia de produto (Um tomate).
        // Agora tomate recebe todos os atributos de produto
        // Temos que fazer um cash para forçar essa referencia. É como se fosse fazer um int receber um double, somente forçando


//        if (produto instanceof Tomate){ // se produto for um Tomate...
//            Tomate tomate = (Tomate) produto;
//            System.out.println("Data de validade: " + tomate.getDataDeValidade());
//        }

        // Ou
        if (produto instanceof Tomate){
            System.out.println("Data de validade: " + ((Tomate) produto).getDataDeValidade());
        }
    }

}
