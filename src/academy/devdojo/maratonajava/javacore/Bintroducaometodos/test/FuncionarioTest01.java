package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jose");
        funcionario.setIdade(20);
        funcionario.setSalario(new double[] {1300, 900, 350});

        funcionario.imprimirResultado();
    }
}
