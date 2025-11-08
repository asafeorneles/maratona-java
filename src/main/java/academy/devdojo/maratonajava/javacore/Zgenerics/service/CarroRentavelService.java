package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Camaro"), new Carro("Fusca")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando carros disponíveis");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando o carro: " + carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void devolverCarroAlugado(Carro carro){
        System.out.println("Devolvendo o carro" + carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponíveis para alugar: ");
        System.out.println(carrosDisponiveis);
    }
}
