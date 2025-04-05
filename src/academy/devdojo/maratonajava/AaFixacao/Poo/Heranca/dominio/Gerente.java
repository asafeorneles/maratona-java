package academy.devdojo.maratonajava.AaFixacao.Poo.Heranca.dominio;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario) {
        super(nome, salario);
        this.bonus = 0;
    }

    public Gerente(String nome, double salario, double bonus) {
        this(nome, salario);
        this.bonus = bonus;
    }

    public void imprime(){
        super.imprime();
        System.out.printf("Bonus: R$ %.2f\n", this.bonus);
        System.out.printf("Salario total: R$ %.2f\n", calculaBonus());

    }

    public double calculaBonus(){
        return salario + bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
