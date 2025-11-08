package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();
    // Nao podemos associar a referencia a outra, mas podemos alterar os atributos do objeto da referencia

    public final void imprime(){ // Os metodos e atributos continuam funcionando para a classe extendida mas nao pode ser sobrescrito
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
