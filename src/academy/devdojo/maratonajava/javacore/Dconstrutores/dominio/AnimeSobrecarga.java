package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class AnimeSobrecarga {
    private String tipo;
    private int episodios;
    private String genero;
    private int classificacao;
    private String estudio;

    public AnimeSobrecarga(String tipo, int episodios, String genero, int classificacao) {
        this(); // Faz referencia ao construtor sem argumentos
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
        this.classificacao = classificacao;
    }

    public AnimeSobrecarga(String tipo, int episodios, String genero, int classificacao, String estudio) {
        this(tipo, episodios, genero, classificacao);
        this.estudio = estudio;
    }

    public AnimeSobrecarga() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Episodios: " + episodios);
        System.out.println("Genero: " + genero);
        System.out.println("Classificacao: " + classificacao);
        System.out.println("Estudio: " + estudio);
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
