package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentavelService;

import java.util.ArrayList;
import java.util.List;

public class ClassesGenericasTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Camaro"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Submarino")));

        RentavelService<Carro> carroRentavelService = new RentavelService<>(carrosDisponiveis);
        Carro carro = carroRentavelService.buscarProdutoDisponivel();
        System.out.println();
        System.out.println("Produto usado por 1 mês....");
        System.out.println();
        carroRentavelService.devolverProdutoAlugado(carro);

        System.out.println("-----------------");

        RentavelService<Barco> barcoRentavelService = new RentavelService<>(barcosDisponiveis);
        Barco barco = barcoRentavelService.buscarProdutoDisponivel();
        System.out.println();
        System.out.println("Produto usado por 1 mês....");
        System.out.println();
        barcoRentavelService.devolverProdutoAlugado(barco);
    }
}
