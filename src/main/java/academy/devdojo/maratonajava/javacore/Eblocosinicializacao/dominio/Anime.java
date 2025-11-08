package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i + 1;
        }
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
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    /*
    RESUMO E EXPLICAÇAO DO VIDEO SOBRE BLOCO DE INICIALIZACAO
    ele vai criar dois construtores um sem parametro e outro com parametro, quando ele instanciar o objeto la como Anime anime = new Anime( );
    ou seja, sem parametro, o construtor Anime sem parametro é chamado os valores daquele for são atribuidos e printados, e quando ele chama
    o getEpisodios que tem dentro um return episodios, como ele ta chamando episodios que é um array, vai printar o endereco de
    memoria do objeto array, e não dos valores individuais, pra poder printar os valores individuais ele acessa com for e indice i.
    se ele passa "One Piece", ai o construtor usado é aquele que tem String nome, e  como nesse construtor que tem nome como
    parametro, não tem um for passando os valores pra dentro do array, ou seja, ele está vazio, é printado null quando ele usa o getEpisodios.

    qual o problema a ser resolvido nesse video?, o fato de que dependendo do construtor chamado, a atribuição de valores ao array
    não acontece, usando o construtor sem parametro, usando aquele for os dados são colocados no array, e usando o com parametro que
    só tem a inicialização do nome, como não tem o for, o array é deixado vazio, qual a solução?

    usar bloco de inicialização, que basicamente se consiste em abrir chaves antes dos construtores e colocar esse codigo
    do for que atribui valores, porque ai, como esses valores estão sendo atribuidos antes de chamar os construtores,
    independente de qual construtor chamado, os valores ainda vão ser atribuidos, tirando a necessidade de atribuir
    dentro de um construtor especifico.
*/
}
