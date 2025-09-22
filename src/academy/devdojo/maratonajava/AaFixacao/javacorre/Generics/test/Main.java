package academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.test;

import academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.dominio.Celular;
import academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.dominio.Computador;
import academy.devdojo.maratonajava.AaFixacao.javacorre.Generics.service.ComprarService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Celular> celulares = new ArrayList<>(List.of(new Celular("Iphone 14"), new Celular("Sansung s23")));
        List<Computador> computadores = new ArrayList<>(List.of(new Computador("i5 11h"), new Computador("Rz 7500x")));

        ComprarService<Celular> celularComprarService = new ComprarService<>(celulares);
        Celular celular = celularComprarService.comprarProduto();
        System.out.println("Celular com defeito... Fazer troca");
        celularComprarService.devolverProduto(celular);

        System.out.println("------------");

        ComprarService<Computador> computadorComprarService = new ComprarService<>(computadores);
        Computador pc = computadorComprarService.comprarProduto();
        System.out.println("Computador com defeito... Fazer troca");
        computadorComprarService.devolverProduto(pc);
    }
}
