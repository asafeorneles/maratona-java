package academy.devdojo.maratonajava.AaFixacao.Poo.BlocosInicializacao.Test;

import academy.devdojo.maratonajava.AaFixacao.Poo.BlocosInicializacao.Dominio.Carro;

public class CarroTest {
    public static void main (String [] args){
        Carro carro = new Carro();
        Carro carro2 = new Carro("Honda", "Honda Civic ej1", 1985);
        Carro carro3 = new Carro ("Mitsubishi" , "Eclipse", 1800);

        carro.setModelo("Opala");
        carro.setAno(1980);


        carro.exibirDetalhes();
        carro2.exibirDetalhes();
        carro3.exibirDetalhes();
        System.out.println("Total de carros criados: " + Carro.getTotalCarros());
    }
}
