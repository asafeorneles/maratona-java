package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Opala";
        carro1.modelo = "Chevrolet";
        carro1.ano = 1980;

        carro2.nome = "Honda Civic ej1";
        carro2.modelo = "Honda";
        carro2.ano = 1995;

        System.out.printf("Carro 1: %s Marca: %s Ano: %d\n", carro1.nome, carro1.modelo, carro1.ano );
        System.out.printf("Carro 2: %s Marca: %s Ano: %d\n", carro2.nome, carro2.modelo, carro2.ano );
    }
}
