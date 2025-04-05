package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double [] salario;
    private double media;

    public void imprimirResultado(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(salario == null){
            return;
        }
        for (int i = 0; i < this.salario.length; i++) {
            System.out.printf("Salario %d: R$ %.2f\n", (i + 1), salario[i]);
        }

        calcularMedia();
    }

    public void calcularMedia(){
        if(salario == null){
            return;
        }
        double soma = 0;
        for (double num : this.salario) {
            soma += num;
        }
        media = soma / this.salario.length;
        System.out.printf("\nMedia = %.2f\n", media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

    private void setMedia(double media) {
        this.media = media;
    }

    /*
    OUTRA FORMA:
    public void calcularMedia(){
        double media = 0;
        for (double num : this.salario) {
            media += num;
        }
        media /= this.salario.length;
        System.out.printf("Media = %.2f", media);
    }
    */
}
