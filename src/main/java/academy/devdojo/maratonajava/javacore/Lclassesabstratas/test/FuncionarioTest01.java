package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Neji", 5000);
        gerente.calcularBonus();
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Tobirama", 12000);
        desenvolvedor.calcularBonus();
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();

    }
}
