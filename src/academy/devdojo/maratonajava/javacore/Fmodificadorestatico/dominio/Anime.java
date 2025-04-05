package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicialização estático é executado quando o JVM carregar a classe
    // 1 - Alocado espaco em memoria pro objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static  { // É executado uma unica vez
        System.out.println("Dentro do bloco de inicializacao estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estático 2");
        System.out.println();
    }

    { // É executado toda vez antes de criar um objeto
        System.out.println("Dentro do bloco de inicializacao nao estatico");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
        for (int episodio: episodios) {
            System.out.print(episodio + " ");
        }

        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
