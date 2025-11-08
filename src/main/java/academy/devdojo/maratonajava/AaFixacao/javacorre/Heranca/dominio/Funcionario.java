package academy.devdojo.maratonajava.AaFixacao.javacorre.Heranca.dominio;

public class Funcionario {
    private String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.printf("Salario: R$ %.2f\n", this.salario);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
