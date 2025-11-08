package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprimeEstudanteTeste(String nome, int idade, char sexo) {
        nome = "Tsunade Gostosa";
        idade = 26;
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);

    }

    public void imprime(){
//      Tambem altera o valor na raiz.

        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
