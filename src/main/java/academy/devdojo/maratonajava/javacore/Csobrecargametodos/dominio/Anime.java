package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String genero;
    private int classificacao;

    /*
    Se eu nao fizesse essa sobrecarga de metodos, eu seria obrigado a passar uma classificaçao, se nao daria erro.
    Com a sobrecarga eu nao sou "Obrigado" a passar uma classificaçao. Por exemplo, se eu tifve trabalhando com alguem e
    adicionar um atributo, eu posso adicionar no segundo "init", assim ela nao tera um erro em nao passar esse outro atributo.
    */

    public void init (String tipo, int episodios, String genero){
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    public void init (String tipo, int episodios, String genero, int classificacao){
        this.init (tipo, episodios, genero);
        this. classificacao = classificacao;
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
