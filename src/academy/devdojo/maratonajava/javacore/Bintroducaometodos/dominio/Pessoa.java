package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNome(int idade){
        if (idade < 0){
            System.out.println("Idade inválida!");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return idade;
    }

    public void imprimePessoa(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
