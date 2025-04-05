package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        // Os parênteses de toda a criação de um objeto, é do seu construtor.
        // Ao ter um construtor la na classe, é obrigatório passar os seus argumentos no objeto.
        Anime anime = new Anime("TV",18,"Acao", 18);

        // Para nao dar erro em criar um outro objeto, basta criar outro construtor, porém vazio.
        Anime anime2 = new Anime();
        anime2.init("Filme",1,"Romance", 12);

        anime.imprime();
        System.out.println("-----------------------");
        anime2.imprime();
    }
}
