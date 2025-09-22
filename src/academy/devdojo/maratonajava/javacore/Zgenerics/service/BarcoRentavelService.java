package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Submarino")));

    public Barco buscarBarcoDisponivel(){
        System.out.println("Buscando carros disponíveis");
        Barco barco = barcosDisponiveis.remove(0);
        System.out.println("Alugando o barco: " + barco);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
        return barco;
    }

    public void devolverBarcoAlugado(Barco barco){
        System.out.println("Devolvendo o barco" + barco);
        barcosDisponiveis.add(barco);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(barcosDisponiveis);
    }
}
