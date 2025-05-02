package academy.devdojo.maratonajava.AaFixacao.javacorre.Heranca.dominio;

public class Desenvolvedor extends Funcionario{
    private String linguagem;

    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    public Desenvolvedor(String nome, double salario, String linguagem){
        this(nome, salario);
        this.linguagem = linguagem;
    }

    public void imprime(){
        super.imprime();
        System.out.println("Linguagem que programa: " + this.linguagem);
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
