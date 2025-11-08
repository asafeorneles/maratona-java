package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String genero;
    private int classificacao;

    // O inicializador vai sempre ser a primeira coisa a ser executada na classe.
    public Anime(){

    }

    public Anime(String tipo, int episodios, String genero, int classificacao){
        System.out.println("Dentro do construtor");
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.classificacao = classificacao;
    }

    public void init(String tipo, int episodios, String genero) {
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void init(String tipo, int episodios, String genero, int classificacao) {
        this.init(tipo, episodios, genero);
        this.classificacao = classificacao;
    }

    public void imprime() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Episodios: " + episodios);
        System.out.println("Genero: " + genero);
        System.out.println("Classificacao: " + classificacao);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
