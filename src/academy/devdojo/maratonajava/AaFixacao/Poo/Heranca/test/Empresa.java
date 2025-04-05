package academy.devdojo.maratonajava.AaFixacao.Poo.Heranca.test;

import academy.devdojo.maratonajava.AaFixacao.Poo.Heranca.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.AaFixacao.Poo.Heranca.dominio.Gerente;

public class Empresa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Nolan", 20000);
        gerente.setBonus(1240);

        Desenvolvedor dev = new Desenvolvedor("Mark", 4500.80, "Java");

        gerente.imprime();
        System.out.println("---------------------");
        dev.imprime();
    }
}
