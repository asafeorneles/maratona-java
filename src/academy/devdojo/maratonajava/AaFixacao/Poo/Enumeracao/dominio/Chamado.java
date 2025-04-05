package academy.devdojo.maratonajava.AaFixacao.Poo.Enumeracao.dominio;

public class Chamado {
    private String nome;
    private TipoProblema tipoProblema;
    private Prioridade prioridade;

    public Chamado(String nome, TipoProblema tipoProblema, Prioridade prioridade) {
        this.nome = nome;
        this.tipoProblema = tipoProblema;
        this.prioridade = prioridade;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println("Tipo: " + this.tipoProblema);
        System.out.print("Prioridade: " + this.prioridade);
        System.out.println(" (Tempo maximo de resposta: " + this.prioridade.HORAS + ")");

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
