package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa { //Herança: É UM (Funcionario é uma pessoa) já associação: TEM UM. (Pessoa tem um endereço)
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicializacao estatico de Funcionario");
    }

    {
        System.out.println("Dentro do bloco de inicializacao NAO estatico de Funcionario 1");
    }

    {
        System.out.println("Dentro do bloco de inicializacao NAO estatico de Funcionario 2");
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
        System.out.println("Dentro do construtor de Funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: " + this.salario);
    }

    public void relatorioSalario(){
        System.out.println("Funcionario: " + this.nome + ", recebeu seu salario de:");
        System.out.println("Salario: " + this.salario);

        /* O protected permite as classes filhas e classes do mesmo pacote,
        utilizar os atributos como se estivessem sendo criados na classe */
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
