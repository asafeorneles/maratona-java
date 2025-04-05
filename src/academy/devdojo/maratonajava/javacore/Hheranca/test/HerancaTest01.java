package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 2");
        endereco.setCep("54321-321");

        Endereco endereco2 = new Endereco();
        endereco2.setRua("Laboratorio");
        endereco2.setCep("12345-123");

        Pessoa pessoa = new Pessoa("Saitama", "123456789-09");
        pessoa.setEndereco(endereco);

        pessoa.imprime();
        System.out.println("------------------");

        Funcionario funcionario = new Funcionario("Genos", "987654321-90");
        funcionario.setEndereco(endereco2);
        funcionario.setSalario(15000.70);

        funcionario.imprime();
        System.out.println("------------------");
        funcionario.relatorioSalario();

    }
}
